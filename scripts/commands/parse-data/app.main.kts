@file:Import("../../qtools/qfil.kts")
@file:Import("../../qtools/qcli.kts")
@file:Import("../../qtools/qstr.kts")


import java.io.File
import org.json.JSONArray
import org.json.JSONObject
import qfil
import qcli
import qstr

fun main() {
    // Read lines from the flashcards.txt file
    val lines = qfil.getLinesFromFile("../../data/flashcards.txt")
    qcli.message("Read ${lines.size} lines from flashcards.txt")

    val flashcards = mutableListOf<Map<String, String>>()

    // Process lines in groups of 4
    for (i in lines.indices step 4) {
        val suuid = qstr.generateSuuid()
        val category = lines.getOrNull(i)?.trim().orEmpty()
        val front = lines.getOrNull(i + 1)?.trim().orEmpty()
        val back = lines.getOrNull(i + 2)?.trim().orEmpty()

        if (category.isNotEmpty() && front.isNotEmpty() && back.isNotEmpty()) {
            flashcards.add(
                mapOf(
                    "suuid" to suuid,
                    "category" to category,
                    "front" to front,
                    "back" to back
                )
            )
        } else {
            qcli.message(
                "Skipping incomplete flashcard at lines ${i + 1}-${i + 3}",
                "warning"
            )
        }
    }

    qcli.message("Generated ${flashcards.size} flashcards")

    // Save flashcards to JSON file
    val jsonData = JSONArray(flashcards).toString(4) // Pretty print with 4 spaces
    val outputFile = File("../../parseddata/flashcards.json")
    try {
        outputFile.writeText(jsonData)
        qcli.message("Wrote ${flashcards.size} flashcards to flashcards.json")
    } catch (e: Exception) {
        qcli.message("Error writing flashcards to JSON file: ${e.message}", "error")
    }
}     
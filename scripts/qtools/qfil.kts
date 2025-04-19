import java.io.File

/**
 * File utility methods
 */
object qfil {
    /**
     * Reads a file and returns its lines as a list of strings.
     *
     * Example:
     * val lines = QFil.getLinesFromFile("../data/flashcards.txt")
     *
     * @param filePath Path to the file to read
     * @return List of lines from the file, or an empty list if the file cannot be read
     */
    fun getLinesFromFile(filePath: String): List<String> {
        return try {
            val file = File(filePath)
            if (!file.exists() || !file.canRead()) {
                QCli.message("Error reading file at $filePath", "error")
                emptyList()
            } else {
                file.readLines()
            }
        } catch (error: Exception) {
            QCli.message("Error reading file at $filePath: ${error.message}", "error")
            emptyList()
        }
    }
}
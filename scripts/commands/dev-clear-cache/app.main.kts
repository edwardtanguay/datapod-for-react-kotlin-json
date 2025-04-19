import java.io.File

// this is a hack: we append a space to the end of the file to clear cache so that you can change imported files and see the changes

fun main() {
    val filePaths = arrayOf(
        "../create-page/app.main.kts",
        "../parse-data/app.main.kts",
    )

    filePaths.forEach { path ->
        val file = File(path)
        if (file.exists()) {
            file.appendText(" ") 
        } else {
            println("File $path does not exist.")
        }
    }
}

main()
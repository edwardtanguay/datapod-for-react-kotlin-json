import java.io.File

fun main() {
    val filePath = "../create-page/app.main.kts"
    val file = File(filePath)

    if (file.exists()) {
        file.appendText(" ") // this is a hack to clear the cache so changes in imported files are acknowledged
    } else {
        println("File $filePath does not exist.")
    }
}

main()
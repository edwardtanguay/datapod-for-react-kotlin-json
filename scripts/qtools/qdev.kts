import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Utility methods for development
 */
object qdev {
    /**
     * Prints a debug line with timestamp
     *
     * Example output:
     * 2025-04-14 18:18:06 ### was here ##############
     */
    fun debug(obj: Any) {
        val timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))

        if (obj is String) {
            println("🛠️  $timestamp - $obj")
        } else {
            println(obj.toString())
        }
    }
}
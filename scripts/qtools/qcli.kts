/**
 * Quick tools for CLI commands
 */
object qcli {
    /**
     * Prints a CLI message with emoji indicators
     *
     * @param line The message to display
     * @param kind The type of message (info, error, success, warning, doing)
     */
    fun message(line: String, kind: String = "success") {
        val emoji = when (kind) {
            "info" -> "ℹ️"
            "error" -> "❌"
            "warning" -> "🟠"
            "doing" -> "⏳"
            else -> "✅"
        }
        println("$emoji 222 $line")
    }
}

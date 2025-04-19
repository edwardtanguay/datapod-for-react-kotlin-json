/**
 * String utility methods
 */
object qstr {
    /**
     * Generates a 6-character unique identifier (suuid) consisting of random
     * upper and lower case letters and numbers.
     * Example: "nO57aL"
     *
     * @return The generated suuid
     */
    fun generateSuuid(): String {
        val characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        return (1..6)
            .map { characters.random() }
            .joinToString("")
    }
}
object learn {
    fun showTitle(exNum: String, title: String) {
        qcli.message("EX$exNum - ${title.uppercase()}", "success") // Convert title to uppercase
    }

    fun ex001() {
        this.showTitle("001", "first example")
    }
    fun ex002() {
        this.showTitle("002", "second example")
    }
}
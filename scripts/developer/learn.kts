object learn {
    fun showTitle(title: String) {
        qcli.message("=== $title ===", "success")
    }

    fun ex001() {
        this.showTitle("Ex001")
        qcli.message("this is ex001--008", "info")
    }
    fun ex002() {
        qcli.message("this is ex002", "info")
    }
    fun ex003() {
        qcli.message("this is ex003", "info")
    }
}
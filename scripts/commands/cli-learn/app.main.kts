@file:Import("../../qtools/qdev.kts")
@file:Import("../../qtools/qcli.kts")
@file:Import("../../developer/learn.kts")

import qdev
import qcli

val exerciseNumber = args.getOrNull(0) ?: "No exercise number provided"

qcli.message("Exercise Number: $exerciseNumber", "info")
learn.ex001()

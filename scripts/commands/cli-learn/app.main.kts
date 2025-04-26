@file:Import("../../qtools/qdev.kts")
@file:Import("../../qtools/qcli.kts")
@file:Import("../../developer/learn.kts")

import qdev
import qcli
import learn
import kotlin.reflect.full.declaredFunctions

val exerciseNumber = args.getOrNull(0) ?: "001"

// qcli.message("Exercise Number: $exerciseNumber", "info")

val methodName = "ex$exerciseNumber"
val method = learn::class.declaredFunctions.find { it.name == methodName }

if (method != null) {
    method.call(learn)
} else {
    qcli.message("Method $methodName not found in learn", "error")
}

// hack: suppress the "kotlin.Unit" (void) output
""
              
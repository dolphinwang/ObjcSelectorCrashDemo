package org.dolphinwang.sample

import kotlinx.cinterop.ExportObjCClass
import kotlinx.cinterop.ObjCAction
import platform.Foundation.NSRunLoop
import platform.Foundation.NSRunLoopCommonModes
import platform.QuartzCore.CADisplayLink
import platform.darwin.NSObject
import platform.darwin.sel_registerName

@ExportObjCClass
internal class Choreographer : NSObject() {

    private val displayLink =
        CADisplayLink.displayLinkWithTarget(this, sel_registerName(::onFrame.name)).apply {
            addToRunLoop(NSRunLoop.mainRunLoop, NSRunLoopCommonModes)
        }

    @ObjCAction
    private fun onFrame(sender: CADisplayLink) {
        val frameTimeNanos = (sender.timestamp * 1_000_000_000).toLong()
        println("[$frameTimeNanos]Choreographer#onFrame")
    }
}
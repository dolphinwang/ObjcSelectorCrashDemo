package org.dolphinwang.sample

import kotlinx.cinterop.ExportObjCClass
import kotlinx.cinterop.ObjCAction
import kotlinx.cinterop.ObjCOutlet
import platform.CoreGraphics.CGRectMake
import platform.UIKit.*

class VCDelegate(private val controller: UIViewController) {
    private lateinit var choreographer: Choreographer

    fun onViewDidLoad(): UIView = UITextView().apply {
        text = "UIText test"
        textColor = UIColor.orangeColor
        setFrame(CGRectMake(x = 100.0, y = 100.0, width = 100.0, height = 100.0))
    }

    fun onViewDidAppear() {
        choreographer = Choreographer()
    }
}
package com.symeonchen.demo.examples.fixAppbarBehavior.Behavior

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.MotionEvent.ACTION_DOWN
import android.widget.OverScroller
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.Behavior

@Suppress("unused")
class FixScrollShakeBehavior : Behavior {

    constructor()
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)


    override fun onInterceptTouchEvent(parent: CoordinatorLayout, child: AppBarLayout, ev: MotionEvent): Boolean {
        if (ev.action == ACTION_DOWN) {
            val scroller = getScrollerObj()
            if (scroller is OverScroller) {
                scroller.abortAnimation()
            }
        }
        return super.onInterceptTouchEvent(parent, child, ev)
    }

    private fun getScrollerObj(): Any? {
        var obj: Any? = null
        try {
            val field = this.javaClass.superclass?.superclass?.superclass?.getDeclaredField("scroller")
            field?.isAccessible = true
            obj = field?.get(this)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return obj
    }
}
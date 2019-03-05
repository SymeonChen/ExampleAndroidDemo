package com.symeonchen.demo.examples.xfermodeView.View

import android.content.Context
import android.graphics.*
import android.os.Build
import android.util.AttributeSet
import android.widget.ImageView

class RoundBottomCornerImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ImageView(context, attrs, defStyleAttr) {

    var supportPie: Boolean = true
        set(value) {
            field = value
            postInvalidate()
        }

    /**
     * Bottom Corner (px)
     */
    var corner = 50f
        set(value) {
            field = value
            postInvalidate()
        }

    private var paint = Paint()
    private var dstInXfermode = PorterDuffXfermode(PorterDuff.Mode.DST_IN)
    private var srcInXfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)

    override fun onDraw(canvas: Canvas?) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {

            val saveCount: Int = canvas?.saveLayer(0f, 0f, width.toFloat(), height.toFloat(), null) ?: 0
            super.onDraw(canvas)

            paint = getDstInPaint()
            canvas?.drawPath(getCustomPath(), paint)
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                if (supportPie) {
                    paint = getSrcInPaint()
                    canvas?.drawPath(getInversePath(), paint)
                }
            }

            canvas?.restoreToCount(saveCount)
            paint.xfermode = null

        } else {
            super.onDraw(canvas)
        }
    }

    private fun getCustomPath(): Path {
        val path = Path()
        path.moveTo(0f, 0f)
        path.lineTo(0f, height - corner)
        path.lineTo(corner, height.toFloat())
        path.lineTo(width - corner, height.toFloat())
        path.lineTo(width.toFloat(), height - corner)
        path.lineTo(width.toFloat(), 0f)
        path.close()
        return path
    }

    private fun getInversePath(): Path {
        val path = Path()
        path.moveTo(0f, height - corner)
        path.lineTo(corner, height.toFloat())
        path.lineTo(width - corner, height.toFloat())
        path.lineTo(width.toFloat(), height - corner)
        path.lineTo(width.toFloat(), height.toFloat())
        path.lineTo(0f, height.toFloat())
        path.close()
        return path
    }

    private fun getDstInPaint(): Paint {
        val paint = Paint()
        paint.isAntiAlias = true
        paint.color = Color.WHITE
        paint.xfermode = dstInXfermode
        return paint
    }

    private fun getSrcInPaint(): Paint {
        val paint = Paint()
        paint.isAntiAlias = true
        paint.color = Color.WHITE
        paint.xfermode = srcInXfermode
        return paint
    }


}
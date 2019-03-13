package com.symeonchen.demo.examples.fixTvReuse.Item

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.button.MaterialButton
import com.symeonchen.demo.examples.R
import com.symeonchen.demo.examples.fixTvReuse.Bean.User

class UserItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    var v: View? = null
    var tvUserName: TextView? = null
    var mbUserLevel: MaterialButton? = null

    init {
        v = LayoutInflater.from(context).inflate(R.layout.fix_tv_reuse_item_user, this, true)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        tvUserName = v?.findViewById(R.id.tv_fix_tv_reuse_item_user_name)
        mbUserLevel = v?.findViewById(R.id.mb_fix_tv_reuse_item_user_level)
    }

    fun bindData(item: User) {
        tvUserName?.text = item.name
        mbUserLevel?.text = "Lv {${item.level}}"
    }

}
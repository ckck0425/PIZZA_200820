package kr.co.tjoeun.pizza_200820

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity()
{
    var mContext = this

    abstract fun setValues()
    abstract fun setupEvents()
}
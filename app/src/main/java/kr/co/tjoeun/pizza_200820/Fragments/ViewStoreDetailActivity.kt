package kr.co.tjoeun.pizza_200820.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.activity_view_store_detail.logoImg
import kotlinx.android.synthetic.main.activity_view_store_detail.nameTxt
import kotlinx.android.synthetic.main.store_list_item.*
import kr.co.tjoeun.pizza_200820.BaseActivity
import kr.co.tjoeun.pizza_200820.Datas.Store
import kr.co.tjoeun.pizza_200820.R

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mstore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mstore = intent.getSerializableExtra("storeInfo") as Store

        nameTxt.text = mstore.name
        phonenumbTxt.text = mstore.phonenumb

        Glid.with(mContext).load(mstore.logoUrl).into(logoImg)
    }
}

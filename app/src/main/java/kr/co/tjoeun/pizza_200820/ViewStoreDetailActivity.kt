package kr.co.tjoeun.pizza_200820

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
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

        callBtn.setOnClickListener {

            val permissionListener = object : PermissionListener {
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:${mStore.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext, "전화 연결 권한이 거부되었습니다.", Toast.LENGTH_SHORT).show()
                }

            }

            TedPermission.with(mContext)
                .setPermissionListener(permissionListener)
                .setDeniedMessage("[설정] 에서 권한을 열어줘야 전화 연결이 가능합니다.")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()

        }



    }

    override fun setValues() {
        mstore = intent.getSerializableExtra("storeInfo") as Store

        nameTxt.text = mstore.name
        phonenumbTxt.text = mstore.phonenumb

        Glide.with(mContext).load(mstore.logoUrl).into(logoImg)
    }
}

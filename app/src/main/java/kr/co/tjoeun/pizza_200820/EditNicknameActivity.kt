package kr.co.tjoeun.pizza_200820

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        okBtn.setOnClickListener {

            val inputNickname = newNicknameEdt.text.toString()

//            입력한 닉네임이 5글자가 넘어야 이전화면으로 복귀
//            그렇지 않다면 토스트로 "닉네임은 5자 이상이어야 합니다." 문구만 출력

            if (inputNickname.length >= 5) {
                val resultIntent = Intent()
                resultIntent.putExtra("nick", inputNickname)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
            else {
                Toast.makeText(mContext, "닉네임은 5자 이상이어야 합니다.", Toast.LENGTH_SHORT).show()
            }


        }

    }

    override fun setValues() {

    }
}

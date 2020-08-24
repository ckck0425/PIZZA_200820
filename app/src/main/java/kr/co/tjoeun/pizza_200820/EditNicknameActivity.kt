package kr.co.tjoeun.pizza_200820

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
//            그렇지않다면 토스트로


            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()

        }

    }

    override fun setValues() {

    }
}

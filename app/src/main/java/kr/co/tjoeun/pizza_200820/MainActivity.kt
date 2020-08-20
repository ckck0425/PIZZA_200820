package kr.co.tjoeun.pizza_200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizza_200820.Adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setValues() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = mvpa

        // 탭 레이아웃 + 뷰 페이저 연결
        myTabLayout.setupWithViewPager(viewPager)
    }

    override fun setupEvents() {
    }
}

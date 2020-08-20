package kr.co.tjoeun.pizza_200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizza_200820.Adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setValues() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

        // 탭 레이아웃 + 뷰 페이저 연결
        maintaplayout.setupWithViewPager(mainViewPager)
    }

    override fun setupEvents() {
    }
}

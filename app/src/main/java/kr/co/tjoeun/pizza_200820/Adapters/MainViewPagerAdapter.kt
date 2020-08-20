package kr.co.tjoeun.pizza_200820.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.pizza_200820.Fragments.MyPage

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {

        return when (position){
            0 -> PiazzOrderfragment()
            1 -> MyPagefragment()
        }

    }

    override fun getCount(): Int {

        return 2

    }
}
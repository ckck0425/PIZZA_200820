package kr.co.tjoeun.pizza_200820.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.pizza_200820.Fragments.MyPageFragment
import kr.co.tjoeun.pizza_200820.Fragments.PizzaStoreFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){


    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "피자주문"
            else -> "내정보"
        }
    }

    override fun getItem(position: Int): Fragment {

        return when (position){
            0 -> PizzaStoreFragment()
            else -> MyPageFragment()
        }

    }

    override fun getCount(): Int {

        return 2

    }
}
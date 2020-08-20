package kr.co.tjoeun.pizza_200820.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.pizza_200820.R

class StoreAdapter (

    val mContext : context,
    val resId : Int,
    val mList : List<Store>

) : ArrayAdapter<store>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if tempRow == null {
            tempRow = inf.inflate(R.layout.fragment_pizza_store, null)
        }
        val row = tempRow!!
        return row
    }
}
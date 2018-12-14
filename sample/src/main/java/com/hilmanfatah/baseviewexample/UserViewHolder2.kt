package com.hilmanfatah.baseviewexample

import android.view.View
import com.hilmanfatah.baselistadapter.BaseRecyclerViewAdapter
import com.hilmanfatah.baselistadapter.viewholder.BaseItemViewHolder
import kotlinx.android.synthetic.main.user_item_view.view.*

/**
 * Created by Hilman N Fatah on 30/01/18.
 */
class UserViewHolder2(itemView: View,
                      mItemClickListener: BaseRecyclerViewAdapter.OnItemClickListener?,
                      mLongItemClickListener: BaseRecyclerViewAdapter.OnLongItemClickListener?)
    : BaseItemViewHolder<Any>(itemView, mItemClickListener, mLongItemClickListener) {
    override fun bind(data: Any, position: Int) {
        val datax: UserModel2? = data as? UserModel2 // Works
        if (datax != null) {
            itemView.tvNama.text = datax.name
            itemView.tvAlamat.text = datax.alamat
        }
        itemView.setOnClickListener { onClick(it) }
        itemView.setOnLongClickListener { onLongClick(it) }
    }
}
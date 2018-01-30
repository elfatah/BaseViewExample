package com.hilmanfatah.baseviewexample

import android.view.View
import com.hilmanfatah.baselistadapter.BaseRecyclerViewAdapter
import com.hilmanfatah.baselistadapter.viewholder.BaseItemViewHolder
import kotlinx.android.synthetic.main.user_item_view.view.*

/**
 * Created by Hilman N Fatah on 30/01/18.
 */
class UserViewHolder(itemView: View,
                     mItemClickListener: BaseRecyclerViewAdapter.OnItemClickListener?,
                     mLongItemClickListener: BaseRecyclerViewAdapter.OnLongItemClickListener?)
    : BaseItemViewHolder<UserModel>(itemView, mItemClickListener, mLongItemClickListener) {
    override fun bind(data: UserModel, position: Int) {

        itemView.tvNama.text = data.name
        itemView.tvAlamat.text = data.alamat
        itemView.setOnClickListener { onClick(it) }
        itemView.setOnLongClickListener { onLongClick(it) }
    }
}
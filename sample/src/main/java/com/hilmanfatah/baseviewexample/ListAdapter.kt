package com.hilmanfatah.baseviewexample

import android.content.Context
import android.view.ViewGroup
import com.hilmanfatah.baselistadapter.BaseRecyclerViewAdapter

/**
 * Created by Hilman N Fatah on 30/01/18.
 */
class ListAdapter(context: Context) : BaseRecyclerViewAdapter<UserModel, UserViewHolder>(context) {
    override fun getItemResourceLayout(viewType: Int): Int = R.layout.user_item_view

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): UserViewHolder =
            UserViewHolder(getView(parent!!, viewType), mItemClickListener, mLongItemClickListener)
}
package com.hilmanfatah.baseviewexample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.hilmanfatah.baselistadapter.BaseRecyclerViewAdapter
import com.hilmanfatah.baselistadapter.viewholder.BaseItemViewHolder

/**
 * Created by Hilman N Fatah on 30/01/18.
 */
class ListAdapter(context: Context) : BaseRecyclerViewAdapter<Any, BaseItemViewHolder<Any>>(context) {
    override fun getItemResourceLayout(viewType: Int): Int {
        when (viewType)
        {
            0 -> return R.layout.user_item_view
            1 -> return R.layout.user_item_view2
            else -> return -1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseItemViewHolder<Any> {
        when (viewType)
        {
            0 -> return UserViewHolder(getView(parent, viewType), mItemClickListener, mLongItemClickListener)
            1 -> return UserViewHolder2(getView(parent, viewType), mItemClickListener, mLongItemClickListener)
            else -> throw IllegalArgumentException("Valid View Type required")
        }

    }


    override fun getItemViewType(position: Int): Int {
        if (mDatas.get(position) is UserModel) {
            return 0
        } else if (mDatas.get(position) is UserModel2) {
            return 1
        } else
            return -1
    }
}
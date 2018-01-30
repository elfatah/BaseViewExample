![Release](https://jitpack.io/v/elfatah/BaseViewExample.svg)


# BaseViewExample

Base recyclerview adapter and viewholder to reduce code boilerplate in Kotlin.

Based on https://github.com/derohimat/android-base-mvp

# How to use

1. Create model

```
data class UserModel(val name: String, val alamat: String)
```

2. Create viewholder
```
class UserViewHolder(itemView: View,
                     mItemClickListener: BaseRecyclerViewAdapter.OnItemClickListener?,
                     mLongItemClickListener: BaseRecyclerViewAdapter.OnLongItemClickListener?)
    : BaseItemViewHolder<UserModel>(itemView, mItemClickListener, mLongItemClickListener) {
   
    override fun bind(data: UserModel, position: Int) {

        itemView.tvNama.text = data.name
        itemView.tvAlamat.text = data.alamat
        itemView.setOnClickListener { onClick(it) }
    }
}

```

3. Create adapter

```
class ListAdapter(context: Context) : BaseRecyclerViewAdapter<UserModel, UserViewHolder>(context) {
    
    override fun getItemResourceLayout(viewType: Int): Int = R.layout.user_item_view

   
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): UserViewHolder =
            UserViewHolder(getView(parent!!, viewType), mItemClickListener, mLongItemClickListener)
}

```

# Installation

1. Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}

```
2.Add the dependency

	dependencies {
	        implementation 'com.github.elfatah:BaseViewExample:v1.0.0'
	}
	
# License

Copyright (C) 2018 Hilman N Fatah

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
	

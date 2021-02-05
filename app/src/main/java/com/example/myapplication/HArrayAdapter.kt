package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class HArrayAdapter(context: Context, resource: Int, item: Array<String>) : ArrayAdapter<String>(context,resource,item){

    private val mContext = context
    private val mItem = item
    private val mResource = resource
    //리스트에 들어갈 View를 지정해줌.
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        lateinit var viewHolder : ViewHolder
        var view = convertView
        if (view == null){
            viewHolder = ViewHolder()
            view = LayoutInflater.from(mContext).inflate(mResource,parent,false)

            viewHolder.textView = view.findViewById(R.id.textTitle)
            viewHolder.textView = view.findViewById(R.id.textDate)
            view.tag = viewHolder
            viewHolder.textView.text = mItem[position]
            return view
        }else{
            viewHolder = view.tag as ViewHolder
        }
        viewHolder.textView.text = mItem[position]
        return  view
    }

    //리스트뷰의 성능을 높히기 위해 사용
    inner class ViewHolder{
        lateinit var textView : TextView

    }

}
package com.ankitpatelsandroidapplication.app.modules.myorder.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowMyorder2Binding
import com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model.Myorder2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup240Adapter(
  public var list: List<Myorder2RowModel>
) : RecyclerView.Adapter<RecyclerGroup240Adapter.RowMyorder2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyorder2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_myorder2,parent,false)
    return RowMyorder2VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyorder2VH, position: Int): Unit {
    val myorder2RowModel = Myorder2RowModel()
    // TODO uncomment following line after integration with data source
    // val myorder2RowModel = list[position]
    holder.binding.myorder2RowModel = myorder2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Myorder2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Myorder2RowModel
    ): Unit {
    }
  }

  public inner class RowMyorder2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyorder2Binding = RowMyorder2Binding.bind(itemView)
  }
}

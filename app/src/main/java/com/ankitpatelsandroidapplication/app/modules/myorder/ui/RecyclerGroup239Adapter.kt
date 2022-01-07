package com.ankitpatelsandroidapplication.app.modules.myorder.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowMyorder1Binding
import com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model.Myorder1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup239Adapter(
  public var list: List<Myorder1RowModel>
) : RecyclerView.Adapter<RecyclerGroup239Adapter.RowMyorder1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyorder1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_myorder1,parent,false)
    return RowMyorder1VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyorder1VH, position: Int): Unit {
    val myorder1RowModel = Myorder1RowModel()
    // TODO uncomment following line after integration with data source
    // val myorder1RowModel = list[position]
    holder.binding.myorder1RowModel = myorder1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Myorder1RowModel>): Unit {
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
      item: Myorder1RowModel
    ): Unit {
    }
  }

  public inner class RowMyorder1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyorder1Binding = RowMyorder1Binding.bind(itemView)
  }
}

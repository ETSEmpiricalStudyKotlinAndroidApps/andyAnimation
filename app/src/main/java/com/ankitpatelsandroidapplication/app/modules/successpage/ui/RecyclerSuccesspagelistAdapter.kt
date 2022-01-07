package com.ankitpatelsandroidapplication.app.modules.successpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowSuccesspage1Binding
import com.ankitpatelsandroidapplication.app.modules.successpage.`data`.model.Successpage1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerSuccesspagelistAdapter(
  public var list: List<Successpage1RowModel>
) : RecyclerView.Adapter<RecyclerSuccesspagelistAdapter.RowSuccesspage1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSuccesspage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_successpage1,parent,false)
    return RowSuccesspage1VH(view)
  }

  public override fun onBindViewHolder(holder: RowSuccesspage1VH, position: Int): Unit {
    val successpage1RowModel = Successpage1RowModel()
    // TODO uncomment following line after integration with data source
    // val successpage1RowModel = list[position]
    holder.binding.successpage1RowModel = successpage1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Successpage1RowModel>): Unit {
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
      item: Successpage1RowModel
    ): Unit {
    }
  }

  public inner class RowSuccesspage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSuccesspage1Binding = RowSuccesspage1Binding.bind(itemView)
  }
}

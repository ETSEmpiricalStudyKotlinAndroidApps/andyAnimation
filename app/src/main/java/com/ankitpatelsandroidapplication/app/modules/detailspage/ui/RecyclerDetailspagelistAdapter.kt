package com.ankitpatelsandroidapplication.app.modules.detailspage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowDetailspage1Binding
import com.ankitpatelsandroidapplication.app.modules.detailspage.`data`.model.Detailspage1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerDetailspagelistAdapter(
  public var list: List<Detailspage1RowModel>
) : RecyclerView.Adapter<RecyclerDetailspagelistAdapter.RowDetailspage1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailspage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detailspage1,parent,false)
    return RowDetailspage1VH(view)
  }

  public override fun onBindViewHolder(holder: RowDetailspage1VH, position: Int): Unit {
    val detailspage1RowModel = Detailspage1RowModel()
    // TODO uncomment following line after integration with data source
    // val detailspage1RowModel = list[position]
    holder.binding.detailspage1RowModel = detailspage1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Detailspage1RowModel>): Unit {
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
      item: Detailspage1RowModel
    ): Unit {
    }
  }

  public inner class RowDetailspage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDetailspage1Binding = RowDetailspage1Binding.bind(itemView)
  }
}

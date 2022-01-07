package com.ankitpatelsandroidapplication.app.modules.productpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowProductpage1Binding
import com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model.Productpage1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup461Adapter(
  public var list: List<Productpage1RowModel>
) : RecyclerView.Adapter<RecyclerGroup461Adapter.RowProductpage1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductpage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_productpage1,parent,false)
    return RowProductpage1VH(view)
  }

  public override fun onBindViewHolder(holder: RowProductpage1VH, position: Int): Unit {
    val productpage1RowModel = Productpage1RowModel()
    // TODO uncomment following line after integration with data source
    // val productpage1RowModel = list[position]
    holder.binding.productpage1RowModel = productpage1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Productpage1RowModel>): Unit {
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
      item: Productpage1RowModel
    ): Unit {
    }
  }

  public inner class RowProductpage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProductpage1Binding = RowProductpage1Binding.bind(itemView)
  }
}

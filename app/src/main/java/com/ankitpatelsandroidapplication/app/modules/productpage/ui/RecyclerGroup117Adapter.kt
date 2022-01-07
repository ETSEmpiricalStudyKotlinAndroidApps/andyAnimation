package com.ankitpatelsandroidapplication.app.modules.productpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowProductpage2Binding
import com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model.Productpage2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup117Adapter(
  public var list: List<Productpage2RowModel>
) : RecyclerView.Adapter<RecyclerGroup117Adapter.RowProductpage2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductpage2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_productpage2,parent,false)
    return RowProductpage2VH(view)
  }

  public override fun onBindViewHolder(holder: RowProductpage2VH, position: Int): Unit {
    val productpage2RowModel = Productpage2RowModel()
    // TODO uncomment following line after integration with data source
    // val productpage2RowModel = list[position]
    holder.binding.productpage2RowModel = productpage2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Productpage2RowModel>): Unit {
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
      item: Productpage2RowModel
    ): Unit {
    }
  }

  public inner class RowProductpage2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProductpage2Binding = RowProductpage2Binding.bind(itemView)
    init {
      binding.linearGroup.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Productpage2RowModel())
      }
    }
  }
}

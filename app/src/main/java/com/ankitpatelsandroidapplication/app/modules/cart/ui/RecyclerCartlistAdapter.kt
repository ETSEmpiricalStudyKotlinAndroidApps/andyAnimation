package com.ankitpatelsandroidapplication.app.modules.cart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowCart1Binding
import com.ankitpatelsandroidapplication.app.modules.cart.`data`.model.Cart1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerCartlistAdapter(
  public var list: List<Cart1RowModel>
) : RecyclerView.Adapter<RecyclerCartlistAdapter.RowCart1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCart1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cart1,parent,false)
    return RowCart1VH(view)
  }

  public override fun onBindViewHolder(holder: RowCart1VH, position: Int): Unit {
    val cart1RowModel = Cart1RowModel()
    // TODO uncomment following line after integration with data source
    // val cart1RowModel = list[position]
    holder.binding.cart1RowModel = cart1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Cart1RowModel>): Unit {
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
      item: Cart1RowModel
    ): Unit {
    }
  }

  public inner class RowCart1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCart1Binding = RowCart1Binding.bind(itemView)
  }
}

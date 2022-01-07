package com.ankitpatelsandroidapplication.app.modules.paymentpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowPaymentpage1Binding
import com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model.Paymentpage1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup189Adapter(
  public var list: List<Paymentpage1RowModel>
) : RecyclerView.Adapter<RecyclerGroup189Adapter.RowPaymentpage1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPaymentpage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_paymentpage1,parent,false)
    return RowPaymentpage1VH(view)
  }

  public override fun onBindViewHolder(holder: RowPaymentpage1VH, position: Int): Unit {
    val paymentpage1RowModel = Paymentpage1RowModel()
    // TODO uncomment following line after integration with data source
    // val paymentpage1RowModel = list[position]
    holder.binding.paymentpage1RowModel = paymentpage1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Paymentpage1RowModel>): Unit {
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
      item: Paymentpage1RowModel
    ): Unit {
    }
  }

  public inner class RowPaymentpage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPaymentpage1Binding = RowPaymentpage1Binding.bind(itemView)
  }
}

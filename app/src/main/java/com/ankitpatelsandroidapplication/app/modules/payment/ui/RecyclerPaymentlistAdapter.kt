package com.ankitpatelsandroidapplication.app.modules.payment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowPayment1Binding
import com.ankitpatelsandroidapplication.app.modules.payment.`data`.model.Payment1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerPaymentlistAdapter(
  public var list: List<Payment1RowModel>
) : RecyclerView.Adapter<RecyclerPaymentlistAdapter.RowPayment1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPayment1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_payment1,parent,false)
    return RowPayment1VH(view)
  }

  public override fun onBindViewHolder(holder: RowPayment1VH, position: Int): Unit {
    val payment1RowModel = Payment1RowModel()
    // TODO uncomment following line after integration with data source
    // val payment1RowModel = list[position]
    holder.binding.payment1RowModel = payment1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Payment1RowModel>): Unit {
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
      item: Payment1RowModel
    ): Unit {
    }
  }

  public inner class RowPayment1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPayment1Binding = RowPayment1Binding.bind(itemView)
  }
}

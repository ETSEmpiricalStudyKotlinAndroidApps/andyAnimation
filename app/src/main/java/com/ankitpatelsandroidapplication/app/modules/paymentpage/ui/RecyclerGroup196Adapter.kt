package com.ankitpatelsandroidapplication.app.modules.paymentpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.databinding.RowPaymentpage2Binding
import com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model.Paymentpage2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup196Adapter(
  public var list: List<Paymentpage2RowModel>
) : RecyclerView.Adapter<RecyclerGroup196Adapter.RowPaymentpage2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPaymentpage2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_paymentpage2,parent,false)
    return RowPaymentpage2VH(view)
  }

  public override fun onBindViewHolder(holder: RowPaymentpage2VH, position: Int): Unit {
    val paymentpage2RowModel = Paymentpage2RowModel()
    // TODO uncomment following line after integration with data source
    // val paymentpage2RowModel = list[position]
    holder.binding.paymentpage2RowModel = paymentpage2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Paymentpage2RowModel>): Unit {
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
      item: Paymentpage2RowModel
    ): Unit {
    }
  }

  public inner class RowPaymentpage2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPaymentpage2Binding = RowPaymentpage2Binding.bind(itemView)
  }
}

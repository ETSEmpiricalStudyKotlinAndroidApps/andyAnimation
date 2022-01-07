package com.ankitpatelsandroidapplication.app.modules.myorder.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseFragment
import com.ankitpatelsandroidapplication.app.databinding.FragmentMyorderBinding
import com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model.Myorder1RowModel
import com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model.Myorder2RowModel
import com.ankitpatelsandroidapplication.app.modules.myorder.`data`.viewmodel.MyorderVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class MyorderFragment : BaseFragment<FragmentMyorderBinding>(R.layout.fragment_myorder) {
  private val viewModel: MyorderVM by viewModels<MyorderVM>()

  public override fun onInitialized(): Unit {
    val recyclerGroup239Adapter =
    RecyclerGroup239Adapter(viewModel.recyclerGroup239List.value?:mutableListOf())
    binding.recyclerGroup239.adapter = recyclerGroup239Adapter
    recyclerGroup239Adapter.setOnItemClickListener(
    object : RecyclerGroup239Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Myorder1RowModel) {
        onClickRecyclerGroup239(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup239List.observe(requireActivity()) {
      recyclerGroup239Adapter.updateData(it)
    }
    val recyclerGroup240Adapter =
    RecyclerGroup240Adapter(viewModel.recyclerGroup240List.value?:mutableListOf())
    binding.recyclerGroup240.adapter = recyclerGroup240Adapter
    recyclerGroup240Adapter.setOnItemClickListener(
    object : RecyclerGroup240Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Myorder2RowModel) {
        onClickRecyclerGroup240(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup240List.observe(requireActivity()) {
      recyclerGroup240Adapter.updateData(it)
    }
    binding.myorderVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup239(
    view: View,
    position: Int,
    item: Myorder1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup240(
    view: View,
    position: Int,
    item: Myorder2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "MYORDER_FRAGMENT"
  }
}

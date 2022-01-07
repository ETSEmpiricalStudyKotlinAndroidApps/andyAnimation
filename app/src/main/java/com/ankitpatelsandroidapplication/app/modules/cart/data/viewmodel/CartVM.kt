package com.ankitpatelsandroidapplication.app.modules.cart.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.cart.`data`.model.Cart1RowModel
import com.ankitpatelsandroidapplication.app.modules.cart.`data`.model.CartModel
import kotlin.collections.MutableList

public class CartVM : ViewModel() {
  public val cartModel: MutableLiveData<CartModel> = MutableLiveData(CartModel())

  public val recyclerCartlistList: MutableLiveData<MutableList<Cart1RowModel>> =
      MutableLiveData(mutableListOf())
}

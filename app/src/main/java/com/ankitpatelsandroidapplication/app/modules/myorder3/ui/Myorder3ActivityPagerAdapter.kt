package com.ankitpatelsandroidapplication.app.modules.myorder3.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import com.ankitpatelsandroidapplication.app.modules.myorder.ui.MyorderFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class Myorder3ActivityPagerAdapter(
    public val fragmentManager: FragmentManager,
    public val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    public override fun getItemCount(): Int = viewPages.size

    public override fun createFragment(position: Int): Fragment = viewPages[position]

    public companion object AdapterConstant {
        public val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_complete_orders),MyApp.getInstance().resources.getString(R.string.lbl_pending_orders))

        public val viewPages: List<Fragment> = listOf(MyorderFragment(),MyorderFragment())

    }
}

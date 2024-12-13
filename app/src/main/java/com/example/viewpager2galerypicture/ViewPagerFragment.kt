package com.example.viewpager2galerypicture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPagerTV: TextView = view.findViewById(R.id.viewTitleTV)
        val viewPagerIV: ImageView = view.findViewById(R.id.viewPagerIV)
        val viewAuthorTV: TextView = view.findViewById(R.id.viewAuthorTV)

        val viewPagerItem = arguments?.getSerializable("vp") as Picture

        viewPagerTV.text = viewPagerItem.title
        viewPagerIV.setImageResource(viewPagerItem.imageView)
        viewAuthorTV.text = viewPagerItem.author
    }
}
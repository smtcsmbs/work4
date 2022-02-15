package com.example.workfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import com.example.workfour.databinding.FragmentAltIkinciBinding


class AltIkinciFragment : Fragment() {
    private lateinit var tasarim : FragmentAltIkinciBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAltIkinciBinding.inflate(inflater, container, false)


        return tasarim.root

    }


}
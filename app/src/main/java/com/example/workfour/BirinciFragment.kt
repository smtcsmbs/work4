package com.example.workfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.workfour.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {
    private lateinit var tasarim: FragmentBirinciBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentBirinciBinding.inflate(inflater, container, false)

        tasarim.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_birinciFragment_to_ikinciFragment)
        }

        return tasarim.root
    }

}
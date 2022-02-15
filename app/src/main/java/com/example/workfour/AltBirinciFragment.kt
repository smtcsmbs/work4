package com.example.workfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.workfour.databinding.FragmentAltBirinciBinding

class AltBirinciFragment : Fragment() {

    private lateinit var tasarim : FragmentAltBirinciBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim =  FragmentAltBirinciBinding.inflate(inflater, container, false)

        tasarim.altIkiGec.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_altBirinciFragment_to_altIkinciFragment)
        }

        return tasarim.root
    }

}
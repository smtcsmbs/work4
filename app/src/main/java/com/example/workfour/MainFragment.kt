package com.example.workfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.workfour.databinding.FragmentMainBinding


class MainFragment : Fragment() {
private lateinit var tasarim: FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentMainBinding.inflate(inflater,container,false)



        tasarim.buttonToBirinciSayfa.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_birinciFragment)
        }
        tasarim.buttonToAltBirinciSayfa.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_altBirinciFragment)
        }



        return tasarim.root
    }


}
package com.example.syntaxis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FourthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonFirst4 = view.findViewById<Button>(R.id.buttonFirst4)
        val buttonSecond4 = view.findViewById<Button>(R.id.buttonSecond4)
        val buttonThird4 = view.findViewById<Button>(R.id.buttonThird4)

        buttonFirst4?.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFragment_to_blankFragment)

        }
        buttonSecond4?.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFragment_to_secondFragment)

        }
        buttonThird4?.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFragment_to_thirdFragment)

        }
    }
}
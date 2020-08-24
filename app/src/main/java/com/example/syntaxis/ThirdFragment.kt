package com.example.syntaxis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonFirst3 = view.findViewById<Button>(R.id.buttonFirst3)
        val buttonSecond3 = view.findViewById<Button>(R.id.buttonSecond3)
        val buttonFourth3 = view.findViewById<Button>(R.id.buttonFourth3)

        buttonFirst3?.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_blankFragment)

        }
        buttonSecond3?.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)

        }
        buttonFourth3?.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment)

        }
    }
}
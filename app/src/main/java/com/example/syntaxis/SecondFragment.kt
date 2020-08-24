package com.example.syntaxis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonFirst2 = view.findViewById<Button>(R.id.buttonFirst2)
        val buttonThird2 = view.findViewById<Button>(R.id.buttonThird2)
        val buttonFourth2 = view.findViewById<Button>(R.id.buttonFourth2)

        buttonFirst2?.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_blankFragment)

        }
        buttonThird2?.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)

        }
        buttonFourth2?.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_fourthFragment)

        }
    }
}
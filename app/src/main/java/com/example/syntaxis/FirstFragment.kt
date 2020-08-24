package com.example.syntaxis


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    @SuppressLint("ResourceAsColor")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        val button = view?.findViewById<Button>(R.id.colorButton)
//        val listColors = listOf(
//                R.color.azure,
//                R.color.blue,
//                R.color.violet,
//                R.color.teal_700,
//                R.color.purple_700,
//                R.color.black,
//                R.color.white,
//                R.color.bright_pink,
//                R.color.red,
//                R.color.orange,
//                R.color.yellow,
//                R.color.chartreuse,
//                R.color.green,
//                R.color.spring_green,
//                R.color.cyan,
//                R.color.teal_200,
//                R.color.purple_200,
//                R.color.magenta)


//        var colorsarray = arrayOfNulls<Int>(19)
//                colorsarray[0]= R.color.purple_200
//                colorsarray[1]= R.color.violet
//                colorsarray[2]= R.color.cyan
//                colorsarray[3]= R.color.purple_700
//                colorsarray[4]= R.color.black
//                colorsarray[5]= R.color.white
//                colorsarray[6]= R.color.bright_pink
//                colorsarray[7]= R.color.red
//                colorsarray[8]= R.color.orange
//                colorsarray[9]= R.color.yellow
//                colorsarray[10]= R.color.chartreuse
//                colorsarray[11]= R.color.green
//                colorsarray[12]= R.color.spring_green
//                colorsarray[13]= R.color.teal_700
//                colorsarray[14]= R.color.azure
//                colorsarray[15]= R.color.blue
//                colorsarray[16]= R.color.teal_200
//                colorsarray[17]= R.color.magenta
//                colorsarray[18]= R.color.purple_500


//        val rnd = Random()
//
//        listColors.add(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)))
//
//        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
////        button.setBackgroundColor(color)


        var counter = 0
        button?.setOnClickListener {
            counter++
            when (counter) {
                1 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.bright_pink)
                )
                2 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.red)
                )
                3 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.orange)
                )
                4 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.yellow)
                )
                5 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.chartreuse)
                )
                6 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.green)
                )
                7 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.spring_green)
                )
                8 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.cyan)
                )
                9 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.azure)
                )
                10 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.blue)
                )
                11 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.violet)
                )
                12 -> button.setBackgroundTintList(
                    context?.getResources()?.getColorStateList(R.color.magenta)
                )
                else -> counter = 0
            }

        }

        val buttonSecont1 = view?.findViewById<Button>(R.id.buttonSecont1)
        val buttonThird1 = view?.findViewById<Button>(R.id.buttonThird1)
        val buttonFourth1 = view?.findViewById<Button>(R.id.buttonFourth1)


        buttonSecont1?.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_secondFragment)

        }
        buttonThird1?.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_thirdFragment)

        }
        buttonFourth1?.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_fourthFragment)

        }

        val nextActivity = view?.findViewById<Button>(R.id.buttonNext2)

        nextActivity?.setOnClickListener {
            nextActiv()
        }
    }

    fun nextActiv() {

        val nextIntent = Intent(context, MainActivity2::class.java)
        startActivity(nextIntent)
    }
}


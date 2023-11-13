package com.example.calculator
import android.annotation.SuppressLint
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.math.RoundingMode


@SuppressLint("SetTextI18n")
fun calculatorLogic (binding: ActivityMainBinding) {
    binding.acId.setOnClickListener {
binding.textview1Id.text = ""
        binding.textview2Id.text = ""
    }

    binding.backspace.setOnClickListener {
       binding.textview1Id.text =  binding.textview1Id.text.toString().dropLast(1)
    }

    binding.one.setOnClickListener {
        binding.textview1Id.append("1")
       
    }
    binding.two.setOnClickListener {
        binding.textview1Id.append("2")
   
    }
    binding.three.setOnClickListener {
        binding.textview1Id.append("3")
        
    }
    binding.four.setOnClickListener {
        binding.textview1Id.append("4")
        
    }
    binding.five.setOnClickListener {
        binding.textview1Id.append("5")
        
    }

    binding.six.setOnClickListener {
        binding.textview1Id.append("6")
         
    }
    binding.sevenId.setOnClickListener {
        binding.textview1Id.append("7")

         
    }
    binding.eight.setOnClickListener {
        binding.textview1Id.append("8")
         
    }
    binding.nine.setOnClickListener {
        binding.textview1Id.append("9")
         
    }
    binding.zero.setOnClickListener {
        binding.textview1Id.append("0")
         
    }

    binding.doublezero.setOnClickListener {
        binding.textview1Id.append("00")
    }




   // nothings to do here just leave
    binding.add.setOnClickListener {
        binding.textview1Id.append("+")
    }

    binding.minus.setOnClickListener {
        binding.textview1Id.append("-")

    }
    binding.multiple.setOnClickListener {
        binding.textview1Id.append("*")

    }
    binding.divide.setOnClickListener {
        binding.textview1Id.append("/")

    }
    binding.modulus.setOnClickListener {
        binding.textview1Id.append("%")

    }
    binding.dot.setOnClickListener {
        binding.textview1Id.append(".")

    }



      binding.equal.setOnClickListener {

          val expression = ExpressionBuilder(binding.textview1Id.text.toString()).build()
          val result = expression.evaluate()
          if (result.toFloat().toDouble() == result ){
              binding.textview2Id.text = result.toInt().toString()
          }else{

              binding.textview2Id.text =  result.toBigDecimal().setScale(2, RoundingMode.CEILING).toString()
          }

      }


}


    




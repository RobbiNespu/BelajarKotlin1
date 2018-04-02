package robbinespu.github.com.myapplication1.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//  Button function +. -. * and /
    fun sum(view: View){
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()
        val result = a+b
        textView2.text= "Result: $result"

    }

    fun minus(view: View){
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()
        val result = a-b
        textView2.text= "Result: $result"
    }

    fun multiply(view: View){
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()
        val result = a*b
        textView2.text= "Result: $result"
    }

    fun divide(view: View){
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()
        val result = a/b
        textView2.text= "Result: $result"
    }
}

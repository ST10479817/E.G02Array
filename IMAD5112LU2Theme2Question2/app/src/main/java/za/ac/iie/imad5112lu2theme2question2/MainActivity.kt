package za.ac.iie.imad5112lu2theme2question2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.edtNum1)
        val num2 = findViewById<EditText>(R.id.edtNum2)
        val num3 = findViewById<EditText>(R.id.edtNum3)
        val result = findViewById<TextView>(R.id.txtResult)  // Correct ID for displaying result
        val btnMark = findViewById<Button>(R.id.btnMark)

        btnMark.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number3 = num3.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null && number3 != null) {
                val FinalMark=(number1*0.25)+(number2*0.35)+(number3*0.40)
                result.text="FinalMark: %.2f%%".format(FinalMark)

            }


        }
        //adding array




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
package fr.bilog.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LibFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib_first)
        initListener()



    }

    fun initListener(){
        findViewById<Button>(R.id.nextActBtn).setOnClickListener {
            try {
                val intent = Intent(this, Class.forName("fr.bilog.blinkingeffectlibrary.LibSecondActivity"))
                startActivity(intent)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }
    }
}
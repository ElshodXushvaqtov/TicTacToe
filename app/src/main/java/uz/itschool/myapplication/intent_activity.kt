package uz.itschool.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import kotlinx.android.synthetic.main.activity_main.*

class intent_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        start.setOnClickListener{
            callActivity()
        }

    }
    private fun callActivity(){
        var x_message=X_player.text.toString()
        var o_message=O_player.text.toString()
        var intent=Intent(this,MainActivity::class.java).also{
            it.putExtra("X_message",x_message)
            it.putExtra("O_message",o_message)
            startActivity(it)
        }
    }
}


package co.edu.eam.unishop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager

class RestorePasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_login)
        setContentView(R.layout.activity_restore_password)

    }
    fun changePassword(view: View){
        Log.e("Main Activity","Se hizo click en el botón cambiar contraseña")
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
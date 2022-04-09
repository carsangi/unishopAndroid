package co.edu.eam.unishop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_login)
    }
    fun forgotPassword(view: View){
        Log.e("Main Activity","Se hizo click en el botón restaurar contraseña")
        val intent = Intent(this, RestorePasswordActivity::class.java)
        startActivity(intent)
    }
    fun gotoSingUp(view:View){
        Log.e("Main Activity","Se hizo click en el botón registrase")
        val intent = Intent(this, SingUpActivity::class.java)
        startActivity(intent)
    }
    fun login(view:View){
        if (findViewById<TextView>(R.id.txtemaillogin).toString().isEmpty() ||
            findViewById<TextView>(R.id.txtpasswordlogin).toString().isEmpty()){

        }else{

        }
        Log.e("Main Activity","Se hizo click en el botón Iniciar Sesion")
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
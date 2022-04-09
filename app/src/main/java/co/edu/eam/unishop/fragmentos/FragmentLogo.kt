package co.edu.eam.unishop.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import co.edu.eam.unishop.R

class FragmentLogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_fragmento_logo)
    }
}
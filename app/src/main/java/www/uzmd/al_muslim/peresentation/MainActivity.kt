package www.uzmd.al_muslim.peresentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.uzmd.al_muslim.R
import www.uzmd.al_muslim.peresentation.ui.register.RegisterFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,RegisterFragment()).commit()
    }
}
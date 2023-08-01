package com.example.ejercicio7m5.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.ejercicio7m5.Presenter.PasswordInterface
import com.example.ejercicio7m5.Presenter.PasswordPresenter
import com.example.ejercicio7m5.R
import com.example.ejercicio7m5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), PasswordInterface.View {

    private lateinit var presenter: PasswordInterface.Presenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        presenter = PasswordPresenter(this)

        binding.buttonTest.setOnClickListener {
            val password = binding.passwordEditText.text.toString()
            presenter.EscribiendoPass(password)
        }

    }


    override fun Actualizarfortaleza(strength: Int) {
        val strengthText = when (strength) {
            0 -> {
                Toast.makeText(this,"Contraseña Débil",Toast.LENGTH_SHORT).show()
                binding.Password.setBackgroundColor(ContextCompat.getColor(this, R.color.weak_color))
                "Débil"

            }

            1 -> {
                Toast.makeText(this,"Contraseña Media",Toast.LENGTH_SHORT).show()
                binding.Password.setBackgroundColor(ContextCompat.getColor(this, R.color.medium_color))
                "Media"
            }

            2 -> {
                Toast.makeText(this,"Contraseña Fuerte",Toast.LENGTH_SHORT).show()
                binding.Password.setBackgroundColor(ContextCompat.getColor(this, R.color.strong_color))
                "Fuerte"
            }

            else -> "Desconocida"
        }
        binding.Password.text = "Fortaleza: $strengthText"
    }


}
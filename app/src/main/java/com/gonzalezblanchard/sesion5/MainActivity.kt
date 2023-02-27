package com.gonzalezblanchard.sesion5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gonzalezblanchard.sesion5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.text = "Cambiar pantalla"
    }

    fun cambiarPantalla(view: View){
        val intent = Intent(this, DetailActivity::class.java);
        startActivity(intent)
    }

}
package edu.iest.androidwear

import android.app.Activity
import android.os.Bundle
import edu.iest.androidwear.databinding.ActivityRelojBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityRelojBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRelojBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvSaludo.text = "QUE ONDA KRNAL"
        binding.bnCambio.text = "Enviar"
    }
}
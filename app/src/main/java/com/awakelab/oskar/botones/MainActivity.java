package com.awakelab.oskar.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.awakelab.oskar.botones.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding; //atributo abajo de class Main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); //abajo del super
        setContentView(binding.getRoot()); //Reemplaza R.layout.activity_main
        initListeners();
    }

    private void initListeners() {
        binding.button1.setOnClickListener(v -> Toast.makeText(this,"Modo avion desactivado",Toast.LENGTH_SHORT).show());
        binding.button2.setOnClickListener(v -> Toast.makeText(this,"Perfil actualizado",Toast.LENGTH_SHORT).show());
        binding.button3.setOnClickListener(v -> Toast.makeText(this,"Imagen guardada",Toast.LENGTH_SHORT).show());
        binding.button4.setOnClickListener(v -> Toast.makeText(this,"Desbloquedo nivel 5",Toast.LENGTH_SHORT).show());
        binding.button5.setOnClickListener(v -> Toast.makeText(this,"Felicidades nivel 4 terminado",Toast.LENGTH_SHORT).show());
        binding.button6.setOnClickListener(v -> Toast.makeText(this,"Musica pausada",Toast.LENGTH_SHORT).show());
    }
}
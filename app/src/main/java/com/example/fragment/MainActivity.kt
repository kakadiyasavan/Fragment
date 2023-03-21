package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Data.setOnClickListener {

            var dataFragment:DataFragment = DataFragment()
            var manager: FragmentManager = supportFragmentManager
            var transaction: FragmentTransaction = manager.beginTransaction()
            transaction.replace(R.id.fragframe,dataFragment)
            transaction.commit()
        }
    }
}
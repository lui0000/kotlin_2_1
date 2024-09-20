package com.example.kotlin2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.kotlin2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentManager = supportFragmentManager
        binding.buttonFirst.setOnClickListener {
            replaysFragment(Fragment1())

        }
        binding.buttonSecond.setOnClickListener {
            replaysFragment(Fragment2())

        }
        binding.buttonThird.setOnClickListener {
            replaysFragment(Fragment3())

        }
    }

    private fun replaysFragment(fragment : Fragment) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}


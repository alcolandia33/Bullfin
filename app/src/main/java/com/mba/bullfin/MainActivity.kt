package com.mba.bullfin

import android.os.Bundle
import android.view.Window
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.mba.bullfin.databinding.ActivityMainBinding
import com.mba.bullfin.databinding.FragmentManageBinding
import com.mba.bullfin.mockups.PoputMockups
import com.mba.bullfin.utilities.Variables

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val myDatapoput = PoputMockups().loadPoput()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        setContentView(binding.root)

        //

        var dialog=  Poput(myDatapoput[0])
        dialog.show(FragmentManageBinding,"P")


        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_academia, R.id.navigation_manage, R.id.navigation_estado, R.id.navigation_perfil
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    fun poputAction(value:Int){

    }


}
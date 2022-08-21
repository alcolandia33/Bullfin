package com.mba.bullfin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import  com.mba.bullfin.utilities.Variables
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mba.bullfin.models.PoputModels

//
class Poput(var objpoput: PoputModels) : DialogFragment() {





    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        var rootView: View= inflater.inflate(R.layout.activity_poput,container,false)
        var poputtitle: TextView =  rootView.findViewById(R.id.titlepoput);
        var poputcontent: TextView =  rootView.findViewById(R.id.contentpoput);
        var poputimage: ImageView =  rootView.findViewById(R.id.imagepoput);

        poputtitle.text= objpoput.titulo
        poputcontent.text= objpoput.contenido
        poputimage.setImageResource(objpoput.imageResourceId)
        if (objpoput.visible==1){
            poputimage.visibility = View.VISIBLE
        }else{
            poputimage.visibility = View.GONE
        }


        var far: TextView =  rootView.findViewById(R.id.continuar);
        far.setOnClickListener{
            onDestroyView()
        }


        return rootView


    }




    override fun onDestroyView() {
        Variables.poputList.add(Variables.poputcambio)
        println(Variables.poputList)
        super.onDestroyView()
        Variables.poputcambio= Variables.poputcambio+1

    }



}
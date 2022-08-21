package com.mba.bullfin.utilities
import androidx.fragment.app.FragmentManager
import com.mba.bullfin.Poput
import com.mba.bullfin.databinding.FragmentManageBinding
import com.mba.bullfin.models.PoputModels
import com.mba.bullfin.mockups.PoputMockups
import com.mba.bullfin.utilities.Variables

class Variables {

    companion object {
        var poputList = mutableListOf(-1)
        var poputcambio= 0

        //var poputobject: List<PoputModels> =listOf()

    }

    fun setPoputcambio(value:Int){
        poputcambio= value

        if (Variables.poputList.size==1) {

        }

    }







}
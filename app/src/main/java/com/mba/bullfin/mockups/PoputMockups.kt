package com.mba.bullfin.mockups
import com.mba.bullfin.R
import com.mba.bullfin.models.PoputModels


class PoputMockups {

    fun loadPoput(): List<PoputModels> {
        return listOf<PoputModels>(
            PoputModels("Bienvenidos","  \n Estas a un paso de tener un negocio mas rentable!!\n\nA continuacion daremos un tour para conocer las funcionaidades basicas\n", R.drawable.ic_academia,0),
            PoputModels("Academia"," Esta primera ventana te capacitaras en conceptos financiers que te ayudaran a comprender temas sobre: \n " +
                    "- Estados Finacieros\n- Analisis finaciero\n- Presupuesto", R.drawable.pruebagorro,1),

        )
    }
}
package com.example.apm_actividad1

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Bienvenida: AppCompatActivity() {

    private lateinit var imageAndroid: ImageView
    private lateinit var imageIos: ImageView
    private lateinit var bienvenidaLayout: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        imageAndroid = findViewById(R.id.imageAndroid)
        imageIos = findViewById(R.id.imageIos)

        imageAndroid.setOnClickListener {
            toggleImageSizeSUPERFUNNY(imageAndroid, imageIos)
        }

        imageIos.setOnClickListener {
            toggleImageSizeSUPERFUNNY(imageIos, imageAndroid)

        }
    }
    private fun toggleImageSizeSUPERFUNNY(agrandar: ImageView, achicar: ImageView) {

        if(!agrandar.isSelected) {
            agrandar.animate().scaleX(1.3f).scaleY(1.3f).translationX(0f).translationY(0f)
                .withEndAction()
                {
                    agrandar.isSelected = true
                }
            achicar.animate().scaleX(0.5f).scaleY(0.5f).translationX(0f).translationY(0f)
                .withEndAction()
                {
                    achicar.isSelected = false
                }
        }
        else{
            agrandar.animate().scaleX(1.0f).scaleY(1.0f).translationX(0f).translationY(0f)
                .withEndAction()
                {
                    agrandar.isSelected = false
                }
            achicar.animate().scaleX(1.0f).scaleY(1.0f).translationX(0f).translationY(0f)
                .withEndAction()
                {
                    achicar.isSelected = false
                }
        }
    }

}
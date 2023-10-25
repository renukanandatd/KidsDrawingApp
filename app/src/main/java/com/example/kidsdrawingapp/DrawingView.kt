package com.example.kidsdrawingapp

import android.content.Context
import android.util.AttributeSet
import android.view.View

class DrawingView(context : Context, attrs: AttributeSet): View(context,attrs) {

    private var mDrawPath : CustomPath? = null

    internal inner class CustomPath {

    }
}
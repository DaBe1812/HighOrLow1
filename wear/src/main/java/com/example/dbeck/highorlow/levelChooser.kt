package com.example.dbeck.highorlow

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class levelChooser : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_chooser)

        // Enables Always-on
        setAmbientEnabled()
    }
}

package com.example.officecrimes

import android.app.Application

class OfficeCrimesApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}

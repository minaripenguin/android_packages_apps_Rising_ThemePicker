package com.rising.android.customization.picker

import android.app.Application;

import com.android.wallpaper.module.InjectorProvider;

import com.rising.android.customization.module.RisingCustomizationInjector;

public class RisingCustomizationPickerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(RisingCustomizationInjector());
    }

}

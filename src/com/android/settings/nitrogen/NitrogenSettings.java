package com.android.settings.nitrogen;

import com.android.internal.logging.MetricsLogger;

import android.os.Bundle;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class NitrogenSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.nitrogen_settings);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsLogger.NITROGEN_SETTINGS;
    }
}

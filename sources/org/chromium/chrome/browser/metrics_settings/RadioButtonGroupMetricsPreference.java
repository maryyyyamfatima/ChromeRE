package org.chromium.chrome.browser.metrics_settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RadioButtonGroupMetricsPreference extends Preference implements RadioGroup.OnCheckedChangeListener {
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
    }

    public RadioButtonGroupMetricsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.f60300_resource_name_obfuscated_res_0x7f0e0240;
    }
}

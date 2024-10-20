package org.chromium.chrome.browser.image_descriptions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RadioButtonGroupAccessibilityPreference extends Preference implements RadioGroup.OnCheckedChangeListener {
    public RadioButtonWithDescription T;
    public RadioButtonWithDescription U;
    public boolean V;

    public RadioButtonGroupAccessibilityPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.f60270_resource_name_obfuscated_res_0x7f0e023d;
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        this.T = (RadioButtonWithDescription) c1812Ny2.v(R.id.image_descriptions_settings_only_on_wifi_radio_button);
        this.U = (RadioButtonWithDescription) c1812Ny2.v(R.id.image_descriptions_settings_mobile_data_radio_button);
        ((RadioButtonWithDescriptionLayout) this.T.getParent()).g = this;
        if (this.V) {
            this.T.f(true);
        } else {
            this.U.f(true);
        }
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        boolean e = this.T.e();
        this.V = e;
        f(Boolean.valueOf(e));
    }
}

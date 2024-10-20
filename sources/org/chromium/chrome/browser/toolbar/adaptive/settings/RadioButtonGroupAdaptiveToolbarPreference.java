package org.chromium.chrome.browser.toolbar.adaptive.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import defpackage.FI2;
import defpackage.KG2;
import defpackage.S6;
import defpackage.T6;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RadioButtonGroupAdaptiveToolbarPreference extends Preference implements RadioGroup.OnCheckedChangeListener {
    public RadioButtonWithDescriptionLayout T;
    public RadioButtonWithDescription U;
    public RadioButtonWithDescription V;
    public RadioButtonWithDescription W;
    public RadioButtonWithDescription X;
    public int Y;
    public S6 Z;
    public boolean a0;

    public RadioButtonGroupAdaptiveToolbarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a0 = true;
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e023e;
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        RadioButtonWithDescriptionLayout radioButtonWithDescriptionLayout = (RadioButtonWithDescriptionLayout) c1812Ny2.v(R.id.adaptive_radio_group);
        this.T = radioButtonWithDescriptionLayout;
        radioButtonWithDescriptionLayout.g = this;
        this.U = (RadioButtonWithDescription) c1812Ny2.v(R.id.adaptive_option_based_on_usage);
        this.V = (RadioButtonWithDescription) c1812Ny2.v(R.id.adaptive_option_new_tab);
        this.W = (RadioButtonWithDescription) c1812Ny2.v(R.id.adaptive_option_share);
        this.X = (RadioButtonWithDescription) c1812Ny2.v(R.id.adaptive_option_voice_search);
        W();
        S6 s6 = this.Z;
        if (s6 != null && this.T != null) {
            s6.b(new KG2(this));
            this.Z.b(new T6("Android.AdaptiveToolbarButton.Settings.Startup"));
        }
        FI2.a("Mobile.AdaptiveToolbarButton.SettingsPage.Opened");
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        S6 s6;
        int i2 = this.Y;
        if (this.U.e()) {
            this.Y = 5;
        } else if (this.V.e()) {
            this.Y = 2;
        } else if (this.W.e()) {
            this.Y = 3;
        } else if (this.X.e()) {
            this.Y = 4;
        }
        f(Integer.valueOf(this.Y));
        if (i2 == this.Y || (s6 = this.Z) == null) {
            return;
        }
        s6.b(new T6("Android.AdaptiveToolbarButton.Settings.Changed"));
    }

    public final void W() {
        RadioButtonWithDescription radioButtonWithDescription = this.X;
        if (radioButtonWithDescription == null) {
            return;
        }
        radioButtonWithDescription.setVisibility(this.a0 ? 0 : 8);
        if (!this.X.e() || this.a0) {
            return;
        }
        this.U.f(true);
    }
}

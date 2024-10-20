package org.chromium.chrome.browser.homepage.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import defpackage.LG2;
import defpackage.VG2;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;
import org.chromium.components.browser_ui.widget.RadioButtonWithEditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RadioButtonGroupHomepagePreference extends Preference implements RadioGroup.OnCheckedChangeListener, VG2 {
    public boolean T;
    public RadioButtonWithEditText U;
    public RadioButtonWithDescription V;
    public RadioButtonWithDescriptionLayout W;
    public TextView X;
    public LG2 Y;

    public RadioButtonGroupHomepagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e023f;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.Y.a = !this.V.e() ? 1 : 0;
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        this.V = (RadioButtonWithDescription) c1812Ny2.v(R.id.radio_button_chrome_ntp);
        this.U = (RadioButtonWithEditText) c1812Ny2.v(R.id.radio_button_uri_edit);
        RadioButtonWithDescriptionLayout radioButtonWithDescriptionLayout = (RadioButtonWithDescriptionLayout) c1812Ny2.v(R.id.radio_button_group);
        this.W = radioButtonWithDescriptionLayout;
        radioButtonWithDescriptionLayout.g = this;
        this.X = (TextView) c1812Ny2.v(R.id.title);
        this.T = true;
        LG2 lg2 = this.Y;
        if (lg2 != null) {
            W(lg2);
        }
        this.U.m.add(this);
    }

    public final void W(LG2 lg2) {
        if (this.T) {
            this.W.setEnabled(lg2.c);
            this.X.setEnabled(lg2.c);
            this.U.h.setText(lg2.b);
            if (lg2.a == 0) {
                this.V.f(true);
            } else {
                this.U.f(true);
            }
            this.V.setVisibility(lg2.d ? 0 : 8);
            this.U.setVisibility(lg2.e ? 0 : 8);
        }
        this.Y = lg2;
    }
}

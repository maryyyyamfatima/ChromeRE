package org.chromium.components.browser_ui.site_settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TriStateSiteSettingsPreference extends Preference implements RadioGroup.OnCheckedChangeListener {
    public int T;
    public int[] U;
    public RadioButtonWithDescription V;
    public RadioButtonWithDescription W;
    public RadioButtonWithDescription X;

    public TriStateSiteSettingsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = 0;
        this.K = R.layout.f61820_resource_name_obfuscated_res_0x7f0e02da;
        M();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.V.e()) {
            this.T = 1;
        } else if (this.W.e()) {
            this.T = 3;
        } else if (this.X.e()) {
            this.T = 2;
        }
        f(Integer.valueOf(this.T));
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        RadioButtonWithDescription radioButtonWithDescription;
        super.v(c1812Ny2);
        this.V = (RadioButtonWithDescription) c1812Ny2.v(R.id.allowed);
        this.W = (RadioButtonWithDescription) c1812Ny2.v(R.id.ask);
        this.X = (RadioButtonWithDescription) c1812Ny2.v(R.id.blocked);
        ((RadioGroup) c1812Ny2.v(R.id.radio_button_layout)).setOnCheckedChangeListener(this);
        int[] iArr = this.U;
        if (iArr != null) {
            RadioButtonWithDescription radioButtonWithDescription2 = this.V;
            int i = iArr[0];
            Context context = this.a;
            radioButtonWithDescription2.h(context.getText(i));
            this.W.h(context.getText(this.U[1]));
            this.X.h(context.getText(this.U[2]));
        }
        int i2 = this.T;
        if (i2 == 1) {
            radioButtonWithDescription = this.V;
        } else if (i2 == 3) {
            radioButtonWithDescription = this.W;
        } else {
            radioButtonWithDescription = i2 == 2 ? this.X : null;
        }
        if (radioButtonWithDescription != null) {
            radioButtonWithDescription.f(true);
        }
    }
}

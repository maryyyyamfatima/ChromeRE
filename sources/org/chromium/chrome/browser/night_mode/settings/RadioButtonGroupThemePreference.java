package org.chromium.chrome.browser.night_mode.settings;

import J.N;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import defpackage.C7928nE;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.UN;
import java.util.ArrayList;
import java.util.Collections;
import org.chromium.chrome.browser.night_mode.settings.RadioButtonGroupThemePreference;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RadioButtonGroupThemePreference extends Preference implements RadioGroup.OnCheckedChangeListener {
    public int T;
    public RadioButtonWithDescription U;
    public RadioButtonWithDescriptionLayout V;
    public final ArrayList W;
    public LinearLayout X;
    public boolean Y;
    public CheckBox Z;

    public RadioButtonGroupThemePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0243;
        this.W = new ArrayList(Collections.nCopies(3, null));
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        this.X = (LinearLayout) c1812Ny2.v(R.id.checkbox_container);
        this.Z = (CheckBox) c1812Ny2.v(R.id.darken_websites);
        RadioButtonWithDescriptionLayout radioButtonWithDescriptionLayout = (RadioButtonWithDescriptionLayout) c1812Ny2.v(R.id.radio_button_layout);
        this.V = radioButtonWithDescriptionLayout;
        radioButtonWithDescriptionLayout.g = this;
        this.X.setOnClickListener(new View.OnClickListener() { // from class: OG2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButtonGroupThemePreference radioButtonGroupThemePreference = RadioButtonGroupThemePreference.this;
                radioButtonGroupThemePreference.Z.setChecked(!r0.isChecked());
                radioButtonGroupThemePreference.f(Integer.valueOf(radioButtonGroupThemePreference.T));
            }
        });
        this.Z.setChecked(this.Y);
        ArrayList arrayList = this.W;
        arrayList.set(0, (RadioButtonWithDescription) c1812Ny2.v(R.id.system_default));
        if (Build.VERSION.SDK_INT >= 29) {
            ((RadioButtonWithDescription) arrayList.get(0)).h(this.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140b2c));
        }
        arrayList.set(1, (RadioButtonWithDescription) c1812Ny2.v(R.id.light));
        arrayList.set(2, (RadioButtonWithDescription) c1812Ny2.v(R.id.dark));
        RadioButtonWithDescription radioButtonWithDescription = (RadioButtonWithDescription) arrayList.get(this.T);
        this.U = radioButtonWithDescription;
        radioButtonWithDescription.f(true);
        W();
    }

    public final void W() {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("DarkenWebsitesCheckboxInThemesSetting")) {
            int i = this.T;
            if (i == 0 || i == 2) {
                RadioButtonWithDescriptionLayout radioButtonWithDescriptionLayout = this.V;
                LinearLayout linearLayout = this.X;
                RadioButtonWithDescription radioButtonWithDescription = this.U;
                radioButtonWithDescriptionLayout.getClass();
                if (linearLayout.getParent() != null) {
                    ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
                }
                radioButtonWithDescriptionLayout.addView(linearLayout, radioButtonWithDescriptionLayout.indexOfChild(radioButtonWithDescription) + 1);
                this.X.setVisibility(0);
                return;
            }
            this.X.setVisibility(8);
        }
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            }
            ArrayList arrayList = this.W;
            if (((RadioButtonWithDescription) arrayList.get(i2)).e()) {
                this.T = i2;
                this.U = (RadioButtonWithDescription) arrayList.get(i2);
                break;
            }
            i2++;
        }
        W();
        f(Integer.valueOf(this.T));
        int i3 = this.T;
        if (i3 == 0) {
            FI2.a("Android.DarkTheme.Preference.SystemDefault");
        } else if (i3 == 1) {
            FI2.a("Android.DarkTheme.Preference.Light");
        } else if (i3 == 2) {
            FI2.a("Android.DarkTheme.Preference.Dark");
        }
        EI2.h(i3, 3, "Android.DarkTheme.Preference.State");
    }
}

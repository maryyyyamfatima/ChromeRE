package org.chromium.chrome.browser.safe_browsing.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import defpackage.InterfaceC4184cL1;
import defpackage.NG2;
import defpackage.RG2;
import defpackage.Y50;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionAndAuxButton;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RadioButtonGroupSafeBrowsingPreference extends Preference implements RadioGroup.OnCheckedChangeListener, RG2 {
    public RadioButtonWithDescriptionAndAuxButton T;
    public RadioButtonWithDescriptionAndAuxButton U;
    public RadioButtonWithDescription V;
    public int W;
    public int X;
    public NG2 Y;
    public InterfaceC4184cL1 Z;

    public RadioButtonGroupSafeBrowsingPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.f60320_resource_name_obfuscated_res_0x7f0e0242;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == this.T.getId()) {
            this.W = 2;
        } else if (i == this.U.getId()) {
            this.W = 1;
        } else if (i == this.V.getId()) {
            this.W = 0;
        }
        f(Integer.valueOf(this.W));
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        RadioButtonWithDescriptionAndAuxButton radioButtonWithDescriptionAndAuxButton = (RadioButtonWithDescriptionAndAuxButton) c1812Ny2.v(R.id.enhanced_protection);
        this.T = radioButtonWithDescriptionAndAuxButton;
        if (this.X == 3) {
            Object obj = Y50.a;
            radioButtonWithDescriptionAndAuxButton.setBackgroundColor(this.a.getColor(R.color.f25670_resource_name_obfuscated_res_0x7f070816));
        }
        this.T.setVisibility(0);
        this.T.j(this);
        RadioButtonWithDescriptionAndAuxButton radioButtonWithDescriptionAndAuxButton2 = (RadioButtonWithDescriptionAndAuxButton) c1812Ny2.v(R.id.standard_protection);
        this.U = radioButtonWithDescriptionAndAuxButton2;
        radioButtonWithDescriptionAndAuxButton2.j(this);
        RadioButtonWithDescription radioButtonWithDescription = (RadioButtonWithDescription) c1812Ny2.v(R.id.no_protection);
        this.V = radioButtonWithDescription;
        RadioButtonWithDescriptionLayout radioButtonWithDescriptionLayout = (RadioButtonWithDescriptionLayout) radioButtonWithDescription.getRootView();
        radioButtonWithDescriptionLayout.g = this;
        W(this.W);
        if (this.Z.b(this)) {
            radioButtonWithDescriptionLayout.setEnabled(false);
            this.T.m.setEnabled(true);
            this.U.m.setEnabled(true);
        }
    }

    @Override // defpackage.RG2
    public final void e(int i) {
        if (i == this.T.getId()) {
            ((SafeBrowsingSettingsFragment) this.Y).U0(2);
        } else if (i == this.U.getId()) {
            ((SafeBrowsingSettingsFragment) this.Y).U0(1);
        }
    }

    public final void W(int i) {
        this.W = i;
        this.T.f(i == 2);
        this.U.f(i == 1);
        this.V.f(i == 0);
    }
}

package org.chromium.chrome.browser.prefetch.settings;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import defpackage.C7928nE;
import defpackage.InterfaceC4184cL1;
import defpackage.MG2;
import defpackage.RG2;
import defpackage.UN;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionAndAuxButton;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RadioButtonGroupPreloadPagesSettings extends Preference implements RadioGroup.OnCheckedChangeListener, RG2 {
    public RadioButtonWithDescriptionAndAuxButton T;
    public RadioButtonWithDescriptionAndAuxButton U;
    public RadioButtonWithDescription V;
    public int W;
    public MG2 X;
    public InterfaceC4184cL1 Y;

    public RadioButtonGroupPreloadPagesSettings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0241;
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
        this.T = (RadioButtonWithDescriptionAndAuxButton) c1812Ny2.v(R.id.extended_preloading);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ShowExtendedPreloadingSetting")) {
            this.T.j(this);
        } else {
            this.T.setVisibility(4);
        }
        RadioButtonWithDescriptionAndAuxButton radioButtonWithDescriptionAndAuxButton = (RadioButtonWithDescriptionAndAuxButton) c1812Ny2.v(R.id.standard_preloading);
        this.U = radioButtonWithDescriptionAndAuxButton;
        radioButtonWithDescriptionAndAuxButton.j(this);
        RadioButtonWithDescription radioButtonWithDescription = (RadioButtonWithDescription) c1812Ny2.v(R.id.no_preloading);
        this.V = radioButtonWithDescription;
        RadioButtonWithDescriptionLayout radioButtonWithDescriptionLayout = (RadioButtonWithDescriptionLayout) radioButtonWithDescription.getRootView();
        radioButtonWithDescriptionLayout.g = this;
        int i = this.W;
        if (!N.M09VlOh_("ShowExtendedPreloadingSetting") && i == 2) {
            i = 1;
        }
        this.W = i;
        this.T.f(i == 2);
        this.U.f(i == 1);
        this.V.f(i == 0);
        if (this.Y.b(this)) {
            radioButtonWithDescriptionLayout.setEnabled(false);
            this.T.m.setEnabled(true);
            this.U.m.setEnabled(true);
        }
    }

    @Override // defpackage.RG2
    public final void e(int i) {
        if (i == this.T.getId()) {
            ((PreloadPagesSettingsFragment) this.X).T0(2);
        } else if (i == this.U.getId()) {
            ((PreloadPagesSettingsFragment) this.X).T0(1);
        }
    }
}

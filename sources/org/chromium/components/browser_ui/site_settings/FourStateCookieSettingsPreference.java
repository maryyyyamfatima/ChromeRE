package org.chromium.components.browser_ui.site_settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC9771sd;
import defpackage.C1812Ny2;
import defpackage.GS0;
import defpackage.HS0;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.text.TextViewWithCompoundDrawables;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class FourStateCookieSettingsPreference extends Preference implements RadioGroup.OnCheckedChangeListener {
    public HS0 T;
    public RadioButtonWithDescription U;
    public RadioButtonWithDescription V;
    public RadioButtonWithDescription W;
    public RadioButtonWithDescription X;
    public RadioGroup Y;
    public TextViewWithCompoundDrawables Z;

    public FourStateCookieSettingsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0115;
        M();
    }

    public final GS0 X() {
        if (this.Y == null && this.T == null) {
            return GS0.UNINITIALIZED;
        }
        HS0 hs0 = this.T;
        GS0 gs0 = GS0.BLOCK_THIRD_PARTY_INCOGNITO;
        GS0 gs02 = GS0.ALLOW;
        GS0 gs03 = GS0.BLOCK_THIRD_PARTY;
        GS0 gs04 = GS0.BLOCK;
        if (hs0 == null) {
            return this.U.e() ? gs02 : this.V.e() ? gs0 : this.W.e() ? gs03 : gs04;
        }
        if (!hs0.a) {
            return gs04;
        }
        int i = hs0.b;
        return i == 1 ? gs03 : (i == 2 && hs0.c) ? gs0 : gs02;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        f(X());
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        this.U = (RadioButtonWithDescription) c1812Ny2.v(R.id.allow);
        this.V = (RadioButtonWithDescription) c1812Ny2.v(R.id.block_third_party_incognito);
        this.W = (RadioButtonWithDescription) c1812Ny2.v(R.id.block_third_party);
        this.X = (RadioButtonWithDescription) c1812Ny2.v(R.id.block);
        RadioGroup radioGroup = (RadioGroup) c1812Ny2.v(R.id.radio_button_layout);
        this.Y = radioGroup;
        radioGroup.setOnCheckedChangeListener(this);
        TextViewWithCompoundDrawables textViewWithCompoundDrawables = (TextViewWithCompoundDrawables) c1812Ny2.v(R.id.managed_view);
        this.Z = textViewWithCompoundDrawables;
        Drawable[] compoundDrawablesRelative = textViewWithCompoundDrawables.getCompoundDrawablesRelative();
        this.Z.setCompoundDrawablesRelativeWithIntrinsicBounds(AbstractC9771sd.c(this.a.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f0901cd, 0), compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        HS0 hs0 = this.T;
        if (hs0 != null) {
            W(hs0);
        }
    }

    public final void W(HS0 hs0) {
        RadioButtonWithDescription[] radioButtonWithDescriptionArr;
        GS0 gs0;
        RadioButtonWithDescription radioButtonWithDescription;
        this.U.setEnabled(true);
        this.V.setEnabled(true);
        this.W.setEnabled(true);
        this.X.setEnabled(true);
        boolean z = hs0.d;
        int i = 0;
        if (!z && !hs0.e) {
            radioButtonWithDescriptionArr = !hs0.c ? new RadioButtonWithDescription[]{this.V} : new RadioButtonWithDescription[0];
        } else if (z && hs0.e) {
            radioButtonWithDescriptionArr = new RadioButtonWithDescription[]{this.U, this.V, this.W, this.X};
        } else if (z) {
            if (hs0.a) {
                radioButtonWithDescriptionArr = !hs0.c ? new RadioButtonWithDescription[]{this.X, this.V} : new RadioButtonWithDescription[]{this.X};
            } else {
                radioButtonWithDescriptionArr = new RadioButtonWithDescription[]{this.U, this.V, this.W, this.X};
            }
        } else {
            radioButtonWithDescriptionArr = hs0.b == 1 ? new RadioButtonWithDescription[]{this.U, this.V} : new RadioButtonWithDescription[]{this.V, this.W};
        }
        for (RadioButtonWithDescription radioButtonWithDescription2 : radioButtonWithDescriptionArr) {
            radioButtonWithDescription2.setEnabled(false);
        }
        TextViewWithCompoundDrawables textViewWithCompoundDrawables = this.Z;
        if (!hs0.d && !hs0.e) {
            i = 8;
        }
        textViewWithCompoundDrawables.setVisibility(i);
        if (!hs0.a) {
            gs0 = GS0.BLOCK;
        } else {
            int i2 = hs0.b;
            if (i2 == 1) {
                gs0 = GS0.BLOCK_THIRD_PARTY;
            } else if (i2 == 2 && hs0.c) {
                gs0 = GS0.BLOCK_THIRD_PARTY_INCOGNITO;
            } else {
                gs0 = GS0.ALLOW;
            }
        }
        int ordinal = gs0.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                radioButtonWithDescription = this.U;
            } else if (ordinal == 2) {
                radioButtonWithDescription = this.V;
            } else if (ordinal == 3) {
                radioButtonWithDescription = this.W;
            } else if (ordinal == 4) {
                radioButtonWithDescription = this.X;
            }
            radioButtonWithDescription.setEnabled(true);
            radioButtonWithDescription.f(true);
            this.T = null;
        }
        radioButtonWithDescription = null;
        radioButtonWithDescription.setEnabled(true);
        radioButtonWithDescription.f(true);
        this.T = null;
    }
}

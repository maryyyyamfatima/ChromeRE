package org.chromium.components.browser_ui.settings;

import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.preference.g;
import defpackage.AbstractC4871eL1;
import defpackage.C1812Ny2;
import defpackage.C4516dJ;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeBaseCheckBoxPreference extends g {
    public final C4516dJ Y;

    @Override // androidx.preference.g, androidx.preference.Preference
    public final void w() {
        if (AbstractC4871eL1.d(null, this)) {
            return;
        }
        super.w();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChromeBaseCheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2131034316(0x7f0500cc, float:1.7679146E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.AbstractC9067qZ3.a(r0, r1, r4)
            r3.<init>(r4, r5, r0)
            dJ r1 = new dJ
            r1.<init>(r3)
            r3.Y = r1
            int[] r1 = defpackage.JG2.A
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = defpackage.AbstractC9067qZ3.f(r4, r5, r2)
            r3.Y(r5)
            r5 = 4
            r0 = 1
            java.lang.String r5 = defpackage.AbstractC9067qZ3.f(r4, r5, r0)
            r3.X(r5)
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 3
            boolean r5 = r4.getBoolean(r0, r5)
            r3.X = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.settings.ChromeBaseCheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        a0(c1812Ny2.v(R.id.checkbox));
        Z(c1812Ny2.v(R.id.summary));
        ((TextView) c1812Ny2.v(R.id.title)).setSingleLine(false);
    }

    @Override // androidx.preference.Preference
    public final void F(View view) {
        super.F(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            a0(view.findViewById(R.id.checkbox));
            Z(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.T);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.Y);
        }
    }
}

package androidx.preference;

import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import defpackage.C1812Ny2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SwitchPreference extends g {
    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        a0(c1812Ny2.v(R.id.switch_widget));
        Z(c1812Ny2.v(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void F(View view) {
        super.F(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            a0(view.findViewById(R.id.switch_widget));
            Z(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.T);
        }
        if (z) {
            Switch r5 = (Switch) view;
            r5.setTextOn(null);
            r5.setTextOff(null);
            r5.setOnCheckedChangeListener(null);
        }
    }
}

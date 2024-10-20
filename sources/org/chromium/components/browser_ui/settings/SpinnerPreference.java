package org.chromium.components.browser_ui.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import defpackage.C3153Yg3;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SpinnerPreference extends Preference {
    public Spinner T;
    public ArrayAdapter U;
    public int V;
    public final boolean W;

    public SpinnerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.N0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        this.W = z;
        obtainStyledAttributes.recycle();
        if (z) {
            this.K = R.layout.f59850_resource_name_obfuscated_res_0x7f0e0210;
        } else {
            this.K = R.layout.f59840_resource_name_obfuscated_res_0x7f0e020f;
        }
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        ((TextView) c1812Ny2.v(R.id.title)).setText(this.m);
        Spinner spinner = (Spinner) c1812Ny2.v(R.id.spinner);
        this.T = spinner;
        spinner.setOnItemSelectedListener(new C3153Yg3(this));
        SpinnerAdapter adapter = this.T.getAdapter();
        ArrayAdapter arrayAdapter = this.U;
        if (adapter != arrayAdapter) {
            this.T.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        this.T.setSelection(this.V);
    }
}

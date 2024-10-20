package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.AbstractC9685sM1;
import defpackage.C2720Uy0;
import defpackage.Ec4;
import defpackage.GM1;
import defpackage.JG2;
import defpackage.SJ3;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] e0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final C2720Uy0 a0;
    public ColorStateList b0;
    public ColorStateList c0;
    public final boolean d0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050450, com.android.chrome.R.style.f112880_resource_name_obfuscated_res_0x7f150849), attributeSet, 0);
        Context context2 = getContext();
        this.a0 = new C2720Uy0(context2);
        TypedArray d = SJ3.d(context2, attributeSet, JG2.R0, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050450, com.android.chrome.R.style.f112880_resource_name_obfuscated_res_0x7f150849, new int[0]);
        this.d0 = d.getBoolean(0, false);
        d.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int[][] iArr = e0;
        boolean z = this.d0;
        if (z && this.g == null) {
            if (this.b0 == null) {
                int d = AbstractC9685sM1.d(this, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050152);
                int d2 = AbstractC9685sM1.d(this, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050112);
                float dimension = getResources().getDimension(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0805d7);
                C2720Uy0 c2720Uy0 = this.a0;
                if (c2720Uy0.a) {
                    float f = 0.0f;
                    for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                        WeakHashMap weakHashMap = Ec4.a;
                        f += ((View) parent).getElevation();
                    }
                    dimension += f;
                }
                int b = c2720Uy0.b(d, dimension);
                this.b0 = new ColorStateList(iArr, new int[]{AbstractC9685sM1.e(1.0f, d, d2), b, AbstractC9685sM1.e(0.38f, d, d2), b});
            }
            this.g = this.b0;
            this.i = true;
            a();
        }
        if (z && this.l == null) {
            if (this.c0 == null) {
                int d3 = AbstractC9685sM1.d(this, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050152);
                int d4 = AbstractC9685sM1.d(this, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050112);
                int d5 = AbstractC9685sM1.d(this, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05012e);
                this.c0 = new ColorStateList(iArr, new int[]{AbstractC9685sM1.e(0.54f, d3, d4), AbstractC9685sM1.e(0.32f, d3, d5), AbstractC9685sM1.e(0.12f, d3, d4), AbstractC9685sM1.e(0.12f, d3, d5)});
            }
            this.l = this.c0;
            this.n = true;
            b();
        }
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12086zM1 extends C2494Tf {
    public static final int[][] l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;

    public C12086zM1(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, com.android.chrome.R.attr.f11720_resource_name_obfuscated_res_0x7f0503c1, com.android.chrome.R.style.f112870_resource_name_obfuscated_res_0x7f150848), attributeSet);
        Context context2 = getContext();
        TypedArray d = SJ3.d(context2, attributeSet, JG2.m0, com.android.chrome.R.attr.f11720_resource_name_obfuscated_res_0x7f0503c1, com.android.chrome.R.style.f112870_resource_name_obfuscated_res_0x7f150848, new int[0]);
        if (d.hasValue(0)) {
            setButtonTintList(AM1.b(context2, d, 0));
        }
        this.k = d.getBoolean(1, false);
        d.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && getButtonTintList() == null) {
            this.k = true;
            if (this.j == null) {
                int d = AbstractC9685sM1.d(this, com.android.chrome.R.attr.f4850_resource_name_obfuscated_res_0x7f050112);
                int d2 = AbstractC9685sM1.d(this, com.android.chrome.R.attr.f5130_resource_name_obfuscated_res_0x7f05012e);
                int d3 = AbstractC9685sM1.d(this, com.android.chrome.R.attr.f5490_resource_name_obfuscated_res_0x7f050152);
                this.j = new ColorStateList(l, new int[]{AbstractC9685sM1.e(1.0f, d3, d), AbstractC9685sM1.e(0.54f, d3, d2), AbstractC9685sM1.e(0.38f, d3, d2), AbstractC9685sM1.e(0.38f, d3, d2)});
            }
            setButtonTintList(this.j);
        }
    }
}

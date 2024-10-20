package org.chromium.chrome.browser.toolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractC11276wz3;
import defpackage.C0249Bx3;
import defpackage.C10226tv3;
import defpackage.C1482Lk1;
import defpackage.C1611Mk1;
import defpackage.C8609pC3;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC9883sv3;
import defpackage.Y50;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class IncognitoToggleTabLayout extends TabLayout implements InterfaceC9883sv3 {
    public static final /* synthetic */ int j0 = 0;
    public final C0249Bx3 U;
    public final C0249Bx3 V;
    public final ChromeImageView W;
    public final ChromeImageView a0;
    public final C8609pC3 b0;
    public final ColorStateList c0;
    public final ColorStateList d0;
    public final ColorStateList e0;
    public final ColorStateList f0;
    public InterfaceC10590uz3 g0;
    public C10226tv3 h0;
    public C1611Mk1 i0;

    public IncognitoToggleTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c0 = Y50.b(getContext(), R.color.0_resource_name_obfuscated_res_0x7f07012b);
        this.e0 = Y50.b(getContext(), R.color.0_resource_name_obfuscated_res_0x7f070113);
        this.d0 = Y50.b(getContext(), R.color.0_resource_name_obfuscated_res_0x7f0708d4);
        this.f0 = Y50.b(getContext(), R.color.0_resource_name_obfuscated_res_0x7f070107);
        ChromeImageView chromeImageView = new ChromeImageView(getContext());
        this.W = chromeImageView;
        C8609pC3 d = C8609pC3.d(getContext(), 3);
        this.b0 = d;
        chromeImageView.setImageDrawable(d);
        chromeImageView.setContentDescription(getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140174));
        ChromeImageView chromeImageView2 = new ChromeImageView(getContext());
        this.a0 = chromeImageView2;
        chromeImageView2.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f090353);
        chromeImageView2.setContentDescription(getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140172));
        C0249Bx3 m = m();
        m.f = chromeImageView;
        m.e();
        this.U = m;
        c(m);
        C0249Bx3 m2 = m();
        m2.f = chromeImageView2;
        m2.e();
        this.V = m2;
        c(m2);
        b(new C1482Lk1(this));
    }

    public final void y(InterfaceC10590uz3 interfaceC10590uz3) {
        this.g0 = interfaceC10590uz3;
        if (interfaceC10590uz3 == null) {
            return;
        }
        C1611Mk1 c1611Mk1 = new C1611Mk1(this);
        this.i0 = c1611Mk1;
        ((AbstractC11276wz3) interfaceC10590uz3).c(c1611Mk1);
        x();
        InterfaceC10590uz3 interfaceC10590uz32 = this.g0;
        if (((AbstractC11276wz3) interfaceC10590uz32).i) {
            this.b0.e(((AbstractC11276wz3) interfaceC10590uz32).c.e(false).getCount(), false);
        }
    }

    @Override // defpackage.InterfaceC9883sv3
    public final void a(int i, boolean z) {
        if (z) {
            return;
        }
        this.b0.e(i, z);
    }

    public final void x() {
        int defaultColor;
        InterfaceC10590uz3 interfaceC10590uz3 = this.g0;
        if (interfaceC10590uz3 == null) {
            return;
        }
        boolean o = ((AbstractC11276wz3) interfaceC10590uz3).o();
        ColorStateList colorStateList = this.f0;
        ColorStateList colorStateList2 = this.e0;
        if (o) {
            defaultColor = colorStateList.getDefaultColor();
        } else {
            defaultColor = colorStateList2.getDefaultColor();
        }
        this.r = defaultColor;
        Drawable drawable = this.q;
        if (defaultColor != 0) {
            drawable.setTint(defaultColor);
        } else {
            drawable.setTintList(null);
        }
        w(false);
        ColorStateList colorStateList3 = this.d0;
        this.b0.c(o ? colorStateList3 : colorStateList2);
        ChromeImageView chromeImageView = this.W;
        if (o) {
            colorStateList2 = colorStateList3;
        }
        chromeImageView.setImageTintList(colorStateList2);
        ChromeImageView chromeImageView2 = this.a0;
        if (!o) {
            colorStateList = this.c0;
        }
        chromeImageView2.setImageTintList(colorStateList);
        if (o) {
            C0249Bx3 c0249Bx3 = this.V;
            if (!c0249Bx3.a()) {
                c0249Bx3.b();
                return;
            }
        }
        if (o) {
            return;
        }
        C0249Bx3 c0249Bx32 = this.U;
        if (c0249Bx32.a()) {
            return;
        }
        c0249Bx32.b();
    }
}

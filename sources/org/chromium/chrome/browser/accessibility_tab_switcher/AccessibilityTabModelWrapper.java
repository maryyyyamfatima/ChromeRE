package org.chromium.chrome.browser.accessibility_tab_switcher;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC11276wz3;
import defpackage.C0249Bx3;
import defpackage.C1;
import defpackage.C10941w1;
import defpackage.InterfaceC10590uz3;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccessibilityTabModelWrapper extends LinearLayout {
    public static final /* synthetic */ int t = 0;
    public AccessibilityTabModelListView a;
    public View g;
    public TabLayout h;
    public C0249Bx3 i;
    public C0249Bx3 j;
    public ChromeImageView k;
    public ChromeImageView l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public ColorStateList p;
    public InterfaceC10590uz3 q;
    public final C1 r;
    public boolean s;

    public AccessibilityTabModelWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new C1(this);
    }

    public final void b() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.q;
        if (interfaceC10590uz3 == null) {
            return;
        }
        boolean o = ((AbstractC11276wz3) interfaceC10590uz3).o();
        c();
        if (o) {
            setBackgroundColor(getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700e8));
            TabLayout tabLayout = this.h;
            int defaultColor = this.p.getDefaultColor();
            tabLayout.r = defaultColor;
            Drawable drawable = tabLayout.q;
            if (defaultColor != 0) {
                drawable.setTint(defaultColor);
            } else {
                drawable.setTintList(null);
            }
            tabLayout.w(false);
            this.k.setImageTintList(this.n);
            this.l.setImageTintList(this.p);
        } else {
            setBackgroundColor(AbstractC10957w33.a(getContext()));
            TabLayout tabLayout2 = this.h;
            int defaultColor2 = this.o.getDefaultColor();
            tabLayout2.r = defaultColor2;
            Drawable drawable2 = tabLayout2.q;
            if (defaultColor2 != 0) {
                drawable2.setTint(defaultColor2);
            } else {
                drawable2.setTintList(null);
            }
            tabLayout2.w(false);
            this.k.setImageTintList(this.o);
            this.l.setImageTintList(this.m);
        }
        if (o && !this.j.a()) {
            this.j.b();
        } else if (!o && !this.i.a()) {
            this.i.b();
        }
        this.a.setContentDescription(o ? getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140172) : getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140174));
        C10941w1 a = a();
        TabModel j = ((AbstractC11276wz3) this.q).j(o);
        a.h = j;
        a.g = j.h();
        a.notifyDataSetChanged();
    }

    public final C10941w1 a() {
        return (C10941w1) this.a.getAdapter();
    }

    public final void c() {
        this.g.setVisibility(((AbstractC11276wz3) this.q).j(true).h().getCount() > 0 ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ((AbstractC11276wz3) this.q).c(this.r);
        this.s = true;
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.s = false;
        super.onDetachedFromWindow();
    }
}

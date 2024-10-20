package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249Bx3 {
    public Object a;
    public Drawable b;
    public CharSequence c;
    public CharSequence d;
    public View f;
    public TabLayout g;
    public C0639Ex3 h;
    public int e = -1;
    public int i = -1;

    public final void d(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
            this.h.setContentDescription(charSequence);
        }
        this.c = charSequence;
        e();
    }

    public final void b() {
        TabLayout tabLayout = this.g;
        if (tabLayout != null) {
            tabLayout.r(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final boolean a() {
        TabLayout tabLayout = this.g;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        int j = tabLayout.j();
        return j != -1 && j == this.e;
    }

    public final void c(CharSequence charSequence) {
        this.d = charSequence;
        e();
    }

    public final void e() {
        C0639Ex3 c0639Ex3 = this.h;
        if (c0639Ex3 != null) {
            c0639Ex3.a();
        }
    }
}

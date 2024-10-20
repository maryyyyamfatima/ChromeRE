package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ao3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0074Ao3 extends BS1 implements SubMenu {
    public final C6287iT1 A;
    public final BS1 z;

    public SubMenuC0074Ao3(Context context, BS1 bs1, C6287iT1 c6287iT1) {
        super(context);
        this.z = bs1;
        this.A = c6287iT1;
    }

    @Override // defpackage.BS1, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // defpackage.BS1
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.BS1
    public final boolean o() {
        return this.z.o();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.BS1
    public final BS1 k() {
        return this.z.k();
    }

    @Override // defpackage.BS1
    public final boolean e(BS1 bs1, MenuItem menuItem) {
        return super.e(bs1, menuItem) || this.z.e(bs1, menuItem);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // defpackage.BS1
    public final boolean f(C6287iT1 c6287iT1) {
        return this.z.f(c6287iT1);
    }

    @Override // defpackage.BS1
    public final boolean d(C6287iT1 c6287iT1) {
        return this.z.d(c6287iT1);
    }

    @Override // defpackage.BS1
    public final String j() {
        C6287iT1 c6287iT1 = this.A;
        int i = c6287iT1 != null ? c6287iT1.a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC9076qb1.a("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.BS1, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // defpackage.BS1
    public final boolean m() {
        return this.z.m();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }
}

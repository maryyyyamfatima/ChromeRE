package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ni3 */
/* loaded from: classes.dex */
public final class C1733Ni3 extends AbstractC6160i5 implements InterfaceC12116zS1 {
    public final Context h;
    public final ActionBarContextView i;
    public final InterfaceC5816h5 j;
    public WeakReference k;
    public boolean l;
    public final BS1 m;

    public C1733Ni3(Context context, ActionBarContextView actionBarContextView, InterfaceC5816h5 interfaceC5816h5) {
        this.h = context;
        this.i = actionBarContextView;
        this.j = interfaceC5816h5;
        BS1 bs1 = new BS1(actionBarContextView.getContext());
        bs1.l = 1;
        this.m = bs1;
        bs1.e = this;
    }

    @Override // defpackage.AbstractC6160i5
    public final void n(int i) {
        o(this.h.getString(i));
    }

    @Override // defpackage.AbstractC6160i5
    public final void l(int i) {
        m(this.h.getString(i));
    }

    @Override // defpackage.AbstractC6160i5
    public final void k(View view) {
        this.i.k(view);
        this.k = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.AbstractC6160i5
    public final void i() {
        this.j.d(this, this.m);
    }

    @Override // defpackage.AbstractC6160i5
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.b(this);
    }

    @Override // defpackage.AbstractC6160i5
    public final BS1 e() {
        return this.m;
    }

    @Override // defpackage.AbstractC6160i5
    public final void o(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.i;
        actionBarContextView.n = charSequence;
        actionBarContextView.d();
        Ec4.n(charSequence, actionBarContextView);
    }

    @Override // defpackage.AbstractC6160i5
    public final void m(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.i;
        actionBarContextView.o = charSequence;
        actionBarContextView.d();
    }

    @Override // defpackage.AbstractC6160i5
    public final CharSequence h() {
        return this.i.n;
    }

    @Override // defpackage.AbstractC6160i5
    public final View d() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.AbstractC6160i5
    public final CharSequence g() {
        return this.i.o;
    }

    @Override // defpackage.AbstractC6160i5
    public final void p(boolean z) {
        this.g = z;
        ActionBarContextView actionBarContextView = this.i;
        if (z != actionBarContextView.x) {
            actionBarContextView.requestLayout();
        }
        actionBarContextView.x = z;
    }

    @Override // defpackage.AbstractC6160i5
    public final MenuInflater f() {
        return new C1898Op3(this.i.getContext());
    }

    @Override // defpackage.InterfaceC12116zS1
    public final boolean a(BS1 bs1, MenuItem menuItem) {
        return this.j.a(this, menuItem);
    }

    @Override // defpackage.InterfaceC12116zS1
    public final void b(BS1 bs1) {
        i();
        C4097c5 c4097c5 = this.i.i;
        if (c4097c5 != null) {
            c4097c5.l();
        }
    }

    @Override // defpackage.AbstractC6160i5
    public final boolean j() {
        return this.i.x;
    }
}

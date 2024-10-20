package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: np4 */
/* loaded from: classes.dex */
public final class C8133np4 extends AbstractC6160i5 implements InterfaceC12116zS1 {
    public final Context h;
    public final BS1 i;
    public InterfaceC5816h5 j;
    public WeakReference k;
    public final /* synthetic */ C8477op4 l;

    @Override // defpackage.AbstractC6160i5
    public final void p(boolean z) {
        this.g = z;
        ActionBarContextView actionBarContextView = this.l.f;
        if (z != actionBarContextView.x) {
            actionBarContextView.requestLayout();
        }
        actionBarContextView.x = z;
    }

    public C8133np4(C8477op4 c8477op4, Context context, C9440rf c9440rf) {
        this.l = c8477op4;
        this.h = context;
        this.j = c9440rf;
        BS1 bs1 = new BS1(context);
        bs1.l = 1;
        this.i = bs1;
        bs1.e = this;
    }

    @Override // defpackage.AbstractC6160i5
    public final MenuInflater f() {
        return new C1898Op3(this.h);
    }

    @Override // defpackage.AbstractC6160i5
    public final BS1 e() {
        return this.i;
    }

    @Override // defpackage.AbstractC6160i5
    public final void c() {
        C8477op4 c8477op4 = this.l;
        if (c8477op4.i != this) {
            return;
        }
        if (!(!c8477op4.q)) {
            c8477op4.j = this;
            c8477op4.k = this.j;
        } else {
            this.j.b(this);
        }
        this.j = null;
        c8477op4.t(false);
        ActionBarContextView actionBarContextView = c8477op4.f;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = c8477op4.c;
        boolean z = c8477op4.v;
        if (z != actionBarOverlayLayout.o) {
            actionBarOverlayLayout.o = z;
            if (!z) {
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.i.setTranslationY(-Math.max(0, Math.min(0, actionBarOverlayLayout.i.getHeight())));
            }
        }
        c8477op4.i = null;
    }

    @Override // defpackage.AbstractC6160i5
    public final void i() {
        if (this.l.i != this) {
            return;
        }
        BS1 bs1 = this.i;
        bs1.w();
        try {
            this.j.d(this, bs1);
        } finally {
            bs1.v();
        }
    }

    @Override // defpackage.AbstractC6160i5
    public final void k(View view) {
        this.l.f.k(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.AbstractC6160i5
    public final void m(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.l.f;
        actionBarContextView.o = charSequence;
        actionBarContextView.d();
    }

    @Override // defpackage.AbstractC6160i5
    public final void o(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.l.f;
        actionBarContextView.n = charSequence;
        actionBarContextView.d();
        Ec4.n(charSequence, actionBarContextView);
    }

    @Override // defpackage.AbstractC6160i5
    public final void n(int i) {
        o(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.AbstractC6160i5
    public final void l(int i) {
        m(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.AbstractC6160i5
    public final CharSequence h() {
        return this.l.f.n;
    }

    @Override // defpackage.AbstractC6160i5
    public final CharSequence g() {
        return this.l.f.o;
    }

    @Override // defpackage.AbstractC6160i5
    public final boolean j() {
        return this.l.f.x;
    }

    @Override // defpackage.AbstractC6160i5
    public final View d() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.InterfaceC12116zS1
    public final boolean a(BS1 bs1, MenuItem menuItem) {
        InterfaceC5816h5 interfaceC5816h5 = this.j;
        if (interfaceC5816h5 != null) {
            return interfaceC5816h5.a(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.InterfaceC12116zS1
    public final void b(BS1 bs1) {
        if (this.j == null) {
            return;
        }
        i();
        C4097c5 c4097c5 = this.l.f.i;
        if (c4097c5 != null) {
            c4097c5.l();
        }
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.c;
import androidx.fragment.app.h;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class US0 extends ZS0 implements InterfaceC1832Oc2, InterfaceC8059nd2, InterfaceC4965ed2, InterfaceC5309fd2, InterfaceC12177zd4, InterfaceC0273Cc2, InterfaceC4103c6, InterfaceC10417uV2, InterfaceC11777yT0, YS1 {
    public final Activity a;
    public final Context g;
    public final Handler h;
    public final h i;
    public final /* synthetic */ VS0 j;

    @Override // defpackage.InterfaceC10417uV2
    public final C9731sV2 A() {
        return this.j.j.b;
    }

    public final void d(C8004nT0 c8004nT0) {
        ZS1 zs1 = this.j.h;
        zs1.b.add(c8004nT0);
        zs1.a.run();
    }

    public final void i(C8004nT0 c8004nT0) {
        ZS1 zs1 = this.j.h;
        zs1.b.remove(c8004nT0);
        X5.a(zs1.c.remove(c8004nT0));
        zs1.a.run();
    }

    public US0(VS0 vs0) {
        this.j = vs0;
        Handler handler = new Handler();
        this.i = new h();
        this.a = vs0;
        this.g = vs0;
        this.h = handler;
    }

    @Override // defpackage.JA1
    public final LA1 Z() {
        return this.j.t;
    }

    @Override // defpackage.InterfaceC12177zd4
    public final C11834yd4 w() {
        return this.j.w();
    }

    @Override // defpackage.InterfaceC11777yT0
    public final void a(c cVar) {
        this.j.j0(cVar);
    }

    @Override // defpackage.ZS0
    public final View b(int i) {
        return this.j.findViewById(i);
    }

    @Override // defpackage.ZS0
    public final boolean c() {
        Window window = this.j.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public final void e(InterfaceC11989z40 interfaceC11989z40) {
        this.j.n.add(interfaceC11989z40);
    }

    public final void j(C5942hT0 c5942hT0) {
        this.j.n.remove(c5942hT0);
    }

    public final void h(C6286iT0 c6286iT0) {
        this.j.o.add(c6286iT0);
    }

    public final void m(C6286iT0 c6286iT0) {
        this.j.o.remove(c6286iT0);
    }

    public final void f(C6628jT0 c6628jT0) {
        this.j.q.add(c6628jT0);
    }

    public final void k(C6628jT0 c6628jT0) {
        this.j.q.remove(c6628jT0);
    }

    public final void g(C6972kT0 c6972kT0) {
        this.j.r.add(c6972kT0);
    }

    public final void l(C6972kT0 c6972kT0) {
        this.j.r.remove(c6972kT0);
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DC3 implements InterfaceC9975tB3 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ IC3 g;

    @Override // defpackage.InterfaceC9975tB3
    public final void a() {
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void b() {
        final IC3 ic3 = this.g;
        boolean R = ic3.R();
        InterfaceC9632sB3 interfaceC9632sB3 = ic3.E;
        if (!R) {
            interfaceC9632sB3.o();
            ic3.w = false;
            ic3.f();
            return;
        }
        Rect l = interfaceC9632sB3.l(true);
        C1551Ly1 c1551Ly1 = ic3.p[0];
        ic3.h();
        V10 j = ic3.j();
        ArrayList arrayList = new ArrayList(5);
        MD2 md2 = C1551Ly1.g;
        float width = l.width();
        float f = ic3.a;
        float f2 = ic3.t;
        HH0 hh0 = AbstractC8142nr1.e;
        arrayList.add(C4424d20.f(j, c1551Ly1, md2, width / (f * f2), 1.0f, 300L, hh0));
        arrayList.add(C4424d20.f(j, c1551Ly1, C1551Ly1.h, l.left / f2, 0.0f, 300L, hh0));
        arrayList.add(C4424d20.f(j, c1551Ly1, C1551Ly1.i, l.top / f2, 0.0f, 300L, hh0));
        arrayList.add(C4424d20.f(j, c1551Ly1, C1551Ly1.w, AbstractC5177fD3.f() ? Math.min(ic3.a / AbstractC7239lD3.c(ic3.j), c1551Ly1.s()) : ic3.a, c1551Ly1.s(), 300L, hh0));
        C4424d20 c = C4424d20.c(j, 1.0f, 0.0f, 150L, new InterfaceC4080c20() { // from class: AC3
            @Override // defpackage.InterfaceC4080c20
            public final void a(C4424d20 c4424d20) {
                IC3 ic32 = IC3.this;
                ic32.getClass();
                ic32.H = c4424d20.b();
            }
        });
        c.j = AbstractC8142nr1.d;
        arrayList.add(c);
        AnimatorSet animatorSet = new AnimatorSet();
        ic3.v = animatorSet;
        animatorSet.playTogether(arrayList);
        ic3.v.addListener(new FC3(ic3));
        ic3.M = ic3.I;
        ic3.f11445J = SystemClock.elapsedRealtime();
        ic3.K = SystemClock.elapsedRealtime();
        ic3.L = 0L;
        ic3.v.start();
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void c() {
        IC3 ic3 = this.g;
        ic3.N = true;
        if (!AbstractC5177fD3.i(this.a)) {
            ic3.g();
        }
        if (ic3.R()) {
            new Handler().postDelayed(new Runnable() { // from class: BC3
                @Override // java.lang.Runnable
                public final void run() {
                    IC3 ic32 = DC3.this.g;
                    Tab h = ((AbstractC11276wz3) ic32.l).h();
                    if (h != null) {
                        ic32.m.a(h);
                    }
                    ic32.p = null;
                }
            }, 300L);
        } else {
            new Handler().postDelayed(new Runnable() { // from class: CC3
                @Override // java.lang.Runnable
                public final void run() {
                    DC3.this.g.p = null;
                }
            }, 300L);
        }
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void d() {
        this.g.N = false;
    }

    public DC3(IC3 ic3, Context context) {
        this.g = ic3;
        this.a = context;
    }
}

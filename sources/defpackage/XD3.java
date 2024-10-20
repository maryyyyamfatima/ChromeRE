package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XD3 implements InterfaceC9985tD3 {
    public final /* synthetic */ YD3 a;

    @Override // defpackage.InterfaceC9985tD3
    public final int N() {
        return 2;
    }

    @Override // defpackage.InterfaceC9985tD3
    public final View a() {
        C1413Kw2 c1413Kw2 = this.a.j;
        if (c1413Kw2 == null) {
            return null;
        }
        return c1413Kw2.e;
    }

    @Override // defpackage.InterfaceC9985tD3
    public final void d() {
        YD3 yd3 = this.a;
        C3799bD c3799bD = yd3.k;
        if (c3799bD != null && yd3.p == -1) {
            yd3.p = c3799bD.v();
        }
        YD3.a(yd3, true);
    }

    @Override // defpackage.InterfaceC9985tD3
    public final void v() {
        YD3 yd3 = this.a;
        C3799bD c3799bD = yd3.k;
        if (c3799bD != null) {
            c3799bD.u(yd3.p);
            yd3.p = -1;
        }
        YD3.a(yd3, false);
    }

    public XD3(YD3 yd3) {
        this.a = yd3;
    }
}

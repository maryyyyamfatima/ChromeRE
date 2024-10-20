package defpackage;

import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IT1 extends AbstractC4472dA0 {
    public int a;
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ JT1 h;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void b(PB pb) {
        int i;
        JT1 jt1 = this.h;
        if (pb != jt1.l) {
            int i2 = this.a;
            WT1 wt1 = jt1.i;
            wt1.c();
            wt1.b();
            wt1.a();
            EI2.b("MerchantTrust.BottomSheet.IsHalfViewed", wt1.h);
            EI2.b("MerchantTrust.BottomSheet.IsFullyViewed", wt1.i);
            EI2.h(i2, 10, "MerchantTrust.BottomSheet.CloseReason");
            wt1.e = false;
            wt1.f = false;
            wt1.g = false;
            wt1.h = false;
            wt1.i = false;
            wt1.j = 0L;
            wt1.k = 0L;
            wt1.l = 0L;
            Runnable runnable = this.g;
            if (runnable != null && ((i = this.a) == 0 || i == 1 || i == 2 || i == 3)) {
                runnable.run();
            }
            jt1.h.removeOnLayoutChangeListener(jt1);
            IT1 it1 = jt1.k;
            QB qb = jt1.g;
            if (it1 != null) {
                ((m) qb).o(it1);
            }
            ((m) qb).l(jt1.l, true, 0);
            jt1.l = null;
            OT1 ot1 = jt1.j;
            LT1 lt1 = ot1.l;
            if (lt1 != null) {
                lt1.destroy();
                ot1.l = null;
            }
            WebContents webContents = ot1.i;
            if (webContents != null) {
                webContents.destroy();
                ot1.i = null;
                ot1.j = null;
            }
            ot1.k = null;
            ot1.h = null;
            C6930kK3 c6930kK3 = jt1.n;
            if (c6930kK3 != null) {
                c6930kK3.b();
            }
            jt1.n = null;
            UD2 ud2 = jt1.q;
            if (ud2 != null) {
                ud2.b();
            }
            jt1.p = null;
            jt1.o = null;
        }
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        JT1 jt1 = this.h;
        if (jt1.l == null) {
            return;
        }
        WT1 wt1 = jt1.i;
        if (i == 1) {
            if (wt1.j == 0) {
                wt1.j = System.nanoTime();
            }
            wt1.b();
            wt1.a();
            return;
        }
        if (i == 2) {
            wt1.h = true;
            if (wt1.k == 0) {
                wt1.k = System.nanoTime();
            }
            wt1.c();
            wt1.a();
            return;
        }
        if (i != 3) {
            return;
        }
        wt1.i = true;
        if (wt1.l == 0) {
            wt1.l = System.nanoTime();
        }
        wt1.c();
        wt1.b();
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void j() {
        WT1 wt1 = this.h.i;
        wt1.h = true;
        if (wt1.k == 0) {
            wt1.k = System.nanoTime();
        }
        wt1.c();
        wt1.a();
    }

    public IT1(JT1 jt1, XT1 xt1) {
        this.h = jt1;
        this.g = xt1;
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void d(int i) {
        this.a = i;
    }
}

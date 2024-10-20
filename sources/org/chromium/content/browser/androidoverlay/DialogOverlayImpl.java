package org.chromium.content.browser.androidoverlay;

import J.N;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import defpackage.A51;
import defpackage.AbstractC6411ip1;
import defpackage.C3570aa;
import defpackage.C4422d14;
import defpackage.C5953hV1;
import defpackage.C6068hp1;
import defpackage.C9141qm0;
import defpackage.D30;
import defpackage.HY1;
import defpackage.InterfaceC8798pm0;
import defpackage.N9;
import defpackage.O9;
import defpackage.R9;
import defpackage.RunnableC4257ca;
import defpackage.V60;
import defpackage.X9;
import org.chromium.base.ThreadUtils;
import org.chromium.gfx.mojom.Rect;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DialogOverlayImpl implements N9, InterfaceC8798pm0, ViewTreeObserver.OnPreDrawListener {
    public O9 a;
    public final Runnable g;
    public C9141qm0 h;
    public long i;
    public int j;
    public boolean k;
    public Rect l;
    public ViewTreeObserver m;
    public final C3570aa n;
    public final boolean o;

    public DialogOverlayImpl(O9 o9, C3570aa c3570aa, RunnableC4257ca runnableC4257ca) {
        Object obj = ThreadUtils.a;
        this.a = o9;
        this.g = runnableC4257ca;
        Rect rect = c3570aa.c;
        Rect rect2 = new Rect(0);
        rect2.b = rect.b;
        rect2.c = rect.c;
        rect2.d = rect.d;
        rect2.e = rect.e;
        this.l = rect2;
        this.n = c3570aa;
        this.o = false;
        C4422d14 c4422d14 = c3570aa.b;
        long MqPi0d6D = N.MqPi0d6D(this, c4422d14.b, c4422d14.c, c3570aa.e);
        this.i = MqPi0d6D;
        if (MqPi0d6D == 0) {
            e();
            c();
        } else {
            N.MAd6qeVr(MqPi0d6D, this, c3570aa.c);
            N.MQAm7B7f(this.i, this);
        }
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = ThreadUtils.a;
        if (this.k) {
            return;
        }
        this.k = true;
        C9141qm0 c9141qm0 = this.h;
        if (c9141qm0 != null) {
            c9141qm0.b();
            c9141qm0.d.token = null;
            c9141qm0.a = null;
            c();
        }
        this.g.run();
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        Object obj = ThreadUtils.a;
        close();
    }

    @Override // defpackage.N9
    public final void m(Rect rect) {
        Object obj = ThreadUtils.a;
        Rect rect2 = new Rect(0);
        rect2.b = rect.b;
        rect2.c = rect.c;
        rect2.d = rect.d;
        rect2.e = rect.e;
        this.l = rect2;
        if (this.h == null) {
            return;
        }
        N.MAd6qeVr(this.i, this, rect);
        C9141qm0 c9141qm0 = this.h;
        if (c9141qm0.b == null || c9141qm0.d.token == null || !c9141qm0.a(rect)) {
            return;
        }
        c9141qm0.b.getWindow().setAttributes(c9141qm0.d);
    }

    public static void receiveCompositorOffset(Rect rect, int i, int i2) {
        rect.b += i;
        rect.c += i2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m(this.l);
        return true;
    }

    public void onWindowAndroid(WindowAndroid windowAndroid) {
        Object obj = ThreadUtils.a;
        if (this.h != null) {
            this.h.c(windowAndroid != null ? windowAndroid.v() : null);
            return;
        }
        if (windowAndroid == null) {
            return;
        }
        Context context = (Context) windowAndroid.j.get();
        if (V60.a(context) == null) {
            return;
        }
        C9141qm0 c9141qm0 = new C9141qm0();
        this.h = c9141qm0;
        c9141qm0.a = this;
        c9141qm0.e = this.o;
        Dialog dialog = new Dialog(context, R.style.Theme.NoDisplay);
        c9141qm0.b = dialog;
        dialog.requestWindowFeature(1);
        c9141qm0.b.setCancelable(false);
        C3570aa c3570aa = this.n;
        boolean z = c3570aa.d;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.type = c9141qm0.e ? 1000 : 1001;
        layoutParams.flags = 568;
        if (z) {
            layoutParams.flags = 8760;
        }
        try {
            layoutParams.getClass().getField("privateFlags").set(layoutParams, Integer.valueOf(((Integer) layoutParams.getClass().getField("privateFlags").get(layoutParams)).intValue() | 64));
        } catch (ExceptionInInitializerError | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NullPointerException | SecurityException unused) {
        }
        c9141qm0.d = layoutParams;
        c9141qm0.a(c3570aa.c);
        this.h.c(windowAndroid.v());
    }

    public final void observeContainerView(View view) {
        ViewTreeObserver viewTreeObserver = this.m;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.m.removeOnPreDrawListener(this);
        }
        this.m = null;
        if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.m = viewTreeObserver2;
            viewTreeObserver2.addOnPreDrawListener(this);
        }
    }

    public void onDismissed() {
        Object obj = ThreadUtils.a;
        e();
        C9141qm0 c9141qm0 = this.h;
        if (c9141qm0 != null) {
            c9141qm0.c(null);
        }
        c();
    }

    public final void onPowerEfficientState(boolean z) {
        O9 o9;
        Object obj = ThreadUtils.a;
        if (this.h == null || (o9 = this.a) == null) {
            return;
        }
        R9 r9 = new R9(0);
        r9.b = z;
        C6068hp1 c6068hp1 = ((X9) o9).a;
        c6068hp1.g.A(r9.c(c6068hp1.a, new C5953hV1(3)));
    }

    public final void c() {
        Object obj = ThreadUtils.a;
        int i = this.j;
        if (i != 0) {
            N.M1e4GdYZ(i);
            this.j = 0;
        }
        long j = this.i;
        if (j != 0) {
            N.MJj9v_ba(j, this);
            this.i = 0L;
        }
        this.h = null;
        D30 d30 = this.a;
        if (d30 != null) {
            ((AbstractC6411ip1) d30).close();
        }
        this.a = null;
    }

    public final void e() {
        O9 o9 = this.a;
        if (o9 == null) {
            return;
        }
        this.a = null;
        if (this.j == 0) {
            ((X9) o9).c();
        } else {
            N.MFq0hOYg(((A51) ((X9) o9).a.g).n0().E0());
        }
    }
}

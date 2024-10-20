package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.HashSet;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3799bD extends IC {
    public final InterfaceC7697ma2 k;
    public long l;
    public final Handler j = new Handler();
    public final C7638mO3 i = new C7638mO3(new Runnable() { // from class: YC
        @Override // java.lang.Runnable
        public final void run() {
            C3799bD.this.z();
        }
    });

    @Override // defpackage.IC, defpackage.C8385oa2
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Integer) obj);
    }

    public final void u(int i) {
        C7638mO3 c7638mO3 = this.i;
        HashSet hashSet = c7638mO3.b;
        if (hashSet.size() == 1 && hashSet.contains(Integer.valueOf(i))) {
            s();
        }
        c7638mO3.c(i);
    }

    public C3799bD(C8385oa2 c8385oa2) {
        this.k = c8385oa2;
        c8385oa2.m(new Callback() { // from class: ZC
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C3799bD.this.z();
            }
        });
        z();
    }

    public final void s() {
        if (AX.e().g("disable-minimum-show-duration")) {
            return;
        }
        Handler handler = this.j;
        if (handler.hasMessages(0)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.l;
        if (uptimeMillis >= 3000) {
            return;
        }
        final int a = this.i.a();
        handler.postDelayed(new Runnable() { // from class: aD
            @Override // java.lang.Runnable
            public final void run() {
                C3799bD.this.i.c(a);
            }
        }, 3000 - uptimeMillis);
    }

    public final void y() {
        if (!this.i.b()) {
            this.l = SystemClock.uptimeMillis();
        }
        s();
    }

    public final int v() {
        C7638mO3 c7638mO3 = this.i;
        if (!c7638mO3.b()) {
            this.l = SystemClock.uptimeMillis();
        }
        return c7638mO3.a();
    }

    public final int w(int i) {
        int v = v();
        this.i.c(i);
        return v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:            if (J.N.M09VlOh_("ToolbarScrollAblationAndroid") != false) goto L12;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            r1 = this;
            ma2 r0 = r1.k
            oa2 r0 = (defpackage.C8385oa2) r0
            java.lang.Object r0 = r0.g
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L10
            r0 = 2
            goto L2c
        L10:
            mO3 r0 = r1.i
            boolean r0 = r0.b()
            if (r0 == 0) goto L19
            goto L29
        L19:
            boolean r0 = defpackage.AbstractC8293oI0.b()
            if (r0 == 0) goto L2b
            nE r0 = defpackage.UN.a
            java.lang.String r0 = "ToolbarScrollAblationAndroid"
            boolean r0 = J.N.M09VlOh_(r0)
            if (r0 == 0) goto L2b
        L29:
            r0 = 1
            goto L2c
        L2b:
            r0 = 3
        L2c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3799bD.z():void");
    }
}

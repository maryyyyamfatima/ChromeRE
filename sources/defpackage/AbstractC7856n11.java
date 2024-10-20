package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n11 */
/* loaded from: classes.dex */
public abstract class AbstractC7856n11 {
    public final Context a;
    public final String b;
    public final C3588ad c;
    public final InterfaceC2999Xc d;
    public final C0540Ee e;
    public final Looper f;
    public final int g;
    public final C6144i21 h;
    public final InterfaceC3984bl3 i;
    public final C5800h21 j;

    public AbstractC7856n11(Activity activity, C3588ad c3588ad, C2869Wc c2869Wc, C7512m11 c7512m11) {
        this(activity, activity, c3588ad, c2869Wc, c7512m11);
    }

    public AbstractC7856n11(Context context, C3588ad c3588ad, InterfaceC2999Xc interfaceC2999Xc, C7512m11 c7512m11) {
        this(context, null, c3588ad, interfaceC2999Xc, c7512m11);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC7856n11(android.content.Context r5, android.app.Activity r6, defpackage.C3588ad r7, defpackage.InterfaceC2999Xc r8, defpackage.C7512m11 r9) {
        /*
            r4 = this;
            r4.<init>()
            android.content.Context r0 = r5.getApplicationContext()
            r4.a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L28
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = "getAttributionTag"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L28
            java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r5 = 0
        L29:
            r4.b = r5
            r4.c = r7
            r4.d = r8
            android.os.Looper r0 = r9.b
            r4.f = r0
            Ee r0 = new Ee
            r0.<init>(r7, r8, r5)
            r4.e = r0
            i21 r5 = new i21
            r5.<init>(r4)
            r4.h = r5
            android.content.Context r5 = r4.a
            h21 r5 = defpackage.C5800h21.a(r5)
            r4.j = r5
            java.util.concurrent.atomic.AtomicInteger r7 = r5.m
            int r7 = r7.getAndIncrement()
            r4.g = r7
            bl3 r7 = r9.a
            r4.i = r7
            if (r6 == 0) goto L87
            boolean r7 = r6 instanceof com.google.android.gms.common.api.GoogleApiActivity
            if (r7 != 0) goto L87
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            if (r7 != r8) goto L87
            BA1 r7 = new BA1
            r7.<init>(r6)
            DA1 r6 = com.google.android.gms.common.api.internal.LifecycleCallback.c(r7)
            java.lang.String r7 = "ConnectionlessLifecycleHelper"
            java.lang.Class<W30> r8 = defpackage.W30.class
            com.google.android.gms.common.api.internal.LifecycleCallback r7 = r6.h(r8, r7)
            W30 r7 = (defpackage.W30) r7
            if (r7 != 0) goto L7f
            W30 r7 = new W30
            r7.<init>(r6, r5)
        L7f:
            fk r6 = r7.k
            r6.add(r0)
            r5.f(r7)
        L87:
            uU3 r5 = r5.s
            r6 = 7
            android.os.Message r6 = r5.obtainMessage(r6, r4)
            r5.sendMessage(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7856n11.<init>(android.content.Context, android.app.Activity, ad, Xc, m11):void");
    }

    public final void c(int i, AbstractC8508ov abstractC8508ov) {
        abstractC8508ov.i();
        C5800h21 c5800h21 = this.j;
        c5800h21.getClass();
        C4619dd c4619dd = new C4619dd(i, abstractC8508ov);
        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
        handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(4, new DG2(c4619dd, c5800h21.n.get(), this)));
    }

    public final AF3 b(int i, AbstractC5875hF3 abstractC5875hF3) {
        C6905kF3 c6905kF3 = new C6905kF3();
        C5800h21 c5800h21 = this.j;
        c5800h21.getClass();
        c5800h21.c(c6905kF3, abstractC5875hF3.c, this);
        C5306fd c5306fd = new C5306fd(i, abstractC5875hF3, c6905kF3, this.i);
        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
        handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(4, new DG2(c5306fd, c5800h21.n.get(), this)));
        return c6905kF3.a;
    }

    public final AF3 d(DL2 dl2) {
        YD1 yd1 = dl2.a.a.c;
        BL2 bl2 = dl2.b;
        YD1 yd12 = bl2.a;
        C5800h21 c5800h21 = this.j;
        AL2 al2 = dl2.a;
        Runnable runnable = dl2.c;
        c5800h21.getClass();
        C6905kF3 c6905kF3 = new C6905kF3();
        c5800h21.c(c6905kF3, al2.d, this);
        C4962ed c4962ed = new C4962ed(new C6590jL2(al2, bl2, runnable), c6905kF3);
        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
        handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(8, new DG2(c4962ed, c5800h21.n.get(), this)));
        return c6905kF3.a;
    }

    public final AF3 e(YD1 yd1, int i) {
        C5800h21 c5800h21 = this.j;
        c5800h21.getClass();
        C6905kF3 c6905kF3 = new C6905kF3();
        c5800h21.c(c6905kF3, i, this);
        C5650gd c5650gd = new C5650gd(yd1, c6905kF3);
        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
        handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(13, new DG2(c5650gd, c5800h21.n.get(), this)));
        return c6905kF3.a;
    }

    public final IU a() {
        IU iu = new IU();
        InterfaceC2999Xc interfaceC2999Xc = this.d;
        iu.a = interfaceC2999Xc instanceof InterfaceC2739Vc ? ((InterfaceC2739Vc) interfaceC2999Xc).a() : null;
        Set emptySet = Collections.emptySet();
        if (iu.b == null) {
            iu.b = new C5348fk(0);
        }
        iu.b.addAll(emptySet);
        Context context = this.a;
        iu.d = context.getClass().getName();
        iu.c = context.getPackageName();
        return iu;
    }

    public AbstractC7856n11(Context context, C3588ad c3588ad, InterfaceC3984bl3 interfaceC3984bl3) {
        this(context, c3588ad, InterfaceC2999Xc.a, new C7512m11(interfaceC3984bl3, Looper.getMainLooper()));
    }
}

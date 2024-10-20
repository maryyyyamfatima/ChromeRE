package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC6619jR1 extends AbstractBinderC0017Ad1 {
    public static final C4856eI1 j = new C4856eI1("MediaRouterProxy");
    public final MQ1 a;
    public final CastOptions g;
    public final HashMap h = new HashMap();
    public final R43 i;

    public BinderC6619jR1(MQ1 mq1, final CastOptions castOptions, C5537gH c5537gH) {
        this.a = mq1;
        this.g = castOptions;
        int i = Build.VERSION.SDK_INT;
        C4856eI1 c4856eI1 = j;
        if (i <= 32) {
            c4856eI1.f("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]);
            return;
        }
        c4856eI1.f("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.i = new R43();
        c5537gH.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).a(new InterfaceC1702Nc2() { // from class: gR1
            @Override // defpackage.InterfaceC1702Nc2
            public final void b(AF3 af3) {
                boolean z;
                CastOptions castOptions2;
                BinderC6619jR1 binderC6619jR1 = BinderC6619jR1.this;
                binderC6619jR1.getClass();
                boolean l = af3.l();
                C4856eI1 c4856eI12 = BinderC6619jR1.j;
                if (l) {
                    Bundle bundle = (Bundle) af3.k();
                    boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    Object[] objArr = new Object[1];
                    objArr[0] = z2 ? "existed" : "not existed";
                    c4856eI12.a("The module-to-client output switcher flag %s", objArr);
                    if (z2) {
                        z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        CastOptions castOptions3 = castOptions;
                        c4856eI12.a("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(castOptions3.q));
                        boolean z3 = !z && castOptions3.q;
                        if (binderC6619jR1.a != null || (castOptions2 = binderC6619jR1.g) == null) {
                        }
                        C4901eR1 c4901eR1 = new C4901eR1();
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 30) {
                            c4901eR1.a = z3;
                        }
                        boolean z4 = castOptions2.o;
                        if (i2 >= 30) {
                            c4901eR1.c = z4;
                        }
                        boolean z5 = castOptions2.n;
                        if (i2 >= 30) {
                            c4901eR1.b = z5;
                        }
                        C5245fR1 c5245fR1 = new C5245fR1(c4901eR1);
                        MQ1.b();
                        C11420xQ1 c = MQ1.c();
                        C5245fR1 c5245fR12 = c.q;
                        c.q = c5245fR1;
                        if (c.g()) {
                            if (c.f == null) {
                                C6267iP1 c6267iP1 = new C6267iP1(c.a, new C10391uQ1(c));
                                c.f = c6267iP1;
                                c.a(c6267iP1);
                                c.m();
                                C11396xL2 c11396xL2 = c.d;
                                c11396xL2.c.post(c11396xL2.h);
                            }
                            if ((c5245fR12 != null && c5245fR12.c) != c5245fR1.c) {
                                C6267iP1 c6267iP12 = c.f;
                                c6267iP12.j = c.z;
                                if (!c6267iP12.k) {
                                    c6267iP12.k = true;
                                    c6267iP12.h.sendEmptyMessage(2);
                                }
                            }
                        } else {
                            C6267iP1 c6267iP13 = c.f;
                            if (c6267iP13 != null) {
                                c.j(c6267iP13);
                                c.f = null;
                                C11396xL2 c11396xL22 = c.d;
                                c11396xL22.c.post(c11396xL22.h);
                            }
                        }
                        c.n.b(769, c5245fR1);
                        c4856eI12.f("session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5));
                        if (z4) {
                            C4558dR1 c4558dR1 = new C4558dR1(binderC6619jR1.i);
                            MQ1.b();
                            MQ1.c().B = c4558dR1;
                            int i3 = AbstractC10350uI0.a;
                        }
                        if (z5) {
                            int i4 = AbstractC10350uI0.a;
                            return;
                        }
                        return;
                    }
                }
                z = true;
                CastOptions castOptions32 = castOptions;
                c4856eI12.a("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(castOptions32.q));
                if (z) {
                }
                if (binderC6619jR1.a != null) {
                }
            }
        });
    }

    public final void h1(C6614jQ1 c6614jQ1, int i) {
        Set set;
        if (c6614jQ1 == null || (set = (Set) this.h.get(c6614jQ1)) == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.a.a(c6614jQ1, (AbstractC6958kQ1) it.next(), i);
        }
    }

    public final void i1(C6614jQ1 c6614jQ1) {
        Set set;
        if (c6614jQ1 == null || (set = (Set) this.h.get(c6614jQ1)) == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.a.j((AbstractC6958kQ1) it.next());
        }
    }
}

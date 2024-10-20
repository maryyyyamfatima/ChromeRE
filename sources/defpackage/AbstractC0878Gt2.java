package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gt2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0878Gt2 {
    public static final Object g = new Object();
    public static volatile C11552xo h;
    public static final DP0 i;
    public static final AtomicInteger j;
    public final C0748Ft2 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final boolean f;

    public abstract Object b(Object obj);

    static {
        new AtomicReference();
        i = new DP0(new InterfaceC6891kD() { // from class: xt2
            @Override // defpackage.InterfaceC6891kD
            public final void a() {
                Object obj = AbstractC0878Gt2.g;
            }
        });
        j = new AtomicInteger();
    }

    public static void e(final Context context) {
        Context context2;
        synchronized (g) {
            C11552xo c11552xo = h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (c11552xo == null || c11552xo.a != context) {
                W20.b();
                M83.b();
                synchronized (C7880n51.class) {
                    C7880n51 c7880n51 = C7880n51.c;
                    if (c7880n51 != null && (context2 = c7880n51.a) != null && c7880n51.b != null) {
                        context2.getContentResolver().unregisterContentObserver(C7880n51.c.b);
                    }
                    C7880n51.c = null;
                }
                h = new C11552xo(context, AbstractC0729Fp3.a(new InterfaceC0209Bp3() { // from class: wt2
                    @Override // defpackage.InterfaceC0209Bp3
                    public final Object get() {
                        AbstractC9095qe2 abstractC9095qe2;
                        Context context3 = context;
                        synchronized (C71.class) {
                            abstractC9095qe2 = C71.a;
                            if (abstractC9095qe2 == null) {
                                abstractC9095qe2 = D71.b(context3);
                                C71.a = abstractC9095qe2;
                            }
                        }
                        return abstractC9095qe2;
                    }
                }));
                j.incrementAndGet();
            }
        }
    }

    public static void h(Context context) {
        if (h == null) {
            synchronized (g) {
                if (h == null) {
                    e(context);
                }
            }
        }
    }

    public AbstractC0878Gt2(C0748Ft2 c0748Ft2, String str, Object obj, boolean z) {
        String str2 = c0748Ft2.a;
        if (str2 == null && c0748Ft2.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && c0748Ft2.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = c0748Ft2;
        this.b = str;
        this.c = obj;
        this.f = z;
    }

    public final Object c() {
        if (!this.f && i.a) {
            String str = this.b;
            AbstractC1212Ji1 abstractC1212Ji1 = (AbstractC1212Ji1) CP0.a.get();
            if (str == null) {
                abstractC1212Ji1.getClass();
            } else {
                C0172Bi1 listIterator = ((AbstractC0562Ei1) ((AbstractC0952Hi1) abstractC1212Ji1.a()).values()).listIterator(0);
                while (listIterator.hasNext() && !((Collection) listIterator.next()).contains(str)) {
                }
            }
        }
        int i2 = j.get();
        if (this.d < i2) {
            synchronized (this) {
                if (this.d < i2) {
                    this.e = d();
                    this.d = i2;
                }
            }
        }
        return this.e;
    }

    public final Object d() {
        Object g2;
        C11552xo c11552xo = h;
        if (!this.a.f ? (g2 = g(c11552xo)) == null && (g2 = f(c11552xo)) == null : (g2 = f(c11552xo)) == null && (g2 = g(c11552xo)) == null) {
            g2 = this.c;
        }
        AbstractC9095qe2 abstractC9095qe2 = (AbstractC9095qe2) c11552xo.b.get();
        if (!abstractC9095qe2.c()) {
            return g2;
        }
        C0566Ej0 c0566Ej0 = (C0566Ej0) abstractC9095qe2.b();
        C0748Ft2 c0748Ft2 = this.a;
        String a = c0566Ej0.a(c0748Ft2.b, c0748Ft2.a, c0748Ft2.d, this.b);
        return a == null ? this.c : b(a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {, blocks: (B:30:0x004a, B:32:0x0052, B:33:0x005e, B:35:0x0060, B:40:0x0092, B:42:0x0096, B:43:0x009c, B:51:0x00a8, B:52:0x00b3, B:54:0x006d, B:57:0x007d, B:59:0x0083), top: B:29:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Type inference failed for: r1v1, types: [yt2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.C11552xo r10) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0878Gt2.g(xo):java.lang.Object");
    }

    public final Object f(C11552xo c11552xo) {
        CV0 cv0;
        String str;
        C0748Ft2 c0748Ft2 = this.a;
        if (!c0748Ft2.e && ((cv0 = c0748Ft2.h) == null || ((Boolean) cv0.apply(c11552xo.a)).booleanValue())) {
            C7880n51 c = C7880n51.c(c11552xo.a);
            if (c0748Ft2.e) {
                str = null;
            } else {
                String str2 = c0748Ft2.c;
                str = this.b;
                if (str2 == null || !str2.isEmpty()) {
                    str = AbstractC7848n0.a(str2, str);
                }
            }
            String a = c.a(str);
            if (a != null) {
                return b(a);
            }
        }
        return null;
    }

    public static C0488Dt2 a(InterfaceC0618Et2 interfaceC0618Et2, C0748Ft2 c0748Ft2, QX0 qx0, String str, boolean z) {
        return new C0488Dt2(interfaceC0618Et2, c0748Ft2, qx0, str, z);
    }
}

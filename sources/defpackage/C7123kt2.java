package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kt2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7123kt2 {
    public static volatile C7123kt2 g;
    public final Context a;
    public final InterfaceC0209Bp3 b;
    public final InterfaceC0209Bp3 c;
    public final AbstractC9095qe2 d;
    public final InterfaceC0209Bp3 e;
    public static final Object f = new Object();
    public static final InterfaceC0209Bp3 h = AbstractC0729Fp3.a(new InterfaceC0209Bp3() { // from class: it2
        @Override // defpackage.InterfaceC0209Bp3
        public final Object get() {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: jt2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return new Thread(runnable, "ProcessStablePhenotypeFlag");
                }
            });
            if (newSingleThreadScheduledExecutor instanceof InterfaceScheduledExecutorServiceC4493dE1) {
                return (InterfaceScheduledExecutorServiceC4493dE1) newSingleThreadScheduledExecutor;
            }
            return new SY1(newSingleThreadScheduledExecutor);
        }
    });

    public static C7123kt2 b(Context context) {
        synchronized (AbstractC7811mt2.a) {
        }
        C7123kt2 c7123kt2 = g;
        if (c7123kt2 == null) {
            synchronized (f) {
                c7123kt2 = g;
                if (c7123kt2 == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        AbstractC3598ae3.a(applicationContext);
                        throw null;
                    } catch (IllegalStateException unused) {
                        c7123kt2 = new C7123kt2(applicationContext);
                        g = c7123kt2;
                    }
                }
            }
        }
        return c7123kt2;
    }

    public C7123kt2(final Context context) {
        InterfaceC0209Bp3 a = AbstractC0729Fp3.a(new InterfaceC0209Bp3() { // from class: gt2
            @Override // defpackage.InterfaceC0209Bp3
            public final Object get() {
                return new C5900hK3(new C4374ct2(context));
            }
        });
        InterfaceC0209Bp3 interfaceC0209Bp3 = h;
        C3242Yy2 c3242Yy2 = new C3242Yy2(new C1398Kt2(interfaceC0209Bp3));
        InterfaceC0209Bp3 a2 = AbstractC0729Fp3.a(new InterfaceC0209Bp3() { // from class: ht2
            @Override // defpackage.InterfaceC0209Bp3
            public final Object get() {
                return new C3694au3(Collections.singletonList(new C3434a9(new Z8(context))));
            }
        });
        this.a = context.getApplicationContext();
        this.b = AbstractC0729Fp3.a(interfaceC0209Bp3);
        this.c = AbstractC0729Fp3.a(a);
        this.d = c3242Yy2;
        this.e = AbstractC0729Fp3.a(a2);
    }

    public final InterfaceScheduledExecutorServiceC4493dE1 a() {
        return (InterfaceScheduledExecutorServiceC4493dE1) this.b.get();
    }
}

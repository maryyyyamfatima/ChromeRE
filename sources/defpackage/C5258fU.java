package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5258fU {
    public final C3901bX1 a;
    public final boolean b;
    public final InterfaceC0209Bp3 c = AbstractC0729Fp3.a(new InterfaceC0209Bp3() { // from class: cU
        @Override // defpackage.InterfaceC0209Bp3
        public final Object get() {
            C5258fU c5258fU = C5258fU.this;
            c5258fU.getClass();
            V90 a = c5258fU.a.a("/client_streamz/xuikit/client_errors/template_processing_error_count", C4188cM0.a("template_processing_error_type"), C4188cM0.a("client_surface_id"), C4188cM0.a("feature_attribution_id"), new C4188cM0(String.class, "application_id"));
            if (!c5258fU.b) {
                a.e = false;
            }
            return a;
        }
    });
    public final InterfaceC0209Bp3 d = AbstractC0729Fp3.a(new InterfaceC0209Bp3() { // from class: dU
        @Override // defpackage.InterfaceC0209Bp3
        public final Object get() {
            C5258fU c5258fU = C5258fU.this;
            c5258fU.getClass();
            V90 a = c5258fU.a.a("/client_streamz/xuikit/client_errors/internal_runtime_error_count", C4188cM0.a("internal_runtime_error_type"), C4188cM0.a("client_surface_id"), C4188cM0.a("feature_attribution_id"), new C4188cM0(String.class, "application_id"));
            if (!c5258fU.b) {
                a.e = false;
            }
            return a;
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:            r3 = new defpackage.C3901bX1("xuikit_android");        defpackage.C3901bX1.f.add(r3);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5258fU(java.util.concurrent.ScheduledExecutorService r6, defpackage.ST r7, android.app.Application r8) {
        /*
            r5 = this;
            java.lang.String r0 = "xuikit_android"
            r5.<init>()
            cU r1 = new cU
            r1.<init>()
            Bp3 r1 = defpackage.AbstractC0729Fp3.a(r1)
            r5.c = r1
            dU r1 = new dU
            r1.<init>()
            Bp3 r1 = defpackage.AbstractC0729Fp3.a(r1)
            r5.d = r1
            eU r1 = new eU
            r1.<init>()
            defpackage.AbstractC0729Fp3.a(r1)
            java.nio.charset.Charset r1 = defpackage.C3901bX1.e
            java.lang.Class<bX1> r1 = defpackage.C3901bX1.class
            monitor-enter(r1)
            java.util.ArrayList r2 = defpackage.C3901bX1.f     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6a
        L2e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6a
            bX1 r3 = (defpackage.C3901bX1) r3     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r3.c     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L2e
            monitor-exit(r1)
            goto L4f
        L44:
            bX1 r3 = new bX1     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r0 = defpackage.C3901bX1.f     // Catch: java.lang.Throwable -> L6a
            r0.add(r3)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r1)
        L4f:
            r5.a = r3
            Qk1 r0 = r3.d
            if (r0 != 0) goto L62
            in3 r0 = new in3
            r0.<init>(r7, r6, r3)
            if (r8 == 0) goto L5f
            r8.registerActivityLifecycleCallbacks(r0)
        L5f:
            r3.d = r0
            goto L66
        L62:
            in3 r0 = (defpackage.C6401in3) r0
            r0.g = r7
        L66:
            r6 = 0
            r5.b = r6
            return
        L6a:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5258fU.<init>(java.util.concurrent.ScheduledExecutorService, ST, android.app.Application):void");
    }
}

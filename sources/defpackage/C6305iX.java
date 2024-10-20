package defpackage;

import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iX */
/* loaded from: classes.dex */
public final class C6305iX implements HP0 {
    public static volatile AbstractC9095qe2 i;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Set f;
    public final InterfaceC4484dC2 g;
    public final InterfaceC4484dC2 h;

    public C6305iX(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AbstractC1472Li1 abstractC1472Li1, InterfaceC4484dC2 interfaceC4484dC2, InterfaceC4484dC2 interfaceC4484dC22) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = abstractC1472Li1;
        this.g = interfaceC4484dC2;
        this.h = interfaceC4484dC22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:            if (android.os.Build.VERSION.CODENAME.charAt(0) == 'T') goto L160;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.MP0 a(defpackage.C7123kt2 r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            java.util.Set r9 = r13.f
            LP0 r10 = defpackage.MP0.h
            boolean r11 = r13.a
            boolean r6 = r13.c
            boolean r7 = r13.d
            boolean r8 = r13.e
            r10.getClass()
            java.lang.String r4 = ""
            mi2 r12 = new mi2
            r12.<init>(r15, r0)
            BT2 r0 = r10.a
            java.lang.Object r0 = r0.get(r12)
            MP0 r0 = (defpackage.MP0) r0
            if (r0 != 0) goto La0
            QX1 r0 = new QX1
            r1 = r0
            r2 = r14
            r3 = r15
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            BT2 r1 = r10.a
            java.lang.Object r1 = r1.putIfAbsent(r12, r0)
            MP0 r1 = (defpackage.MP0) r1
            if (r1 != 0) goto L9f
            android.content.Context r14 = r14.a
            JP0 r1 = new JP0
            r1.<init>(r0)
            BT2 r2 = defpackage.C2567Tt2.c
            r2.putIfAbsent(r12, r1)
            boolean r1 = defpackage.C2567Tt2.b
            if (r1 != 0) goto L87
            java.lang.Object r1 = defpackage.C2567Tt2.a
            monitor-enter(r1)
            boolean r2 = defpackage.C2567Tt2.b     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L82
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L84
            r3 = 33
            r4 = 1
            if (r2 >= r3) goto L5e
            java.lang.String r2 = android.os.Build.VERSION.CODENAME     // Catch: java.lang.Throwable -> L84
            r3 = 0
            char r2 = r2.charAt(r3)     // Catch: java.lang.Throwable -> L84
            r5 = 84
            if (r2 != r5) goto L5f
        L5e:
            r3 = r4
        L5f:
            if (r3 == 0) goto L71
            Tt2 r2 = new Tt2     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "com.google.android.gms.phenotype.UPDATE"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L84
            defpackage.AbstractC2437St2.a(r14, r2, r3)     // Catch: java.lang.Throwable -> L84
            goto L80
        L71:
            Tt2 r2 = new Tt2     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "com.google.android.gms.phenotype.UPDATE"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L84
            r14.registerReceiver(r2, r3)     // Catch: java.lang.Throwable -> L84
        L80:
            defpackage.C2567Tt2.b = r4     // Catch: java.lang.Throwable -> L84
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            goto L87
        L84:
            r14 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            throw r14
        L87:
            if (r11 == 0) goto L94
            KH r14 = new KH
            r14.<init>()
            BT2 r1 = defpackage.AbstractC1657Mt2.a
            r1.putIfAbsent(r15, r14)
            goto La0
        L94:
            KP0 r14 = new KP0
            r14.<init>()
            BT2 r15 = defpackage.AbstractC3082Xs2.a
            r15.putIfAbsent(r12, r14)
            goto La0
        L9f:
            r0 = r1
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6305iX.a(kt2, java.lang.String):MP0");
    }
}

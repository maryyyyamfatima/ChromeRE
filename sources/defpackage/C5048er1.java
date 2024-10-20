package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: er1 */
/* loaded from: classes2.dex */
public final class C5048er1 implements InterfaceC4841eF1 {
    public final N33 a;
    public final PU2 g;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C5048er1() {
        PU2 pu2 = new PU2(V60.a);
        Object obj = ThreadUtils.a;
        this.g = pu2;
        this.a = PostTask.a(QF3.h);
    }

    @Override // defpackage.InterfaceC4841eF1
    public final void a1(final HU0 hu0, final C6559jF1 c6559jF1) {
        this.a.b(new Runnable() { // from class: ar1
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    r10 = this;
                    er1 r0 = defpackage.C5048er1.this
                    r0.getClass()
                    org.chromium.url.Origin r1 = new org.chromium.url.Origin
                    HU0 r2 = r2
                    Ie2 r3 = r2.b
                    r1.<init>(r3)
                    d14 r4 = r3.e
                    r5 = 1
                    r6 = 0
                    if (r4 == 0) goto L16
                    r4 = r5
                    goto L17
                L16:
                    r4 = r6
                L17:
                    java.lang.String r7 = ""
                    if (r4 == 0) goto L1c
                    goto L50
                L1c:
                    java.lang.String r1 = r1.a()
                    java.lang.String r4 = "https"
                    boolean r1 = r1.equals(r4)
                    if (r1 == 0) goto L50
                    d14 r1 = r3.e
                    if (r1 == 0) goto L2e
                    r1 = r5
                    goto L2f
                L2e:
                    r1 = r6
                L2f:
                    if (r1 != 0) goto L34
                    java.lang.String r1 = r3.c
                    goto L35
                L34:
                    r1 = r7
                L35:
                    java.lang.String r4 = "attestation.android.com"
                    boolean r1 = r1.equals(r4)
                    if (r1 == 0) goto L50
                    d14 r1 = r3.e
                    if (r1 == 0) goto L43
                    r1 = r5
                    goto L44
                L43:
                    r1 = r6
                L44:
                    if (r1 != 0) goto L49
                    short r1 = r3.d
                    goto L4a
                L49:
                    r1 = r6
                L4a:
                    r3 = 443(0x1bb, float:6.21E-43)
                    if (r1 != r3) goto L50
                    r1 = r5
                    goto L51
                L50:
                    r1 = r6
                L51:
                    jF1 r3 = r3
                    if (r1 != 0) goto L66
                    java.lang.String r0 = "Wrong status"
                    GU0 r0 = defpackage.C5048er1.c(r5, r0)
                    QF3 r1 = defpackage.AbstractC5103f04.c
                    br1 r2 = new br1
                    r2.<init>()
                    org.chromium.base.task.PostTask.c(r1, r2)
                    goto Lb7
                L66:
                    java.lang.String r1 = r2.c
                    PU2 r2 = r0.g
                    android.content.Context r4 = r2.a
                    java.lang.String r5 = r4.getPackageName()
                    android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
                    android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
                    int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
                    long r8 = (long) r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
                    java.lang.String r7 = java.lang.Long.toString(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
                L7f:
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    java.lang.String r8 = "nonce"
                    r4.putString(r8, r1)
                    java.lang.String r1 = "packageName"
                    r4.putString(r1, r5)
                    java.lang.String r1 = "versionCode"
                    r4.putString(r1, r7)
                    gF3 r1 = new gF3
                    r1.<init>()
                    NU2 r5 = new NU2
                    r5.<init>()
                    r1.a = r5
                    fF3 r1 = r1.a()
                    AF3 r1 = r2.b(r6, r1)
                    cr1 r2 = new cr1
                    r2.<init>(r0, r3)
                    r1.e(r2)
                    dr1 r2 = new dr1
                    r2.<init>(r0, r3)
                    r1.c(r2)
                Lb7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC3674ar1.run():void");
            }
        });
    }

    public static GU0 c(int i, String str) {
        GU0 gu0 = new GU0(0);
        gu0.b = i;
        gu0.c = str;
        return gu0;
    }
}

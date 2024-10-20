package defpackage;

import android.util.Pair;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pu3 */
/* loaded from: classes.dex */
public final class C8849pu3 implements InterfaceC3039Xk {
    public C3169Yk a;

    @Override // defpackage.InterfaceC12080zL0
    public final /* bridge */ /* synthetic */ Pair c() {
        return null;
    }

    @Override // defpackage.InterfaceC3039Xk
    public final boolean a() {
        C3169Yk c3169Yk = this.a;
        return c3169Yk != null && c3169Yk.b == 2;
    }

    @Override // defpackage.InterfaceC3039Xk
    public final void b(AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        if (this.a != null) {
            return;
        }
        C3169Yk c3169Yk = new C3169Yk(this, abstractRunnableC9679sL0);
        this.a = c3169Yk;
        c3169Yk.c(AbstractC0185Bl.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    @Override // defpackage.InterfaceC12080zL0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map d() {
        /*
            r10 = this;
            r0 = 6
            android.util.Pair[] r0 = new android.util.Pair[r0]
            java.lang.String r1 = J.N.MpdXuPgt()
            java.lang.String r2 = "CPU Architecture"
            android.util.Pair r1 = android.util.Pair.create(r2, r1)
            r2 = 0
            r0[r2] = r1
            int r1 = J.N.Mnh$RUKx()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "Available Memory (MB)"
            android.util.Pair r1 = android.util.Pair.create(r2, r1)
            r2 = 1
            r0[r2] = r1
            int r1 = J.N.MEPW6xxL()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "Total Memory (MB)"
            android.util.Pair r1 = android.util.Pair.create(r2, r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = J.N.M3VLomue()
            java.lang.String r3 = "GPU Vendor"
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            r3 = 3
            r0[r3] = r1
            java.lang.String r1 = J.N.MZ6RjAhF()
            java.lang.String r3 = "GPU Model"
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            r3 = 4
            r0[r3] = r1
            java.lang.String r1 = "UI Locale"
            java.lang.String r3 = org.chromium.base.LocaleUtils.getDefaultLocaleString()
            android.util.Pair r1 = android.util.Pair.create(r1, r3)
            r3 = 5
            r0[r3] = r1
            java.util.HashMap r0 = defpackage.AbstractC9048qW.c(r0)
            Yk r1 = r10.a     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6c
            int r1 = r1.b     // Catch: java.lang.Throwable -> L6c
            if (r1 != r2) goto L6c
            Yk r1 = r10.a     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = r1.f()     // Catch: java.lang.Throwable -> L6c
            goto L6d
        L6c:
            r1 = 0
        L6d:
            android.os.StatFs r1 = (android.os.StatFs) r1
            if (r1 == 0) goto L96
            long r2 = r1.getBlockSizeLong()
            long r4 = r1.getAvailableBlocksLong()
            long r4 = r4 * r2
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r4 / r6
            long r8 = r1.getBlockCountLong()
            long r8 = r8 * r2
            long r8 = r8 / r6
            java.lang.String r1 = "Available Storage (MB)"
            java.lang.String r2 = java.lang.Long.toString(r4)
            r0.put(r1, r2)
            java.lang.String r1 = "Total Storage (MB)"
            java.lang.String r2 = java.lang.Long.toString(r8)
            r0.put(r1, r2)
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8849pu3.d():java.util.Map");
    }
}

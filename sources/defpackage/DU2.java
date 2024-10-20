package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DU2 extends FU2 {
    public final /* synthetic */ int[] r;
    public final /* synthetic */ String t;
    public final /* synthetic */ int s = 3;
    public final /* synthetic */ String u = "AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU2(C6144i21 c6144i21, String str, int[] iArr) {
        super(c6144i21);
        this.r = iArr;
        this.t = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:            if (r1 == null) goto L112;     */
    @Override // defpackage.AbstractC8508ov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.InterfaceC3129Yc r7) {
        /*
            r6 = this;
            KU2 r7 = (defpackage.KU2) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int[] r1 = r6.r
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L1a
            r5 = r1[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto Lc
        L1a:
            r7.getClass()
            java.lang.String r1 = r6.u
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L4c
            java.lang.String r1 = "com.google.android.safetynet.API_KEY"
            android.content.Context r2 = r7.F
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            if (r4 != 0) goto L30
            goto L4a
        L30:
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo(r2, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            if (r2 != 0) goto L3d
            goto L4a
        L3d:
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            if (r2 != 0) goto L42
            goto L4a
        L42:
            java.lang.Object r1 = r2.get(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            java.lang.String r1 = (java.lang.String) r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            if (r1 != 0) goto L4c
        L4a:
            java.lang.String r1 = ""
        L4c:
            int r2 = r0.size()
            int[] r2 = new int[r2]
        L52:
            int r4 = r0.size()
            if (r3 >= r4) goto L67
            java.lang.Object r4 = r0.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L52
        L67:
            android.os.IInterface r7 = r7.m()
            gf1 r7 = (defpackage.InterfaceC5664gf1) r7
            ef1 r7 = (defpackage.C4976ef1) r7
            android.os.Parcel r0 = r7.a()
            EU2 r3 = r6.q
            defpackage.AbstractC11786yV.c(r0, r3)
            r0.writeString(r1)
            r0.writeIntArray(r2)
            int r1 = r6.s
            r0.writeInt(r1)
            java.lang.String r1 = r6.t
            r0.writeString(r1)
            r1 = 3
            r7.h(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DU2.m(Yc):void");
    }
}

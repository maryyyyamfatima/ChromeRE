package org.chromium.shape_detection;

import defpackage.AbstractC10647v90;
import defpackage.AbstractC4851eH1;
import defpackage.C10348uH3;
import defpackage.C11445xV1;
import defpackage.C8977qH3;
import defpackage.C9026qR2;
import defpackage.SG0;
import defpackage.V60;
import defpackage.VR;
import defpackage.W14;
import defpackage.WG0;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InterfaceRegistrar {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bindBarcodeDetectionProvider(long r5) {
        /*
            xV1 r5 = a(r5)
            android.content.Context r6 = defpackage.V60.a
            boolean r0 = defpackage.VR.a(r6)
            java.lang.String r1 = "Google Play Services not available"
            java.lang.String r2 = "BarcodeProviderImpl"
            r3 = 0
            if (r0 != 0) goto L17
            java.lang.Object[] r6 = new java.lang.Object[r3]
            defpackage.AbstractC4851eH1.f(r2, r1, r6)
            goto L40
        L17:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r0 = r6.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            r4 = 19742000(0x12d3d30, float:3.1818982E-38)
            if (r0 >= r4) goto L35
            java.lang.String r0 = "Detection disabled (%s < 19.7.42)"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.String r6 = r6.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            r4[r3] = r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            defpackage.AbstractC4851eH1.f(r2, r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            goto L40
        L35:
            It r6 = new It
            r6.<init>()
            goto L41
        L3b:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            defpackage.AbstractC4851eH1.f(r2, r1, r6)
        L40:
            r6 = 0
        L41:
            if (r6 != 0) goto L47
            r5.close()
            return
        L47:
            qR2 r0 = new qR2
            r0.<init>(r5)
            n40 r1 = r0.a
            r1.j = r6
            Qt r1 = new Qt
            org.chromium.mojo.system.impl.CoreImpl r5 = r5.g
            r1.<init>(r5, r6)
            r0.g = r1
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.shape_detection.InterfaceRegistrar.bindBarcodeDetectionProvider(long):void");
    }

    public static void bindFaceDetectionProvider(long j) {
        SG0 sg0 = new SG0();
        C11445xV1 a = a(j);
        C9026qR2 c9026qR2 = new C9026qR2(a);
        c9026qR2.a.j = sg0;
        c9026qR2.g = new WG0(a.g, sg0);
        c9026qR2.b();
    }

    public static void bindTextDetection(long j) {
        C8977qH3 c8977qH3;
        C11445xV1 a = a(j);
        if (!VR.a(V60.a)) {
            AbstractC4851eH1.a("TextDetectionImpl", "Google Play Services not available", new Object[0]);
            c8977qH3 = null;
        } else {
            c8977qH3 = new C8977qH3();
        }
        if (c8977qH3 == null) {
            a.close();
            return;
        }
        C9026qR2 c9026qR2 = new C9026qR2(a);
        c9026qR2.a.j = c8977qH3;
        c9026qR2.g = new C10348uH3(a.g, c8977qH3);
        c9026qR2.b();
    }

    public static C11445xV1 a(long j) {
        CoreImpl coreImpl = AbstractC10647v90.a;
        coreImpl.getClass();
        return new C11445xV1(new W14(coreImpl, j));
    }
}

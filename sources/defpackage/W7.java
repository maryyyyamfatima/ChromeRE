package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W7 extends AbstractC10902vu {
    public final TY2 b;
    public final V7 c;

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @Override // defpackage.AbstractC10902vu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r11 = this;
            java.lang.String r0 = "com.google.android.googlequicksearchbox"
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "connect"
            defpackage.AbstractC5195fH1.a(r3, r2)
            TY2 r2 = r11.b
            XY2 r2 = (defpackage.XY2) r2
            java.util.HashSet r3 = r2.g
            V7 r4 = r11.c
            r3.add(r4)
            r2.getClass()
            defpackage.AbstractC5434fy2.a()
            int r3 = r2.i
            r4 = 1
            r5 = 2
            if (r3 != r5) goto L23
            r3 = r4
            goto L24
        L23:
            r3 = r1
        L24:
            java.lang.String r6 = "LensSdk"
            if (r3 == 0) goto L2f
            java.lang.String r0 = "Attempting to bind service while currently binding."
            android.util.Log.e(r6, r0)
            goto La8
        L2f:
            boolean r3 = r2.h1()
            if (r3 == 0) goto L3c
            java.lang.String r0 = "Attempting to bind service when already bound."
            android.util.Log.e(r6, r0)
            goto La8
        L3c:
            android.content.pm.PackageManager r3 = r2.l
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            if (r3 == 0) goto L4d
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            r7 = 300821121(0x11ee2a81, float:3.7575974E-28)
            if (r3 < r7) goto L4d
            r3 = r4
            goto L57
        L4d:
            r3 = r1
            goto L57
        L4f:
            java.lang.String r3 = "AgsaVersionChecker"
            java.lang.String r7 = "Unable to find agsa package: com.google.android.googlequicksearchbox"
            android.util.Log.e(r3, r7)
            goto L4d
        L57:
            r7 = 3
            if (r3 != 0) goto L62
            r0 = 5
            r2.k1(r0)
            r2.i1(r7)
            goto La8
        L62:
            r2.k1(r5)
            java.lang.String r3 = r2.m
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "com.google.android.apps.gsa.publicsearch.IPublicSearchService"
            r8.<init>(r9)
            r8.setPackage(r0)
            r0 = 6
            android.content.Context r9 = r2.h     // Catch: java.lang.SecurityException -> L94
            r10 = 65
            boolean r8 = r9.bindService(r8, r2, r10)     // Catch: java.lang.SecurityException -> L94
            if (r8 != 0) goto L90
            java.lang.String r7 = "Unable to bind %s."
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch: java.lang.SecurityException -> L94
            r8[r1] = r3     // Catch: java.lang.SecurityException -> L94
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch: java.lang.SecurityException -> L94
            android.util.Log.e(r6, r7)     // Catch: java.lang.SecurityException -> L94
            r2.i1(r5)     // Catch: java.lang.SecurityException -> L94
            r2.k1(r0)     // Catch: java.lang.SecurityException -> L94
            goto La8
        L90:
            r2.k1(r7)     // Catch: java.lang.SecurityException -> L94
            goto La8
        L94:
            r7 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r1 = "Unable to bind %s due to security exception."
            java.lang.String r1 = java.lang.String.format(r1, r4)
            android.util.Log.e(r6, r1, r7)
            r2.i1(r5)
            r2.k1(r0)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.W7.a():void");
    }

    @Override // defpackage.AbstractC10902vu
    public final void b() {
        AbstractC5195fH1.a("disconnect", new Object[0]);
        XY2 xy2 = (XY2) this.b;
        xy2.getClass();
        AbstractC5434fy2.a();
        int i = xy2.i;
        if (i == 4 || i == 7) {
            try {
                InterfaceC3141Ye1 interfaceC3141Ye1 = xy2.j;
                interfaceC3141Ye1.getClass();
                byte[] bArr = XY2.o;
                C2881We1 c2881We1 = (C2881We1) interfaceC3141Ye1;
                Parcel a = c2881We1.a();
                a.writeByteArray(bArr);
                c2881We1.M0(1, a);
            } catch (RemoteException | SecurityException e) {
                Log.e("LensSdk", String.format("Unable to end %s.", xy2.m), e);
            }
            xy2.j = null;
        }
        if (xy2.h1()) {
            xy2.h.unbindService(xy2);
        }
        xy2.g.clear();
        xy2.a.clear();
        xy2.k1(1);
    }

    @Override // defpackage.AbstractC10902vu
    public final void d(Bundle bundle) {
        AbstractC5195fH1.a("send", new Object[0]);
        final SystemParcelableWrapper systemParcelableWrapper = new SystemParcelableWrapper(bundle);
        final XY2 xy2 = (XY2) this.b;
        xy2.getClass();
        AbstractC5434fy2.a();
        AbstractC5434fy2.a();
        if (xy2.i == 4) {
            InterfaceC3141Ye1 interfaceC3141Ye1 = xy2.j;
            interfaceC3141Ye1.getClass();
            byte[] bArr = XY2.n;
            C2881We1 c2881We1 = (C2881We1) interfaceC3141Ye1;
            Parcel a = c2881We1.a();
            a.writeByteArray(bArr);
            AbstractC11786yV.b(a, systemParcelableWrapper);
            c2881We1.M0(2, a);
            return;
        }
        xy2.a.add(new Runnable() { // from class: VY2
            @Override // java.lang.Runnable
            public final void run() {
                SystemParcelableWrapper systemParcelableWrapper2 = systemParcelableWrapper;
                XY2 xy22 = XY2.this;
                xy22.getClass();
                try {
                    InterfaceC3141Ye1 interfaceC3141Ye12 = xy22.j;
                    interfaceC3141Ye12.getClass();
                    byte[] bArr2 = XY2.n;
                    C2881We1 c2881We12 = (C2881We1) interfaceC3141Ye12;
                    Parcel a2 = c2881We12.a();
                    a2.writeByteArray(bArr2);
                    AbstractC11786yV.b(a2, systemParcelableWrapper2);
                    c2881We12.M0(2, a2);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public W7(Context context) {
        XY2 xy2 = new XY2(context);
        this.c = new V7(this);
        this.b = xy2;
    }
}

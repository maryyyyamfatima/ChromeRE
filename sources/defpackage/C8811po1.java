package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: po1 */
/* loaded from: classes.dex */
public final class C8811po1 extends AbstractC11280x01 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12200000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.instantapps.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC2741Vc1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        if (queryLocalInterface instanceof InterfaceC2871Wc1) {
            return (InterfaceC2871Wc1) queryLocalInterface;
        }
        return new C2611Uc1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return new Feature[]{AbstractC11036wI0.a, AbstractC11036wI0.b, AbstractC11036wI0.c, AbstractC11036wI0.d};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8811po1(android.content.Context r13, android.os.Looper r14, defpackage.InterfaceC9914t11 r15, defpackage.InterfaceC10257u11 r16) {
        /*
            r12 = this;
            r3 = 121(0x79, float:1.7E-43)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            ck r7 = new ck
            r7.<init>()
            ck r0 = new ck
            r0.<init>()
            java.lang.Object r1 = defpackage.C8543p11.c
            Y93 r1 = defpackage.AbstractC3574aa3.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13.getMainLooper()
            java.lang.String r8 = r13.getPackageName()
            java.lang.Class r1 = r13.getClass()
            java.lang.String r9 = r1.getName()
            ga3 r1 = defpackage.C5636ga3.b
            ad r2 = defpackage.AbstractC3574aa3.b
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L45
            java.lang.Object r0 = r0.get(r2)
            ga3 r0 = (defpackage.C5636ga3) r0
            r10 = r0
            goto L46
        L45:
            r10 = r1
        L46:
            JU r11 = new JU
            r5 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0 = r12
            r1 = r13
            r2 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8811po1.<init>(android.content.Context, android.os.Looper, t11, u11):void");
    }
}

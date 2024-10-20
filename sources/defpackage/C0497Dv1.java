package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497Dv1 extends AbstractC11280x01 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 15000000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.kids.internal.IKidsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.kids.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    public C0497Dv1(Context context, Looper looper, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, looper, 42, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC4621dd1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsService");
        if (queryLocalInterface instanceof InterfaceC4964ed1) {
            return (InterfaceC4964ed1) queryLocalInterface;
        }
        return new C4277cd1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return AbstractC11379xI0.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:            if (android.os.Build.VERSION.CODENAME.charAt(0) == 'T') goto L6;     */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String p() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L11
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r1 = 0
            char r0 = r0.charAt(r1)
            r2 = 84
            if (r0 != r2) goto L12
        L11:
            r1 = 1
        L12:
            java.lang.String r0 = "com.google.android.gms"
            if (r1 != 0) goto L17
            return r0
        L17:
            java.lang.Class<android.app.admin.DevicePolicyManager> r1 = android.app.admin.DevicePolicyManager.class
            android.content.Context r2 = r3.h
            java.lang.Object r1 = r2.getSystemService(r1)
            android.app.admin.DevicePolicyManager r1 = (android.app.admin.DevicePolicyManager) r1
            java.lang.String r2 = "com.google.android.gms.supervision"
            boolean r1 = r1.isProfileOwnerApp(r2)
            if (r1 == 0) goto L2a
            r0 = r2
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0497Dv1.p():java.lang.String");
    }
}

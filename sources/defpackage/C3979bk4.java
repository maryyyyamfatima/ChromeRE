package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bk4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3979bk4 implements Gk4 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC4322ck4 c;

    public C3979bk4(Context context, String str, InterfaceC4322ck4 interfaceC4322ck4) {
        this.a = context;
        this.b = str;
        this.c = interfaceC4322ck4;
    }

    @Override // defpackage.Gk4
    public final void a(IBinder iBinder) {
        IInterface c1831Oc1;
        Bundle bundle;
        Context context = this.a;
        String packageName = context.getPackageName();
        InterfaceC4322ck4 interfaceC4322ck4 = this.c;
        String str = null;
        if (iBinder == null) {
            try {
                bundle = context.getPackageManager().getApplicationInfo(this.b, 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null && bundle.getInt("org.chromium.webapk.shell_apk.shellApkVersion") < 6) {
                str = bundle.getString("org.chromium.webapk.shell_apk.runtimeHost");
            }
            interfaceC4322ck4.a(str, TextUtils.equals(str, packageName));
            return;
        }
        int i = AbstractBinderC1961Pc1.a;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.webapk.lib.common.identity_service.IIdentityService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2091Qc1)) {
            c1831Oc1 = (InterfaceC2091Qc1) queryLocalInterface;
        } else {
            c1831Oc1 = new C1831Oc1(iBinder);
        }
        try {
            C1831Oc1 c1831Oc12 = (C1831Oc1) c1831Oc1;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("org.chromium.webapk.lib.common.identity_service.IIdentityService");
                c1831Oc12.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                obtain2.recycle();
                obtain.recycle();
                str = readString;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        } catch (RemoteException unused2) {
            Log.w("WebApkIdentityService", "Failed to get runtime host from the Identity service.");
        }
        interfaceC4322ck4.a(str, TextUtils.equals(str, packageName));
    }
}

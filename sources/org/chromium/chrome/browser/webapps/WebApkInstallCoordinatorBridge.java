package org.chromium.chrome.browser.webapps;

import J.N;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.C9779se1;
import defpackage.InterfaceC10122te1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebApkInstallCoordinatorBridge {
    public long a = N.MpLwMZHi(this);
    public InterfaceC10122te1 b;

    public void onFinishedInstall(int i) {
        try {
            C9779se1 c9779se1 = (C9779se1) this.b;
            c9779se1.getClass();
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("org.chromium.components.webapk_install.IOnFinishInstallCallback");
                obtain.writeInt(i);
                c9779se1.a.transact(1, obtain, null, 1);
                obtain.recycle();
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } catch (RemoteException unused) {
        }
        long j = this.a;
        if (j != 0) {
            N.MIO1A7Cv(j);
            this.a = 0L;
        }
    }
}

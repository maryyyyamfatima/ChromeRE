package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lv */
/* loaded from: classes.dex */
public final class C7476lv extends AbstractC5414fv {
    public final IBinder g;
    public final /* synthetic */ BaseGmsClient h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7476lv(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.h = baseGmsClient;
        this.g = iBinder;
    }

    @Override // defpackage.AbstractC5414fv
    public final void b(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.h;
        C10937w01 c10937w01 = baseGmsClient.u;
        if (c10937w01 != null) {
            c10937w01.a.M0(connectionResult);
        }
        baseGmsClient.s(connectionResult);
    }

    @Override // defpackage.AbstractC5414fv
    public final boolean c() {
        IBinder iBinder = this.g;
        try {
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.h;
            if (!baseGmsClient.n().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + baseGmsClient.n() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface e = baseGmsClient.e(iBinder);
            if (e == null || !(BaseGmsClient.c(baseGmsClient, 2, 4, e) || BaseGmsClient.c(baseGmsClient, 3, 4, e))) {
                return false;
            }
            baseGmsClient.y = null;
            Bundle b = baseGmsClient.b();
            C10594v01 c10594v01 = baseGmsClient.t;
            if (c10594v01 == null) {
                return true;
            }
            c10594v01.a.h(b);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}

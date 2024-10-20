package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sH */
/* loaded from: classes.dex */
public final class C9658sH extends AbstractC11280x01 {

    /* renamed from: J */
    public static final C4856eI1 f11541J = new C4856eI1("CastClientImplCxless");
    public final CastDevice F;
    public final long G;
    public final Bundle H;
    public final String I;

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 19390000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final void disconnect() {
        try {
            try {
                C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) m());
                c0002Aa1.M0(1, c0002Aa1.a());
            } catch (RemoteException | IllegalStateException unused) {
                f11541J.b("Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC0132Ba1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof InterfaceC0262Ca1) {
            return (InterfaceC0262Ca1) queryLocalInterface;
        }
        return new C0002Aa1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle i() {
        Bundle bundle = new Bundle();
        f11541J.a("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.F;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.G);
        bundle.putString("connectionless_client_record_id", this.I);
        Bundle bundle2 = this.H;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return FI0.e;
    }

    public C9658sH(Context context, Looper looper, JU ju, CastDevice castDevice, long j, Bundle bundle, String str, InterfaceC9914t11 interfaceC9914t11, InterfaceC10257u11 interfaceC10257u11) {
        super(context, looper, 10, ju, interfaceC9914t11, interfaceC10257u11);
        this.F = castDevice;
        this.G = j;
        this.H = bundle;
        this.I = str;
    }
}

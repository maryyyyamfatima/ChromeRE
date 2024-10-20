package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9315rH extends AbstractC11280x01 {
    public static final C4856eI1 Z = new C4856eI1("CastClientImpl");
    public static final Object a0 = new Object();
    public static final Object b0 = new Object();
    public ApplicationMetadata F;
    public final CastDevice G;
    public final YG H;
    public final HashMap I;

    /* renamed from: J, reason: collision with root package name */
    public final long f11540J;
    public final Bundle K;
    public BinderC8973qH L;
    public String M;
    public boolean N;
    public boolean O;
    public boolean P;
    public double Q;
    public EqualizerSettings R;
    public int S;
    public int T;
    public String U;
    public String V;
    public Bundle W;
    public final HashMap X;
    public InterfaceC8851pv Y;

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public C9315rH(Context context, Looper looper, JU ju, CastDevice castDevice, long j, YG yg, Bundle bundle, InterfaceC9914t11 interfaceC9914t11, InterfaceC10257u11 interfaceC10257u11) {
        super(context, looper, 10, ju, interfaceC9914t11, interfaceC10257u11);
        this.G = castDevice;
        this.H = yg;
        this.f11540J = j;
        this.K = bundle;
        this.I = new HashMap();
        new AtomicLong(0L);
        this.X = new HashMap();
        this.S = -1;
        this.T = -1;
        this.F = null;
        this.M = null;
        this.Q = 0.0d;
        z();
        this.N = false;
        this.R = null;
        z();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void u(int i, IBinder iBinder, Bundle bundle, int i2) {
        Z.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.O = true;
            this.P = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.W = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.u(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final void disconnect() {
        Object[] objArr = {this.L, Boolean.valueOf(isConnected())};
        C4856eI1 c4856eI1 = Z;
        c4856eI1.a("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        BinderC8973qH binderC8973qH = this.L;
        C9315rH c9315rH = null;
        this.L = null;
        if (binderC8973qH != null) {
            C9315rH c9315rH2 = (C9315rH) binderC8973qH.a.getAndSet(null);
            if (c9315rH2 != null) {
                c9315rH2.S = -1;
                c9315rH2.T = -1;
                c9315rH2.F = null;
                c9315rH2.M = null;
                c9315rH2.Q = 0.0d;
                c9315rH2.z();
                c9315rH2.N = false;
                c9315rH2.R = null;
                c9315rH = c9315rH2;
            }
            if (c9315rH != null) {
                c4856eI1.a("removing all MessageReceivedCallbacks", new Object[0]);
                synchronized (this.I) {
                    this.I.clear();
                }
                try {
                    try {
                        C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) m());
                        c0002Aa1.M0(1, c0002Aa1.a());
                    } catch (RemoteException | IllegalStateException unused) {
                        c4856eI1.b("Error while disconnecting the controller interface", new Object[0]);
                    }
                    return;
                } finally {
                    super.disconnect();
                }
            }
        }
        c4856eI1.a("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC11623y01
    public final Bundle b() {
        Bundle bundle = this.W;
        if (bundle == null) {
            return null;
        }
        this.W = null;
        return bundle;
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
        Z.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.U, this.V);
        CastDevice castDevice = this.G;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f11540J);
        Bundle bundle2 = this.K;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        BinderC8973qH binderC8973qH = new BinderC8973qH(this);
        this.L = binderC8973qH;
        bundle.putParcelable("listener", new BinderWrapper(binderC8973qH.asBinder()));
        String str = this.U;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.V;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void s(ConnectionResult connectionResult) {
        super.s(connectionResult);
        Z.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.I) {
            this.I.clear();
        }
    }

    public final void z() {
        CastDevice castDevice = this.G;
        if (castDevice.u1(2048) || !castDevice.u1(4) || castDevice.u1(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.j);
    }

    public static void y(C9315rH c9315rH, long j, int i) {
        InterfaceC8851pv interfaceC8851pv;
        synchronized (c9315rH.X) {
            interfaceC8851pv = (InterfaceC8851pv) c9315rH.X.remove(Long.valueOf(j));
        }
        if (interfaceC8851pv != null) {
            interfaceC8851pv.a(new Status(i, null, 0));
        }
    }
}

package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC6444iv extends AbstractBinderC7826mw {
    public BaseGmsClient a;
    public final int g;

    public BinderC6444iv(BaseGmsClient baseGmsClient, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = baseGmsClient;
        this.g = i;
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            this.a.u(readInt, readStrongBinder, bundle, this.g);
            this.a = null;
        } else if (i == 2) {
            parcel.readInt();
            AbstractBinderC7826mw.g1(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            ConnectionInfo connectionInfo = (ConnectionInfo) AbstractC11786yV.a(parcel, ConnectionInfo.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            BaseGmsClient baseGmsClient = this.a;
            baseGmsClient.A = connectionInfo;
            if (baseGmsClient.x()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.i;
                C10735vQ2 a = C10735vQ2.a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a;
                synchronized (a) {
                    if (rootTelemetryConfiguration == null) {
                        a.a = C10735vQ2.c;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = a.a;
                        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.a < rootTelemetryConfiguration.a) {
                            a.a = rootTelemetryConfiguration;
                        }
                    }
                }
            }
            this.a.u(readInt2, readStrongBinder2, connectionInfo.a, this.g);
            this.a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

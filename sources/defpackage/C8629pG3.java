package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pG3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8629pG3 extends AbstractC11280x01 {
    public final C8972qG3 F;

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean q() {
        return true;
    }

    public C8629pG3(Context context, Looper looper, JU ju, C8972qG3 c8972qG3, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, looper, 270, ju, c30, interfaceC1962Pc2);
        this.F = c8972qG3;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC4265cb1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof InterfaceC4609db1) {
            return (InterfaceC4609db1) queryLocalInterface;
        }
        return new C3922bb1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return II0.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle i() {
        this.F.getClass();
        return new Bundle();
    }
}

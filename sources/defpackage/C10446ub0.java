package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ub0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10446ub0 extends AbstractC11280x01 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.credential.manager.firstparty.internal.ICredentialManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.credential.manager.service.firstparty.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean q() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    public C10446ub0(Context context, Looper looper, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, looper, 196, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC7014kb1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.credential.manager.firstparty.internal.ICredentialManagerService");
        if (queryLocalInterface instanceof InterfaceC7358lb1) {
            return (InterfaceC7358lb1) queryLocalInterface;
        }
        return new C6670jb1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return new Feature[]{JI0.a};
    }
}

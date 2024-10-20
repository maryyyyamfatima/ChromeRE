package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6612jQ extends AbstractC11280x01 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 211700000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.chromesync.firstparty.internal.IChromeSyncApiService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.chromesync.service.firstparty.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    public C6612jQ(Context context, Looper looper, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, looper, 303, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC2731Va1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.chromesync.firstparty.internal.IChromeSyncApiService");
        if (queryLocalInterface instanceof InterfaceC2861Wa1) {
            return (InterfaceC2861Wa1) queryLocalInterface;
        }
        return new C2601Ua1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return GI0.b;
    }
}

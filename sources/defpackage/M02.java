package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M02 extends DZ2 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.search.nativeapi.internal.INativeApiService";
    }

    public M02(Context context, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, context.getMainLooper(), 78, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC1187Jd1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiService");
        if (queryLocalInterface instanceof InterfaceC1317Kd1) {
            return (InterfaceC1317Kd1) queryLocalInterface;
        }
        return new C1057Id1(iBinder);
    }
}

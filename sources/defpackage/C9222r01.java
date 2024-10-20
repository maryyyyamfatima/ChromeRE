package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9222r01 extends DZ2 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.search.global.internal.IGlobalSearchAdminService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    public C9222r01(Context context, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, context.getMainLooper(), 33, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC4615dc1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
        if (queryLocalInterface instanceof InterfaceC4958ec1) {
            return (InterfaceC4958ec1) queryLocalInterface;
        }
        return new C4271cc1(iBinder);
    }
}

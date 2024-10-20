package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uZ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10437uZ2 extends DZ2 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.search.administration.internal.ISearchAdministrationService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    public C10437uZ2(Context context, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, context.getMainLooper(), 30, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC6351if1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
        if (queryLocalInterface instanceof InterfaceC6694jf1) {
            return (InterfaceC6694jf1) queryLocalInterface;
        }
        return new C6008hf1(iBinder);
    }
}

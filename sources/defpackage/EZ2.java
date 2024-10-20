package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EZ2 extends DZ2 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.search.corpora.internal.ISearchCorporaService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    public EZ2(Context context, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, context.getMainLooper(), 36, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC7382lf1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
        if (queryLocalInterface instanceof InterfaceC7726mf1) {
            return (InterfaceC7726mf1) queryLocalInterface;
        }
        return new C7038kf1(iBinder);
    }
}

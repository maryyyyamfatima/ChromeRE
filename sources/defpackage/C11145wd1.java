package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11145wd1 extends DZ2 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.search.ime.internal.IIMEUpdatesService";
    }

    public C11145wd1(Context context, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, context.getMainLooper(), 66, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC1571Mc1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.ime.internal.IIMEUpdatesService");
        if (queryLocalInterface instanceof InterfaceC1701Nc1) {
            return (InterfaceC1701Nc1) queryLocalInterface;
        }
        return new C1442Lc1(iBinder);
    }
}

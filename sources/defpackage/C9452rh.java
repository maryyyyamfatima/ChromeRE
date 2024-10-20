package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9452rh extends AbstractC11280x01 {
    public static final C3588ad F = new C3588ad("AppIndexing.API", new C9110qh(), new C3259Zc());

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC7696ma1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        if (queryLocalInterface instanceof InterfaceC8040na1) {
            return (InterfaceC8040na1) queryLocalInterface;
        }
        return new C7352la1(iBinder);
    }

    public C9452rh(Context context, Looper looper, InterfaceC9914t11 interfaceC9914t11, InterfaceC10257u11 interfaceC10257u11, JU ju) {
        super(context, looper, 113, ju, interfaceC9914t11, interfaceC10257u11);
    }
}

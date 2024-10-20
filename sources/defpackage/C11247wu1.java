package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wu1 */
/* loaded from: classes.dex */
public final class C11247wu1 extends AbstractC11280x01 {
    public final C11933yu1 F;

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 19609000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.auth.folsom.internal.IKeyRetrievalService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.auth.key.retrieval.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean q() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    public C11247wu1(Context context, Looper looper, C11933yu1 c11933yu1, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2, JU ju) {
        super(context, looper, 172, ju, c30, interfaceC1962Pc2);
        this.F = c11933yu1;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("SECURITY_DOMAIN", this.F.b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return EI0.d;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC3590ad1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
        if (queryLocalInterface instanceof InterfaceC3934bd1) {
            return (InterfaceC3934bd1) queryLocalInterface;
        }
        return new C3261Zc1(iBinder);
    }
}

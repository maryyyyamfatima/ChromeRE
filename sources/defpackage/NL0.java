package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NL0 extends AbstractC11280x01 {
    public final String F;
    public final String G;

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 16890000;
    }

    public NL0(String str, String str2, int i, Context context, Looper looper, JU ju, InterfaceC9914t11 interfaceC9914t11, InterfaceC10257u11 interfaceC10257u11) {
        super(context, looper, i, ju, interfaceC9914t11, interfaceC10257u11);
        this.F = str;
        this.G = str2;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return this.G;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return this.F;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        return new OL0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", this.G);
        return bundle;
    }
}

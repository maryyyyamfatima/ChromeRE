package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DZ2 extends AbstractC11280x01 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.icing.INDEX_SERVICE";
    }

    public DZ2(Context context, Looper looper, int i, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, looper, i, ju, c30, interfaceC1962Pc2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("ComponentName", null);
        return bundle;
    }
}

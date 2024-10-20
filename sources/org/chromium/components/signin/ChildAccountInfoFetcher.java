package org.chromium.components.signin;

import android.content.IntentFilter;
import defpackage.C5891hJ;
import defpackage.C6235iJ;
import defpackage.V60;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChildAccountInfoFetcher {
    public final long a;
    public final CoreAccountInfo b;
    public final C6235iJ c;

    public ChildAccountInfoFetcher(long j, CoreAccountInfo coreAccountInfo) {
        this.a = j;
        this.b = coreAccountInfo;
        C6235iJ c6235iJ = new C6235iJ(this);
        this.c = c6235iJ;
        V60.c(V60.a, c6235iJ, new IntentFilter("com.google.android.gms.auth.ACCOUNT_SERVICES_CHANGED"), "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE");
        coreAccountInfo.getEmail();
        AccountManagerFacadeProvider.getInstance().d(CoreAccountInfo.a(coreAccountInfo), new C5891hJ(this));
    }

    public final void destroy() {
        V60.a.unregisterReceiver(this.c);
    }

    public static ChildAccountInfoFetcher create(long j, CoreAccountInfo coreAccountInfo) {
        return new ChildAccountInfoFetcher(j, coreAccountInfo);
    }
}

package org.chromium.components.signin;

import J.N;
import org.chromium.base.Callback;
import org.chromium.components.signin.AccountCapabilitiesFetcher;
import org.chromium.components.signin.base.AccountCapabilities;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AccountCapabilitiesFetcher {
    public final CoreAccountInfo a;
    public long b;

    public AccountCapabilitiesFetcher(CoreAccountInfo coreAccountInfo, long j) {
        this.a = coreAccountInfo;
        this.b = j;
    }

    public void startFetchingAccountCapabilities() {
        AccountManagerFacadeProvider.getInstance().e(CoreAccountInfo.a(this.a)).g(new Callback() { // from class: r2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                AccountCapabilitiesFetcher accountCapabilitiesFetcher = AccountCapabilitiesFetcher.this;
                N.M8lmDXtQ((AccountCapabilities) obj, accountCapabilitiesFetcher.b);
                accountCapabilitiesFetcher.b = 0L;
            }
        });
    }
}

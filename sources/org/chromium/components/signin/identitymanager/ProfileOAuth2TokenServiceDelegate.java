package org.chromium.components.signin.identitymanager;

import J.N;
import android.accounts.Account;
import defpackage.B4;
import defpackage.MC2;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.identitymanager.ProfileOAuth2TokenServiceDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ProfileOAuth2TokenServiceDelegate {
    public final long a;
    public final AccountTrackerService b;
    public final AccountManagerFacade c = AccountManagerFacadeProvider.getInstance();

    public ProfileOAuth2TokenServiceDelegate(long j, AccountTrackerService accountTrackerService) {
        this.a = j;
        this.b = accountTrackerService;
    }

    public final void getAccessTokenFromNative(final String str, final String str2, final long j) {
        this.c.a().g(new Callback() { // from class: xC2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ProfileOAuth2TokenServiceDelegate profileOAuth2TokenServiceDelegate = ProfileOAuth2TokenServiceDelegate.this;
                profileOAuth2TokenServiceDelegate.getClass();
                Account d = B4.d(str, (List) obj);
                final long j2 = j;
                if (d == null) {
                    ThreadUtils.d(new Runnable() { // from class: zC2
                        @Override // java.lang.Runnable
                        public final void run() {
                            N.MTN9MD0o(null, 0L, false, j2);
                        }
                    });
                    return;
                }
                P30 p30 = new P30(new BC2(profileOAuth2TokenServiceDelegate, d, "oauth2:" + str2, new AC2(j2)));
                Object obj2 = ThreadUtils.a;
                p30.h.set(false);
                new N30(p30).c(AbstractC0185Bl.e);
            }
        });
    }

    public void invalidateAccessToken(String str) {
        this.c.h(str);
    }

    public boolean hasOAuth2RefreshToken(String str) {
        MC2 a = this.c.a();
        return a.d() && B4.d(str, (List) a.b) != null;
    }

    public void seedAndReloadAccountsWithPrimaryAccount(final String str) {
        Object obj = ThreadUtils.a;
        this.b.b(new Runnable() { // from class: yC2
            @Override // java.lang.Runnable
            public final void run() {
                ProfileOAuth2TokenServiceDelegate profileOAuth2TokenServiceDelegate = ProfileOAuth2TokenServiceDelegate.this;
                profileOAuth2TokenServiceDelegate.getClass();
                N.M0SOBbHG(profileOAuth2TokenServiceDelegate.a, str, (String[]) B4.f(B4.e(AccountManagerFacadeProvider.getInstance().a())).toArray(new String[0]));
            }
        });
    }
}

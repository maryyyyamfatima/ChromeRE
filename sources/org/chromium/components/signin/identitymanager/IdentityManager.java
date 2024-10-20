package org.chromium.components.signin.identitymanager;

import J.N;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.InterfaceC1072Ig1;
import java.util.Iterator;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class IdentityManager {
    public long a;
    public final C12157za2 b = new C12157za2();

    public final void onRefreshTokenUpdatedForAccount(CoreAccountInfo coreAccountInfo) {
    }

    public static IdentityManager create(long j, ProfileOAuth2TokenServiceDelegate profileOAuth2TokenServiceDelegate) {
        return new IdentityManager(j);
    }

    public IdentityManager(long j) {
        this.a = j;
    }

    public final void destroy() {
        this.a = 0L;
    }

    public final void a(InterfaceC1072Ig1 interfaceC1072Ig1) {
        this.b.a(interfaceC1072Ig1);
    }

    public final void d(InterfaceC1072Ig1 interfaceC1072Ig1) {
        this.b.d(interfaceC1072Ig1);
    }

    public void onPrimaryAccountChanged(PrimaryAccountChangeEvent primaryAccountChangeEvent) {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1072Ig1) c11814ya2.next()).o(primaryAccountChangeEvent);
            }
        }
    }

    public void onAccountsCookieDeletedByUserAction() {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1072Ig1) c11814ya2.next()).v();
            }
        }
    }

    public void onExtendedAccountInfoUpdated(AccountInfo accountInfo) {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1072Ig1) c11814ya2.next()).m(accountInfo);
            }
        }
    }

    public final boolean c(int i) {
        return b(i) != null;
    }

    public final CoreAccountInfo b(int i) {
        return (CoreAccountInfo) N.MwJ3GEOr(this.a, i);
    }
}

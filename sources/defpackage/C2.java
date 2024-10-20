package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.AccountTrackerService;
import org.chromium.components.signin.identitymanager.IdentityManager;
import org.chromium.components.signin.identitymanager.PrimaryAccountChangeEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class C2 implements InterfaceC1072Ig1, A4 {
    public final IdentityManager a;
    public final AccountTrackerService g;
    public final C12157za2 h = new C12157za2();

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void o(PrimaryAccountChangeEvent primaryAccountChangeEvent) {
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void v() {
    }

    public C2(IdentityManager identityManager, AccountTrackerService accountTrackerService) {
        this.a = identityManager;
        this.g = accountTrackerService;
        identityManager.a(this);
        accountTrackerService.d.a(this);
    }

    public final MC2 b(final String str) {
        final MC2 mc2 = new MC2();
        this.g.b(new Runnable() { // from class: B2
            @Override // java.lang.Runnable
            public final void run() {
                mc2.b((AccountInfo) N.MAwvRw4K(C2.this.a.a, str));
            }
        });
        return mc2;
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final void m(AccountInfo accountInfo) {
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((C10322uC2) ((A2) c11814ya2.next())).d(accountInfo);
            }
        }
    }

    @Override // defpackage.A4
    public final void a(ArrayList arrayList, boolean z) {
        IdentityManager identityManager = this.a;
        identityManager.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N.MxkwHIGI(identityManager.a, ((CoreAccountInfo) it.next()).getId());
        }
    }
}

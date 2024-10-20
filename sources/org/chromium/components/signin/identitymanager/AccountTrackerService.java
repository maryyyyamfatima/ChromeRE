package org.chromium.components.signin.identitymanager;

import defpackage.C11302x4;
import defpackage.C12157za2;
import defpackage.F4;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.identitymanager.AccountTrackerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AccountTrackerService {
    public final long a;
    public C11302x4 e;
    public final C12157za2 d = new C12157za2();
    public int c = 0;
    public final ConcurrentLinkedDeque b = new ConcurrentLinkedDeque();
    public boolean f = false;

    public AccountTrackerService(long j) {
        this.a = j;
    }

    public final void b(Runnable runnable) {
        Object obj = ThreadUtils.a;
        int i = this.c;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.b;
        if (i == 0) {
            concurrentLinkedDeque.add(runnable);
            a(false);
        } else if (i == 1) {
            concurrentLinkedDeque.add(runnable);
        } else {
            if (i != 2) {
                return;
            }
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [x4, F4] */
    public final void a(final boolean z) {
        Object obj = ThreadUtils.a;
        final AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
        this.c = 1;
        if (this.e == null) {
            ?? r1 = new F4() { // from class: x4
                @Override // defpackage.F4
                public final void E() {
                    AccountTrackerService accountTrackerService = AccountTrackerService.this;
                    if (accountTrackerService.c == 1) {
                        accountTrackerService.f = true;
                    } else {
                        accountTrackerService.a(true);
                    }
                }
            };
            this.e = r1;
            accountManagerFacadeProvider.b(r1);
        }
        accountManagerFacadeProvider.a().g(new Callback() { // from class: y4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                AccountTrackerService accountTrackerService = AccountTrackerService.this;
                accountTrackerService.getClass();
                new C11988z4(B4.f((List) obj2), accountManagerFacadeProvider, accountTrackerService, z).c(AbstractC0185Bl.e);
            }
        });
    }
}

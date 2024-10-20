package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.AccountTrackerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ea3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524Ea3 implements A4 {
    public final SigninManager a;
    public final AccountTrackerService g;
    public final AccountManagerFacade h = AccountManagerFacadeProvider.getInstance();
    public int i = 0;

    public C0524Ea3(SigninManager signinManager, AccountTrackerService accountTrackerService) {
        this.a = signinManager;
        this.g = accountTrackerService;
        accountTrackerService.d.a(this);
    }

    @Override // defpackage.A4
    public final void a(ArrayList arrayList, final boolean z) {
        Pattern pattern = B4.a;
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(B4.c(((CoreAccountInfo) it.next()).getEmail()));
        }
        this.a.u(new Runnable() { // from class: sa3
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2 = z;
                C0524Ea3 c0524Ea3 = C0524Ea3.this;
                List list = arrayList2;
                c0524Ea3.b(list, z2);
                B4.b(c0524Ea3.h, list, new C11129wa3(c0524Ea3));
            }
        });
    }

    public final void b(List list, boolean z) {
        SigninManager signinManager = this.a;
        CoreAccountInfo b = signinManager.p().b(0);
        final boolean z2 = signinManager.p().b(1) != null;
        if (b == null) {
            return;
        }
        if (B4.d(b.getEmail(), list) != null) {
            if (z) {
                signinManager.a(b.getId());
                return;
            }
            return;
        }
        if (I3.b == null) {
            I3.b = new I3(new H3());
        }
        I3 i3 = I3.b;
        String email = b.getEmail();
        i3.getClass();
        MC2 mc2 = new MC2();
        new G3(i3, email, list, mc2).c(AbstractC0185Bl.f);
        mc2.g(new Callback() { // from class: va3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final String str = (String) obj;
                final C0524Ea3 c0524Ea3 = C0524Ea3.this;
                SigninManager signinManager2 = c0524Ea3.a;
                if (str == null) {
                    signinManager2.e(9);
                } else {
                    final boolean z3 = z2;
                    signinManager2.w(20, new InterfaceC5642gb3() { // from class: ya3
                        @Override // defpackage.InterfaceC5642gb3
                        public final /* synthetic */ void b() {
                        }

                        @Override // defpackage.InterfaceC5642gb3
                        public final void a() {
                            SigninManager signinManager3 = C0524Ea3.this.a;
                            boolean z4 = z3;
                            String str2 = str;
                            if (z4) {
                                signinManager3.d(30, B4.c(str2), new C0134Ba3());
                            } else {
                                signinManager3.s(B4.c(str2), null);
                            }
                        }
                    }, false);
                }
            }
        });
    }
}

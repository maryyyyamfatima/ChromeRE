package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.signin.services.SigninManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ka3 */
/* loaded from: classes.dex */
public abstract class AbstractC7010ka3 {
    public boolean a;
    public boolean b;
    public final C6666ja3 c;
    public final SigninManager d;
    public final C0009Ab3 e;
    public final C10322uC2 f;

    public AbstractC7010ka3(SigninManager signinManager) {
        Context context = V60.a;
        this.d = signinManager;
        a();
        this.f = C10322uC2.b(context);
        this.e = new C0009Ab3(20, C3083Xs3.a());
        this.c = new C6666ja3((NK0) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r6 = this;
            org.chromium.components.signin.AccountManagerFacade r0 = org.chromium.components.signin.AccountManagerFacadeProvider.getInstance()
            MC2 r0 = r0.a()
            boolean r0 = r0.d()
            org.chromium.chrome.browser.signin.services.SigninManager r1 = r6.d
            boolean r2 = r1.l()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1e
            boolean r2 = r6.a
            if (r2 == 0) goto L1e
            if (r0 == 0) goto L1e
            r2 = r3
            goto L1f
        L1e:
            r2 = r4
        L1f:
            boolean r5 = r1.n()
            if (r5 == 0) goto L42
            org.chromium.components.signin.identitymanager.IdentityManager r1 = r1.p()
            boolean r5 = r1.c(r4)
            if (r5 == 0) goto L37
            boolean r1 = r1.c(r3)
            if (r1 != 0) goto L37
            r1 = r3
            goto L38
        L37:
            r1 = r4
        L38:
            if (r1 == 0) goto L42
            boolean r1 = r6.a
            if (r1 == 0) goto L42
            if (r0 == 0) goto L42
            r0 = r3
            goto L43
        L42:
            r0 = r4
        L43:
            if (r2 != 0) goto L49
            if (r0 == 0) goto L48
            goto L49
        L48:
            r3 = r4
        L49:
            r0 = r6
            NK0 r0 = (defpackage.NK0) r0
            boolean r1 = r0.b
            if (r1 != r3) goto L51
            goto L66
        L51:
            if (r1 != 0) goto L5a
            if (r3 == 0) goto L5a
            Ab3 r1 = r0.e
            r1.d()
        L5a:
            r0.b = r3
            SK0 r1 = r0.g
            zK0 r1 = r1.a
            r1.h(r3)
            r0.b()
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7010ka3.a():void");
    }
}

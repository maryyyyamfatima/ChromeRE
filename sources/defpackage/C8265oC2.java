package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oC2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C8265oC2 implements Callback {
    public final /* synthetic */ C10322uC2 a;

    public /* synthetic */ C8265oC2(C10322uC2 c10322uC2) {
        this.a = c10322uC2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final C2 c2 = (C2) obj;
        final C10322uC2 c10322uC2 = this.a;
        c10322uC2.getClass();
        AccountManagerFacadeProvider.getInstance().a().g(new Callback() { // from class: pC2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                C10322uC2 c10322uC22 = C10322uC2.this;
                c10322uC22.getClass();
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    c2.b(((Account) it.next()).name).g(new C8951qC2(c10322uC22));
                }
            }
        });
    }
}

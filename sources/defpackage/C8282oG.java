package defpackage;

import J.N;
import android.util.Pair;
import java.util.HashSet;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oG */
/* loaded from: classes.dex */
public final class C8282oG implements Callback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Pair g;
    public final /* synthetic */ C8625pG h;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C8282oG(C8625pG c8625pG, boolean z, Pair pair) {
        this.h = c8625pG;
        this.a = z;
        this.g = pair;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C1634Mp c1634Mp = (C1634Mp) obj;
        boolean z = c1634Mp.a;
        C8625pG c8625pG = this.h;
        if (z) {
            if (c1634Mp.t == null) {
                PersonalDataManager d = PersonalDataManager.d();
                c1634Mp.t = N.My71lPBY(d.a, d, c1634Mp.q);
            }
            PersonalDataManager.AutofillProfile autofillProfile = c1634Mp.q;
            String str = c1634Mp.t;
            autofillProfile.p = str;
            String[] strArr = c1634Mp.n;
            strArr[1] = str;
            if (this.a) {
                c8625pG.h.e.remove(autofillProfile.getGUID());
                int i = 0;
                while (true) {
                    List list = c8625pG.g;
                    if (i >= list.size()) {
                        break;
                    }
                    if (((String) ((Pair) ((C1021Hw0) list.get(i))).first).equals(c1634Mp.l)) {
                        list.remove(i);
                        break;
                    }
                    i++;
                }
            } else {
                c8625pG.h.d.add(autofillProfile);
            }
            c8625pG.g.add(0, new C1021Hw0(c1634Mp.l, strArr[1]));
            C9310rG c9310rG = c8625pG.h;
            c9310rG.t.e(c8625pG.g);
            c9310rG.t.s = c1634Mp.l;
        } else {
            HashSet hashSet = c8625pG.h.t.g;
            PersonalDataManager.CreditCard creditCard = c8625pG.a;
            boolean contains = hashSet.contains(creditCard.getBillingAddressId());
            C9310rG c9310rG2 = c8625pG.h;
            if (contains) {
                c9310rG2.t.s = creditCard.getBillingAddressId();
            } else {
                c9310rG2.t.s = null;
            }
        }
        c8625pG.h.k.post((Runnable) this.g.second);
    }
}

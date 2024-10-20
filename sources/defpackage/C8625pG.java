package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pG */
/* loaded from: classes.dex */
public final class C8625pG implements Callback {
    public final /* synthetic */ PersonalDataManager.CreditCard a;
    public final /* synthetic */ List g;
    public final /* synthetic */ C9310rG h;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C8625pG(C9310rG c9310rG, PersonalDataManager.CreditCard creditCard, ArrayList arrayList) {
        this.h = c9310rG;
        this.a = creditCard;
        this.g = arrayList;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        PersonalDataManager.AutofillProfile c;
        Pair pair = (Pair) obj;
        boolean equals = "add".equals(pair.first);
        C9310rG c9310rG = this.h;
        boolean containsKey = c9310rG.e.containsKey(pair.first);
        if (equals || containsKey) {
            if (equals) {
                c = new PersonalDataManager.AutofillProfile();
                PersonalDataManager.CreditCard creditCard = this.a;
                c.e = new C2042Ps2(creditCard.getIsLocal() ? c9310rG.q.s.toString() : creditCard.getName(), 4);
            } else {
                c = C9310rG.c((String) pair.first, c9310rG.d);
            }
            c9310rG.f.d(new C8282oG(this, containsKey, pair), new C1634Mp(c9310rG.b, c, 0));
        }
    }
}

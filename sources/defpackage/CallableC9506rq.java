package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC9506rq implements Callable {
    public final /* synthetic */ String a;

    public CallableC9506rq(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (PersonalDataManager.e().a("autofill.credit_card_enabled")) {
            String str = this.a;
            if (TextUtils.isEmpty(str)) {
                PersonalDataManager d = PersonalDataManager.d();
                d.getClass();
                Object obj = ThreadUtils.a;
                long j = d.a;
                String[] MQERVwyl = N.MQERVwyl(j, d);
                ArrayList arrayList = new ArrayList(MQERVwyl.length);
                for (String str2 : MQERVwyl) {
                    arrayList.add((PersonalDataManager.CreditCard) N.M3g2doJx(j, d, str2));
                }
                return arrayList;
            }
            PersonalDataManager d2 = PersonalDataManager.d();
            d2.getClass();
            Object obj2 = ThreadUtils.a;
            PersonalDataManager.CreditCard creditCard = (PersonalDataManager.CreditCard) N.M3g2doJx(d2.a, d2, str);
            if (creditCard != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(creditCard);
                return arrayList2;
            }
        }
        return null;
    }
}

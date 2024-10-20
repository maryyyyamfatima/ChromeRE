package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2809Vq implements InterfaceC2549Tq {
    public final InterfaceC6749jo2 a;
    public final boolean b;
    public final Set c;

    public C2809Vq(InterfaceC6749jo2 interfaceC6749jo2) {
        this.a = interfaceC6749jo2;
        C4317ck k = ((C2287Rp2) interfaceC6749jo2.e()).k();
        this.c = !k.containsKey("basic-card") ? Collections.emptySet() : AbstractC3229Yw.a((C6755jp2) k.get("basic-card"));
        this.b = !r3.isEmpty();
    }

    public final C3069Xq a(PersonalDataManager.CreditCard creditCard) {
        PersonalDataManager.AutofillProfile autofillProfile;
        if (!this.b) {
            return null;
        }
        InterfaceC6749jo2 interfaceC6749jo2 = this.a;
        if (((C2287Rp2) interfaceC6749jo2.e()).u) {
            return null;
        }
        if (!this.c.contains(creditCard.getBasicCardIssuerNetwork())) {
            return null;
        }
        if (TextUtils.isEmpty(creditCard.getBillingAddressId())) {
            autofillProfile = null;
        } else {
            PersonalDataManager d = PersonalDataManager.d();
            String billingAddressId = creditCard.getBillingAddressId();
            d.getClass();
            Object obj = ThreadUtils.a;
            autofillProfile = (PersonalDataManager.AutofillProfile) N.M172IO7Q(d.a, d, billingAddressId);
        }
        if (autofillProfile != null && C1634Mp.g(autofillProfile, 1) != 0) {
            autofillProfile = null;
        }
        if (autofillProfile == null) {
            creditCard.l = null;
        }
        return new C3069Xq(((C2287Rp2) interfaceC6749jo2.e()).f, creditCard, autofillProfile, "basic-card");
    }
}

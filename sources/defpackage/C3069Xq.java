package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import android.util.JsonWriter;
import com.android.chrome.R;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.components.payments.PayerData;
import org.chromium.components.payments.PaymentApp;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xq */
/* loaded from: classes.dex */
public final class C3069Xq extends PaymentApp implements PersonalDataManager.FullCardRequestDelegate, PersonalDataManager.NormalizedAddressRequestDelegate {
    public final WebContents p;
    public PersonalDataManager.CreditCard q;
    public String r;
    public PersonalDataManager.AutofillProfile s;
    public String t;
    public InterfaceC6063ho2 u;
    public boolean v;
    public boolean w;
    public boolean x;

    @Override // org.chromium.components.payments.PaymentApp
    public final void k() {
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final int p() {
        return 1;
    }

    public C3069Xq(WebContents webContents, PersonalDataManager.CreditCard creditCard, PersonalDataManager.AutofillProfile autofillProfile, String str) {
        super(null, creditCard.getGUID(), creditCard.g, creditCard.getName());
        this.p = webContents;
        this.q = creditCard;
        this.s = autofillProfile;
        this.h = true;
        this.t = str;
        Context context = V60.a;
        if (context == null) {
            return;
        }
        int i = creditCard.k;
        if (i != 0) {
            this.m = AbstractC2884Wf.a(context, i);
        }
        F(context);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final Set o() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.t);
        return hashSet;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean x() {
        return !this.q.getIsLocal();
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean z(String str, C6755jp2 c6755jp2) {
        if (!super.z(str, c6755jp2)) {
            return false;
        }
        int[] iArr = c6755jp2.g;
        return !(iArr != null && iArr.length != 0) || AbstractC3229Yw.a(c6755jp2).contains(this.q.getBasicCardIssuerNetwork());
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final String n() {
        return C1634Mp.j(this.s);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean i() {
        return this.x;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean j() {
        return this.a;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void v(String str, String str2, String str3, String str4, byte[][] bArr, Map map, C5037ep2 c5037ep2, List list, Map map2, C7787mp2 c7787mp2, List list2, InterfaceC6063ho2 interfaceC6063ho2) {
        this.u = interfaceC6063ho2;
        this.v = true;
        this.w = true;
        PersonalDataManager d = PersonalDataManager.d();
        PersonalDataManager.AutofillProfile autofillProfile = this.s;
        d.getClass();
        Object obj = ThreadUtils.a;
        N.M7ysHTTC(d.a, d, autofillProfile, 5, this);
        PersonalDataManager d2 = PersonalDataManager.d();
        N.M_6hrjIQ(d2.a, d2, this.p, this.q, this);
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.FullCardRequestDelegate
    public final void onFullCardDetails(PersonalDataManager.CreditCard creditCard, String str) {
        C4546dP c4546dP;
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2;
        this.r = str;
        this.q.f = creditCard.getNumber();
        this.q.h = creditCard.getMonth();
        this.q.i = creditCard.getYear();
        this.w = false;
        C2287Rp2 c2287Rp2 = (C2287Rp2) this.u;
        if (c2287Rp2.C != null && (c4546dP = c2287Rp2.B) != null && (viewOnClickListenerC5731gq2 = c4546dP.f.z) != null) {
            viewOnClickListenerC5731gq2.a(true);
            C1513Lq2 c1513Lq2 = viewOnClickListenerC5731gq2.j;
            c1513Lq2.b = true;
            c1513Lq2.a();
        }
        if (this.v) {
            return;
        }
        H();
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.NormalizedAddressRequestDelegate
    public final void onAddressNormalized(PersonalDataManager.AutofillProfile autofillProfile) {
        if (this.v) {
            this.v = false;
            if (autofillProfile != null) {
                this.s = autofillProfile;
            }
            if (this.w) {
                return;
            }
            H();
        }
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.NormalizedAddressRequestDelegate
    public final void onCouldNotNormalize(PersonalDataManager.AutofillProfile autofillProfile) {
        onAddressNormalized(null);
    }

    public final void H() {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            try {
                jsonWriter.beginObject();
                jsonWriter.name("cardholderName").value(this.q.getName());
                jsonWriter.name("cardNumber").value(this.q.getNumber());
                jsonWriter.name("expiryMonth").value(this.q.getMonth());
                jsonWriter.name("expiryYear").value(this.q.getYear());
                jsonWriter.name("cardSecurityCode").value(this.r);
                jsonWriter.name("billingAddress").beginObject();
                JsonWriter name = jsonWriter.name("country");
                String countryCode = this.s.getCountryCode();
                if (countryCode == null) {
                    countryCode = "";
                }
                name.value(countryCode);
                JsonWriter name2 = jsonWriter.name("region");
                String region = this.s.getRegion();
                if (region == null) {
                    region = "";
                }
                name2.value(region);
                JsonWriter name3 = jsonWriter.name("city");
                String locality = this.s.getLocality();
                if (locality == null) {
                    locality = "";
                }
                name3.value(locality);
                JsonWriter name4 = jsonWriter.name("dependentLocality");
                String dependentLocality = this.s.getDependentLocality();
                if (dependentLocality == null) {
                    dependentLocality = "";
                }
                name4.value(dependentLocality);
                jsonWriter.name("addressLine").beginArray();
                String streetAddress = this.s.getStreetAddress();
                if (streetAddress == null) {
                    streetAddress = "";
                }
                if (!TextUtils.isEmpty(streetAddress)) {
                    for (String str : streetAddress.split("\n")) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
                JsonWriter name5 = jsonWriter.name("postalCode");
                String postalCode = this.s.getPostalCode();
                if (postalCode == null) {
                    postalCode = "";
                }
                name5.value(postalCode);
                JsonWriter name6 = jsonWriter.name("sortingCode");
                String sortingCode = this.s.getSortingCode();
                if (sortingCode == null) {
                    sortingCode = "";
                }
                name6.value(sortingCode);
                JsonWriter name7 = jsonWriter.name("languageCode");
                String languageCode = this.s.getLanguageCode();
                if (languageCode == null) {
                    languageCode = "";
                }
                name7.value(languageCode);
                JsonWriter name8 = jsonWriter.name("organization");
                String companyName = this.s.getCompanyName();
                if (companyName == null) {
                    companyName = "";
                }
                name8.value(companyName);
                JsonWriter name9 = jsonWriter.name("recipient");
                String fullName = this.s.getFullName();
                if (fullName == null) {
                    fullName = "";
                }
                name9.value(fullName);
                JsonWriter name10 = jsonWriter.name("phone");
                String phoneNumber = this.s.getPhoneNumber();
                if (phoneNumber == null) {
                    phoneNumber = "";
                }
                name10.value(phoneNumber);
                jsonWriter.endObject();
                jsonWriter.endObject();
                this.r = "";
                ((C2287Rp2) this.u).o(this.t, stringWriter.toString(), new PayerData());
                this.u = null;
            } catch (IOException unused) {
                onFullCardError();
                this.r = "";
            }
        } catch (Throwable th) {
            this.r = "";
            throw th;
        }
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.FullCardRequestDelegate
    public final void onFullCardError() {
        ((C2287Rp2) this.u).n("User closed the Payment Request UI.");
        this.u = null;
    }

    @Override // defpackage.C4733dw0
    public final boolean d() {
        return this.a;
    }

    public final void F(Context context) {
        int i;
        int i2;
        int i3;
        this.g = 0;
        int G = G();
        if ((G & 1) == 0) {
            this.g += 6;
        }
        if ((G & 8) == 0) {
            this.g += 10;
            i3 = 0;
            i2 = R.string.0_resource_name_obfuscated_res_0x7f140815;
            i = 0;
        } else {
            i = R.string.0_resource_name_obfuscated_res_0x7f140806;
            i2 = R.string.0_resource_name_obfuscated_res_0x7f1407f9;
            i3 = 1;
        }
        this.x = true;
        if ((G & 2) == 0) {
            this.g += 8;
        } else {
            this.x = false;
            i3++;
            i = R.string.0_resource_name_obfuscated_res_0x7f14081f;
            i2 = R.string.0_resource_name_obfuscated_res_0x7f140800;
        }
        if ((G & 4) == 0) {
            this.g += 13;
        } else {
            this.x = false;
            i3++;
            i = R.string.0_resource_name_obfuscated_res_0x7f14080b;
            i2 = R.string.0_resource_name_obfuscated_res_0x7f140804;
        }
        if (i3 > 1) {
            i = R.string.0_resource_name_obfuscated_res_0x7f14081d;
            i2 = R.string.0_resource_name_obfuscated_res_0x7f1407fe;
        }
        this.i = i == 0 ? null : context.getString(i);
        this.j = context.getString(i2);
        this.a = this.i == null;
    }

    @Override // defpackage.C4733dw0
    public final String c(int i, String str) {
        StringBuilder sb = new StringBuilder(this.n[0]);
        if (i < 0) {
            return sb.toString();
        }
        int indexOf = sb.indexOf(" ");
        if (indexOf > 0) {
            sb.delete(indexOf, sb.length());
        }
        return sb.length() < i ? sb.toString() : sb.substring(0, i / 2);
    }

    public final int G() {
        boolean z = false;
        int i = this.s == null ? 8 : 0;
        PersonalDataManager.CreditCard creditCard = this.q;
        if (!creditCard.h.isEmpty() && !creditCard.i.isEmpty()) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, Integer.parseInt(creditCard.h) - 1);
            calendar.set(1, Integer.parseInt(creditCard.i));
            calendar.add(12, 1);
            z = Calendar.getInstance().before(calendar);
        }
        if (!z) {
            i |= 1;
        }
        if (!this.q.getIsLocal()) {
            return i;
        }
        if (TextUtils.isEmpty(this.q.getName())) {
            i |= 2;
        }
        return PersonalDataManager.d().b(this.q.getNumber().toString(), true) == null ? i | 4 : i;
    }
}

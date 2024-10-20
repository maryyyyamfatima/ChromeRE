package defpackage;

import J.N;
import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Pair;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1634Mp extends C4733dw0 {
    public static Pattern v;
    public final Context p;
    public PersonalDataManager.AutofillProfile q;
    public String r;
    public String s;
    public String t;
    public final int u;

    public C1634Mp(Context context, PersonalDataManager.AutofillProfile autofillProfile, int i) {
        super(autofillProfile.getGUID(), autofillProfile.getFullName(), autofillProfile.p, autofillProfile.getPhoneNumber(), null);
        this.p = context;
        this.q = autofillProfile;
        this.h = true;
        this.u = i;
        i();
    }

    public final void o(PersonalDataManager.AutofillProfile autofillProfile) {
        this.r = null;
        this.s = null;
        this.t = null;
        this.q = autofillProfile;
        String guid = autofillProfile.getGUID();
        String fullName = this.q.getFullName();
        PersonalDataManager.AutofillProfile autofillProfile2 = this.q;
        f(guid, fullName, autofillProfile2.p, autofillProfile2.getPhoneNumber());
        i();
    }

    public final void m() {
        if (this.r == null) {
            PersonalDataManager d = PersonalDataManager.d();
            this.r = N.MGJNOClH(d.a, d, this.q);
        }
        PersonalDataManager.AutofillProfile autofillProfile = this.q;
        String str = this.r;
        autofillProfile.p = str;
        this.n[1] = str;
    }

    public final void i() {
        PersonalDataManager.AutofillProfile autofillProfile = this.q;
        int i = this.u;
        Pair k = k(g(autofillProfile, i));
        int intValue = ((Integer) k.first).intValue();
        Context context = this.p;
        this.i = intValue == 0 ? null : context.getString(((Integer) k.first).intValue());
        this.j = ((Integer) k.second).intValue() != 0 ? context.getString(((Integer) k.second).intValue()) : null;
        this.a = this.i == null;
        int g = g(this.q, i);
        int i2 = (g & 1) == 0 ? 1 : 0;
        if ((g & 2) == 0) {
            i2++;
        }
        if ((g & 8) == 0) {
            i2 += 10;
        }
        this.g = i2;
    }

    public static Pair k(int i) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = 0;
            i3 = R.string.f81340_resource_name_obfuscated_res_0x7f140813;
        } else if (i == 1) {
            i2 = R.string.f81540_resource_name_obfuscated_res_0x7f140828;
            i3 = R.string.f81180_resource_name_obfuscated_res_0x7f140802;
        } else if (i == 2) {
            i2 = R.string.f81510_resource_name_obfuscated_res_0x7f140824;
            i3 = R.string.f81170_resource_name_obfuscated_res_0x7f140801;
        } else if (i != 8) {
            i2 = R.string.f81440_resource_name_obfuscated_res_0x7f14081d;
            i3 = R.string.f81140_resource_name_obfuscated_res_0x7f1407fe;
        } else {
            i2 = R.string.f81410_resource_name_obfuscated_res_0x7f14081a;
            i3 = R.string.f81190_resource_name_obfuscated_res_0x7f140803;
        }
        return new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static int g(PersonalDataManager.AutofillProfile autofillProfile, int i) {
        boolean isEmpty = TextUtils.isEmpty(autofillProfile.getFullName());
        C7432ln3 c = C7432ln3.c();
        ?? r0 = isEmpty;
        if (i != 1) {
            try {
                r0 = isEmpty;
                if (!PhoneNumberUtils.isGlobalPhoneNumber(PhoneNumberUtils.stripSeparators(autofillProfile.getPhoneNumber().toString()))) {
                    r0 = (isEmpty ? 1 : 0) | 2;
                }
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        c.close();
        String j = j(autofillProfile);
        ArrayList arrayList = new ArrayList();
        N.MdAohWFG(j, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue != 8 && intValue != 0 && TextUtils.isEmpty(l(autofillProfile, intValue))) {
                return r0 | 8;
            }
        }
        return r0;
    }

    public static String l(PersonalDataManager.AutofillProfile autofillProfile, int i) {
        switch (i) {
            case 0:
                return autofillProfile.getCountryCode();
            case 1:
                return autofillProfile.getRegion();
            case 2:
                return autofillProfile.getLocality();
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return autofillProfile.getDependentLocality();
            case 4:
                return autofillProfile.getSortingCode();
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return autofillProfile.getPostalCode();
            case 6:
                return autofillProfile.getStreetAddress();
            case 7:
                return autofillProfile.getCompanyName();
            case 8:
                return autofillProfile.getFullName();
            default:
                return null;
        }
    }

    public static String j(PersonalDataManager.AutofillProfile autofillProfile) {
        if (v == null) {
            v = Pattern.compile("^[A-Z]{2}$");
        }
        return (autofillProfile == null || TextUtils.isEmpty(autofillProfile.getCountryCode()) || !v.matcher(autofillProfile.getCountryCode()).matches()) ? Locale.getDefault().getCountry() : autofillProfile.getCountryCode();
    }

    public final C4687do2 n() {
        C4687do2 c4687do2 = new C4687do2(0);
        c4687do2.b = j(this.q);
        c4687do2.c = this.q.getStreetAddress().split("\n");
        c4687do2.d = this.q.getRegion();
        c4687do2.e = this.q.getLocality();
        c4687do2.f = this.q.getDependentLocality();
        c4687do2.g = this.q.getPostalCode();
        c4687do2.h = this.q.getSortingCode();
        c4687do2.i = this.q.getCompanyName();
        c4687do2.j = this.q.getFullName();
        c4687do2.k = this.q.getPhoneNumber();
        return c4687do2;
    }
}

package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C40 extends C8545p13 {
    public final Context f;
    public final G40 g;
    public final ArrayList h;

    public C40(Context context, List list, G40 g40, C1137It1 c1137It1) {
        super(3);
        G40 g402;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        this.f = context;
        this.g = g40;
        this.h = new ArrayList(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            int size = arrayList3.size();
            g402 = this.g;
            if (i2 >= size) {
                break;
            }
            C7446lq g = g((PersonalDataManager.AutofillProfile) arrayList3.get(i2));
            if (g != null) {
                String str7 = g.v;
                g402.getClass();
                if (!TextUtils.isEmpty(str7)) {
                    g402.g.add(str7);
                }
                String str8 = g.w;
                if (g402.k == null) {
                    g402.k = new E40();
                }
                if (g402.k.isValid(str8)) {
                    g402.h.add(str8);
                }
                String str9 = g.x;
                if (g402.l == null) {
                    g402.l = new F40();
                }
                if (g402.l.isValid(str9)) {
                    g402.i.add(str9);
                }
                arrayList.add(g);
            }
            i2++;
        }
        Collections.sort(arrayList, new B40());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C7446lq c7446lq = (C7446lq) arrayList.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList2.size()) {
                    z = true;
                    break;
                }
                C7446lq c7446lq2 = (C7446lq) arrayList2.get(i4);
                if ((!c7446lq2.s || (((str5 = c7446lq2.v) != null || c7446lq.v == null) && (str5 == null || (str6 = c7446lq.v) == null || str5.equalsIgnoreCase(str6)))) && (!c7446lq2.t || (((str3 = c7446lq2.w) != null || c7446lq.w == null) && (str3 == null || (str4 = c7446lq.w) == null || TextUtils.equals(str3, str4)))) && (!c7446lq2.u || (((str = c7446lq2.x) != null || c7446lq.x == null) && (str == null || (str2 = c7446lq.x) == null || str.equalsIgnoreCase(str2))))) {
                    z = false;
                    break;
                }
                i4++;
            }
            if (z) {
                arrayList2.add(c7446lq);
            }
            if (arrayList2.size() == 4) {
                break;
            }
        }
        int i5 = (arrayList2.isEmpty() || !((C7446lq) arrayList2.get(0)).a) ? -1 : 0;
        if (c1137It1 != null) {
            N.MPFG5SwC(c1137It1.a, c1137It1, 0, arrayList2.size(), i5 != -1);
        }
        C7446lq c7446lq3 = arrayList2.isEmpty() ? null : (C7446lq) arrayList2.get(0);
        if (g402.c && (c7446lq3 == null || TextUtils.isEmpty(c7446lq3.v))) {
            i = 1;
        }
        if (g402.d && (c7446lq3 == null || TextUtils.isEmpty(c7446lq3.w))) {
            i |= 2;
        }
        if (g402.e && (c7446lq3 == null || TextUtils.isEmpty(c7446lq3.x))) {
            i |= 4;
        }
        if (i != 0) {
            EI2.m(i, "PaymentRequest.MissingContactFields");
        }
        ArrayList arrayList4 = this.a;
        arrayList4.clear();
        if (arrayList2.isEmpty()) {
            this.c = -1;
        } else {
            this.c = i5;
            arrayList4.addAll(arrayList2);
        }
    }

    public final C7446lq g(PersonalDataManager.AutofillProfile autofillProfile) {
        G40 g40 = this.g;
        boolean z = g40.c;
        boolean z2 = g40.d;
        boolean z3 = g40.e;
        String fullName = (!z || TextUtils.isEmpty(autofillProfile.getFullName())) ? null : autofillProfile.getFullName();
        String phoneNumber = (!z2 || TextUtils.isEmpty(autofillProfile.getPhoneNumber())) ? null : autofillProfile.getPhoneNumber();
        String emailAddress = (!z3 || TextUtils.isEmpty(autofillProfile.getEmailAddress())) ? null : autofillProfile.getEmailAddress();
        if (fullName == null && phoneNumber == null && emailAddress == null) {
            return null;
        }
        return new C7446lq(this.f, autofillProfile, fullName, phoneNumber, emailAddress, g40.c(fullName, phoneNumber, emailAddress), z, z2, z3);
    }

    public final void f(C1634Mp c1634Mp) {
        C7446lq g;
        if (c1634Mp == null || (g = g(c1634Mp.q)) == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                if (((C7446lq) arrayList.get(i)).p.getGUID().equals(c1634Mp.q.getGUID())) {
                    arrayList.remove(i);
                    arrayList.add(i, g);
                    return;
                }
                i++;
            } else {
                arrayList.add(g);
                return;
            }
        }
    }
}

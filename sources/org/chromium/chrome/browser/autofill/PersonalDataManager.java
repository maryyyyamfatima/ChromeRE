package org.chromium.chrome.browser.autofill;

import J.N;
import android.app.Activity;
import android.graphics.Bitmap;
import com.android.chrome.R;
import defpackage.AbstractC0687Fh1;
import defpackage.AbstractC4851eH1;
import defpackage.C0037Ah1;
import defpackage.C2042Ps2;
import defpackage.InterfaceC1912Os2;
import defpackage.R44;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.components.prefs.PrefService;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PersonalDataManager {
    public static PersonalDataManager e;
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final ImageFetcher d = AbstractC0687Fh1.b(1, ProfileKey.a());
    public final long a = N.MQw_0Q1A(this);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface FullCardRequestDelegate {
        void onFullCardDetails(CreditCard creditCard, String str);

        void onFullCardError();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface GetSubKeysRequestDelegate {
        void onSubKeysReceived(String[] strArr, String[] strArr2);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface NormalizedAddressRequestDelegate {
        void onAddressNormalized(AutofillProfile autofillProfile);

        void onCouldNotNormalize(AutofillProfile autofillProfile);
    }

    public final void a(GURL gurl, final Callback callback) {
        if (gurl.b) {
            this.d.d(C0037Ah1.b(gurl.i(), "AutofillCardArt"), new Callback() { // from class: Ns2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Callback.this.onResult((Bitmap) obj);
                }
            });
        } else {
            AbstractC4851eH1.f("PersonalDataManager", "Tried to fetch an invalid url %s", gurl.i());
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class AutofillProfile {
        public String a;
        public final String b;
        public boolean c;
        public C2042Ps2 d;
        public C2042Ps2 e;
        public C2042Ps2 f;
        public C2042Ps2 g;
        public C2042Ps2 h;
        public C2042Ps2 i;
        public C2042Ps2 j;
        public C2042Ps2 k;
        public C2042Ps2 l;
        public C2042Ps2 m;
        public C2042Ps2 n;
        public C2042Ps2 o;
        public String p;
        public String q;

        public static AutofillProfile create(String str, String str2, boolean z, String str3, int i, String str4, int i2, String str5, int i3, String str6, int i4, String str7, int i5, String str8, int i6, String str9, int i7, String str10, int i8, String str11, int i9, String str12, int i10, String str13, int i11, String str14, int i12, String str15) {
            return new AutofillProfile(str, str2, z, new C2042Ps2(str3, i), new C2042Ps2(str4, i2), new C2042Ps2(str5, i3), new C2042Ps2(str6, i4), new C2042Ps2(str7, i5), new C2042Ps2(str8, i6), new C2042Ps2(str9, i7), new C2042Ps2(str10, i8), new C2042Ps2(str11, i9), new C2042Ps2(str12, i10), new C2042Ps2(str13, i11), new C2042Ps2(str14, i12), str15);
        }

        public AutofillProfile(String str, String str2, boolean z, C2042Ps2 c2042Ps2, C2042Ps2 c2042Ps22, C2042Ps2 c2042Ps23, C2042Ps2 c2042Ps24, C2042Ps2 c2042Ps25, C2042Ps2 c2042Ps26, C2042Ps2 c2042Ps27, C2042Ps2 c2042Ps28, C2042Ps2 c2042Ps29, C2042Ps2 c2042Ps210, C2042Ps2 c2042Ps211, C2042Ps2 c2042Ps212, String str3) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = c2042Ps2;
            this.e = c2042Ps22;
            this.f = c2042Ps23;
            this.g = c2042Ps24;
            this.h = c2042Ps25;
            this.i = c2042Ps26;
            this.j = c2042Ps27;
            this.k = c2042Ps28;
            this.l = c2042Ps29;
            this.m = c2042Ps210;
            this.n = c2042Ps211;
            this.o = c2042Ps212;
            this.q = str3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public AutofillProfile() {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = ""
                java.lang.String r2 = "Chrome settings"
                r3 = 1
                Ps2 r5 = defpackage.C2042Ps2.c
                r14 = r5
                r12 = r5
                r7 = r5
                r10 = r5
                r9 = r5
                r15 = r5
                r8 = r5
                r6 = r5
                r11 = r5
                r4 = r5
                Ps2 r13 = new Ps2
                r16 = r13
                java.util.Locale r17 = java.util.Locale.getDefault()
                java.lang.String r3 = r17.getCountry()
                r17 = r0
                r0 = 4
                r18 = r1
                r1 = r16
                r1.<init>(r3, r0)
                java.lang.String r16 = ""
                r0 = r17
                r1 = r18
                r3 = 1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.autofill.PersonalDataManager.AutofillProfile.<init>():void");
        }

        public AutofillProfile(AutofillProfile autofillProfile) {
            this.a = autofillProfile.getGUID();
            this.b = autofillProfile.getOrigin();
            this.c = autofillProfile.c;
            this.d = new C2042Ps2(autofillProfile.getHonorificPrefix(), autofillProfile.getHonorificPrefixStatus());
            this.e = new C2042Ps2(autofillProfile.getFullName(), autofillProfile.getFullNameStatus());
            this.f = new C2042Ps2(autofillProfile.getCompanyName(), autofillProfile.getCompanyNameStatus());
            this.g = new C2042Ps2(autofillProfile.getStreetAddress(), autofillProfile.getStreetAddressStatus());
            this.h = new C2042Ps2(autofillProfile.getRegion(), autofillProfile.getRegionStatus());
            this.i = new C2042Ps2(autofillProfile.getLocality(), autofillProfile.getLocalityStatus());
            this.j = new C2042Ps2(autofillProfile.getDependentLocality(), autofillProfile.getDependentLocalityStatus());
            this.k = new C2042Ps2(autofillProfile.getPostalCode(), autofillProfile.getPostalCodeStatus());
            this.l = new C2042Ps2(autofillProfile.getSortingCode(), autofillProfile.getSortingCodeStatus());
            this.m = new C2042Ps2(autofillProfile.getCountryCode(), autofillProfile.getCountryCodeStatus());
            this.n = new C2042Ps2(autofillProfile.getPhoneNumber(), autofillProfile.getPhoneNumberStatus());
            this.o = new C2042Ps2(autofillProfile.getEmailAddress(), autofillProfile.getEmailAddressStatus());
            this.q = autofillProfile.getLanguageCode();
            this.p = autofillProfile.p;
        }

        public String getGUID() {
            return this.a;
        }

        public String getOrigin() {
            return this.b;
        }

        public String getHonorificPrefix() {
            return this.d.a;
        }

        public final int getHonorificPrefixStatus() {
            return this.d.b;
        }

        public String getFullName() {
            return this.e.a;
        }

        public int getFullNameStatus() {
            return this.e.b;
        }

        public String getCompanyName() {
            return this.f.a;
        }

        public int getCompanyNameStatus() {
            return this.f.b;
        }

        public String getStreetAddress() {
            return this.g.a;
        }

        public int getStreetAddressStatus() {
            return this.g.b;
        }

        public String getRegion() {
            return this.h.a;
        }

        public int getRegionStatus() {
            return this.h.b;
        }

        public String getLocality() {
            return this.i.a;
        }

        public int getLocalityStatus() {
            return this.i.b;
        }

        public String getDependentLocality() {
            return this.j.a;
        }

        public final int getDependentLocalityStatus() {
            return this.j.b;
        }

        public String getPostalCode() {
            return this.k.a;
        }

        public int getPostalCodeStatus() {
            return this.k.b;
        }

        public String getSortingCode() {
            return this.l.a;
        }

        public final int getSortingCodeStatus() {
            return this.l.b;
        }

        public String getCountryCode() {
            return this.m.a;
        }

        public final int getCountryCodeStatus() {
            return this.m.b;
        }

        public String getPhoneNumber() {
            return this.n.a;
        }

        public final int getPhoneNumberStatus() {
            return this.n.b;
        }

        public String getEmailAddress() {
            return this.o.a;
        }

        public final int getEmailAddressStatus() {
            return this.o.b;
        }

        public String getLanguageCode() {
            return this.q;
        }

        public final String toString() {
            return this.p;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class CreditCard {
        public String a;
        public String b;
        public final boolean c;
        public final boolean d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public int k;
        public String l;
        public final String m;
        public final long n;
        public final String o;
        public String p;
        public final GURL q;
        public final int r;
        public final String s;

        public static CreditCard create(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, long j, String str11, String str12, GURL gurl, int i2, String str13) {
            return new CreditCard(str, str2, z, z2, str3, str4, str5, str6, str7, str8, i, str9, str10, j, str11, str12, gurl, i2, str13);
        }

        public CreditCard(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this(str, str2, true, false, str3, str4, str5, str6, str7, "", 0, "", "", 0L, str5, "", null, 0, "");
        }

        public CreditCard(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, long j, String str11, String str12, GURL gurl, int i2, String str13) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = str8;
            this.k = i;
            this.l = str9;
            this.m = str10;
            this.n = j;
            this.o = str11;
            this.p = str12;
            this.q = gurl;
            this.r = i2;
            this.s = str13;
        }

        public String getGUID() {
            return this.a;
        }

        public String getOrigin() {
            return this.b;
        }

        public String getName() {
            return this.e;
        }

        public String getNumber() {
            return this.f;
        }

        public String getMonth() {
            return this.h;
        }

        public String getYear() {
            return this.i;
        }

        public final String a(Activity activity) {
            return getMonth() + activity.getResources().getString(R.string.f68310_resource_name_obfuscated_res_0x7f140237) + getYear();
        }

        public boolean getIsLocal() {
            return this.c;
        }

        public boolean getIsCached() {
            return this.d;
        }

        public String getBasicCardIssuerNetwork() {
            return this.j;
        }

        public String getBillingAddressId() {
            return this.l;
        }

        public String getServerId() {
            return this.m;
        }

        public long getInstrumentId() {
            return this.n;
        }

        public String getNickname() {
            return this.p;
        }

        public GURL getCardArtUrl() {
            return this.q;
        }

        public int getVirtualCardEnrollmentState() {
            return this.r;
        }

        public String getProductDescription() {
            return this.s;
        }
    }

    public static PersonalDataManager d() {
        Object obj = ThreadUtils.a;
        if (e == null) {
            e = new PersonalDataManager();
        }
        return e;
    }

    public final void personalDataChanged() {
        Object obj = ThreadUtils.a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1912Os2) it.next()).C();
        }
        Object obj2 = ThreadUtils.a;
        long j = this.a;
        String[] M00Q2SNr = N.M00Q2SNr(j, this, true);
        ArrayList arrayList = new ArrayList(M00Q2SNr.length);
        for (String str : M00Q2SNr) {
            arrayList.add((CreditCard) N.M3g2doJx(j, this, str));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final CreditCard creditCard = (CreditCard) it2.next();
            if (creditCard.getCardArtUrl() != null && creditCard.getCardArtUrl().b && !this.c.containsKey(creditCard.getCardArtUrl().i())) {
                a(creditCard.getCardArtUrl(), new Callback() { // from class: Ms2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj3) {
                        return new ZE(this, obj3);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj3) {
                        PersonalDataManager.this.c.put(creditCard.getCardArtUrl().i(), (Bitmap) obj3);
                    }
                });
            }
        }
    }

    public final ArrayList f() {
        Object obj = ThreadUtils.a;
        long j = this.a;
        return g(N.M6XJvXko(j, this), N.M4q3jK16(j, this));
    }

    public final ArrayList g(String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (int i = 0; i < strArr2.length; i++) {
            AutofillProfile autofillProfile = (AutofillProfile) N.M172IO7Q(this.a, this, strArr2[i]);
            autofillProfile.p = strArr[i];
            arrayList.add(autofillProfile);
        }
        return arrayList;
    }

    public final String b(String str, boolean z) {
        Object obj = ThreadUtils.a;
        return N.My_CbjBa(this.a, this, str, z);
    }

    public static boolean h() {
        return e().a("autofill.profile_enabled");
    }

    public static PrefService e() {
        return R44.a(Profile.d());
    }

    public final Bitmap c(final GURL gurl) {
        HashMap hashMap = this.c;
        if (hashMap.containsKey(gurl.i())) {
            return (Bitmap) hashMap.get(gurl.i());
        }
        a(gurl, new Callback() { // from class: Ls2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PersonalDataManager.this.c.put(gurl.i(), (Bitmap) obj);
            }
        });
        return null;
    }
}

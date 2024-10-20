package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MY0 extends IX3 {
    public final /* synthetic */ C8117nn0 a;

    public MY0(C8117nn0 c8117nn0) {
        this.a = c8117nn0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [LY0] */
    @Override // defpackage.IX3
    public final void a(String str, Bundle bundle) {
        boolean equals = "getDetails.response".equals(str);
        C8117nn0 c8117nn0 = this.a;
        if (!equals) {
            AbstractC4851eH1.f("DigitalGoods", AbstractC4199cO1.a("Wrong callback name given: ", str, "."), new Object[0]);
            c8117nn0.a(6, new C0092As1[0]);
            return;
        }
        if (bundle == null) {
            AbstractC4851eH1.f("DigitalGoods", "No args provided.", new Object[0]);
            c8117nn0.a(6, new C0092As1[0]);
            return;
        }
        if (!AbstractC2270Rm0.a(bundle, "getDetails.responseCode", Integer.class) || !AbstractC2270Rm0.a(bundle, "getDetails.detailsList", Parcelable[].class)) {
            c8117nn0.a(6, new C0092As1[0]);
            return;
        }
        int i = bundle.getInt("getDetails.responseCode");
        Parcelable[] parcelableArray = bundle.getParcelableArray("getDetails.detailsList");
        ?? r1 = new Object() { // from class: LY0
            public final Object a(Bundle bundle2) {
                int i2;
                String[] strArr = NY0.a;
                for (int i3 = 0; i3 < 5; i3++) {
                    String str2 = strArr[i3];
                    if (!bundle2.containsKey(str2) || !(bundle2.get(str2) instanceof String)) {
                        AbstractC4851eH1.f("DigitalGoods", AbstractC4199cO1.a("Item does not contain field String ", str2, "."), new Object[0]);
                        return null;
                    }
                }
                C9840so2 c9840so2 = new C9840so2(0);
                c9840so2.b = bundle2.getString("itemDetails.currency");
                c9840so2.c = bundle2.getString("itemDetails.value");
                C0092As1 c0092As1 = new C0092As1(1);
                c0092As1.b = bundle2.getString("itemDetails.id");
                c0092As1.c = bundle2.getString("itemDetails.title");
                c0092As1.d = bundle2.getString("itemDetails.description");
                c0092As1.e = c9840so2;
                String string = bundle2.getString("itemDetails.type");
                if ("subs".equals(string)) {
                    i2 = 2;
                } else {
                    i2 = "inapp".equals(string) ? 1 : 0;
                }
                c0092As1.k = i2;
                String string2 = bundle2.getString("itemDetails.url");
                if (string2 != null) {
                    U24 u24 = new U24(0);
                    u24.b = string2;
                    c0092As1.l = new U24[]{u24};
                } else {
                    c0092As1.l = new U24[0];
                }
                c0092As1.f = bundle2.getString("itemDetails.subsPeriod");
                c0092As1.g = bundle2.getString("itemDetails.freeTrialPeriod");
                c0092As1.i = bundle2.getString("itemDetails.introPricePeriod");
                c0092As1.j = bundle2.getInt("itemDetails.introPriceCycles", 0);
                String string3 = bundle2.getString("itemDetails.introPriceCurrency");
                String string4 = bundle2.getString("itemDetails.introPriceValue");
                if (string3 != null && string4 != null) {
                    C9840so2 c9840so22 = new C9840so2(0);
                    c9840so22.b = string3;
                    c9840so22.c = string4;
                    c0092As1.h = c9840so22;
                }
                return c0092As1;
            }
        };
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            if (parcelable instanceof Bundle) {
                Object a = r1.a((Bundle) parcelable);
                if (a != null) {
                    arrayList.add(a);
                }
            } else {
                AbstractC4851eH1.f("DigitalGoods", "Passed a Parcelable that was not a Bundle.", new Object[0]);
            }
        }
        c8117nn0.a(Integer.valueOf(AbstractC2270Rm0.b(i, bundle)), (C0092As1[]) arrayList.toArray(new C0092As1[0]));
    }
}

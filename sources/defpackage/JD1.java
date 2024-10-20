package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JD1 extends IX3 {
    public final /* synthetic */ C10861vn0 a;

    public JD1(C10861vn0 c10861vn0) {
        this.a = c10861vn0;
    }

    @Override // defpackage.IX3
    public final void a(String str, Bundle bundle) {
        boolean equals = "listPurchases.response".equals(str);
        C10861vn0 c10861vn0 = this.a;
        if (!equals) {
            AbstractC4851eH1.f("DigitalGoods", AbstractC4199cO1.a("Wrong callback name given: ", str, "."), new Object[0]);
            c10861vn0.a(6, new C5874hF2[0]);
            return;
        }
        if (bundle == null) {
            AbstractC4851eH1.f("DigitalGoods", "No args provided.", new Object[0]);
            c10861vn0.a(6, new C5874hF2[0]);
            return;
        }
        if (!AbstractC2270Rm0.a(bundle, "listPurchases.responseCode", Integer.class) || !AbstractC2270Rm0.a(bundle, "listPurchases.purchasesList", Parcelable[].class)) {
            c10861vn0.a(6, new C5874hF2[0]);
            return;
        }
        int i = bundle.getInt("listPurchases.responseCode");
        Parcelable[] parcelableArray = bundle.getParcelableArray("listPurchases.purchasesList");
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            if (parcelable instanceof Bundle) {
                C5874hF2 a = KD1.a((Bundle) parcelable);
                if (a != null) {
                    arrayList.add(a);
                }
            } else {
                AbstractC4851eH1.f("DigitalGoods", "Passed a Parcelable that was not a Bundle.", new Object[0]);
            }
        }
        c10861vn0.a(Integer.valueOf(AbstractC2270Rm0.b(i, bundle)), (C5874hF2[]) arrayList.toArray(new C5874hF2[0]));
    }
}

package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gn4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5715gn4 {
    public final C3997bn4 a;
    public final List b;
    public final String c;
    public final String d;
    public final Bundle e;

    public C5715gn4(C3997bn4 c3997bn4, ArrayList arrayList, String str, String str2, Bundle bundle) {
        this.a = c3997bn4;
        this.b = arrayList;
        this.c = str;
        this.d = str2;
        this.e = bundle;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        C3997bn4 c3997bn4 = this.a;
        if (c3997bn4 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("currency", c3997bn4.a);
            bundle2.putString("value", c3997bn4.b);
            bundle.putBundle("total", bundle2);
        }
        List list = this.b;
        if (list != null && !list.isEmpty()) {
            bundle.putParcelableArray("shippingOptions", C6059hn4.a(list));
        }
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("error", str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("stringifiedPaymentMethodErrors", str2);
        }
        Bundle bundle3 = this.e;
        if (bundle3 != null) {
            bundle.putBundle("addressErrors", bundle3);
        }
        return bundle;
    }
}

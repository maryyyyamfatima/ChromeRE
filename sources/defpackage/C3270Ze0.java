package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ze0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3270Ze0 {
    public final Intent a;

    public C3270Ze0(Intent intent) {
        this.a = intent;
    }

    public static C9772sd0 a(Intent intent, int i) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Invalid colorScheme: ", i));
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return C9772sd0.a(null);
        }
        C9772sd0 a = C9772sd0.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) {
            return a;
        }
        C9772sd0 a2 = C9772sd0.a(bundle);
        Integer num = a2.a;
        if (num == null) {
            num = a.a;
        }
        Integer num2 = a2.b;
        if (num2 == null) {
            num2 = a.b;
        }
        Integer num3 = a2.c;
        if (num3 == null) {
            num3 = a.c;
        }
        Integer num4 = a2.d;
        if (num4 == null) {
            num4 = a.d;
        }
        return new C9772sd0(num, num2, num3, num4);
    }
}

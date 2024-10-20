package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bt2 */
/* loaded from: classes.dex */
public final class C0228Bt2 extends AbstractC0878Gt2 {
    public C0228Bt2(C0748Ft2 c0748Ft2, String str, Double d) {
        super(c0748Ft2, str, d, true);
    }

    @Override // defpackage.AbstractC0878Gt2
    public final Object b(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.a.d;
        String str2 = this.b;
        if (str == null || !str.isEmpty()) {
            str2 = AbstractC7848n0.a(str, str2);
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + str2 + ": " + String.valueOf(obj));
        return null;
    }
}

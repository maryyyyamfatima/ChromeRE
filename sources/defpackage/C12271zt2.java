package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zt2 */
/* loaded from: classes.dex */
public final class C12271zt2 extends AbstractC0878Gt2 {
    public C12271zt2(C0748Ft2 c0748Ft2, String str, Long l, boolean z) {
        super(c0748Ft2, str, l, z);
    }

    @Override // defpackage.AbstractC0878Gt2
    public final Object b(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.a.d;
        String str2 = this.b;
        if (str == null || !str.isEmpty()) {
            str2 = AbstractC7848n0.a(str, str2);
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + str2 + ": " + String.valueOf(obj));
        return null;
    }
}

package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: At2 */
/* loaded from: classes.dex */
public final class C0098At2 extends AbstractC0878Gt2 {
    public C0098At2(C0748Ft2 c0748Ft2, String str, Boolean bool, boolean z) {
        super(c0748Ft2, str, bool, z);
    }

    @Override // defpackage.AbstractC0878Gt2
    public final Object b(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (AbstractC7192l51.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (AbstractC7192l51.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.a.d;
        String str3 = this.b;
        if (str2 == null || !str2.isEmpty()) {
            str3 = AbstractC7848n0.a(str2, str3);
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + str3 + ": " + String.valueOf(obj));
        return null;
    }
}

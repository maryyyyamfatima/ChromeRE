package defpackage;

import J.N;
import android.content.SharedPreferences;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tq0 */
/* loaded from: classes.dex */
public final class C2550Tq0 extends AbstractC7584mE {
    public final double c;

    public C2550Tq0(String str, String str2, double d) {
        super(str, str2);
        this.c = d;
    }

    public final double c() {
        Double valueOf;
        String b = b();
        double d = this.c;
        C8615pE c8615pE = CachedFeatureFlags.d;
        c8615pE.c();
        CachedFeatureFlags.c.getClass();
        Q74 q74 = CachedFeatureFlags.b;
        synchronized (q74.d) {
            Double d2 = (Double) q74.d.get(b);
            if (d2 == null) {
                c8615pE.b();
                O83.a.a.getClass();
                SharedPreferences sharedPreferences = T60.a;
                C7432ln3 c = C7432ln3.c();
                try {
                    if (!sharedPreferences.contains(b)) {
                        valueOf = Double.valueOf(d);
                    } else {
                        valueOf = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(b, 0L)));
                    }
                    c.close();
                    q74.d.put(b, valueOf);
                    return valueOf.doubleValue();
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
            return d2.doubleValue();
        }
    }

    @Override // defpackage.AbstractC7584mE
    public final void a() {
        C7928nE c7928nE = UN.a;
        double MQdjXFDB = N.MQdjXFDB(this.a, this.b, this.c);
        Q83 q83 = O83.a;
        String b = b();
        q83.a.getClass();
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putLong(b, Double.doubleToRawLongBits(MQdjXFDB));
        edit.apply();
    }
}

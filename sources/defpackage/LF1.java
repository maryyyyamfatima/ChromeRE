package defpackage;

import J.N;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LF1 {
    public static String a() {
        C4807e84 c4807e84 = C8655pM.a().c;
        c4807e84.getClass();
        String MYfm_yKk = N.MYfm_yKk(c4807e84);
        if (MYfm_yKk == null) {
            return null;
        }
        return MYfm_yKk.toUpperCase(Locale.getDefault());
    }

    public static TimeZone c() {
        C7432ln3 e = C7432ln3.e();
        try {
            TimeZone timeZone = TimeZone.getDefault();
            e.close();
            return timeZone;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static boolean d(String str) {
        Locale locale = Locale.getDefault();
        String upperCase = str.toUpperCase(locale);
        String upperCase2 = locale.getCountry().toUpperCase(locale);
        return (TextUtils.isEmpty(upperCase2) || TextUtils.isEmpty(upperCase) || !upperCase.equals(upperCase2)) ? false : true;
    }

    public static String b() {
        TelephonyManager telephonyManager = (TelephonyManager) V60.a.getSystemService("phone");
        String simCountryIso = telephonyManager == null ? null : telephonyManager.getSimCountryIso();
        if (simCountryIso == null) {
            return null;
        }
        String upperCase = simCountryIso.trim().toUpperCase(Locale.getDefault());
        if (TextUtils.isEmpty(upperCase)) {
            return null;
        }
        return upperCase;
    }
}

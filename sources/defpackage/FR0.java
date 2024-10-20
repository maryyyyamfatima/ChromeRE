package defpackage;

import android.os.SystemClock;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FR0 {
    public static FR0 g;
    public static final Integer[] h = {Integer.valueOf(R.font.f54280_resource_name_obfuscated_res_0x7f0a0002), Integer.valueOf(R.font.f54300_resource_name_obfuscated_res_0x7f0a0004), Integer.valueOf(R.font.f54290_resource_name_obfuscated_res_0x7f0a0003)};
    public final IK3 a = new IK3();
    public final Integer[] b = h;
    public boolean c;
    public Long d;
    public long e;
    public String f;

    public static FR0 a() {
        if (g == null) {
            g = new FR0();
        }
        return g;
    }

    public final void b(String str) {
        if (this.f != null) {
            return;
        }
        this.f = str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.d == null) {
            this.d = Long.valueOf(elapsedRealtime);
        } else {
            EI2.n(elapsedRealtime - this.d.longValue(), String.format("%s.%s.%s", "Android.Fonts", "TimeDownloadableFontsRetrievedBeforePostInflationStartup", str));
        }
    }
}

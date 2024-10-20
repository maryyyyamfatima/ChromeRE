package defpackage;

import android.graphics.Typeface;
import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ER0 extends DP2 {
    public int a;
    public final /* synthetic */ FR0 b;

    @Override // defpackage.DP2
    public final void c(int i) {
    }

    @Override // defpackage.DP2
    public final void d(Typeface typeface) {
        FR0 fr0 = this.b;
        fr0.a.getClass();
        int i = this.a + 1;
        this.a = i;
        if (i == fr0.b.length) {
            fr0.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            EI2.n(elapsedRealtime - fr0.e, String.format("%s.%s", "Android.Fonts", "TimeToRetrieveDownloadableFontsAfterOnCreate"));
            if (fr0.d == null) {
                fr0.d = Long.valueOf(elapsedRealtime);
            } else {
                EI2.n(elapsedRealtime - fr0.d.longValue(), String.format("%s.%s.%s", "Android.Fonts", "TimeDownloadableFontsRetrievedAfterPostInflationStartup", fr0.f));
            }
        }
    }

    public ER0(FR0 fr0) {
        this.b = fr0;
    }
}

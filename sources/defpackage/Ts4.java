package defpackage;

import android.os.SystemClock;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.EventForwarder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Ts4 {
    public static boolean a(WebContents webContents, float f) {
        if (webContents == null) {
            return false;
        }
        EventForwarder r0 = webContents.r0();
        long uptimeMillis = SystemClock.uptimeMillis();
        r0.e(uptimeMillis, 12, 0.0f);
        r0.e(uptimeMillis, 13, f);
        r0.e(uptimeMillis, 14, 0.0f);
        return true;
    }
}

package org.chromium.chrome.browser.logo;

import J.N;
import android.graphics.Bitmap;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LogoBridge {
    public long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface LogoObserver {
        void onCachedLogoRevalidated();

        void onLogoAvailable(Logo logo, boolean z);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class Logo {
        public final Bitmap a;
        public final String b;
        public final String c;
        public final String d;

        public Logo(Bitmap bitmap, String str, String str2, String str3) {
            this.a = bitmap;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }
    }

    public LogoBridge(Profile profile) {
        this.a = N.MiF49PQd(this, profile);
    }

    public static Logo createLogo(Bitmap bitmap, String str, String str2, String str3) {
        return new Logo(bitmap, str, str2, str3);
    }
}

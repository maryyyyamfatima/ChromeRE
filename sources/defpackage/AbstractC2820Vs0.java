package defpackage;

import java.util.Arrays;
import java.util.List;
import org.chromium.base.library_loader.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2820Vs0 {
    public static final List a = Arrays.asList("android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED", "org.chromium.chrome.browser.download.DOWNLOAD_OPEN", "org.chromium.chrome.browser.download.DOWNLOAD_CANCEL", "org.chromium.chrome.browser.download.DOWNLOAD_PAUSE", "org.chromium.chrome.browser.download.DOWNLOAD_RESUME");

    public static void a(int i) {
        if (b.n.f()) {
            EI2.h(i, 5, "Android.DownloadManager.ServiceStopped.DownloadForeground");
        }
    }
}

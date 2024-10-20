package defpackage;

import org.chromium.chrome.browser.download.DownloadNotificationServiceObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12257zr0 {
    public static DownloadNotificationServiceObserver a(String str) {
        try {
            return (DownloadNotificationServiceObserver) Class.forName(str).newInstance();
        } catch (Throwable th) {
            AbstractC4851eH1.f("DownloadFgServiceObs", "getObserverFromClassName(): %s", str, th);
            return null;
        }
    }
}

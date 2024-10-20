package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: De, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0410De {
    public static void a(Service service, int i, Notification notification) {
        try {
            service.startForeground(i, notification, 0);
        } catch (ForegroundServiceStartNotAllowedException e) {
            AbstractC4851eH1.a("ApiHelperForS", "Cannot run service as foreground: " + e + " for notification channel " + notification.getChannelId() + " notification id " + i, new Object[0]);
        }
    }
}

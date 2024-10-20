package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V72 {
    public final Q83 a = O83.a;
    public final C6861k72 b = new C6861k72(V60.a);

    public static void d(int i) {
        EI2.h(i, 6, "Mobile.SystemNotification.Permission.StartupState");
    }

    public final void b(int i, Notification notification) {
        String channelId;
        if (i == -1 || notification == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            channelId = notification.getChannelId();
            a(i, channelId);
        } else {
            a(i, null);
        }
    }

    public final void a(int i, String str) {
        C6861k72 c6861k72 = this.b;
        boolean a = c6861k72.a();
        Q83 q83 = this.a;
        if (!a) {
            int f = q83.f(-1, "NotificationUmaTracker.LastShownNotificationType");
            if (f != -1) {
                q83.m("NotificationUmaTracker.LastShownNotificationType");
                if (f != -1) {
                    EI2.h(f, 38, "Mobile.SystemNotification.BlockedAfterShown");
                }
            }
            if (i == -1) {
                return;
            }
            EI2.h(i, 38, "Mobile.SystemNotification.Blocked");
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && str != null) {
            C62 c62 = null;
            if (i2 >= 26) {
                NotificationChannel notificationChannel = i2 >= 26 ? c6861k72.b.getNotificationChannel(str) : null;
                if (notificationChannel != null) {
                    c62 = new C62(notificationChannel);
                }
            }
            if (c62 != null && c62.a == 0) {
                if (i == -1) {
                    return;
                }
                EI2.h(i, 38, "Mobile.SystemNotification.ChannelBlocked");
                return;
            }
        }
        q83.q(i, "NotificationUmaTracker.LastShownNotificationType");
        if (i == -1) {
            return;
        }
        EI2.h(i, 38, "Mobile.SystemNotification.Shown");
    }

    public static void c(long j, String str) {
        if (j == -1) {
            return;
        }
        EI2.f((int) JM1.d((System.currentTimeMillis() - j) / 60000, 0L, 2147483647L), 1, 10080, 50, str);
    }
}

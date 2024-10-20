package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m72, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7549m72 implements InterfaceC7205l72 {
    public final C6861k72 a;

    public C7549m72(Context context) {
        this.a = new C6861k72(context);
    }

    public final void a(int i, String str) {
        this.a.b(i, str);
    }

    public final void f(W72 w72) {
        Notification notification;
        if (w72 == null || (notification = w72.a) == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = w72.b;
            this.a.c(c7893n72.b, c7893n72.c, notification);
        }
    }

    public final void b(NotificationChannel notificationChannel) {
        int i = Build.VERSION.SDK_INT;
        C6861k72 c6861k72 = this.a;
        if (i < 26) {
            c6861k72.getClass();
        } else {
            c6861k72.b.createNotificationChannel(notificationChannel);
        }
    }

    public final void c(NotificationChannelGroup notificationChannelGroup) {
        int i = Build.VERSION.SDK_INT;
        C6861k72 c6861k72 = this.a;
        if (i < 26) {
            c6861k72.getClass();
        } else {
            c6861k72.b.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public final void d(String str) {
        int i = Build.VERSION.SDK_INT;
        C6861k72 c6861k72 = this.a;
        if (i < 26) {
            c6861k72.getClass();
        } else {
            c6861k72.b.deleteNotificationChannel(str);
        }
    }

    public final List e() {
        List notificationChannels;
        int i = Build.VERSION.SDK_INT;
        C6861k72 c6861k72 = this.a;
        if (i < 26) {
            c6861k72.getClass();
            return Collections.emptyList();
        }
        notificationChannels = c6861k72.b.getNotificationChannels();
        return notificationChannels;
    }
}

package org.chromium.chrome.browser.notifications;

import J.N;
import android.app.NotificationChannel;
import android.os.Build;
import defpackage.AbstractC5316fe3;
import defpackage.C6861k72;
import defpackage.C7549m72;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationSettingsBridge {
    public static SiteChannel createChannel(String str, long j, boolean z) {
        return AbstractC5316fe3.a.a(j, str, z);
    }

    public static void deleteChannel(String str) {
        ((C7549m72) AbstractC5316fe3.a.a).d(str);
    }

    public static int getChannelStatus(String str) {
        NotificationChannel notificationChannel;
        int importance;
        C7549m72 c7549m72 = (C7549m72) AbstractC5316fe3.a.a;
        int i = Build.VERSION.SDK_INT;
        C6861k72 c6861k72 = c7549m72.a;
        if (i < 26) {
            c6861k72.getClass();
            notificationChannel = null;
        } else {
            notificationChannel = c6861k72.b.getNotificationChannel(str);
        }
        if (notificationChannel == null) {
            return 2;
        }
        importance = notificationChannel.getImportance();
        return importance != 0 ? 0 : 1;
    }

    public static SiteChannel[] getSiteChannels() {
        return AbstractC5316fe3.a.d();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SiteChannel {
        public final String a;
        public final String b;
        public final long c;
        public final int d;

        public SiteChannel(int i, String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = i;
        }

        public long getTimestamp() {
            return this.c;
        }

        public String getOrigin() {
            return this.b;
        }

        public int getStatus() {
            return this.d;
        }

        public String getId() {
            return this.a;
        }

        public final NotificationChannel a() {
            NotificationChannel notificationChannel = new NotificationChannel(this.a, N.MR6Af3ZS(this.b, 1), this.d == 1 ? 0 : 3);
            notificationChannel.setGroup("sites");
            return notificationChannel;
        }
    }
}

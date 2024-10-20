package defpackage;

import android.app.NotificationChannel;
import android.content.res.Resources;
import android.media.AudioAttributes;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PI {
    public final String a;
    public final int b;
    public final int c;
    public final String d = "general";
    public final boolean e;
    public final boolean f;

    public static PI a(int i, String str, int i2) {
        return new PI(str, i, i2, false, false);
    }

    public PI(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = z2;
    }

    public final NotificationChannel b(Resources resources) {
        NotificationChannel notificationChannel = new NotificationChannel(this.a, resources.getString(this.b), this.c);
        notificationChannel.setGroup(this.d);
        notificationChannel.setShowBadge(this.e);
        if (this.f) {
            notificationChannel.setSound(null, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
        }
        return notificationChannel;
    }
}

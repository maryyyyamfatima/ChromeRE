package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I62 extends M62 {
    public Bitmap d;
    public IconCompat e;
    public boolean f;

    @Override // defpackage.M62
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.M62
    public final void b(S62 s62) {
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(s62.b).setBigContentTitle(null).bigPicture(this.d);
        if (this.f) {
            IconCompat iconCompat = this.e;
            if (iconCompat == null) {
                bigPicture.bigLargeIcon((Bitmap) null);
            } else {
                bigPicture.bigLargeIcon(iconCompat.g(s62.a));
            }
        }
        if (this.c) {
            bigPicture.setSummaryText(this.b);
        }
        if (i >= 31) {
            bigPicture.showBigPictureWhenCollapsed(false);
            bigPicture.setContentDescription(null);
        }
    }
}

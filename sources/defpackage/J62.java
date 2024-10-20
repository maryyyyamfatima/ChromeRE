package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J62 extends M62 {
    public CharSequence d;

    @Override // defpackage.M62
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public J62() {
    }

    public J62(K62 k62) {
        f(k62);
    }

    @Override // defpackage.M62
    public final void b(S62 s62) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(s62.b).setBigContentTitle(null).bigText(this.d);
        if (this.c) {
            bigText.setSummaryText(this.b);
        }
    }

    @Override // defpackage.M62
    public final void a(Bundle bundle) {
        super.a(bundle);
    }
}

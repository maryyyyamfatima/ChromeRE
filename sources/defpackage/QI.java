package defpackage;

import android.app.NotificationChannelGroup;
import android.content.res.Resources;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QI {
    public final String a;
    public final int b;

    public QI(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final NotificationChannelGroup a(Resources resources) {
        return new NotificationChannelGroup(this.a, resources.getString(this.b));
    }
}

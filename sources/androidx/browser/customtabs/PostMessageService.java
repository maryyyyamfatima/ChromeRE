package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.BinderC0248Bx2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PostMessageService extends Service {
    public final BinderC0248Bx2 a = new BinderC0248Bx2();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}

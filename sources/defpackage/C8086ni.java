package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ni, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8086ni {
    public final /* synthetic */ C8430oi a;

    public final void a(ND2 nd2) {
        C8430oi c8430oi = this.a;
        c8430oi.getClass();
        int b = C8430oi.b(nd2);
        int a = c8430oi.a(b);
        if (a == 3 || a == 0) {
            return;
        }
        int i = a == 2 ? 1 : 2;
        C1193Je2 c1193Je2 = c8430oi.b;
        if (b != 5 || Build.VERSION.SDK_INT < 26) {
            Profile d = Profile.d();
            String c1193Je22 = c1193Je2.toString();
            N.MKKuVgiF(d, b, c1193Je22, c1193Je22, i);
            c8430oi.d.m(nd2, i);
            return;
        }
        String b2 = AbstractC5316fe3.a.b(c1193Je2.toString());
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.CHANNEL_ID", b2);
        Context context = c8430oi.a;
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}

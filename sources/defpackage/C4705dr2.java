package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dr2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4705dr2 {
    public final PendingIntent a;
    public final int b;
    public final int c;

    public C4705dr2(PendingIntent pendingIntent, int i, int i2) {
        this.a = pendingIntent;
        this.b = i;
        this.c = i2;
    }

    public static C4705dr2 a(Context context, int i, Intent intent, int i2) {
        int d = i2 | AbstractC2281Ro1.d(false);
        return new C4705dr2(PendingIntent.getActivity(context, i, intent, d), d, i);
    }

    public static C4705dr2 b(Context context, int i, Intent intent, int i2, boolean z) {
        int d = i2 | AbstractC2281Ro1.d(z);
        return new C4705dr2(PendingIntent.getBroadcast(context, i, intent, d), d, i);
    }

    public static C4705dr2 c(Context context, int i, Intent intent, int i2) {
        int d = i2 | AbstractC2281Ro1.d(false);
        return new C4705dr2(PendingIntent.getService(context, i, intent, d), d, i);
    }
}

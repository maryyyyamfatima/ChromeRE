package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kn4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7089kn4 {
    public static C7089kn4 h;
    public final KH a;
    public final C6745jn4 b;
    public long c = -1;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public static C7089kn4 a() {
        if (h == null) {
            h = new C7089kn4(new KH(), new C6745jn4());
        }
        return h;
    }

    public C7089kn4(KH kh, C6745jn4 c6745jn4) {
        this.a = kh;
        this.b = c6745jn4;
    }

    public final void b(String str) {
        String a = AbstractC4199cO1.a("Notifications.WebPlatformV2.", this.d ? "ActionButton." : "Body.", str);
        this.b.getClass();
        FI2.a(a);
    }

    public final void c(String str) {
        String str2 = this.d ? "ActionButton." : "Body.";
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String a = AbstractC4199cO1.a("Notifications.WebPlatformV2.", str2, str);
        long j = elapsedRealtime - this.c;
        this.b.getClass();
        EI2.n(j, a);
    }

    public final boolean d() {
        if (this.c == -1) {
            return true;
        }
        this.a.getClass();
        return SystemClock.elapsedRealtime() - this.c > 10000;
    }
}

package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fm3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5364fm3 {
    public final long a = System.nanoTime();

    public final C3350Zu0 a() {
        long nanoTime = System.nanoTime() - this.a;
        C3220Yu0 c3220Yu0 = (C3220Yu0) C3350Zu0.l.j();
        long j = nanoTime / 1000000000;
        if (c3220Yu0.h) {
            c3220Yu0.l();
            c3220Yu0.h = false;
        }
        ((C3350Zu0) c3220Yu0.g).j = j;
        int i = (int) (nanoTime % 1000000000);
        if (c3220Yu0.h) {
            c3220Yu0.l();
            c3220Yu0.h = false;
        }
        ((C3350Zu0) c3220Yu0.g).k = i;
        return (C3350Zu0) c3220Yu0.j();
    }

    public final C11064wN3 b() {
        C10378uN3 c10378uN3 = (C10378uN3) C11064wN3.l.j();
        long j = this.a;
        long j2 = j / 1000000000;
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).j = j2;
        int i = (int) (j % 1000000000);
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).k = i;
        return (C11064wN3) c10378uN3.j();
    }
}

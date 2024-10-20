package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8858pw0 extends AbstractC11362xE3 {
    public final C5704gm m() {
        C5704gm c5704gm = new C5704gm();
        int b = b(4);
        if (b == 0) {
            return null;
        }
        c5704gm.c(a(b + this.a), this.b);
        return c5704gm;
    }

    public final C5704gm l() {
        C5704gm c5704gm = new C5704gm();
        int b = b(6);
        if (b == 0) {
            return null;
        }
        c5704gm.c(a(b + this.a), this.b);
        return c5704gm;
    }

    public final boolean i() {
        int b = b(16);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final int k() {
        int b = b(20);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int j() {
        int b = b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final long h() {
        if (b(28) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }
}

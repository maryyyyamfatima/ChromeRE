package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3904bY extends AbstractC11362xE3 {
    public final long k() {
        if (b(4) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long h() {
        if (b(6) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final TF0 j() {
        TF0 tf0 = new TF0();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        tf0.c(a(b + this.a), this.b);
        return tf0;
    }

    public final TF0 i() {
        TF0 tf0 = new TF0();
        int b = b(10);
        if (b == 0) {
            return null;
        }
        tf0.c(a(b + this.a), this.b);
        return tf0;
    }
}

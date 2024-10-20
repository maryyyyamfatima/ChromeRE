package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225Jl extends AbstractC11362xE3 {
    public final long k() {
        if (b(4) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long j() {
        if (b(6) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final C5427fx0 i() {
        C5427fx0 c5427fx0 = new C5427fx0();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        c5427fx0.c(a(b + this.a), this.b);
        return c5427fx0;
    }

    public final int h() {
        int b = b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}

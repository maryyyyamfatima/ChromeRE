package defpackage;

import java.util.Random;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Co, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0330Co {
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final boolean e;

    public C0330Co(int i, long j, int i2, int i3, boolean z) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final String toString() {
        return "SEngineParams{taskRunnerImplementation=" + NS2.a(this.a) + ", randomSeed=" + this.b + ", viewTransparency=" + AbstractC4220cS2.c(this.c) + ", backgroundColor=" + this.d + ", enableInkDocument=" + this.e + "}";
    }

    public static C0200Bo a() {
        C0200Bo c0200Bo = new C0200Bo();
        c0200Bo.a = 2;
        c0200Bo.b(1);
        c0200Bo.d = -328966;
        c0200Bo.f = (byte) (2 | c0200Bo.f);
        c0200Bo.b = new Random().nextLong();
        byte b = (byte) (c0200Bo.f | 1);
        c0200Bo.e = true;
        c0200Bo.f = (byte) (b | 4);
        return c0200Bo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0330Co)) {
            return false;
        }
        C0330Co c0330Co = (C0330Co) obj;
        return AbstractC2373Sg3.a(this.a, c0330Co.a) && this.b == c0330Co.b && AbstractC2373Sg3.a(this.c, c0330Co.c) && this.d == c0330Co.d && this.e == c0330Co.e;
    }

    public final int hashCode() {
        int b = (AbstractC2373Sg3.b(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((b ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ AbstractC2373Sg3.b(this.c)) * 1000003) ^ this.d) * 1000003) ^ (this.e ? 1231 : 1237);
    }
}

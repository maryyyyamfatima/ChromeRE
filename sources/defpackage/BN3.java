package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BN3 extends M74 implements C52 {
    public final long e;
    public long f = Long.MIN_VALUE;
    public long g = Long.MIN_VALUE;
    public long h = Long.MIN_VALUE;

    public BN3(int i) {
        this.e = i;
    }

    @Override // defpackage.M74
    public final float b(long j) {
        if (this.h == Long.MIN_VALUE) {
            this.f = j;
            this.h = j;
            this.g = (this.e * 1000000) + j;
            return 0.0f;
        }
        long j2 = this.g;
        if (j >= j2) {
            this.h = j;
            return 1.0f;
        }
        this.h = j;
        long j3 = this.f;
        return ((float) (j - j3)) / ((float) (j2 - j3));
    }

    @Override // defpackage.C52
    public final boolean a() {
        return this.h >= this.g;
    }
}

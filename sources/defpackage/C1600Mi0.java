package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1600Mi0 {
    public int a;
    public long b;
    public long c = 0;
    public final long d;
    public final long e;

    public C1600Mi0(int i, long j) {
        this.d = j;
        this.e = i;
    }

    public final void a(long j, long j2) {
        if (j % 8 != 0) {
            throw new C12221zl0("Incorrect starting alignment: " + j + ".");
        }
        if (j < this.b) {
            throw new C12221zl0("Trying to access memory out of order.");
        }
        if (j2 < j) {
            throw new C12221zl0("Incorrect memory range.");
        }
        if (j2 > this.d) {
            throw new C12221zl0("Trying to access out of range memory.");
        }
        this.b = (-8) & ((j2 + 8) - 1);
    }
}

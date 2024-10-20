package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m23, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7520m23 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public C7520m23 f;
    public C7520m23 g;

    public C7520m23() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public C7520m23(byte[] bArr, int i, int i2, boolean z) {
        AbstractC0087Ar1.e(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final C7520m23 c() {
        this.d = true;
        return new C7520m23(this.a, this.b, this.c, true);
    }

    public final C7520m23 a() {
        C7520m23 c7520m23 = this.f;
        if (c7520m23 == this) {
            c7520m23 = null;
        }
        C7520m23 c7520m232 = this.g;
        AbstractC0087Ar1.b(c7520m232);
        c7520m232.f = this.f;
        C7520m23 c7520m233 = this.f;
        AbstractC0087Ar1.b(c7520m233);
        c7520m233.g = this.g;
        this.f = null;
        this.g = null;
        return c7520m23;
    }

    public final void b(C7520m23 c7520m23) {
        c7520m23.g = this;
        c7520m23.f = this.f;
        C7520m23 c7520m232 = this.f;
        AbstractC0087Ar1.b(c7520m232);
        c7520m232.g = c7520m23;
        this.f = c7520m23;
    }

    public final void d(C7520m23 c7520m23, int i) {
        if (!c7520m23.e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = c7520m23.c;
        int i3 = i2 + i;
        byte[] bArr = c7520m23.a;
        if (i3 > 8192) {
            if (c7520m23.d) {
                throw new IllegalArgumentException();
            }
            int i4 = c7520m23.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC6036hk.a(0, i4, i2, bArr, bArr);
            c7520m23.c -= c7520m23.b;
            c7520m23.b = 0;
        }
        int i5 = c7520m23.c;
        int i6 = this.b;
        AbstractC6036hk.a(i5, i6, i6 + i, this.a, bArr);
        c7520m23.c += i;
        this.b += i;
    }
}

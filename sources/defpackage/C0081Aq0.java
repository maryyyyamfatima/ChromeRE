package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Aq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081Aq0 {
    public final String a;
    public final String b;
    public final float c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final float j;
    public final boolean k;

    public C0081Aq0(String str, String str2, float f, int i, int i2, float f2, float f3, int i3, int i4, float f4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = f3;
        this.h = i3;
        this.i = i4;
        this.j = f4;
        this.k = z;
    }

    public final int hashCode() {
        int b = ((AbstractC2373Sg3.b(this.d) + (((int) (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c)) * 31)) * 31) + this.e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((b * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}

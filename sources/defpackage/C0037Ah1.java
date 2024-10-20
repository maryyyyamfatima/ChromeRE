package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ah1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0037Ah1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public static C0037Ah1 b(String str, String str2) {
        return new C0037Ah1(0, 0, 0, str, str2, false);
    }

    public static C0037Ah1 a(int i, String str, int i2, String str2) {
        return new C0037Ah1(i, i2, 0, str, str2, i > 0 && i2 > 0);
    }

    public C0037Ah1(int i, int i2, int i3, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0037Ah1)) {
            return false;
        }
        C0037Ah1 c0037Ah1 = (C0037Ah1) obj;
        return this.a.equals(c0037Ah1.a) && this.b.equals(c0037Ah1.b) && this.c == c0037Ah1.c && this.d == c0037Ah1.d && this.e == c0037Ah1.e && this.f == c0037Ah1.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 2) + (this.e ? 1 : 0)) * 31) + this.f;
    }
}

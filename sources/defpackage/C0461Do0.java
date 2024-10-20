package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Do0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461Do0 {
    public String a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;

    public C0461Do0(String str, String str2, long j, long j2, int i) {
        this(j, i, str2, j2);
        this.a = str;
    }

    public C0461Do0(long j, int i, String str, long j2) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public final Object clone() {
        return new C0461Do0(this.a, this.b, this.c, this.d, this.e);
    }
}

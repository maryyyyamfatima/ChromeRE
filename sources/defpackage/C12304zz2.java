package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zz2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12304zz2 {
    public final int a;
    public final C8593p93 b;

    public C12304zz2(int i, C8593p93 c8593p93) {
        this.a = i;
        this.b = c8593p93;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12304zz2)) {
            return false;
        }
        C12304zz2 c12304zz2 = (C12304zz2) obj;
        return this.a == c12304zz2.a && this.b.equals(c12304zz2.b);
    }

    public final int hashCode() {
        int i = (527 + this.a) * 31;
        C8593p93 c8593p93 = this.b;
        return i + (c8593p93 == null ? 0 : c8593p93.hashCode());
    }
}

package defpackage;

import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1715Nf0 implements InterfaceC6098hu1 {
    public final InterfaceC6098hu1 b;
    public final InterfaceC6098hu1 c;

    public C1715Nf0(InterfaceC6098hu1 interfaceC6098hu1, InterfaceC6098hu1 interfaceC6098hu12) {
        this.b = interfaceC6098hu1;
        this.c = interfaceC6098hu12;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1715Nf0)) {
            return false;
        }
        C1715Nf0 c1715Nf0 = (C1715Nf0) obj;
        return this.b.equals(c1715Nf0.b) && this.c.equals(c1715Nf0.c);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return KR0.a("DataCacheKey{sourceKey=", String.valueOf(this.b), ", signature=", String.valueOf(this.c), "}");
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }
}

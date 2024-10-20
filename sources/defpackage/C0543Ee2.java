package defpackage;

import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ee2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543Ee2 implements InterfaceC6098hu1 {
    public final C8958qE b = new C8958qE();

    public final Object c(C8752pe2 c8752pe2) {
        C8958qE c8958qE = this.b;
        return c8958qE.containsKey(c8752pe2) ? c8958qE.get(c8752pe2) : c8752pe2.a;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (obj instanceof C0543Ee2) {
            return this.b.equals(((C0543Ee2) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C8958qE c8958qE = this.b;
            if (i >= c8958qE.h) {
                return;
            }
            C8752pe2 c8752pe2 = (C8752pe2) c8958qE.f(i);
            Object j = this.b.j(i);
            InterfaceC8409oe2 interfaceC8409oe2 = c8752pe2.b;
            if (c8752pe2.d == null) {
                c8752pe2.d = c8752pe2.c.getBytes(InterfaceC6098hu1.a);
            }
            interfaceC8409oe2.a(c8752pe2.d, j, messageDigest);
            i++;
        }
    }

    public final String toString() {
        return AbstractC4199cO1.a("Options{values=", String.valueOf(this.b), "}");
    }
}

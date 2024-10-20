package defpackage;

import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R82 implements InterfaceC6098hu1 {
    public final Object b;

    public R82(Object obj) {
        AbstractC6464iy2.b(obj);
        this.b = obj;
    }

    public final String toString() {
        return AbstractC4199cO1.a("ObjectKey{object=", String.valueOf(this.b), "}");
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (obj instanceof R82) {
            return this.b.equals(((R82) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(InterfaceC6098hu1.a));
    }
}

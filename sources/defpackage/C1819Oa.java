package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819Oa implements InterfaceC6098hu1 {
    public final int b;
    public final InterfaceC6098hu1 c;

    public C1819Oa(int i, InterfaceC6098hu1 interfaceC6098hu1) {
        this.b = i;
        this.c = interfaceC6098hu1;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1819Oa)) {
            return false;
        }
        C1819Oa c1819Oa = (C1819Oa) obj;
        return this.b == c1819Oa.b && this.c.equals(c1819Oa.c);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        return AbstractC10296u74.f(this.b, this.c);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }
}

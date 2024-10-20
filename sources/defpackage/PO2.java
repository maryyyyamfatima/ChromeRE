package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PO2 implements InterfaceC6098hu1 {
    public static final C4866eK1 j = new C4866eK1(50);
    public final C3492aK1 b;
    public final InterfaceC6098hu1 c;
    public final InterfaceC6098hu1 d;
    public final int e;
    public final int f;
    public final Class g;
    public final C0543Ee2 h;
    public final InterfaceC9389rV3 i;

    public PO2(C3492aK1 c3492aK1, InterfaceC6098hu1 interfaceC6098hu1, InterfaceC6098hu1 interfaceC6098hu12, int i, int i2, InterfaceC9389rV3 interfaceC9389rV3, Class cls, C0543Ee2 c0543Ee2) {
        this.b = c3492aK1;
        this.c = interfaceC6098hu1;
        this.d = interfaceC6098hu12;
        this.e = i;
        this.f = i2;
        this.i = interfaceC9389rV3;
        this.g = cls;
        this.h = c0543Ee2;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (!(obj instanceof PO2)) {
            return false;
        }
        PO2 po2 = (PO2) obj;
        return this.f == po2.f && this.e == po2.e && AbstractC10296u74.b(this.i, po2.i) && this.g.equals(po2.g) && this.c.equals(po2.c) && this.d.equals(po2.d) && this.h.equals(po2.h);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        InterfaceC9389rV3 interfaceC9389rV3 = this.i;
        if (interfaceC9389rV3 != null) {
            hashCode = (hashCode * 31) + interfaceC9389rV3.hashCode();
        }
        return this.h.hashCode() + ((this.g.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        Object e;
        C3492aK1 c3492aK1 = this.b;
        synchronized (c3492aK1) {
            YJ1 yj1 = (YJ1) c3492aK1.b.b();
            yj1.b = 8;
            yj1.c = byte[].class;
            e = c3492aK1.e(yj1, byte[].class);
        }
        byte[] bArr = (byte[]) e;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC9389rV3 interfaceC9389rV3 = this.i;
        if (interfaceC9389rV3 != null) {
            interfaceC9389rV3.a(messageDigest);
        }
        this.h.a(messageDigest);
        C4866eK1 c4866eK1 = j;
        Class cls = this.g;
        byte[] bArr2 = (byte[]) c4866eK1.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(InterfaceC6098hu1.a);
            c4866eK1.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.b.g(bArr);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.i);
        String valueOf5 = String.valueOf(this.h);
        StringBuilder a = AbstractC10975w63.a("ResourceCacheKey{sourceKey=", valueOf, ", signature=", valueOf2, ", width=");
        a.append(this.e);
        a.append(", height=");
        a.append(this.f);
        a.append(", decodedResourceClass=");
        a.append(valueOf3);
        a.append(", transformation='");
        a.append(valueOf4);
        a.append("', options=");
        a.append(valueOf5);
        a.append("}");
        return a.toString();
    }
}

package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10315uB0 implements InterfaceC6098hu1 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final InterfaceC6098hu1 g;
    public final Map h;
    public final C0543Ee2 i;
    public int j;

    public C10315uB0(Object obj, InterfaceC6098hu1 interfaceC6098hu1, int i, int i2, C8958qE c8958qE, Class cls, Class cls2, C0543Ee2 c0543Ee2) {
        AbstractC6464iy2.b(obj);
        this.b = obj;
        if (interfaceC6098hu1 == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.g = interfaceC6098hu1;
        this.c = i;
        this.d = i2;
        AbstractC6464iy2.b(c8958qE);
        this.h = c8958qE;
        if (cls == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.e = cls;
        if (cls2 == null) {
            throw new NullPointerException("Transcode class must not be null");
        }
        this.f = cls2;
        AbstractC6464iy2.b(c0543Ee2);
        this.i = c0543Ee2;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (!(obj instanceof C10315uB0)) {
            return false;
        }
        C10315uB0 c10315uB0 = (C10315uB0) obj;
        return this.b.equals(c10315uB0.b) && this.g.equals(c10315uB0.g) && this.d == c10315uB0.d && this.c == c10315uB0.c && this.h.equals(c10315uB0.h) && this.e.equals(c10315uB0.e) && this.f.equals(c10315uB0.f) && this.i.equals(c10315uB0.i);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = this.h.hashCode() + (hashCode2 * 31);
            this.j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.j = hashCode5;
            this.j = this.i.hashCode() + (hashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int i = this.j;
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder("EngineKey{model=");
        sb.append(valueOf);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", resourceClass=");
        sb.append(valueOf2);
        sb.append(", transcodeClass=");
        AbstractC9972tB0.a(sb, valueOf3, ", signature=", valueOf4, ", hashCode=");
        sb.append(i);
        sb.append(", transformations=");
        sb.append(valueOf5);
        sb.append(", options=");
        return Y5.a(sb, valueOf6, "}");
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}

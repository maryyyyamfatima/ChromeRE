package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l43, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7188l43 {
    public static final ByteBuffer d;
    public static final C7188l43 e;
    public final ByteBuffer a;
    public final boolean b;
    public volatile ByteBuffer c = null;

    static {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[0]);
        d = wrap;
        e = new C7188l43(wrap, false);
    }

    public static C7188l43 a(byte[] bArr) {
        if (bArr == null) {
            return e;
        }
        return new C7188l43(ByteBuffer.wrap(bArr), false);
    }

    public static C7188l43 b(C9570s10 c9570s10) {
        if (c9570s10 == null) {
            return e;
        }
        C7855n10 c7855n10 = (C7855n10) C8199o10.l.j();
        c7855n10.p(C9570s10.m, c9570s10);
        return new C7188l43(ByteBuffer.wrap(((C8199o10) c7855n10.j()).toByteArray()), true);
    }

    public final ByteBuffer c() {
        ByteBuffer duplicate;
        ByteBuffer slice;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                ByteBuffer duplicate2 = this.a.duplicate();
                try {
                    DV h = DV.h(duplicate2, false);
                    if (h.e()) {
                        slice = d;
                    } else {
                        h.B();
                        h.u();
                        duplicate2.position(duplicate2.position() + h.d());
                        slice = duplicate2.slice();
                    }
                    this.c = slice;
                } catch (IOException e2) {
                    throw new C10239ty0("Error reading extension from model", e2);
                }
            }
            duplicate = this.c.duplicate();
        }
        return duplicate;
    }

    public C7188l43(ByteBuffer byteBuffer, boolean z) {
        this.a = byteBuffer.duplicate();
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7188l43)) {
            return false;
        }
        C7188l43 c7188l43 = (C7188l43) obj;
        return c7188l43.b == this.b && this.a.equals(c7188l43.a);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), this.a);
    }
}

package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ko3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7094ko3 {
    public final int a;

    public abstract void a(KA0 ka0);

    public AbstractC7094ko3(int i) {
        this.a = i;
    }

    public final ByteBuffer b() {
        KA0 ka0 = new KA0(null, this.a);
        a(ka0);
        IA0 ia0 = ka0.b;
        ia0.b.position(0);
        ia0.b.limit(ia0.d);
        ByteBuffer byteBuffer = ia0.b;
        if (ia0.c.isEmpty()) {
            return byteBuffer;
        }
        throw new UnsupportedOperationException("Handles are discarded.");
    }

    public final C10620v43 c(InterfaceC7559m90 interfaceC7559m90, C5953hV1 c5953hV1) {
        C4638dg0 c4638dg0 = c5953hV1.a;
        KA0 ka0 = new KA0(interfaceC7559m90, this.a + c4638dg0.a);
        ka0.g(c4638dg0);
        ka0.b(0, 8);
        ka0.b(c5953hV1.b, 12);
        int i = c5953hV1.c;
        ka0.b(i, 16);
        if ((i & 3) != 0) {
            ka0.f(24, c5953hV1.d);
        }
        a(ka0);
        IA0 ia0 = ka0.b;
        ia0.b.position(0);
        ia0.b.limit(ia0.d);
        return new C10620v43(new C8697pU1(ia0.b, ia0.c), c5953hV1);
    }
}

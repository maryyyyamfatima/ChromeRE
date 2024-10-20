package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5427fx0 extends AbstractC11362xE3 {
    public static void j(ByteBuffer byteBuffer, C5427fx0 c5427fx0) {
        c5427fx0.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
    }

    public final TF0 m() {
        TF0 tf0 = new TF0();
        int b = b(4);
        if (b == 0) {
            return null;
        }
        tf0.c(a(b + this.a), this.b);
        return tf0;
    }

    public final UF0 l() {
        UF0 uf0 = new UF0();
        int b = b(6);
        if (b == 0) {
            return null;
        }
        uf0.c(a(b + this.a), this.b);
        return uf0;
    }

    public final C5427fx0 h(int i) {
        C5427fx0 c5427fx0 = new C5427fx0();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        c5427fx0.c(a((i * 4) + e(b)), this.b);
        return c5427fx0;
    }

    public final int i() {
        int b = b(8);
        if (b != 0) {
            return g(b);
        }
        return 0;
    }

    public final String k() {
        int b = b(10);
        if (b != 0) {
            return d(b + this.a);
        }
        return null;
    }
}

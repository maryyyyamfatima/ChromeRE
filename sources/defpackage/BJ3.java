package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BJ3 extends AbstractC11362xE3 {
    public static BJ3 i(ByteBuffer byteBuffer) {
        BJ3 bj3 = new BJ3();
        bj3.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        return bj3;
    }

    public final C5704gm j() {
        C5704gm c5704gm = new C5704gm();
        int b = b(4);
        if (b == 0) {
            return null;
        }
        c5704gm.c(a(b + this.a), this.b);
        return c5704gm;
    }

    public final C5704gm k() {
        C5704gm c5704gm = new C5704gm();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        c5704gm.c(a(b + this.a), this.b);
        return c5704gm;
    }

    public static int h(UP0 up0, int i, long j, int i2, int i3) {
        up0.o(5);
        up0.c(4, (int) 0);
        up0.e(3, i3);
        up0.e(2, i2);
        up0.c(1, (int) j);
        up0.e(0, i);
        return up0.i();
    }
}

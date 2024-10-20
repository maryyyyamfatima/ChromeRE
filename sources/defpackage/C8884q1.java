package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8884q1 extends AbstractC11362xE3 {
    public static void h(ByteBuffer byteBuffer, C8884q1 c8884q1) {
        c8884q1.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
    }

    public final String i() {
        int b = b(10);
        if (b != 0) {
            return d(b + this.a);
        }
        return null;
    }

    public final boolean j() {
        int b = b(14);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }
}

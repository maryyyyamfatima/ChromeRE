package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826Gj0 {
    public final ByteBuffer a;

    public C0826Gj0(int i, byte[] bArr) {
        this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    public final short a(int i) {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }
}

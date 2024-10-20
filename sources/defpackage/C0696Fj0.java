package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696Fj0 implements InterfaceC1086Ij0 {
    public final ByteBuffer a;

    public C0696Fj0(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.InterfaceC1086Ij0
    public final short b() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() < 1) {
            throw new C0956Hj0();
        }
        return (short) (byteBuffer.get() & 255);
    }

    @Override // defpackage.InterfaceC1086Ij0
    public final int a() {
        return (b() << 8) | b();
    }

    @Override // defpackage.InterfaceC1086Ij0
    public final int c(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.a;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // defpackage.InterfaceC1086Ij0
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.a;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }
}

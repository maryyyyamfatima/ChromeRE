package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ju4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6787ju4 implements InterfaceC5763gv4 {
    public final ByteBuffer a;

    public C6787ju4(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // defpackage.InterfaceC5763gv4
    public final long a() {
        return this.a.capacity();
    }

    @Override // defpackage.InterfaceC5763gv4
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}

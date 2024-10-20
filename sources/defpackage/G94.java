package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G94 implements InterfaceC8409oe2 {
    public final ByteBuffer a = ByteBuffer.allocate(8);

    @Override // defpackage.InterfaceC8409oe2
    public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putLong(l.longValue()).array());
        }
    }
}

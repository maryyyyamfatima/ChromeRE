package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gZ0 */
/* loaded from: classes.dex */
public final class C5628gZ0 implements InterfaceC11073wP2 {
    @Override // defpackage.InterfaceC11073wP2
    public final JO2 a(JO2 jo2, C0543Ee2 c0543Ee2) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((C1993Pi3) ((C5284fZ0) jo2.get()).a.a.a).d.asReadOnlyBuffer();
        AtomicReference atomicReference = RD.a;
        QD qd = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new QD(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (qd != null && qd.a == 0) {
            if (qd.b == qd.c.length) {
                bArr = asReadOnlyBuffer.array();
                return new C4491dE(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new C4491dE(bArr);
    }
}

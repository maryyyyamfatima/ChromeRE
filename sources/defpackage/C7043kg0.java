package defpackage;

import J.N;
import java.nio.ByteBuffer;
import org.chromium.mojo.system.ResultAnd;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7043kg0 extends AbstractC10624v51 implements InterfaceC5669gg0 {
    public C7043kg0(CoreImpl coreImpl, long j) {
        super(coreImpl, j);
    }

    public C7043kg0(AbstractC10624v51 abstractC10624v51) {
        super(abstractC10624v51);
    }

    public final ResultAnd b(ByteBuffer byteBuffer) {
        C6699jg0 c6699jg0 = C6699jg0.c;
        CoreImpl coreImpl = this.g;
        coreImpl.getClass();
        ResultAnd resultAnd = (ResultAnd) N.MBDORBtR(coreImpl, this.a, byteBuffer, byteBuffer == null ? 0 : byteBuffer.capacity(), c6699jg0.a);
        int i = resultAnd.a;
        if (i != 0 && i != 17) {
            throw new HY1(resultAnd.a);
        }
        if (i == 0 && byteBuffer != null) {
            byteBuffer.limit(((Integer) resultAnd.b).intValue());
        }
        return resultAnd;
    }
}

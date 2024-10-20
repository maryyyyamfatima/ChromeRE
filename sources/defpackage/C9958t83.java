package defpackage;

import J.N;
import java.nio.ByteBuffer;
import org.chromium.mojo.system.ResultAnd;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t83, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9958t83 extends AbstractC10624v51 implements InterfaceC9615s83 {
    public C9958t83(CoreImpl coreImpl, long j) {
        super(coreImpl, j);
    }

    public C9958t83(AbstractC10624v51 abstractC10624v51) {
        super(abstractC10624v51);
    }

    @Override // defpackage.InterfaceC9615s83
    public final ByteBuffer g(long j) {
        C9272r83 c9272r83 = C9272r83.c;
        CoreImpl coreImpl = this.g;
        coreImpl.getClass();
        ResultAnd resultAnd = (ResultAnd) N.Mm6zKFIo(coreImpl, this.a, 0L, j, c9272r83.a);
        if (resultAnd.a != 0) {
            throw new HY1(resultAnd.a);
        }
        return (ByteBuffer) resultAnd.b;
    }

    @Override // defpackage.InterfaceC9615s83
    public final void K(ByteBuffer byteBuffer) {
        CoreImpl coreImpl = this.g;
        coreImpl.getClass();
        int MC_p8PYl = N.MC_p8PYl(coreImpl, byteBuffer);
        if (MC_p8PYl != 0) {
            throw new HY1(MC_p8PYl);
        }
    }
}

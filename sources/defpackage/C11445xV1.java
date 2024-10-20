package defpackage;

import J.N;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.mojo.system.ResultAnd;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xV1 */
/* loaded from: classes2.dex */
public final class C11445xV1 extends AbstractC10624v51 implements InterfaceC11102wV1 {
    public C11445xV1(CoreImpl coreImpl, long j) {
        super(coreImpl, j);
    }

    public C11445xV1(AbstractC10624v51 abstractC10624v51) {
        super(abstractC10624v51);
    }

    @Override // defpackage.InterfaceC11102wV1
    public final InterfaceC11102wV1 g1() {
        return new C11445xV1(this);
    }

    @Override // defpackage.InterfaceC11102wV1
    public final void p(ByteBuffer byteBuffer, List list) {
        ByteBuffer byteBuffer2;
        C10759vV1 c10759vV1 = C10759vV1.c;
        CoreImpl coreImpl = this.g;
        coreImpl.getClass();
        if (list == null || list.isEmpty()) {
            byteBuffer2 = null;
        } else {
            byteBuffer2 = coreImpl.a(list.size() * 8);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10281u51 interfaceC10281u51 = (InterfaceC10281u51) it.next();
                byteBuffer2.putLong(interfaceC10281u51.isValid() ? ((AbstractC10624v51) interfaceC10281u51).a : 0L);
            }
            byteBuffer2.position(0);
        }
        int Mkun8eIV = N.Mkun8eIV(coreImpl, this.a, byteBuffer, byteBuffer != null ? byteBuffer.limit() : 0, byteBuffer2, c10759vV1.a);
        if (Mkun8eIV != 0) {
            throw new HY1(Mkun8eIV);
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC10281u51 interfaceC10281u512 = (InterfaceC10281u51) it2.next();
                if (interfaceC10281u512.isValid()) {
                    ((AbstractC10624v51) interfaceC10281u512).a = 0L;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC11102wV1
    public final ResultAnd z() {
        C10073tV1 c10073tV1 = C10073tV1.c;
        CoreImpl coreImpl = this.g;
        coreImpl.getClass();
        ResultAnd resultAnd = (ResultAnd) N.MEHdfwD0(coreImpl, this.a, c10073tV1.a);
        int i = resultAnd.a;
        if (i != 0 && i != 17) {
            throw new HY1(resultAnd.a);
        }
        C10416uV1 c10416uV1 = (C10416uV1) resultAnd.b;
        long[] jArr = c10416uV1.b;
        if (jArr != null && jArr.length != 0) {
            c10416uV1.c = new ArrayList(jArr.length);
            for (long j : jArr) {
                c10416uV1.c.add(new W14(coreImpl, j));
            }
        } else {
            c10416uV1.c = new ArrayList(0);
        }
        return resultAnd;
    }
}

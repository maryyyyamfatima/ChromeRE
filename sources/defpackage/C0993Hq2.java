package defpackage;

import java.util.LinkedList;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hq2 */
/* loaded from: classes.dex */
public final class C0993Hq2 implements Callback {
    public final /* synthetic */ C7446lq a;
    public final /* synthetic */ C1642Mq2 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C0993Hq2(C1642Mq2 c1642Mq2, C7446lq c7446lq) {
        this.g = c1642Mq2;
        this.a = c7446lq;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        InterfaceC9161qp2 interfaceC9161qp2;
        C7446lq c7446lq = (C7446lq) obj;
        C1642Mq2 c1642Mq2 = this.g;
        if (c1642Mq2.z == null) {
            return;
        }
        if (c7446lq != null) {
            c1642Mq2.l.j = null;
            if (!c7446lq.a) {
                c1642Mq2.E.c = -1;
            } else if (this.a == null) {
                C40 c40 = c1642Mq2.E;
                c40.a.add(0, c7446lq);
                c40.c = 0;
            } else {
                C4001bo2 c4001bo2 = new C4001bo2(0);
                c4001bo2.c = c7446lq.v;
                c4001bo2.d = c7446lq.w;
                c4001bo2.b = c7446lq.x;
                C4546dP c4546dP = (C4546dP) c1642Mq2.p;
                C2287Rp2 c2287Rp2 = c4546dP.a;
                if (c2287Rp2 != null && c4546dP.g && (interfaceC9161qp2 = c2287Rp2.A) != null) {
                    C11561xp2 c11561xp2 = new C11561xp2(0);
                    c11561xp2.b = c4001bo2;
                    C6068hp1 c6068hp1 = ((C0468Dp2) interfaceC9161qp2).a;
                    c6068hp1.g.A(c11561xp2.c(c6068hp1.a, new C5953hV1(3)));
                }
            }
        }
        c1642Mq2.z.o(3, c1642Mq2.E);
        LinkedList linkedList = c1642Mq2.i;
        if (linkedList.isEmpty()) {
            return;
        }
        c1642Mq2.h.post((Runnable) linkedList.remove());
    }
}

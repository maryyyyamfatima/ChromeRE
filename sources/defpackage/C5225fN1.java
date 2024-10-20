package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fN1 */
/* loaded from: classes.dex */
public final class C5225fN1 implements InterfaceC3857bO2 {
    public final /* synthetic */ InterfaceC3857bO2 a;
    public final /* synthetic */ C6257iN1 b;

    public C5225fN1(C6257iN1 c6257iN1, InterfaceC3857bO2 interfaceC3857bO2) {
        this.b = c6257iN1;
        this.a = interfaceC3857bO2;
    }

    @Override // defpackage.InterfaceC3857bO2
    public final void a(long j, int i, C5913hN1 c5913hN1) {
        InterfaceC3857bO2 interfaceC3857bO2 = this.a;
        if (interfaceC3857bO2 != null) {
            if (i == 2001) {
                C6257iN1 c6257iN1 = this.b;
                c6257iN1.a.g("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(c6257iN1.i));
                Iterator it = c6257iN1.h.a.i.iterator();
                while (it.hasNext()) {
                    ((AbstractC12087zM2) it.next()).k();
                }
            }
            interfaceC3857bO2.a(j, i, c5913hN1);
        }
    }

    @Override // defpackage.InterfaceC3857bO2
    public final void b(long j) {
        InterfaceC3857bO2 interfaceC3857bO2 = this.a;
        if (interfaceC3857bO2 != null) {
            interfaceC3857bO2.b(j);
        }
    }
}

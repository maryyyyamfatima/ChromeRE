package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d43 */
/* loaded from: classes.dex */
public final class C4439d43 implements InterfaceC9395rX {
    public final InterfaceC3241Yy1 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        C4782e43 c4782e43 = (C4782e43) obj;
        final InterfaceC9738sX interfaceC9738sX = (InterfaceC9738sX) this.a.get();
        if (c4782e43.j.size() <= 0) {
            return C5971hZ.a;
        }
        InterfaceC1377Kp1 interfaceC1377Kp1 = c4782e43.j;
        int i = BQ0.a;
        if (interfaceC1377Kp1 == null) {
            throw new NullPointerException("source is null");
        }
        PQ0 pq0 = new PQ0(new IQ0(interfaceC1377Kp1), new DV0() { // from class: c43
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                return ((C10081tX) InterfaceC9738sX.this).a((CommandOuterClass$Command) obj2, abstractC9053qX, 1);
            }
        });
        Q82.b(2, "prefetch");
        return new C3909bZ(pq0);
    }

    public C4439d43(InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.a = interfaceC3241Yy1;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C4782e43.n;
    }
}

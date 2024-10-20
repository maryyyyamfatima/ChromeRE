package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yi2 */
/* loaded from: classes.dex */
public final class C11862yi2 implements InterfaceC9395rX {
    public final InterfaceC3241Yy1 a;
    public final boolean b = Boolean.FALSE.booleanValue();
    public final AbstractC10422uW2 c;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [wi2] */
    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        C12205zi2 c12205zi2 = (C12205zi2) obj;
        final InterfaceC9738sX interfaceC9738sX = (InterfaceC9738sX) this.a.get();
        if (c12205zi2.j.size() < 1) {
            return C5971hZ.a;
        }
        if (this.b) {
            InterfaceC1377Kp1 interfaceC1377Kp1 = c12205zi2.j;
            int i = BQ0.a;
            if (interfaceC1377Kp1 == null) {
                throw new NullPointerException("source is null");
            }
            IQ0 iq0 = new IQ0(interfaceC1377Kp1);
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            Q82.b(availableProcessors, "parallelism");
            int i2 = BQ0.a;
            Q82.b(i2, "prefetch");
            C0563Ei2 c0563Ei2 = new C0563Ei2(iq0, availableProcessors, i2);
            AbstractC10422uW2 abstractC10422uW2 = this.c;
            if (abstractC10422uW2 == null) {
                throw new NullPointerException("scheduler");
            }
            Q82.b(i2, "prefetch");
            C1732Ni2 c1732Ni2 = new C1732Ni2(c0563Ei2, abstractC10422uW2, i2);
            ?? r8 = new DV0() { // from class: wi2
                @Override // defpackage.DV0
                public final Object apply(Object obj2) {
                    VY a = ((C10081tX) InterfaceC9738sX.this).a((CommandOuterClass$Command) obj2, abstractC9053qX, 1);
                    a.getClass();
                    if (a instanceof MQ0) {
                        return new KQ0(((MQ0) a).a);
                    }
                    return new FZ(a);
                }
            };
            Q82.b(Integer.MAX_VALUE, "maxConcurrency");
            Q82.b(i2, "prefetch");
            C0043Ai2 c0043Ai2 = new C0043Ai2(c1732Ni2, r8, i2);
            Q82.b(i2, "prefetch");
            return new MQ0(new C1083Ii2(c0043Ai2, i2));
        }
        InterfaceC1377Kp1 interfaceC1377Kp12 = c12205zi2.j;
        int i3 = BQ0.a;
        if (interfaceC1377Kp12 == null) {
            throw new NullPointerException("source is null");
        }
        PQ0 pq0 = new PQ0(new IQ0(interfaceC1377Kp12), new DV0() { // from class: xi2
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                return ((C10081tX) InterfaceC9738sX.this).a((CommandOuterClass$Command) obj2, abstractC9053qX, 1);
            }
        });
        Q82.b(Integer.MAX_VALUE, "maxConcurrency");
        return new C9405rZ(pq0);
    }

    public C11862yi2(InterfaceC3241Yy1 interfaceC3241Yy1, AbstractC10422uW2 abstractC10422uW2) {
        this.a = interfaceC3241Yy1;
        this.c = abstractC10422uW2;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C12205zi2.n;
    }
}

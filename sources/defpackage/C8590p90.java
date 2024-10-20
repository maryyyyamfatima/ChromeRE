package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p90 */
/* loaded from: classes.dex */
public final class C8590p90 extends AbstractC3219Yu {
    public final /* synthetic */ C9961t90 d;

    @Override // defpackage.AbstractC3219Yu
    public final void b(InterfaceC9040qU1 interfaceC9040qU1) {
        C7580mD0 c7580mD0 = this.c;
        if (c7580mD0.a) {
            C11411xO2 c11411xO2 = (C11411xO2) interfaceC9040qU1;
            c11411xO2.getClass();
            TD0 td0 = c11411xO2.a;
            if (td0 == null || !td0.equals(c7580mD0.f)) {
                if (c7580mD0.f != null || td0 == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C9961t90 c9961t90 = this.d;
                    boolean b = c9961t90.a.b();
                    if (b) {
                        c7580mD0.f(C7580mD0.b(currentTimeMillis, 5));
                        c7580mD0.f(C7580mD0.d(currentTimeMillis, 0, 0, 0));
                    }
                    c7580mD0.e();
                    if (td0 != null) {
                        c7580mD0.f = td0;
                    }
                    c7580mD0.c = 1;
                    c7580mD0.d.clear();
                    c7580mD0.i = c7580mD0.h.nextInt();
                    c7580mD0.e.clear();
                    c7580mD0.getClass();
                    if (b) {
                        C4979ef4 c4979ef4 = c9961t90.a;
                        c7580mD0.f(C7580mD0.d(currentTimeMillis, c4979ef4.c, c4979ef4.d, c4979ef4.b));
                        return;
                    }
                    return;
                }
                c7580mD0.f = td0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8590p90(C9961t90 c9961t90) {
        super(c9961t90.a, 7, C11411xO2.class);
        this.d = c9961t90;
    }
}

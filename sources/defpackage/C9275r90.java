package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r90 */
/* loaded from: classes.dex */
public final class C9275r90 extends AbstractC3219Yu {
    public final /* synthetic */ C9961t90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9275r90(C9961t90 c9961t90) {
        super(c9961t90.a, 5, C4636df4.class);
        this.d = c9961t90;
    }

    @Override // defpackage.AbstractC3219Yu
    public final void b(InterfaceC9040qU1 interfaceC9040qU1) {
        C7580mD0 c7580mD0 = this.c;
        if (c7580mD0.a) {
            C9961t90 c9961t90 = this.d;
            if (c9961t90.a.b()) {
                return;
            }
            C4979ef4 c4979ef4 = c9961t90.a;
            c4979ef4.e = true;
            if (interfaceC9040qU1 != null) {
                C4636df4 c4636df4 = (C4636df4) interfaceC9040qU1;
                c4979ef4.c = c4636df4.a;
                c4979ef4.d = c4636df4.b;
                c4979ef4.b = 0;
                if (!c4979ef4.b()) {
                    return;
                }
            }
            c7580mD0.f(C7580mD0.d(System.currentTimeMillis(), c4979ef4.c, c4979ef4.d, c4979ef4.b));
            F74 f74 = c9961t90.d;
            if (f74 != null) {
                f74.a(new Cdo(5), null);
            }
        }
    }
}

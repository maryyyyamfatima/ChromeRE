package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o90 */
/* loaded from: classes.dex */
public final class C8247o90 extends AbstractC3219Yu {
    public final /* synthetic */ C9961t90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8247o90(C9961t90 c9961t90) {
        super(c9961t90.a, 3, I71.class);
        this.d = c9961t90;
    }

    @Override // defpackage.AbstractC3219Yu
    public final void b(InterfaceC9040qU1 interfaceC9040qU1) {
        C4979ef4 c4979ef4 = this.d.a;
        if (c4979ef4.e) {
            c4979ef4.e = false;
            C7580mD0 c7580mD0 = this.c;
            if (c7580mD0.a) {
                long currentTimeMillis = System.currentTimeMillis();
                if (interfaceC9040qU1 != null) {
                    X5.a(interfaceC9040qU1);
                    throw null;
                }
                c7580mD0.f(C7580mD0.b(currentTimeMillis, 2));
                c7580mD0.f(C7580mD0.d(currentTimeMillis, 0, 0, 0));
                if (interfaceC9040qU1 != null) {
                    X5.a(interfaceC9040qU1);
                    throw null;
                }
                c7580mD0.e();
            }
        }
    }
}

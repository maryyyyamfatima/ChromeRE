package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s90 */
/* loaded from: classes.dex */
public final class C9618s90 extends AbstractC3219Yu {
    public final /* synthetic */ C9961t90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9618s90(C9961t90 c9961t90) {
        super(c9961t90.a, 8, C4636df4.class);
        this.d = c9961t90;
    }

    @Override // defpackage.AbstractC3219Yu
    public final void b(InterfaceC9040qU1 interfaceC9040qU1) {
        C9961t90 c9961t90 = this.d;
        if (!c9961t90.a.e || interfaceC9040qU1 == null) {
            return;
        }
        C7580mD0 c7580mD0 = this.c;
        if (c7580mD0.a) {
            long currentTimeMillis = System.currentTimeMillis();
            C4636df4 c4636df4 = (C4636df4) interfaceC9040qU1;
            C4979ef4 c4979ef4 = c9961t90.a;
            int i = c4979ef4.c;
            int i2 = c4636df4.a;
            int i3 = c4636df4.b;
            if (i == i2 && c4979ef4.d == i3) {
                return;
            }
            c4979ef4.c();
            int i4 = c4636df4.a;
            c4979ef4.c = i4;
            c4979ef4.d = i3;
            c7580mD0.f(C7580mD0.d(currentTimeMillis, i4, i3, c4979ef4.b));
            c9961t90.b.a(new Cdo(2), null);
        }
    }
}

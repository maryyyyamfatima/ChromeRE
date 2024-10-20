package defpackage;

import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FX1 extends B0 implements InterfaceC4143cD0 {
    public final AbstractC11165wg3 h;
    public final Exception i;
    public final boolean j;

    @Override // defpackage.LT3
    public final void A0() {
    }

    @Override // defpackage.LT3
    public final void w() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FX1(String str, InterfaceC4143cD0 interfaceC4143cD0, boolean z) {
        super(str, interfaceC4143cD0);
        C10822vg3 c10822vg3 = C10822vg3.d;
        this.h = c10822vg3;
        this.i = interfaceC4143cD0.v();
        this.j = z;
    }

    @Override // defpackage.LT3
    public final C10136tg3 J(C10479ug3 c10479ug3) {
        C10136tg3 c10136tg3;
        Object a = this.h.a(c10479ug3);
        if (a != null) {
            c10136tg3 = new C10136tg3(1, a, false);
        } else {
            c10136tg3 = C10136tg3.a(3);
        }
        c10136tg3.getClass();
        return c10136tg3.a == 3 ? C10136tg3.a(2) : c10136tg3;
    }

    @Override // defpackage.LT3
    public final FX1 U0(String str) {
        C10822vg3 c10822vg3 = C10822vg3.d;
        return d(str, true);
    }

    @Override // defpackage.InterfaceC4143cD0
    public final FX1 d(String str, boolean z) {
        C10822vg3 c10822vg3 = C10822vg3.d;
        boolean z2 = this.j;
        if (z && !z2) {
            WeakHashMap weakHashMap = AbstractC6294iU3.a;
        }
        return new FX1(str, this, (z && !z2) || z2);
    }

    @Override // defpackage.InterfaceC4143cD0
    public final Exception v() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FX1(String str, boolean z) {
        super(str, C1232Jm1.c.b());
        C10822vg3 c10822vg3 = C10822vg3.d;
        this.h = c10822vg3;
        this.i = EX1.i;
        this.j = z;
    }
}

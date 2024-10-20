package defpackage;

import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EX1 extends B0 implements InterfaceC4143cD0 {
    public static final C3800bD0 i = new C3800bD0();
    public final C3800bD0 h;

    @Override // defpackage.LT3
    public final void A0() {
    }

    @Override // defpackage.LT3
    public final void w() {
    }

    @Override // defpackage.LT3
    public final FX1 U0(String str) {
        C10822vg3 c10822vg3 = C10822vg3.d;
        WeakHashMap weakHashMap = AbstractC6294iU3.a;
        return d(str, true);
    }

    @Override // defpackage.InterfaceC4143cD0
    public final FX1 d(String str, boolean z) {
        C10822vg3 c10822vg3 = C10822vg3.d;
        if (z) {
            WeakHashMap weakHashMap = AbstractC6294iU3.a;
        }
        return new FX1(str, this, z);
    }

    @Override // defpackage.LT3
    public final C10136tg3 J(C10479ug3 c10479ug3) {
        return C10136tg3.a(2);
    }

    @Override // defpackage.InterfaceC4143cD0
    public final Exception v() {
        return this.h;
    }

    public EX1() {
        super("", C1232Jm1.c.b());
        this.h = i;
    }
}

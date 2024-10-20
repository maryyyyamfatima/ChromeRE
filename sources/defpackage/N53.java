package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N53 implements InterfaceC9298rD2 {
    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
        throw null;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        O53 o53 = (O53) obj;
        if (interfaceC8177nx0.l() instanceof T40) {
            T40 t40 = (T40) interfaceC8177nx0.l();
            t40.D(o53.l);
            if ((o53.j & 4) != 0) {
                t40.B(o53.m);
            }
            if ((o53.j & 8) != 0) {
                t40.C(o53.n);
            }
            if ((o53.j & 1) != 0) {
                t40.E(Integer.valueOf(o53.k));
            }
        }
        if (interfaceC8177nx0.l() instanceof C5197fH3) {
            C5197fH3 c5197fH3 = (C5197fH3) interfaceC8177nx0.l();
            c5197fH3.z(o53.l);
            c5197fH3.x(o53.m);
            c5197fH3.y(o53.n);
            if ((o53.j & 1) != 0) {
                c5197fH3.w(Integer.valueOf(o53.k));
            }
        }
    }

    @Override // defpackage.InterfaceC9298rD2
    public final OX0 a() {
        return O53.q;
    }
}

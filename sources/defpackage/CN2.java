package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CN2 implements InterfaceC9395rX {
    public final C11918yr4 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        D93 d93 = (D93) obj;
        if (d93 == null) {
            return new C6315iZ(new IllegalArgumentException("Invalid command parameter to SendFeedbackCommandHandler.onCommand"));
        }
        if (abstractC9053qX != null) {
            InterfaceC2548Tp3 c = L44.c(abstractC9053qX);
            if (c != null) {
                E93 e93 = d93.k;
                if (e93 == null) {
                    e93 = E93.n;
                }
                C1161Iy0 c1161Iy0 = e93.k;
                if (c1161Iy0 == null) {
                    c1161Iy0 = C1161Iy0.p;
                }
                ((C6241iK0) c).d(this.a.b(c1161Iy0, L44.b(abstractC9053qX)), ((C2924Wn) abstractC9053qX).a);
                return C5971hZ.a;
            }
            return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
        }
        return new C6315iZ(new IllegalArgumentException("Invalid eventData parameter to ReportContentCommandHandler.onCommand"));
    }

    public CN2(C11918yr4 c11918yr4) {
        this.a = c11918yr4;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return D93.o;
    }
}

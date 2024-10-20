package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IU3 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        JU3 ju3 = (JU3) obj;
        InterfaceC3486aJ0 a = L44.a(abstractC9053qX);
        if (a != null) {
            C4793e62 c4793e62 = ju3.k;
            if (c4793e62 == null) {
                c4793e62 = C4793e62.m;
            }
            String str = c4793e62.k;
            int a2 = AbstractC4106c62.a(c4793e62.l);
            if (a2 == 0) {
                a2 = 1;
            }
            int b = AbstractC2373Sg3.b(a2);
            if (b != 0) {
                if (b == 1) {
                    ((C3835bK0) a).a(((C2924Wn) abstractC9053qX).a, 0.33f, new Runnable(str) { // from class: HU3
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC3486aJ0.this.getClass();
                        }
                    });
                }
                return C5971hZ.a;
            }
            return new C6315iZ(new IllegalArgumentException("Unspecified interaction mode in notice data"));
        }
        return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return JU3.n;
    }
}

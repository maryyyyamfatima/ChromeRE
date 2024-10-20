package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BE1 extends CE1 implements CA1 {
    public final JA1 e;
    public final /* synthetic */ G02 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BE1(G02 g02, JA1 ja1, UT2 ut2) {
        super(g02, ut2);
        this.f = g02;
        this.e = ja1;
    }

    @Override // defpackage.CE1
    public final boolean h() {
        return this.e.Z().b.a(EnumC11683yA1.STARTED);
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        JA1 ja12 = this.e;
        EnumC11683yA1 enumC11683yA1 = ja12.Z().b;
        if (enumC11683yA1 != EnumC11683yA1.DESTROYED) {
            EnumC11683yA1 enumC11683yA12 = null;
            while (enumC11683yA12 != enumC11683yA1) {
                e(h());
                enumC11683yA12 = enumC11683yA1;
                enumC11683yA1 = ja12.Z().b;
            }
            return;
        }
        G02 g02 = this.f;
        g02.getClass();
        G02.a("removeObserver");
        CE1 ce1 = (CE1) g02.b.b(this.a);
        if (ce1 == null) {
            return;
        }
        ce1.f();
        ce1.e(false);
    }

    @Override // defpackage.CE1
    public final boolean g(JA1 ja1) {
        return this.e == ja1;
    }

    @Override // defpackage.CE1
    public final void f() {
        this.e.Z().b(this);
    }
}

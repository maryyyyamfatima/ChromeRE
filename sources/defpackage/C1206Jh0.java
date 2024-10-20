package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jh0 */
/* loaded from: classes.dex */
public final class C1206Jh0 extends AbstractC10743vS0 implements PK2 {
    public final C3160Yi0 g;
    public final /* synthetic */ C1336Kh0 h;

    @Override // defpackage.PK2
    public final void b(Object obj, int i, Object obj2) {
        C3160Yi0 c3160Yi0 = this.g;
        ((RC1) obj).v(c3160Yi0.g.i, c3160Yi0.get(i));
    }

    @Override // defpackage.PK2
    public final void g(Object obj) {
        ((RC1) obj).w();
    }

    public C1206Jh0(C1336Kh0 c1336Kh0, C3160Yi0 c3160Yi0) {
        this.h = c1336Kh0;
        this.g = c3160Yi0;
        c3160Yi0.l(this);
    }

    @Override // defpackage.PK2
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.PK2
    public final int getItemViewType(int i) {
        return PD1.b(this.g.get(i), this.h.a);
    }
}

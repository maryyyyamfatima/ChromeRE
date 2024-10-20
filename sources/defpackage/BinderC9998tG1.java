package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tG1 */
/* loaded from: classes.dex */
public final class BinderC9998tG1 extends AbstractBinderC9088qd1 {
    public final YV0 g;

    public BinderC9998tG1(YV0 yv0) {
        this.g = yv0;
    }

    @Override // defpackage.InterfaceC9430rd1
    public final void H0() {
        C3462aE1 c3462aE1;
        YV0 yv0 = this.g;
        synchronized (yv0) {
            c3462aE1 = yv0.b;
        }
        C9655sG1 c9655sG1 = new C9655sG1(this);
        c3462aE1.getClass();
        c3462aE1.a.execute(new XD1(c3462aE1, c9655sG1));
    }
}

package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11587xt4 extends AbstractRunnableC9872st4 {
    public final /* synthetic */ Jt4 g;

    public C11587xt4(Jt4 jt4) {
        this.g = jt4;
    }

    @Override // defpackage.AbstractRunnableC9872st4
    public final void a() {
        Jt4 jt4 = this.g;
        if (jt4.k != null) {
            jt4.b.b(4, "Unbind from service.", new Object[0]);
            jt4.a.unbindService(jt4.j);
            jt4.e = false;
            jt4.k = null;
            jt4.j = null;
        }
    }
}

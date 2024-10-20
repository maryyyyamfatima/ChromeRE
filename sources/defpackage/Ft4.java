package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ft4 extends AbstractRunnableC9872st4 {
    public final /* synthetic */ Ht4 g;

    public Ft4(Ht4 ht4) {
        this.g = ht4;
    }

    @Override // defpackage.AbstractRunnableC9872st4
    public final void a() {
        Ht4 ht4 = this.g;
        Jt4 jt4 = ht4.a;
        jt4.b.b(4, "unlinkToDeath", new Object[0]);
        jt4.k.asBinder().unlinkToDeath(jt4.i, 0);
        Jt4 jt42 = ht4.a;
        jt42.k = null;
        jt42.e = false;
    }
}

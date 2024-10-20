package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TJ2 implements Ze4 {
    public final /* synthetic */ A13 a;

    public TJ2(A13 a13) {
        this.a = a13;
    }

    @Override // defpackage.Ze4
    public final void a(int i, int i2, int i3, int i4, int i5) {
        Y03 y03;
        A13 a13 = this.a;
        synchronized (a13) {
            y03 = a13.n;
        }
        if (y03 != null) {
            a13.q(y03, i, i2, i3, i4, i5);
        }
    }
}

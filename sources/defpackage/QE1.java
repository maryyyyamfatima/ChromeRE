package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QE1 extends AbstractC9776sd4 {
    public static final PE1 i = new PE1();
    public final C1593Mg3 h = new C1593Mg3();

    @Override // defpackage.AbstractC9776sd4
    public final void a() {
        C1593Mg3 c1593Mg3 = this.h;
        if (c1593Mg3.i() > 0) {
            X5.a(c1593Mg3.j(0));
            throw null;
        }
        int i2 = c1593Mg3.i;
        Object[] objArr = c1593Mg3.h;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c1593Mg3.i = 0;
        c1593Mg3.a = false;
    }
}

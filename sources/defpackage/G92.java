package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G92 extends X82 {
    public final Object[] a;

    public G92(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        Object[] objArr = this.a;
        F92 f92 = new F92(interfaceC11128wa2, objArr);
        interfaceC11128wa2.c(f92);
        if (f92.i) {
            return;
        }
        int length = objArr.length;
        for (int i = 0; i < length && !f92.j; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                f92.a.onError(new NullPointerException(AbstractC9307rF1.a("The element at index ", i, " is null")));
                return;
            }
            f92.a.d(obj);
        }
        if (f92.j) {
            return;
        }
        f92.a.b();
    }
}

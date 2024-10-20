package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F92 extends AbstractC5770gx {
    public final InterfaceC11128wa2 a;
    public final Object[] g;
    public int h;
    public boolean i;
    public volatile boolean j;

    public F92(InterfaceC11128wa2 interfaceC11128wa2, Object[] objArr) {
        this.a = interfaceC11128wa2;
        this.g = objArr;
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.i = true;
        return 1;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        int i = this.h;
        Object[] objArr = this.g;
        if (i == objArr.length) {
            return null;
        }
        this.h = i + 1;
        Object obj = objArr[i];
        Q82.a(obj, "The array element is null");
        return obj;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return this.h == this.g.length;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        this.h = this.g.length;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.j = true;
    }
}

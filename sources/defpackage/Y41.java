package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y41 implements InterfaceC3715ay1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public int f;

    public Y41(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.InterfaceC3715ay1
    public final boolean a() {
        return this.e < (this.c == 1 ? this.b : this.a);
    }

    @Override // defpackage.InterfaceC3715ay1
    public final void b(InterfaceC7976nN2 interfaceC7976nN2, int i, int i2) {
        if (this.f == 0) {
            int i3 = this.e;
            if (this.c == 1) {
                i = i2;
            }
            this.e = i3 + i;
        }
        if (interfaceC7976nN2.q()) {
            this.f = 0;
            return;
        }
        int e = interfaceC7976nN2.e() + this.f;
        this.f = e;
        if (e == this.d) {
            this.f = 0;
        }
    }

    @Override // defpackage.InterfaceC3715ay1
    public final int c() {
        return this.e;
    }
}

package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OB1 implements InterfaceC3715ay1 {
    public final int a;
    public final int b;
    public final int c;
    public int d;

    public OB1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.InterfaceC3715ay1
    public final boolean a() {
        return this.d < (this.c == 1 ? this.b : this.a);
    }

    @Override // defpackage.InterfaceC3715ay1
    public final void b(InterfaceC7976nN2 interfaceC7976nN2, int i, int i2) {
        int i3 = this.d;
        if (this.c == 1) {
            i = i2;
        }
        this.d = i3 + i;
    }

    @Override // defpackage.InterfaceC3715ay1
    public final int c() {
        return this.d;
    }
}

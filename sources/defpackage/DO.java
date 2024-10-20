package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DO implements InterfaceC1292Jy1 {
    public int a = -1;
    public final /* synthetic */ HO g;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void i(int i, boolean z, boolean z2) {
    }

    public DO(HO ho) {
        this.g = ho;
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        if (this.a != -1 || i == 1) {
            return;
        }
        this.a = this.g.b();
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void f(int i) {
        int i2 = this.a;
        if (i2 == -1 || i != 1) {
            return;
        }
        ((C5265fV1) this.g.a).a.a.c(i2);
        this.a = -1;
    }
}

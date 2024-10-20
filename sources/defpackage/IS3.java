package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class IS3 implements InterfaceC1292Jy1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LS3 g;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void i(int i, boolean z, boolean z2) {
    }

    public IS3(LS3 ls3, int i) {
        this.g = ls3;
        this.a = i;
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        boolean z2 = (i & this.a) > 0;
        LS3 ls3 = this.g;
        ls3.m = z2;
        ls3.d();
    }
}

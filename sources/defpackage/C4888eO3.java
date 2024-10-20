package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eO3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4888eO3 implements InterfaceC1292Jy1 {
    public boolean a;
    public final /* synthetic */ C5232fO3 g;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    public C4888eO3(C5232fO3 c5232fO3) {
        this.g = c5232fO3;
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        if (i == 2) {
            C5232fO3 c5232fO3 = this.g;
            if (c5232fO3.l) {
                c5232fO3.h.onResult(Boolean.TRUE);
                this.a = true;
            }
        }
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void i(int i, boolean z, boolean z2) {
        if (i == 2 && this.a) {
            this.g.h.onResult(Boolean.FALSE);
            this.a = false;
        }
    }
}

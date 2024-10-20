package defpackage;

import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bR2 */
/* loaded from: classes2.dex */
public final class C3872bR2 implements InterfaceC1292Jy1 {
    public final /* synthetic */ C4559dR2 a;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    public C3872bR2(C4559dR2 c4559dR2) {
        this.a = c4559dR2;
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        C4559dR2 c4559dR2 = this.a;
        if (i != 1 && i != 8 && c4559dR2.R.get() != null) {
            ((ContextualSearchManager) c4559dR2.R.get()).i(0);
        }
        if (i == 2) {
            C3511aO0 c3511aO0 = c4559dR2.n;
            if (c3511aO0 != null) {
                c3511aO0.a(true);
            }
            C0430Di c0430Di = c4559dR2.i;
            if (c0430Di != null) {
                c0430Di.d.a();
            }
        }
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void c(int i) {
        C0430Di c0430Di;
        if (i == 2 || (c0430Di = this.a.i) == null) {
            return;
        }
        c0430Di.d.a();
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void f(int i) {
        C0430Di c0430Di;
        if (i != 2 || (c0430Di = this.a.i) == null) {
            return;
        }
        c0430Di.d.a();
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void i(int i, boolean z, boolean z2) {
        C0430Di c0430Di;
        if (i != 2 || (c0430Di = this.a.i) == null) {
            return;
        }
        c0430Di.d.a();
    }
}

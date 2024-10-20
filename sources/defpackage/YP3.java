package defpackage;

import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.chrome.browser.toolbar.top.e;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YP3 implements InterfaceC1292Jy1 {
    public final /* synthetic */ C9707sQ3 a;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void c(int i) {
        if (i == 2) {
            C9707sQ3 c9707sQ3 = this.a;
            c9707sQ3.k.a.C();
            c9707sQ3.m();
            if (AbstractC5177fD3.h(c9707sQ3.R)) {
                c9707sQ3.a();
                c9707sQ3.h();
            }
        }
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        this.a.n(i, z);
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void i(int i, boolean z, boolean z2) {
        if (i == 2) {
            C9707sQ3 c9707sQ3 = this.a;
            LocationBarModel locationBarModel = c9707sQ3.z;
            locationBarModel.q = false;
            locationBarModel.x();
            locationBarModel.y();
            locationBarModel.v();
            locationBarModel.w();
            e eVar = c9707sQ3.k;
            eVar.e(false, z, z2);
            c9707sQ3.m();
            if (eVar.a.K(true)) {
                ((YO3) c9707sQ3.l.i.g).f(null);
            }
        }
    }

    public YP3(C9707sQ3 c9707sQ3) {
        this.a = c9707sQ3;
    }
}

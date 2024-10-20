package defpackage;

import android.content.res.Configuration;
import org.chromium.content.browser.ScreenOrientationProviderImpl;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nX2 */
/* loaded from: classes2.dex */
public final class C8026nX2 implements InterfaceC9163qp4 {
    public final ScreenOrientationProviderImpl a;
    public final C10191tp4 g;
    public final boolean h;
    public final byte i;
    public boolean j;

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void g(boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void l(float f) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void m(int i) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onAttachedToWindow() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onDetachedFromWindow() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public C8026nX2(ScreenOrientationProviderImpl screenOrientationProviderImpl, C10191tp4 c10191tp4, boolean z, byte b) {
        this.a = screenOrientationProviderImpl;
        this.g = c10191tp4;
        this.h = z;
        this.i = b;
        c10191tp4.b(this);
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void a(WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            return;
        }
        boolean z = this.h;
        ScreenOrientationProviderImpl screenOrientationProviderImpl = this.a;
        if (z) {
            screenOrientationProviderImpl.c(windowAndroid, this.i);
        } else {
            screenOrientationProviderImpl.e(windowAndroid);
        }
        this.g.a.d(this);
        this.j = true;
    }
}

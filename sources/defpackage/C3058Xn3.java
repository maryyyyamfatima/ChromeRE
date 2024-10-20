package defpackage;

import android.animation.ValueAnimator;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xn3 */
/* loaded from: classes.dex */
public final class C3058Xn3 implements InterfaceC1292Jy1 {
    public final /* synthetic */ C3188Yn3 a;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    public final void b(boolean z) {
        C3188Yn3 c3188Yn3 = this.a;
        c3188Yn3.getClass();
        if (UN.A.a() && CachedFeatureFlags.b(AbstractC6265iP.d.b("GridTabSwitcherForTablets:enable_launch_polish"), false)) {
            c3188Yn3.s = z && !C1096Il0.a(c3188Yn3.q);
            return;
        }
        if (C3188Yn3.n()) {
            ValueAnimator valueAnimator = c3188Yn3.t;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c3188Yn3.t.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            c3188Yn3.t = ofFloat;
            ofFloat.setInterpolator(AbstractC8142nr1.f);
            c3188Yn3.t.setDuration(200L);
            c3188Yn3.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Wn3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C3058Xn3 c3058Xn3 = C3058Xn3.this;
                    c3058Xn3.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    C3188Yn3 c3188Yn32 = c3058Xn3.a;
                    C6064ho3 c6064ho3 = c3188Yn32.r;
                    c6064ho3.e = floatValue;
                    c3188Yn32.u.d(c6064ho3);
                }
            });
            c3188Yn3.t.start();
            c3188Yn3.r.f = z;
        }
    }

    public C3058Xn3(C3188Yn3 c3188Yn3) {
        this.a = c3188Yn3;
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        if (i != 2) {
            return;
        }
        b(true);
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void i(int i, boolean z, boolean z2) {
        if (i != 2) {
            return;
        }
        b(false);
    }
}

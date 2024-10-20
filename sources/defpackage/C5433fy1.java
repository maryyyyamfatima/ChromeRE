package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fy1 */
/* loaded from: classes.dex */
public final class C5433fy1 implements InterfaceC10551us3 {
    public int a;
    public final boolean g = true;
    public final /* synthetic */ AbstractC5777gy1 h;

    public C5433fy1(AbstractC5777gy1 abstractC5777gy1) {
        this.h = abstractC5777gy1;
    }

    @Override // defpackage.InterfaceC10551us3
    public final void s0(int i) {
        this.a = 0;
    }

    @Override // defpackage.InterfaceC10551us3
    public final void O(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        int index;
        AbstractC5777gy1 abstractC5777gy1 = this.h;
        if (abstractC5777gy1.R == null) {
            return;
        }
        motionEvent.getRawX();
        motionEvent.getRawY();
        float f5 = abstractC5777gy1.a;
        float f6 = f3 * f5;
        float f7 = f4 * f5;
        float f8 = f * f5;
        if (this.a != 0) {
            C3529aR3 c3529aR3 = abstractC5777gy1.R;
            SystemClock.uptimeMillis();
            c3529aR3.G = JM1.b(c3529aR3.E + f8, 0.0f, c3529aR3.a) - c3529aR3.E;
            c3529aR3.F();
            return;
        }
        double degrees = (Math.toDegrees(Math.atan2(-f7, f6)) + 360.0d) % 360.0d;
        int i = (degrees >= 205.0d || degrees <= 155.0d) ? (degrees < 25.0d || degrees > 335.0d) ? 2 : (degrees >= 295.0d || degrees <= 245.0d) ? 0 : 4 : 1;
        this.a = i;
        if (i == 0) {
            return;
        }
        if (this.g && abstractC5777gy1.S != null && i == 4) {
            FI2.a("MobileToolbarSwipeOpenStackView");
            abstractC5777gy1.d0(2, true);
        } else if (i == 1 || i == 2) {
            abstractC5777gy1.Y(abstractC5777gy1.R, true);
        }
        C3529aR3 c3529aR32 = abstractC5777gy1.R;
        SystemClock.uptimeMillis();
        int i2 = this.a;
        InterfaceC10590uz3 interfaceC10590uz3 = c3529aR32.l;
        if (interfaceC10590uz3 == null || c3529aR32.y != null || i2 == 4) {
            return;
        }
        boolean z = i2 == 2;
        TabModel g = ((AbstractC11276wz3) interfaceC10590uz3).g();
        if (g == null || (index = g.index()) == -1) {
            return;
        }
        c3529aR32.S(i2, index, LocalizationUtils.isLayoutRtl() ^ z ? index - 1 : index + 1);
    }

    @Override // defpackage.InterfaceC10551us3
    public final void V() {
        float f;
        C1551Ly1 c1551Ly1;
        C1551Ly1 c1551Ly12;
        C3529aR3 c3529aR3 = this.h.R;
        if (c3529aR3 != null) {
            if (c3529aR3 == ((C9897sy1) c3529aR3.n).r) {
                SystemClock.uptimeMillis();
                if (c3529aR3.x == null || c3529aR3.l == null) {
                    return;
                }
                float min = Math.min(c3529aR3.I, c3529aR3.a / 3.0f);
                C1551Ly1 c1551Ly13 = c3529aR3.x;
                c3529aR3.y = c1551Ly13;
                float f2 = c3529aR3.G;
                float f3 = 0.0f;
                if (f2 <= min || (c1551Ly12 = c3529aR3.v) == null) {
                    if (f2 < (-min) && (c1551Ly1 = c3529aR3.w) != null) {
                        c3529aR3.y = c1551Ly1;
                        f3 = 0.0f - c3529aR3.a;
                    }
                    f = f3;
                } else {
                    c3529aR3.y = c1551Ly12;
                    f = c3529aR3.a + 0.0f;
                }
                if (c3529aR3.y != c1551Ly13) {
                    FI2.a("MobileSideSwipeFinished");
                }
                c3529aR3.J(c3529aR3.y.p(), false);
                float f4 = c3529aR3.G;
                long abs = (Math.abs(f4 - f) * 500.0f) / c3529aR3.a;
                c3529aR3.y.p();
                c3529aR3.Q(f4, f, abs);
            }
        }
    }

    @Override // defpackage.InterfaceC10551us3
    public final void J(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        AbstractC5777gy1 abstractC5777gy1 = this.h;
        C3529aR3 c3529aR3 = abstractC5777gy1.R;
        if (c3529aR3 != null) {
            if (c3529aR3 == ((C9897sy1) c3529aR3.n).r) {
                motionEvent.getRawX();
                motionEvent.getRawX();
                float f5 = abstractC5777gy1.a;
                float f6 = f * f5;
                float f7 = f3 * f5;
                C3529aR3 c3529aR32 = abstractC5777gy1.R;
                SystemClock.uptimeMillis();
                float f8 = c3529aR32.a * 0.5f;
                c3529aR32.G = JM1.b(c3529aR32.E + (JM1.b(f7 * 0.033333335f, -f8, f8) + f6), 0.0f, c3529aR32.a) - c3529aR32.E;
                c3529aR32.F();
            }
        }
    }

    @Override // defpackage.InterfaceC10551us3
    public final boolean X(int i) {
        AbstractC5777gy1 abstractC5777gy1 = this.h;
        XU0 xu0 = ((CompositorViewHolder) abstractC5777gy1.g).t.z;
        if (abstractC5777gy1.r != abstractC5777gy1.j || !C1096Il0.c().e) {
            return false;
        }
        if (xu0 != null && xu0.g()) {
            return false;
        }
        if (i == 4) {
            return (abstractC5777gy1.S == null || C10021tL.f().c()) ? false : true;
        }
        return i == 1 || i == 2;
    }
}

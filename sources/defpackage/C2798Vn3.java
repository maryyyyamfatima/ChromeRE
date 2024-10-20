package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListPopupWindow;
import com.android.chrome.R;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vn3 */
/* loaded from: classes.dex */
public final class C2798Vn3 implements InterfaceC9401rY0 {
    public final /* synthetic */ C3188Yn3 a;

    @Override // defpackage.InterfaceC9401rY0
    public final void n0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    @Override // defpackage.InterfaceC9401rY0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(int r12, float r13, float r14, boolean r15) {
        /*
            r11 = this;
            Yn3 r0 = r11.a
            h20 r1 = r0.p
            boolean r2 = r1.c(r13, r14)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L10
            r1.j = r4
            r1 = r4
            goto L11
        L10:
            r1 = r3
        L11:
            if (r1 == 0) goto L14
            return
        L14:
            ho3 r1 = r0.r
            boolean r1 = r1.f
            if (r1 == 0) goto L1b
            return
        L1b:
            Nn3 r0 = r0.b()
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.r(r3)
            KN3 r5 = r0.o
            boolean r6 = r5.c(r13, r14)
            if (r6 == 0) goto L32
            r5.j = r4
            r5 = r4
            goto L33
        L32:
            r5 = r3
        L33:
            Dy1 r6 = r0.b
            r7 = 0
            if (r5 == 0) goto L3e
            org.chromium.chrome.browser.compositor.CompositorViewHolder r6 = (org.chromium.chrome.browser.compositor.CompositorViewHolder) r6
            r6.v(r7)
            goto L9b
        L3e:
            go3 r5 = r0.m(r13)
            r8 = -1
            if (r5 == 0) goto L4e
            org.chromium.chrome.browser.tabmodel.TabModel r9 = r0.c
            int r10 = r5.a
            int r9 = defpackage.AbstractC1558Lz3.d(r9, r10)
            goto L4f
        L4e:
            r9 = r8
        L4f:
            if (r9 == r8) goto L59
            go3[] r8 = r0.i
            int r10 = r8.length
            if (r9 >= r10) goto L59
            r8 = r8[r9]
            goto L5a
        L59:
            r8 = r7
        L5a:
            r0.H = r8
            if (r5 == 0) goto L65
            boolean r14 = r5.f(r13, r14)
            if (r14 == 0) goto L65
            r3 = r4
        L65:
            if (r3 == 0) goto L72
            KN3 r14 = r5.g
            r14.j = r4
            r0.I = r14
            org.chromium.chrome.browser.compositor.CompositorViewHolder r6 = (org.chromium.chrome.browser.compositor.CompositorViewHolder) r6
            r6.v(r7)
        L72:
            Ci3 r14 = r0.w
            boolean r14 = r14.a()
            if (r14 != 0) goto L86
            Ci3 r14 = r0.w
            Bi3 r6 = r14.c
            r6.k = r4
            Bi3 r14 = r14.b
            r14.k = r4
            r0.H = r7
        L86:
            if (r15 == 0) goto L9b
            if (r3 != 0) goto L9b
            if (r5 == 0) goto L9b
            float r14 = r5.m
            r15 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 < 0) goto L9b
            r12 = r12 & 4
            if (r12 != 0) goto L9b
            r0.w(r1, r13)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2798Vn3.Z(int, float, float, boolean):void");
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void g0(float f, float f2) {
        C3188Yn3 c3188Yn3 = this.a;
        if (c3188Yn3.r.f) {
            return;
        }
        C1758Nn3 b = c3188Yn3.b();
        long uptimeMillis = SystemClock.uptimeMillis();
        C5720go3 m = b.m(f);
        if (m != null && m.f(f, f2)) {
            m.g.j = false;
            ((CompositorViewHolder) b.b).v(null);
            b.c.q(AbstractC1558Lz3.d(b.c, m.a), 3, false);
            View a = AbstractC1558Lz3.a(b.c).a();
            ListPopupWindow listPopupWindow = b.v;
            listPopupWindow.setAnchorView(a);
            listPopupWindow.setVerticalOffset((-(a.getHeight() - ((int) b.T.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0807b5)))) - ((ViewGroup.MarginLayoutParams) a.getLayoutParams()).topMargin);
            listPopupWindow.setHorizontalOffset(Math.max((Math.round((m.s + m.u) * b.T.getResources().getDisplayMetrics().density) - listPopupWindow.getWidth()) - ((ViewGroup.MarginLayoutParams) a.getLayoutParams()).leftMargin, 0));
            listPopupWindow.show();
            return;
        }
        b.r(false);
        b.w(uptimeMillis, f);
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void h0(float f, float f2, float f3, float f4, float f5) {
        boolean z;
        C3188Yn3 c3188Yn3 = this.a;
        C5799h20 c5799h20 = c3188Yn3.p;
        if (!c5799h20.c(f, f2)) {
            c5799h20.j = false;
        }
        if (c3188Yn3.r.f) {
            return;
        }
        C1758Nn3 b = c3188Yn3.b();
        long uptimeMillis = SystemClock.uptimeMillis();
        b.r(false);
        float f6 = LocalizationUtils.isLayoutRtl() ? -f3 : f3;
        KN3 kn3 = b.o;
        if (!kn3.c(f, f2)) {
            kn3.j = false;
        }
        KN3 kn32 = b.I;
        if (kn32 != null) {
            if (kn32.c(f, f2)) {
                z = kn32.j;
            } else {
                kn32.j = false;
                z = false;
            }
            if (!z) {
                b.I = null;
            }
        }
        if (b.B) {
            float f7 = f - b.C;
            if (Math.abs(f7) >= 1.0f) {
                if (LocalizationUtils.isLayoutRtl()) {
                    if (f6 >= 1.0f) {
                        b.A |= 1;
                    } else if (f6 <= -1.0f) {
                        b.A |= 2;
                    }
                } else if (f6 >= 1.0f) {
                    b.A |= 2;
                } else if (f6 <= -1.0f) {
                    b.A |= 1;
                }
                b.C = f;
                b.D(f7);
            }
        } else if (!b.w.a()) {
            C0174Bi3 c0174Bi3 = b.w.b;
            c0174Bi3.c = (int) (c0174Bi3.c + f6);
            c0174Bi3.k = false;
        } else {
            float b2 = b.Q ? b.b(b.H, true, true, true) : 0.0f;
            if (b.H == null || b2 == 0.0f) {
                if (!b.S) {
                    b.S = true;
                    FI2.a("MobileToolbarSlideTabs");
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Long l = b.G;
                    if (l != null && elapsedRealtime - l.longValue() <= 60000) {
                        b.G = Long.valueOf(elapsedRealtime);
                    } else {
                        b.F = Long.valueOf(elapsedRealtime);
                        b.G = Long.valueOf(elapsedRealtime);
                    }
                }
                b.G((int) (b.x + f6));
            } else if ((b2 > 0.0f && f6 > 0.0f) || (b2 < 0.0f && f6 < 0.0f)) {
                b.w.b(b.x, (int) b2, b.j(), uptimeMillis);
            }
        }
        if (!UN.T.a() && !b.B) {
            float abs = Math.abs(f4);
            float abs2 = Math.abs(f5);
            float f8 = b.u;
            if (f5 > f8 && abs < f8 * 2.0f && abs > 0.001f && abs2 / abs > C1758Nn3.W) {
                b.w(uptimeMillis, f - f4);
            }
        }
        if (!b.B) {
            b.H = null;
        }
        ((C9897sy1) b.a).N(null);
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void l0(float f, float f2) {
        int i;
        int i2;
        int i3;
        C3188Yn3 c3188Yn3 = this.a;
        if (c3188Yn3.r.f) {
            return;
        }
        C1758Nn3 b = c3188Yn3.b();
        long uptimeMillis = SystemClock.uptimeMillis();
        b.r(false);
        float f3 = LocalizationUtils.isLayoutRtl() ? -f : f;
        if (b.B) {
            return;
        }
        if (b.w.a()) {
            i = 0;
        } else {
            C0304Ci3 c0304Ci3 = b.w;
            C0174Bi3 c0174Bi3 = c0304Ci3.b;
            int i4 = c0174Bi3.c - b.x;
            b.H = null;
            c0304Ci3.c.k = true;
            c0174Bi3.k = true;
            i = i4;
        }
        C0304Ci3 c0304Ci32 = b.w;
        int i5 = b.x;
        int i6 = (int) f3;
        int i7 = (int) b.y;
        if (!c0304Ci32.a()) {
            float f4 = c0304Ci32.b.e;
            float f5 = c0304Ci32.c.e;
            float f6 = i6;
            if (Math.signum(f6) == Math.signum(f4)) {
                float f7 = 0;
                if (Math.signum(f7) == Math.signum(f5)) {
                    i3 = (int) (f7 + f5);
                    i2 = (int) (f6 + f4);
                    c0304Ci32.a = 1;
                    c0304Ci32.b.c(i5, i2, i7, 0, 0, uptimeMillis);
                    c0304Ci32.c.c(0, i3, 0, 0, 0, uptimeMillis);
                    C0174Bi3 c0174Bi32 = b.w.b;
                    c0174Bi32.c += i;
                    c0174Bi32.k = false;
                    ((C9897sy1) b.a).N(null);
                }
            }
        }
        i2 = i6;
        i3 = 0;
        c0304Ci32.a = 1;
        c0304Ci32.b.c(i5, i2, i7, 0, 0, uptimeMillis);
        c0304Ci32.c.c(0, i3, 0, 0, 0, uptimeMillis);
        C0174Bi3 c0174Bi322 = b.w.b;
        c0174Bi322.c += i;
        c0174Bi322.k = false;
        ((C9897sy1) b.a).N(null);
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void u() {
        TabModel tabModel;
        C3188Yn3 c3188Yn3 = this.a;
        C5799h20 c5799h20 = c3188Yn3.p;
        boolean z = c5799h20.j;
        c5799h20.j = false;
        if (z && c3188Yn3.g != null) {
            c3188Yn3.b().h();
            if (c3188Yn3.p.k) {
                InterfaceC10590uz3 interfaceC10590uz3 = c3188Yn3.g;
                ((C0129Az3) interfaceC10590uz3).t(true ^ ((AbstractC11276wz3) interfaceC10590uz3).o());
                return;
            }
            return;
        }
        if (c3188Yn3.r.f) {
            return;
        }
        C1758Nn3 b = c3188Yn3.b();
        SystemClock.uptimeMillis();
        KN3 kn3 = b.I;
        if (kn3 != null) {
            kn3.j = false;
        }
        b.I = null;
        if (b.B) {
            b.E = 0L;
            b.A = 0;
            b.C = 0.0f;
            b.B = false;
            b.h();
            C9897sy1 c9897sy1 = (C9897sy1) b.a;
            V10 v10 = c9897sy1.H;
            C5720go3 c5720go3 = b.H;
            C4424d20 d = C4424d20.d(v10, c5720go3, C5720go3.C, c5720go3.p, 0.0f, 125L);
            b.n = d;
            d.start();
            if (AbstractC5177fD3.e(b.T)) {
                int i = 0;
                while (true) {
                    C5720go3[] c5720go3Arr = b.i;
                    if (i >= c5720go3Arr.length) {
                        break;
                    }
                    c5720go3Arr[i].r = 0.0f;
                    i++;
                }
                b.E(true);
            }
            c9897sy1.N(null);
        }
        b.H = null;
        b.A = 0;
        KN3 kn32 = b.o;
        boolean z2 = kn32.j;
        kn32.j = false;
        if (z2 && (tabModel = b.c) != null) {
            if (!tabModel.isIncognito()) {
                b.c.l();
            }
            b.e.e();
        }
        b.S = false;
    }

    public C2798Vn3(C3188Yn3 c3188Yn3) {
        this.a = c3188Yn3;
    }

    @Override // defpackage.InterfaceC9401rY0
    public final void W(int i, float f, float f2, boolean z) {
        boolean z2;
        long uptimeMillis = SystemClock.uptimeMillis();
        C3188Yn3 c3188Yn3 = this.a;
        C5799h20 c5799h20 = c3188Yn3.p;
        boolean z3 = true;
        if (c5799h20.c(f, f2)) {
            c5799h20.j = false;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (c3188Yn3.r.f) {
                return;
            }
            C1758Nn3 b = c3188Yn3.b();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            b.r(false);
            KN3 kn3 = b.o;
            if (kn3.c(f, f2)) {
                kn3.j = false;
            } else {
                z3 = false;
            }
            if (z3) {
                FI2.a("MobileToolbarNewTab");
                kn3.a(uptimeMillis2);
                return;
            }
            C5720go3 m = b.m(f);
            if (m == null || m.i) {
                return;
            }
            if (m.f(f, f2) || (z && (i & 4) != 0)) {
                FI2.a("MobileToolbarCloseTab");
                m.g.a(uptimeMillis2);
                return;
            }
            FI2.a("MobileTabSwitched.TabletTabStrip");
            if (b.F != null && b.G != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long longValue = elapsedRealtime - b.F.longValue();
                if (elapsedRealtime - b.G.longValue() <= 60000) {
                    EI2.k(longValue, "Android.TabStrip.TimeToSwitchTab");
                }
                b.F = null;
                b.G = null;
            }
            m.a(uptimeMillis2);
            return;
        }
        c3188Yn3.p.a(uptimeMillis);
    }
}

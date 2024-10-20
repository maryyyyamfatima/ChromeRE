package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IC3 extends AbstractC2976Wx1 {
    public final InterfaceC8947qB3 A;
    public final DC3 B;
    public final ViewGroup C;
    public final OX2 D;
    public final InterfaceC9632sB3 E;
    public final C1551Ly1 F;
    public boolean G;
    public float H;
    public int I;

    /* renamed from: J */
    public long f11445J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public AnimatorSet v;
    public boolean w;
    public C2073Py3 x;
    public final InterfaceC10318uB3 y;
    public final InterfaceC6092ht1 z;

    @Override // defpackage.AbstractC2976Wx1
    public final AbstractC5518gD0 k() {
        return null;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final int m() {
        return 2;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean r() {
        return true;
    }

    public IC3(Context context, InterfaceC2201Qy1 interfaceC2201Qy1, CompositorViewHolder compositorViewHolder, InterfaceC10318uB3 interfaceC10318uB3, InterfaceC6092ht1 interfaceC6092ht1, ViewGroup viewGroup, OX2 ox2) {
        super(context, interfaceC2201Qy1, compositorViewHolder);
        C1551Ly1 c = c(-1, false);
        this.F = c;
        c.k(C1551Ly1.C, true);
        this.y = interfaceC10318uB3;
        InterfaceC8947qB3 h = interfaceC10318uB3.h();
        this.A = h;
        interfaceC10318uB3.n(new InterfaceC9289rB3() { // from class: sC3
            @Override // defpackage.InterfaceC9289rB3
            public final void e(int i, long j) {
                IC3.this.J(i, true);
            }
        });
        this.E = interfaceC10318uB3.q();
        this.z = interfaceC6092ht1;
        this.C = viewGroup;
        this.D = ox2;
        DC3 dc3 = new DC3(this, context);
        this.B = dc3;
        h.P(dc3);
    }

    public final boolean R() {
        if (AbstractC5177fD3.i(this.j)) {
            return false;
        }
        return AbstractC5177fD3.g();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void u() {
        if (this.G) {
            return;
        }
        this.G = true;
        this.y.a();
        if (this.x == null) {
            this.x = new C2073Py3();
        }
        this.x.h = this.l;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void H(InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager) {
        super.H(interfaceC10590uz3, tabContentManager);
        C2073Py3 c2073Py3 = this.x;
        if (c2073Py3 != null) {
            c2073Py3.h = interfaceC10590uz3;
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final C1551Ly1 l(int i) {
        return this.F;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void d() {
        this.A.z(this.B);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean t() {
        return this.A.C(false);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final SceneLayer n() {
        return this.x;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void M() {
        if (this.x == null) {
            this.x = new C2073Py3();
        }
        C1551Ly1[] c1551Ly1Arr = this.p;
        if (c1551Ly1Arr != null && P(c1551Ly1Arr[0])) {
            F();
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void N(RectF rectF, TabContentManager tabContentManager, ResourceManager resourceManager, CC cc) {
        if (this.x == null) {
            this.x = new C2073Py3();
        }
        C2073Py3 c2073Py3 = this.x;
        Context context = this.j;
        boolean R = R();
        InterfaceC9632sB3 interfaceC9632sB3 = this.E;
        c2073Py3.b(context, rectF, this, tabContentManager, resourceManager, cc, R ? interfaceC9632sB3.d() : 0, this.H, interfaceC9632sB3.p());
        this.I++;
        if (this.K != 0) {
            this.L = Math.max(this.L, SystemClock.elapsedRealtime() - this.K);
        }
        this.K = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void h() {
        AnimatorSet animatorSet = this.v;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.v.end();
    }

    public final void S(boolean z, final C9294rC3 c9294rC3, boolean z2) {
        float f;
        boolean z3 = z && R() && !(((AbstractC11276wz3) this.l).g().getCount() == 0);
        if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabToGTSAnimation:skip-slow-zooming"), true)) {
            z3 &= z2;
        }
        if (AbstractC5177fD3.c()) {
            z3 &= true ^ C10021tL.f().c();
        }
        if (!z3 || c9294rC3.get() == null) {
            this.A.m0(z);
            return;
        }
        h();
        C1551Ly1 c1551Ly1 = this.p[0];
        V10 j = j();
        ArrayList arrayList = new ArrayList(5);
        InterfaceC0079Ap3 interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: tC3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Float.valueOf(1.0f);
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap32 = new InterfaceC0079Ap3() { // from class: uC3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                IC3 ic3 = IC3.this;
                ic3.getClass();
                return Float.valueOf(((Rect) c9294rC3.get()).width() / (ic3.a * ic3.t));
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap33 = new InterfaceC0079Ap3() { // from class: vC3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Float.valueOf(0.0f);
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap34 = new InterfaceC0079Ap3() { // from class: wC3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                IC3 ic3 = IC3.this;
                ic3.getClass();
                return Float.valueOf(((Rect) c9294rC3.get()).left / ic3.t);
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap35 = new InterfaceC0079Ap3() { // from class: xC3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Float.valueOf(0.0f);
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap36 = new InterfaceC0079Ap3() { // from class: yC3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                IC3 ic3 = IC3.this;
                ic3.getClass();
                return Float.valueOf(((Rect) c9294rC3.get()).top / ic3.t);
            }
        };
        MD2 md2 = C1551Ly1.g;
        HH0 hh0 = AbstractC8142nr1.e;
        arrayList.add(C4424d20.g(j, c1551Ly1, md2, interfaceC0079Ap3, interfaceC0079Ap32, 300L, hh0));
        arrayList.add(C4424d20.g(j, c1551Ly1, C1551Ly1.h, interfaceC0079Ap33, interfaceC0079Ap34, 300L, hh0));
        arrayList.add(C4424d20.g(j, c1551Ly1, C1551Ly1.i, interfaceC0079Ap35, interfaceC0079Ap36, 300L, hh0));
        MD2 md22 = C1551Ly1.w;
        float s = c1551Ly1.s();
        if (AbstractC5177fD3.f()) {
            f = Math.min(this.a / AbstractC7239lD3.c(this.j), c1551Ly1.s());
        } else {
            f = this.a;
        }
        arrayList.add(C4424d20.f(j, c1551Ly1, md22, s, f, 300L, hh0));
        C4424d20 c = C4424d20.c(j, 0.0f, 1.0f, 150L, new InterfaceC4080c20() { // from class: zC3
            @Override // defpackage.InterfaceC4080c20
            public final void a(C4424d20 c4424d20) {
                IC3 ic3 = IC3.this;
                ic3.getClass();
                ic3.H = c4424d20.b();
            }
        });
        c.j = AbstractC8142nr1.d;
        arrayList.add(c);
        AnimatorSet animatorSet = new AnimatorSet();
        this.v = animatorSet;
        animatorSet.playTogether(arrayList);
        this.v.addListener(new EC3(this));
        this.M = this.I;
        this.f11445J = SystemClock.elapsedRealtime();
        this.K = SystemClock.elapsedRealtime();
        this.L = 0L;
        this.v.start();
    }

    public final void T(boolean z) {
        h();
        OX2 ox2 = this.D;
        if (ox2 != null) {
            HashMap e = PropertyModel.e(UX2.l);
            JD2 jd2 = UX2.c;
            GD2 gd2 = new GD2();
            gd2.a = this.C;
            e.put(jd2, gd2);
            HD2 hd2 = UX2.d;
            AD2 ad2 = new AD2();
            ad2.a = false;
            e.put(hd2, ad2);
            ox2.b(new PropertyModel(e));
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A.S(), (Property<ViewGroup, Float>) View.TRANSLATION_Y, r1.S().getHeight(), 0.0f);
        ofFloat.setInterpolator(AbstractC8142nr1.c);
        ofFloat.setDuration(450L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.v = animatorSet;
        animatorSet.play(ofFloat);
        this.v.addListener(new GC3(this, z));
        this.v.start();
    }

    public final void U() {
        h();
        OX2 ox2 = this.D;
        if (ox2 != null) {
            if (ox2.b.f != null) {
                ox2.a(true);
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A.S(), (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f, r2.S().getHeight());
        ofFloat.setInterpolator(AbstractC8142nr1.b);
        ofFloat.setDuration(450L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.v = animatorSet;
        animatorSet.play(ofFloat);
        this.v.addListener(new HC3(this));
        this.v.start();
    }

    public static void Q(IC3 ic3, boolean z) {
        int i = ic3.I - ic3.M;
        long elapsedRealtime = SystemClock.elapsedRealtime() - ic3.f11445J;
        int b = (int) (ic3.E.b() - ic3.f11445J);
        float f = (i * 1000.0f) / ((float) elapsedRealtime);
        String.format(Locale.US, "fps = %.2f (%d / %dms), maxFrameInterval = %d, dirtySpan = %d", Float.valueOf(f), Integer.valueOf(i), Long.valueOf(elapsedRealtime), Long.valueOf(ic3.L), Integer.valueOf(b));
        String str = z ? ".Shrink" : ".Expand";
        EI2.d((int) f, "GridTabSwitcher.FramePerSecond".concat(str));
        EI2.n(ic3.L, "GridTabSwitcher.MaxFrameInterval".concat(str));
        EI2.n(b, "GridTabSwitcher.DirtySpan".concat(str));
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void I(long j, boolean z) {
        TraceEvent i = TraceEvent.i("TabSwitcherLayout.Show.TabSwitcher", null);
        try {
            super.I(j, z);
            this.z.a(5);
            C1551Ly1 c = c(((AbstractC11276wz3) this.l).i(), ((AbstractC11276wz3) this.l).o());
            c.u();
            boolean z2 = true;
            this.p = new C1551Ly1[]{c};
            boolean r = this.E.r();
            boolean z3 = ((AbstractC11276wz3) this.l).g().getCount() == 0;
            if (!z || z3) {
                z2 = false;
            }
            if (AbstractC5177fD3.i(this.j)) {
                T(z2);
            } else {
                S(z2, new C9294rC3(this), r);
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void J(int i, boolean z) {
        TraceEvent i2 = TraceEvent.i("TabSwitcherLayout.Hide.TabSwitcher", null);
        try {
            super.J(i, z);
            if (i == -1) {
                i = ((AbstractC11276wz3) this.l).i();
            }
            C1551Ly1 c = c(i, ((AbstractC11276wz3) this.l).o());
            c.u();
            ArrayList arrayList = new ArrayList();
            arrayList.add(c);
            if (i != ((AbstractC11276wz3) this.l).i()) {
                C1551Ly1 c2 = c(((AbstractC11276wz3) this.l).i(), ((AbstractC11276wz3) this.l).o());
                c2.l(C1551Ly1.g, 0.0f);
                c2.u();
                arrayList.add(c2);
            }
            this.p = (C1551Ly1[]) arrayList.toArray(new C1551Ly1[0]);
            L(new LinkedList(Arrays.asList(Integer.valueOf(i))));
            this.w = true;
            if (AbstractC5177fD3.i(this.j)) {
                U();
            } else {
                this.A.w(!R());
            }
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void f() {
        TraceEvent i = TraceEvent.i("TabSwitcherLayout.DoneHiding", null);
        try {
            super.f();
            FI2.a("MobileExitStackView");
            this.z.b(5);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void g() {
        TraceEvent i = TraceEvent.i("TabSwitcherLayout.DoneShowing", null);
        try {
            if (!this.N) {
                if (i != null) {
                    i.close();
                }
            } else {
                super.g();
                if (i != null) {
                    i.close();
                }
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean E() {
        return this.v == null && !this.w;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean b() {
        return (AbstractC5177fD3.c() && C10021tL.f().c() && !DeviceFormFactor.a(this.j)) ? false : true;
    }
}

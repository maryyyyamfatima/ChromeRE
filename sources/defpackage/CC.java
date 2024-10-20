package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CC implements InterfaceC11179wj, Li4, FC {
    public Tab A;
    public ValueAnimator B;
    public boolean C;
    public final RunnableC11348xC D;
    public final Activity a;
    public final C3799bD g;
    public final int h;
    public final C7638mO3 i = new C7638mO3(new Runnable() { // from class: uC
        @Override // java.lang.Runnable
        public final void run() {
            CC.this.j();
        }
    });
    public final C8385oa2 j;
    public C12034zC k;
    public B80 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public C11691yC x;
    public final C12157za2 y;
    public final XU0 z;

    public CC(Activity activity) {
        C8385oa2 c8385oa2 = new C8385oa2();
        this.j = c8385oa2;
        this.y = new C12157za2();
        this.D = new RunnableC11348xC(this);
        this.a = activity;
        this.h = 0;
        c8385oa2.p(Boolean.FALSE);
        XU0 xu0 = new XU0(activity, c8385oa2);
        this.z = xu0;
        C3799bD c3799bD = new C3799bD(xu0.h);
        this.g = c3799bD;
        c3799bD.m(new Callback() { // from class: vC
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CC cc = CC.this;
                cc.getClass();
                if (((Integer) obj).intValue() == 1) {
                    cc.m();
                }
            }
        });
        VrModuleProvider.f(this);
        if (VrModuleProvider.b().a()) {
            h();
        }
    }

    public final void f(B80 b80, C6166i6 c6166i6, InterfaceC10590uz3 interfaceC10590uz3, int i) {
        XU0 xu0 = this.z;
        ApplicationStatus.e(xu0, xu0.a);
        ApplicationStatus.g(xu0);
        xu0.v = new RU0(xu0, c6166i6);
        xu0.w = new SU0(xu0, interfaceC10590uz3, interfaceC10590uz3);
        Activity activity = this.a;
        ApplicationStatus.e(this, activity);
        this.x = new C11691yC(this, c6166i6);
        this.k = new C12034zC(this, interfaceC10590uz3);
        this.l = b80;
        int i2 = this.h;
        if (i2 == 0) {
            this.m = activity.getResources().getDimensionPixelSize(i);
        } else if (i2 == 1) {
            this.w = 1.0f;
        }
        int i3 = this.m;
        this.t = i3;
        if (i2 != 1) {
            if (i3 == 0) {
                this.w = 1.0f;
            } else {
                this.w = Math.abs(this.r / i3);
            }
        }
        j();
    }

    public final void m() {
        Tab tab = this.A;
        if (tab != null && tab.isInitialized()) {
            if ((C3093Xu3.a(tab) == null ? 3 : C3093Xu3.a(tab).b()) == 2) {
                int i = this.n;
                int i2 = i - this.m;
                int i3 = this.o;
                int i4 = this.p;
                l(i2, i3 - i4, i, i, i4);
                return;
            }
        }
        l(0, 0, this.m, this.n, this.p);
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i != 2) {
            if (i == 6) {
                ApplicationStatus.h(this);
            }
        } else {
            QF3 qf3 = AbstractC5103f04.a;
            final C3799bD c3799bD = this.g;
            Objects.requireNonNull(c3799bD);
            PostTask.b(qf3, new Runnable() { // from class: sC
                @Override // java.lang.Runnable
                public final void run() {
                    C3799bD.this.y();
                }
            }, 100L);
        }
    }

    public final void k(int i, int i2) {
        if (this.o == i && this.p == i2) {
            return;
        }
        TraceEvent i3 = TraceEvent.i("BrowserControlsManager.setBottomControlsHeight", null);
        try {
            this.o = i;
            this.p = i2;
            Iterator it = this.y.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((GC) c11814ya2.next()).k(this.o);
                }
            }
            if (i3 != null) {
                i3.close();
            }
        } catch (Throwable th) {
            if (i3 != null) {
                try {
                    i3.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void l(int i, int i2, int i3, int i4, int i5) {
        int max = Math.max(i, -this.m);
        int min = Math.min(i2, this.o);
        int min2 = Math.min(i3, this.m + max);
        if (max == this.r && min == this.s && min2 == this.t && i4 == this.u && i5 == this.v) {
            return;
        }
        this.r = max;
        this.s = min;
        this.u = i4;
        this.v = i5;
        this.t = min2;
        this.j.p(Boolean.valueOf(min2 == this.n && HC.b(this) == this.p));
        if (this.h != 1) {
            int i6 = this.m;
            if (i6 == 0) {
                this.w = 1.0f;
            } else {
                this.w = Math.abs(this.r / i6);
            }
        }
        TraceEvent i7 = TraceEvent.i("BrowserControlsManager.notifyControlOffsetChanged", null);
        try {
            j();
            if (n()) {
                ToolbarControlContainer toolbarControlContainer = (ToolbarControlContainer) this.l;
                toolbarControlContainer.getClass();
                toolbarControlContainer.setTranslationY(this.r);
            }
            boolean n = n();
            Iterator it = this.y.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((GC) c11814ya2.next()).b(n, this.r, this.u, e());
                }
            }
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final int e() {
        return Math.min(this.s, this.o);
    }

    public final void d(GC gc) {
        this.y.a(gc);
    }

    public final void g(GC gc) {
        this.y.d(gc);
    }

    public final void j() {
        if (this.l == null) {
            return;
        }
        int i = n() ? 0 : 4;
        ToolbarControlContainer toolbarControlContainer = (ToolbarControlContainer) this.l;
        toolbarControlContainer.getClass();
        if (toolbarControlContainer.getVisibility() == i) {
            return;
        }
        ToolbarControlContainer toolbarControlContainer2 = (ToolbarControlContainer) this.l;
        toolbarControlContainer2.getClass();
        RunnableC11348xC runnableC11348xC = this.D;
        toolbarControlContainer2.removeCallbacks(runnableC11348xC);
        ToolbarControlContainer toolbarControlContainer3 = (ToolbarControlContainer) this.l;
        toolbarControlContainer3.getClass();
        toolbarControlContainer3.postOnAnimation(runnableC11348xC);
    }

    public final boolean n() {
        if (this.l == null || this.i.b()) {
            return false;
        }
        if (this.C) {
            return true;
        }
        boolean z = !(this.w > 0.0f);
        Tab tab = this.A;
        Q50 y = tab != null ? tab.y() : null;
        if (y == null) {
            return z;
        }
        for (int i = 0; i < y.getChildCount(); i++) {
            View childAt = y.getChildAt(i);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && 48 == (((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity & 112)) {
                return true;
            }
        }
        return z;
    }

    public static void c(CC cc, int i, int i2, int i3, int i4, int i5) {
        if (cc.C) {
            ValueAnimator valueAnimator = cc.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            cc.C = false;
        }
        Tab tab = cc.A;
        if (C8693pT2.W0(tab) || tab.isNativePage()) {
            cc.p(false);
        } else {
            cc.q(false, i, i2, i3, i4, i5);
        }
        if (AbstractC8604pB3.a <= 0) {
            return;
        }
        AbstractC8604pB3.c = true;
    }

    public final void h() {
        if (this.C) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.C = false;
        }
        Tab tab = this.A;
        C3223Yu3 V0 = tab != null ? C3223Yu3.V0(tab) : null;
        if (V0 != null && V0.l && tab != null && !tab.isNativePage()) {
            q(false, V0.g, V0.h, V0.i, V0.j, V0.k);
        } else {
            p(false);
        }
        if (tab == null || C3093Xu3.a(tab) == null) {
            return;
        }
        C3093Xu3.a(tab).e();
    }

    public final void p(boolean z) {
        if (!z) {
            q(true, 0, 0, this.m, this.n, this.p);
            return;
        }
        if (this.B != null) {
            return;
        }
        this.C = true;
        float f = this.w;
        final int i = this.m;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.r, 0);
        this.B = ofInt;
        ofInt.setDuration(Math.abs(f * 200.0f));
        this.B.addListener(new AC(this, i));
        this.B.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tC
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                CC cc = CC.this;
                cc.getClass();
                cc.q(false, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, i2, cc.n, cc.p);
            }
        });
        this.B.start();
    }

    public final void i(final int i, final int i2) {
        if (this.B != null) {
            return;
        }
        this.C = true;
        final int i3 = this.m;
        final int i4 = this.n;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wC
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CC cc = CC.this;
                cc.getClass();
                float floatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * (i4 - r1)) + i2;
                int i5 = i;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = (floatValue2 * (r4 - i5)) + i5;
                cc.q(false, (int) (f - i3), cc.e(), (int) f, (int) floatValue, cc.v);
            }
        });
        this.B.setDuration(200L);
        this.B.addListener(new BC(this));
        this.B.start();
    }

    public final void q(boolean z, int i, int i2, int i3, int i4, int i5) {
        if (VrModuleProvider.b().a()) {
            VrModuleProvider.b().I();
            l(-this.m, this.o, 0, 0, 0);
        } else if (z) {
            m();
        } else {
            l(i, i2, i3, i4, i5);
        }
    }

    @Override // defpackage.Li4
    public final void b() {
        h();
    }

    @Override // defpackage.Li4
    public final void a() {
        h();
        p(false);
    }
}

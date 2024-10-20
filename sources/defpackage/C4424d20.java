package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.provider.Settings;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4424d20 extends Animator {
    public static float s = 1.0f;
    public final WeakReference a;
    public long k;
    public float l;
    public InterfaceC0079Ap3 m;
    public InterfaceC0079Ap3 n;
    public long o;
    public long p;
    public boolean r;
    public final C12157za2 g = new C12157za2();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public int q = 3;
    public TimeInterpolator j = AbstractC8142nr1.a;

    public static C4424d20 c(V10 v10, float f, float f2, long j, InterfaceC4080c20 interfaceC4080c20) {
        C4424d20 c4424d20 = new C4424d20(v10);
        Y10 y10 = new Y10(f);
        Z10 z10 = new Z10(f2);
        c4424d20.m = y10;
        c4424d20.n = z10;
        if (interfaceC4080c20 != null) {
            c4424d20.a(interfaceC4080c20);
        }
        if (j < 0) {
            j = 0;
        }
        c4424d20.o = j;
        return c4424d20;
    }

    public static C4424d20 d(V10 v10, final InterfaceC7041kf4 interfaceC7041kf4, final AbstractC5239fQ0 abstractC5239fQ0, float f, float f2, long j) {
        DecelerateInterpolator decelerateInterpolator = AbstractC8142nr1.a;
        C4424d20 c4424d20 = new C4424d20(v10);
        Y10 y10 = new Y10(f);
        Z10 z10 = new Z10(f2);
        c4424d20.m = y10;
        c4424d20.n = z10;
        if (j < 0) {
            j = 0;
        }
        c4424d20.o = j;
        c4424d20.a(new InterfaceC4080c20() { // from class: a20
            @Override // defpackage.InterfaceC4080c20
            public final void a(C4424d20 c4424d202) {
                AbstractC5239fQ0.this.b(interfaceC7041kf4, c4424d202.b());
            }
        });
        c4424d20.j = decelerateInterpolator;
        return c4424d20;
    }

    public static C4424d20 g(V10 v10, final PropertyModel propertyModel, final MD2 md2, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32, long j, Interpolator interpolator) {
        C4424d20 c4424d20 = new C4424d20(v10);
        c4424d20.m = interfaceC0079Ap3;
        c4424d20.n = interfaceC0079Ap32;
        if (j < 0) {
            j = 0;
        }
        c4424d20.o = j;
        c4424d20.a(new InterfaceC4080c20() { // from class: b20
            @Override // defpackage.InterfaceC4080c20
            public final void a(C4424d20 c4424d202) {
                PropertyModel.this.l(md2, c4424d202.b());
            }
        });
        c4424d20.j = interpolator;
        return c4424d20;
    }

    public static C4424d20 f(V10 v10, PropertyModel propertyModel, MD2 md2, final float f, final float f2, long j, Interpolator interpolator) {
        return g(v10, propertyModel, md2, new InterfaceC0079Ap3() { // from class: W10
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Float.valueOf(f);
            }
        }, new InterfaceC0079Ap3() { // from class: X10
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Float.valueOf(f2);
            }
        }, j, interpolator);
    }

    public static C4424d20 e(V10 v10, PropertyModel propertyModel, MD2 md2, float f, float f2, long j) {
        return f(v10, propertyModel, md2, f, f2, j, AbstractC8142nr1.a);
    }

    public C4424d20(V10 v10) {
        this.a = new WeakReference(v10);
        Y10 y10 = new Y10(0.0f);
        Z10 z10 = new Z10(1.0f);
        this.m = y10;
        this.n = z10;
        float f = Settings.Global.getFloat(V60.a.getContentResolver(), "animator_duration_scale", s);
        s = f;
        if (f != 1.0f) {
            AbstractC4851eH1.d("CompositorAnimator", "Settings.Global.ANIMATOR_DURATION_SCALE = %f", Float.valueOf(f));
        }
    }

    public final void a(InterfaceC4080c20 interfaceC4080c20) {
        this.h.add(interfaceC4080c20);
    }

    public final float b() {
        return ((((Float) this.n.get()).floatValue() - ((Float) this.m.get()).floatValue()) * this.l) + ((Float) this.m.get()).floatValue();
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.g.a(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.g.d(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.g.clear();
        this.h.clear();
    }

    @Override // android.animation.Animator
    public final void start() {
        if (this.q != 3) {
            return;
        }
        super.start();
        this.q = 1;
        this.r = false;
        V10 v10 = (V10) this.a.get();
        if (v10 != null) {
            ArrayList arrayList = v10.a;
            if (arrayList.size() <= 0) {
                v10.e = System.currentTimeMillis();
            }
            addListener(new U10(v10, this));
            arrayList.add(this);
            if (!v10.d) {
                v10.b.run();
                v10.d = true;
            }
        }
        this.k = 0L;
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((Animator.AnimatorListener) c11814ya2.next()).onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public final void cancel() {
        if (this.q == 3) {
            return;
        }
        this.q = 2;
        super.cancel();
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                end();
                return;
            }
            ((Animator.AnimatorListener) c11814ya2.next()).onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public final void end() {
        if (this.q == 3) {
            return;
        }
        super.end();
        boolean z = this.q == 2;
        this.q = 3;
        if (!this.r && !z) {
            this.l = 1.0f;
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC4080c20) it.next()).a(this);
            }
        }
        Iterator it2 = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it2;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((Animator.AnimatorListener) c11814ya2.next()).onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.p;
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        if (j < 0) {
            j = 0;
        }
        this.p = j;
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        if (j < 0) {
            j = 0;
        }
        this.o = j;
        return this;
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.o;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.j = timeInterpolator;
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.q == 1;
    }
}

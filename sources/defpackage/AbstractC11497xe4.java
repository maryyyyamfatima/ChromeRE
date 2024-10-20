package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xe4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11497xe4 {
    public int a;
    public int g;
    public Context h;
    public ViewGroup i;
    public C9537rv0 j;
    public C10811ve4 k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public ViewTreeObserverOnDrawListenerC11154we4 p;

    public void h() {
    }

    public boolean i() {
        return !(this instanceof C6859k70);
    }

    public boolean j() {
        return !(this instanceof C4116c80);
    }

    public AbstractC11497xe4(int i, int i2, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        this.a = i;
        this.g = i2;
        this.h = context;
        this.i = viewGroup;
        this.j = c9537rv0;
    }

    public final void d() {
        if (this.l != null) {
            return;
        }
        this.l = LayoutInflater.from(this.h).inflate(this.a, this.i, false);
        h();
        if (this.k == null) {
            this.k = new C10811ve4(this, this.l.findViewById(this.g));
        }
        C9537rv0 c9537rv0 = this.j;
        if (c9537rv0 != null) {
            c9537rv0.d(this.g, this.k);
        }
        this.m = true;
    }

    public void e(boolean z) {
        C10811ve4 c10811ve4;
        if (this.l == null) {
            d();
        }
        this.n = true;
        if (!this.o && i() && !this.o) {
            this.i.addView(this.l);
            this.o = true;
            if (this.p == null) {
                this.p = new ViewTreeObserverOnDrawListenerC11154we4(this);
                this.l.getViewTreeObserver().addOnDrawListener(this.p);
            }
        }
        if (this.o) {
            if (z || this.m) {
                int c = c();
                int size = View.MeasureSpec.getMode(c) == 1073741824 ? View.MeasureSpec.getSize(c) : -2;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                int size2 = View.MeasureSpec.getMode(makeMeasureSpec) == 1073741824 ? View.MeasureSpec.getSize(makeMeasureSpec) : -2;
                ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
                layoutParams.width = size;
                layoutParams.height = size2;
                this.l.setLayoutParams(layoutParams);
            }
        } else {
            f();
            if (this.n && this.l != null && (c10811ve4 = this.k) != null) {
                this.n = false;
                c10811ve4.f(null);
            }
        }
        this.m = false;
    }

    public void a() {
        if (this.l == null) {
            return;
        }
        C9537rv0 c9537rv0 = this.j;
        if (c9537rv0 != null) {
            c9537rv0.e(this.g);
        }
        this.k = null;
        this.l.post(new Runnable() { // from class: ue4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11497xe4 abstractC11497xe4 = AbstractC11497xe4.this;
                abstractC11497xe4.b();
                abstractC11497xe4.l = null;
                abstractC11497xe4.i = null;
            }
        });
        this.a = -1;
        this.g = -1;
        this.h = null;
        this.j = null;
    }

    public final void f() {
        this.l.measure(c(), View.MeasureSpec.makeMeasureSpec(0, 0));
        View view = this.l;
        view.layout(0, 0, view.getMeasuredWidth(), this.l.getMeasuredHeight());
    }

    public final void b() {
        if (this.o) {
            if (this.p != null) {
                this.l.getViewTreeObserver().removeOnDrawListener(this.p);
                this.p = null;
            }
            this.i.removeView(this.l);
            this.o = false;
        }
    }

    public int c() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public void g() {
        if (j()) {
            b();
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H91 extends HorizontalScrollView implements InterfaceC4792e61 {
    public final C11703yE1 a;
    public int g;
    public int h;
    public I91 i;
    public AY2 j;
    public C9471rk0 k;
    public C0596Ep0 l;

    public H91(Context context) {
        super(context);
        C11703yE1 c11703yE1 = new C11703yE1(context);
        this.a = c11703yE1;
        addView(c11703yE1);
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        super.fling(i);
        C9471rk0 c9471rk0 = this.k;
        if (c9471rk0 != null) {
            c9471rk0.c = true;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        C9471rk0 c9471rk0 = this.k;
        if (c9471rk0 == null || !c9471rk0.c || c9471rk0.d) {
            return;
        }
        if (!c9471rk0.e) {
            c9471rk0.d = true;
            InterfaceC7687mY2 interfaceC7687mY2 = c9471rk0.a;
            if (interfaceC7687mY2 != null) {
                interfaceC7687mY2.a(this, 1);
            }
            c9471rk0.c = false;
        }
        c9471rk0.e = false;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.i != null) {
            AY2 ay2 = this.j;
            if (ay2 != null) {
                int scrollX = getScrollX();
                int i5 = this.i.a;
                InterfaceC9738sX interfaceC9738sX = ay2.a;
                CommandOuterClass$Command a = ay2.b.a();
                C3184Yn c3184Yn = (C3184Yn) ay2.c;
                C3998bo c3998bo = c3184Yn.v;
                AbstractC5771gx0 abstractC5771gx0 = c3184Yn.r;
                C2842Vw2 c2842Vw2 = (C2842Vw2) C2972Ww2.m.j();
                float f = scrollX / ay2.d;
                if (c2842Vw2.h) {
                    c2842Vw2.l();
                    c2842Vw2.h = false;
                }
                C2972Ww2 c2972Ww2 = (C2972Ww2) c2842Vw2.g;
                c2972Ww2.j |= 1;
                c2972Ww2.k = f;
                DY2.a(this, interfaceC9738sX, a, c3998bo, abstractC5771gx0, (C2972Ww2) c2842Vw2.j());
            }
            this.i.a = getScrollX();
        }
        C9471rk0 c9471rk0 = this.k;
        if (c9471rk0 != null) {
            if (!c9471rk0.b && !c9471rk0.d) {
                c9471rk0.b = true;
                InterfaceC7687mY2 interfaceC7687mY2 = c9471rk0.a;
                if (interfaceC7687mY2 != null) {
                    interfaceC7687mY2.a(this, 0);
                }
            }
            c9471rk0.e = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C6206iD0 c6206iD0;
        C0596Ep0 c0596Ep0 = this.l;
        if (c0596Ep0 != null && (c6206iD0 = c0596Ep0.a) != null) {
            AbstractC4830eD0.a(c6206iD0, this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        C9471rk0 c9471rk0 = this.k;
        if (c9471rk0 != null) {
            c9471rk0.getClass();
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C9471rk0 c9471rk0 = this.k;
        if (c9471rk0 != null) {
            c9471rk0.a(this, motionEvent);
        }
        return onTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.g, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // defpackage.InterfaceC4792e61
    public final void a(ArrayList arrayList) {
        arrayList.add(this.a);
    }

    @Override // defpackage.InterfaceC4105c61
    public final C0596Ep0 b() {
        return this.l;
    }

    @Override // defpackage.InterfaceC4105c61
    public final void c(C0596Ep0 c0596Ep0) {
        this.l = c0596Ep0;
    }
}

package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import defpackage.AbstractC4830eD0;
import defpackage.C0596Ep0;
import defpackage.C11703yE1;
import defpackage.C6206iD0;
import defpackage.C9471rk0;
import defpackage.InterfaceC4792e61;
import defpackage.InterfaceC7687mY2;
import defpackage.P84;
import defpackage.ViewTreeObserverOnPreDrawListenerC9988tE1;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LithoScrollView extends NestedScrollView implements InterfaceC4792e61 {

    /* renamed from: J, reason: collision with root package name */
    public final C11703yE1 f11495J;
    public P84 K;
    public ViewTreeObserverOnPreDrawListenerC9988tE1 L;
    public C0596Ep0 M;
    public C9471rk0 N;
    public boolean O;

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C11703yE1 c11703yE1 = new C11703yE1(context);
        this.f11495J = c11703yE1;
        addView(c11703yE1);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = super.onInterceptTouchEvent(motionEvent);
        C9471rk0 c9471rk0 = this.N;
        if (c9471rk0 != null) {
            c9471rk0.getClass();
        }
        return z;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void n(int i) {
        super.n(i);
        C9471rk0 c9471rk0 = this.N;
        if (c9471rk0 != null) {
            c9471rk0.c = true;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        C9471rk0 c9471rk0 = this.N;
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

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.O) {
            this.f11495J.x();
        }
        P84 p84 = this.K;
        if (p84 != null) {
            p84.a = getScrollY();
        }
        C9471rk0 c9471rk0 = this.N;
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
        C0596Ep0 c0596Ep0 = this.M;
        if (c0596Ep0 != null && (c6206iD0 = c0596Ep0.a) != null) {
            AbstractC4830eD0.a(c6206iD0, this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C9471rk0 c9471rk0 = this.N;
        if (c9471rk0 != null) {
            c9471rk0.a(this, motionEvent);
        }
        return onTouchEvent;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, true);
    }

    @Override // defpackage.InterfaceC4792e61
    public final void a(ArrayList arrayList) {
        arrayList.add(this.f11495J);
    }

    @Override // defpackage.InterfaceC4105c61
    public final C0596Ep0 b() {
        return this.M;
    }

    @Override // defpackage.InterfaceC4105c61
    public final void c(C0596Ep0 c0596Ep0) {
        this.M = c0596Ep0;
    }
}

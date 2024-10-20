package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pe4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC8754pe4 extends LI2 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public final int[] h;
    public final View j;
    public ViewTreeObserver m;
    public boolean n;
    public final Rect i = new Rect();
    public int k = -1;
    public int l = -1;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewTreeObserverOnGlobalLayoutListenerC8754pe4(View view) {
        this.h = r0;
        this.j = view;
        int[] iArr = {-1, -1};
    }

    public final void e(Rect rect) {
        Rect rect2 = this.i;
        if (rect.equals(rect2)) {
            return;
        }
        rect2.set(rect);
        c(true);
    }

    public final void d(boolean z) {
        if (z == this.n) {
            return;
        }
        this.n = z;
        c(true);
    }

    @Override // defpackage.LI2
    public final void a(T8 t8) {
        View view = this.j;
        view.addOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.m = viewTreeObserver;
        viewTreeObserver.addOnGlobalLayoutListener(this);
        this.m.addOnPreDrawListener(this);
        c(false);
        this.g = t8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        T8 t8 = this.g;
        if (t8 != null) {
            t8.b();
        }
    }

    @Override // defpackage.LI2
    public final void b() {
        this.j.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = this.m;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.m.removeOnGlobalLayoutListener(this);
            this.m.removeOnPreDrawListener(this);
        }
        this.m = null;
        this.g = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        T8 t8;
        if (this.j.isShown() || (t8 = this.g) == null) {
            return;
        }
        t8.b();
    }

    public boolean onPreDraw() {
        if (!this.j.isShown()) {
            T8 t8 = this.g;
            if (t8 == null) {
                return true;
            }
            t8.b();
            return true;
        }
        c(false);
        return true;
    }

    public final void c(boolean z) {
        int paddingStart;
        int paddingEnd;
        int[] iArr = this.h;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = this.k;
        int i4 = this.l;
        View view = this.j;
        view.getLocationInWindow(iArr);
        iArr[0] = Math.max(iArr[0], 0);
        iArr[1] = Math.max(iArr[1], 0);
        this.k = view.getWidth();
        int height = view.getHeight();
        this.l = height;
        if (!z && iArr[0] == i && iArr[1] == i2 && this.k == i3 && height == i4) {
            return;
        }
        int i5 = iArr[0];
        Rect rect = this.a;
        rect.left = i5;
        rect.top = iArr[1];
        rect.right = view.getWidth() + i5;
        int height2 = view.getHeight() + rect.top;
        rect.bottom = height2;
        int i6 = rect.left;
        Rect rect2 = this.i;
        rect.left = i6 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom = height2 - rect2.bottom;
        if (!this.n) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i7 = rect.left;
            WeakHashMap weakHashMap = Ec4.a;
            if (!z2) {
                paddingStart = view.getPaddingStart();
            } else {
                paddingStart = view.getPaddingEnd();
            }
            rect.left = i7 + paddingStart;
            int i8 = rect.right;
            if (z2) {
                paddingEnd = view.getPaddingStart();
            } else {
                paddingEnd = view.getPaddingEnd();
            }
            rect.right = i8 - paddingEnd;
            rect.top = view.getPaddingTop() + rect.top;
            rect.bottom -= view.getPaddingBottom();
        }
        rect.right = Math.max(rect.left, rect.right);
        rect.bottom = Math.max(rect.top, rect.bottom);
        rect.right = Math.min(rect.right, view.getRootView().getWidth());
        rect.bottom = Math.min(rect.bottom, view.getRootView().getHeight());
        T8 t8 = this.g;
        if (t8 != null) {
            t8.f();
        }
    }
}

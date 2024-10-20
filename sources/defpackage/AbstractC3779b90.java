package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3779b90 {
    public boolean a(View view, Rect rect) {
        return false;
    }

    public boolean b(View view) {
        return false;
    }

    public void c(C5153f90 c5153f90) {
    }

    public void d(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void e(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public abstract boolean g(CoordinatorLayout coordinatorLayout, View view, int i);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public void i(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public void l(View view, Parcelable parcelable) {
    }

    public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public AbstractC3779b90() {
    }

    public AbstractC3779b90(int i) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int[] iArr) {
        iArr[0] = iArr[0] + i;
        iArr[1] = iArr[1] + i2;
    }

    public Parcelable m(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }
}

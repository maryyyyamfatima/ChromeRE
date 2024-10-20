package org.chromium.components.browser_ui.bottomsheet;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import defpackage.C11939yv1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class b implements View.OnLayoutChangeListener {
    public int a;
    public final /* synthetic */ Window g;
    public final /* synthetic */ C11939yv1 h;
    public final /* synthetic */ BottomSheet i;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C11939yv1 c11939yv1;
        BottomSheet bottomSheet = this.i;
        int i9 = bottomSheet.n;
        int i10 = bottomSheet.o;
        int i11 = i3 - i;
        bottomSheet.n = i11;
        int i12 = i4 - i2;
        bottomSheet.o = i12;
        if (i9 != i11 || i10 != i12) {
            if (!bottomSheet.o()) {
                int i13 = bottomSheet.r;
                if (i13 == 2) {
                    bottomSheet.t(3, 0, false);
                } else if (i13 == 4 && bottomSheet.s == 2) {
                    bottomSheet.s = 3;
                }
            }
            bottomSheet.p = -1.0f;
            bottomSheet.w();
        }
        Window window = this.g;
        View decorView = window.getDecorView();
        Rect rect = bottomSheet.h;
        decorView.getWindowVisibleDisplayFrame(rect);
        int min = bottomSheet.z ? bottomSheet.o - Math.min(window.getDecorView().getHeight(), rect.height()) : 0;
        if (min != this.a) {
            TouchRestrictingFrameLayout touchRestrictingFrameLayout = bottomSheet.v;
            touchRestrictingFrameLayout.setPadding(touchRestrictingFrameLayout.getPaddingLeft(), bottomSheet.v.getPaddingTop(), bottomSheet.v.getPaddingRight(), min);
        }
        if (i10 != bottomSheet.o || this.a != min) {
            if (bottomSheet.l.d && (c11939yv1 = this.h) != null) {
                c11939yv1.d(bottomSheet);
            } else if (bottomSheet.s != -1) {
                bottomSheet.a();
                bottomSheet.b(bottomSheet.s, 0);
            } else {
                ValueAnimator valueAnimator = bottomSheet.m;
                if (valueAnimator != null) {
                    valueAnimator.end();
                }
                bottomSheet.m = null;
                bottomSheet.t(bottomSheet.r, 0, false);
            }
        }
        this.a = min;
    }

    public b(BottomSheet bottomSheet, Window window, C11939yv1 c11939yv1) {
        this.i = bottomSheet;
        this.g = window;
        this.h = c11939yv1;
    }
}

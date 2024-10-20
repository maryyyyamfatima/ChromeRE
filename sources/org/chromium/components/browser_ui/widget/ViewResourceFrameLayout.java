package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import defpackage.ViewOnLayoutChangeListenerC10125te4;
import org.chromium.ui.widget.OptimizedFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ViewResourceFrameLayout extends OptimizedFrameLayout {
    public ViewOnLayoutChangeListenerC10125te4 g;
    public Rect h;

    public boolean e() {
        return true;
    }

    public ViewResourceFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = c();
    }

    public ViewOnLayoutChangeListenerC10125te4 c() {
        return new ViewOnLayoutChangeListenerC10125te4(this, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (e()) {
            if (this.h == null) {
                this.h = new Rect();
            }
            int floor = (int) Math.floor(view.getX());
            int floor2 = (int) Math.floor(view.getY());
            this.h.set(floor, floor2, view.getWidth() + floor, view.getHeight() + floor2);
            this.g.f(this.h);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        ViewParent invalidateChildInParent = super.invalidateChildInParent(iArr, rect);
        if (e()) {
            this.g.f(rect);
        }
        return invalidateChildInParent;
    }
}

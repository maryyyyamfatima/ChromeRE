package org.chromium.chrome.browser.download.home.list.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import defpackage.AbstractC8540p04;
import defpackage.C9146qn;
import defpackage.JG2;
import defpackage.ViewOnAttachStateChangeListenerC6281iS0;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CircularProgressView extends ChromeImageButton {
    public final Drawable i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final Drawable m;
    public final ViewOnAttachStateChangeListenerC6281iS0 n;

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewOnAttachStateChangeListenerC6281iS0 viewOnAttachStateChangeListenerC6281iS0 = new ViewOnAttachStateChangeListenerC6281iS0(this);
        this.n = viewOnAttachStateChangeListenerC6281iS0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (viewOnAttachStateChangeListenerC6281iS0.l != scaleType) {
            viewOnAttachStateChangeListenerC6281iS0.l = scaleType;
            viewOnAttachStateChangeListenerC6281iS0.j = true;
            if (viewOnAttachStateChangeListenerC6281iS0.k != null) {
                viewOnAttachStateChangeListenerC6281iS0.i.invalidate();
            }
        }
        TypedArray obtainStyledAttributes = attributeSet == null ? null : context.obtainStyledAttributes(attributeSet, JG2.E, 0, 0);
        this.i = C9146qn.b(AbstractC8540p04.d(context, obtainStyledAttributes, 1));
        this.j = C9146qn.b(AbstractC8540p04.d(context, obtainStyledAttributes, 0));
        this.k = AbstractC8540p04.d(context, obtainStyledAttributes, 3);
        this.l = AbstractC8540p04.d(context, obtainStyledAttributes, 2);
        this.m = AbstractC8540p04.d(context, obtainStyledAttributes, 4);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        this.n.a(canvas);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.n.b(view, i);
    }

    @Override // org.chromium.ui.widget.ChromeImageButton, defpackage.C1844Of, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ViewOnAttachStateChangeListenerC6281iS0 viewOnAttachStateChangeListenerC6281iS0 = this.n;
        Drawable drawable = viewOnAttachStateChangeListenerC6281iS0.k;
        if (drawable == null) {
            return;
        }
        View view = viewOnAttachStateChangeListenerC6281iS0.i;
        if (drawable.setState(view.getDrawableState())) {
            view.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            boolean r0 = super.verifyDrawable(r4)
            r1 = 1
            if (r0 != 0) goto L1a
            r0 = 0
            iS0 r2 = r3.n
            if (r4 == 0) goto L12
            android.graphics.drawable.Drawable r2 = r2.k
            if (r2 != r4) goto L15
            r4 = r1
            goto L16
        L12:
            r2.getClass()
        L15:
            r4 = r0
        L16:
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r1 = r0
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.download.home.list.view.CircularProgressView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}

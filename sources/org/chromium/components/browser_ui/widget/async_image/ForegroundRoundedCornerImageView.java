package org.chromium.components.browser_ui.widget.async_image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.AbstractC8540p04;
import defpackage.C9146qn;
import defpackage.JG2;
import defpackage.ViewOnAttachStateChangeListenerC6281iS0;
import org.chromium.components.browser_ui.widget.RoundedCornerImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ForegroundRoundedCornerImageView extends RoundedCornerImageView {
    public final ViewOnAttachStateChangeListenerC6281iS0 q;

    public ForegroundRoundedCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundRoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        ViewOnAttachStateChangeListenerC6281iS0 viewOnAttachStateChangeListenerC6281iS0 = new ViewOnAttachStateChangeListenerC6281iS0(this);
        this.q = viewOnAttachStateChangeListenerC6281iS0;
        TypedArray obtainStyledAttributes = attributeSet == null ? null : context.obtainStyledAttributes(attributeSet, JG2.S, 0, 0);
        viewOnAttachStateChangeListenerC6281iS0.c(C9146qn.b(AbstractC8540p04.d(context, obtainStyledAttributes, 0)));
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        this.q.a(canvas);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.q.b(view, i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ViewOnAttachStateChangeListenerC6281iS0 viewOnAttachStateChangeListenerC6281iS0 = this.q;
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
            iS0 r2 = r3.q
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
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.widget.async_image.ForegroundRoundedCornerImageView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}

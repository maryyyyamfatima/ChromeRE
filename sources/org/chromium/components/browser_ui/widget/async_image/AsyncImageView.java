package org.chromium.components.browser_ui.widget.async_image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.AbstractC8540p04;
import defpackage.C6161i50;
import defpackage.C9146qn;
import defpackage.C9762sb2;
import defpackage.InterfaceC3980bl;
import defpackage.JG2;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.async_image.AsyncImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AsyncImageView extends ForegroundRoundedCornerImageView {
    public Drawable r;
    public Drawable s;
    public InterfaceC3980bl t;
    public C9762sb2 u;
    public Runnable v;
    public boolean w;
    public Object x;

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = attributeSet == null ? null : context.obtainStyledAttributes(attributeSet, JG2.q, 0, 0);
        this.r = C9146qn.b(AbstractC8540p04.d(context, obtainStyledAttributes, 0));
        this.s = C9146qn.b(AbstractC8540p04.d(context, obtainStyledAttributes, 1));
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    public final void f(InterfaceC3980bl interfaceC3980bl, C6161i50 c6161i50) {
        Object obj = this.x;
        if (obj == null || c6161i50 == null || !obj.equals(c6161i50)) {
            setImageDrawable(null);
            this.q.c(this.s);
            this.x = c6161i50;
            this.t = interfaceC3980bl;
            d();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        C9762sb2 c9762sb2;
        super.onSizeChanged(i, i2, i3, i4);
        if ((i == i3 && i2 == i4) || (c9762sb2 = this.u) == null) {
            return;
        }
        c9762sb2.a(getDrawable());
    }

    @Override // org.chromium.components.browser_ui.widget.RoundedCornerImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        this.t = null;
        this.x = null;
        if (this.w) {
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
            this.v = null;
            this.w = false;
        }
        C9762sb2 c9762sb2 = this.u;
        if (c9762sb2 != null) {
            c9762sb2.a(drawable);
        }
        this.q.c(null);
        super.setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [al] */
    public final void d() {
        InterfaceC3980bl interfaceC3980bl;
        if (getWidth() <= 0 || getHeight() <= 0 || (interfaceC3980bl = this.t) == 0) {
            return;
        }
        this.w = true;
        final Object obj = this.x;
        this.v = interfaceC3980bl.a(getWidth(), getHeight(), new Callback() { // from class: al
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Drawable drawable = (Drawable) obj2;
                AsyncImageView asyncImageView = AsyncImageView.this;
                Object obj3 = asyncImageView.x;
                Object obj4 = obj;
                if (obj3 == obj4 && asyncImageView.w) {
                    asyncImageView.v = null;
                    asyncImageView.w = false;
                    asyncImageView.setImageDrawable(drawable);
                    asyncImageView.x = obj4;
                    asyncImageView.q.c(drawable == null ? asyncImageView.r : null);
                }
            }
        });
        if (!this.w) {
            this.v = null;
        }
        this.t = null;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pf */
/* loaded from: classes.dex */
public final class C1974Pf {
    public final ImageView a;
    public int b = 0;

    public C1974Pf(ImageView imageView) {
        this.a = imageView;
    }

    public final void b(AttributeSet attributeSet, int i) {
        int i2;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = JG2.k;
        IN3 m = IN3.m(context, attributeSet, iArr, i);
        Ec4.l(imageView, imageView.getContext(), iArr, attributeSet, m.b, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (i2 = m.i(1, -1)) != -1 && (drawable = AbstractC2884Wf.a(imageView.getContext(), i2)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC3085Xt0.a(drawable);
            }
            if (m.l(2)) {
                imageView.setImageTintList(m.b(2));
            }
            if (m.l(3)) {
                imageView.setImageTintMode(AbstractC3085Xt0.c(m.h(3, -1), null));
            }
        } finally {
            m.n();
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable a = AbstractC2884Wf.a(imageView.getContext(), i);
            if (a != null) {
                AbstractC3085Xt0.a(a);
            }
            imageView.setImageDrawable(a);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public final void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            AbstractC3085Xt0.a(drawable);
        }
    }
}

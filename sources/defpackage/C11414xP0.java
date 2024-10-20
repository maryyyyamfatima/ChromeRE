package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.elements.abstractdataimpl.fbs.ImageProxyImplFbs;
import com.google.android.libraries.elements.interfaces.ImageProxy;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xP0 */
/* loaded from: classes.dex */
public final class C11414xP0 extends AbstractC5663gf0 {
    public final ImageProxy i;
    public final InterfaceC1655Mt0 j;
    public final ImageView.ScaleType k;
    public final AbstractC9896sy0 l;

    @Override // defpackage.TE3
    public final void d(Object obj, OV3 ov3) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            ImageView.ScaleType scaleType2 = this.k;
            if (scaleType2 == scaleType) {
                scaleType2 = ImageView.ScaleType.FIT_CENTER;
            }
            drawable = new C9553ry0(((BitmapDrawable) drawable).getBitmap(), scaleType2, this.l);
        }
        Drawable e = AbstractC3286Zh1.e(drawable, this.i);
        C6386il0 c6386il0 = (C6386il0) this.j;
        c6386il0.i = e;
        c6386il0.invalidateSelf();
    }

    public C11414xP0(ImageProxyImplFbs imageProxyImplFbs, C6386il0 c6386il0, int i, int i2, ImageView.ScaleType scaleType, AbstractC9896sy0 abstractC9896sy0) {
        super(i, i2);
        this.i = imageProxyImplFbs;
        this.j = c6386il0;
        this.k = scaleType;
        this.l = abstractC9896sy0;
    }

    @Override // defpackage.TE3
    public final void m(Drawable drawable) {
        if (drawable != null) {
            C6386il0 c6386il0 = (C6386il0) this.j;
            c6386il0.i = drawable;
            c6386il0.invalidateSelf();
        }
    }

    @Override // defpackage.AbstractC5663gf0, defpackage.TE3
    public final void i(Drawable drawable) {
        if (drawable != null) {
            C6386il0 c6386il0 = (C6386il0) this.j;
            c6386il0.i = drawable;
            c6386il0.invalidateSelf();
        }
    }
}

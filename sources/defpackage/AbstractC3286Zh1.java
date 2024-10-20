package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.google.android.libraries.elements.abstractdataimpl.fbs.ImageProxyImplFbs;
import com.google.android.libraries.elements.interfaces.ContentMode;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zh1 */
/* loaded from: classes.dex */
public abstract class AbstractC3286Zh1 {
    public static ImageView.ScaleType b(ContentMode contentMode) {
        int i = AbstractC3156Yh1.a[contentMode.ordinal()];
        if (i == 1) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        if (i == 2) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i == 3) {
            return ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static IN2 a(Context context, ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3, int i, int i2, boolean z) {
        AbstractC7809mt0 abstractC7809mt0;
        ImageSourceProxy imageSourceProxy;
        IN2 in2 = null;
        if (d(context)) {
            return null;
        }
        IN2 q = (!imageProxy.sources().isEmpty() || ((ImageProxyImplFbs) imageProxy).getProcessor() == null) ? null : a.d(context).q(new BitmapDrawable(context.getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
        if (q == null) {
            if (imageProxy.sources().isEmpty()) {
                imageSourceProxy = null;
            } else {
                Iterator it = imageProxy.sources().iterator();
                imageSourceProxy = null;
                int i3 = 0;
                while (it.hasNext()) {
                    ImageSourceProxy imageSourceProxy2 = (ImageSourceProxy) it.next();
                    if (imageSourceProxy2 != null) {
                        int width = i - ((int) imageSourceProxy2.width());
                        int height = i2 - ((int) imageSourceProxy2.height());
                        int i4 = (height * height) + (width * width);
                        if (imageSourceProxy == null || i4 < i3) {
                            imageSourceProxy = imageSourceProxy2;
                            i3 = i4;
                        }
                    }
                }
            }
            q = (imageSourceProxy == null || TextUtils.isEmpty(imageSourceProxy.url())) ? null : a.d(context).j().K(c(imageSourceProxy.url()));
        }
        if (q == null) {
            int a = AbstractC2175Qt0.a(context, imageProxy);
            q = a == 0 ? null : a.d(context).s(Integer.valueOf(a));
        }
        if (q == null) {
            AbstractC9095qe2 a2 = AbstractC1851Og1.a(imageProxy);
            if (a2.c()) {
                in2 = a.d(context).t((byte[]) a2.b());
            }
        } else {
            in2 = q;
        }
        if (in2 == null) {
            if (imageProxy3 == null) {
                return in2;
            }
            in2 = a.d(context).p();
        }
        if (imageProxy.contentMode() != ContentMode.CONTENT_MODE_CENTER) {
            if (AbstractC3156Yh1.a[imageProxy.contentMode().ordinal()] == 1) {
                abstractC7809mt0 = AbstractC7809mt0.b;
            } else {
                abstractC7809mt0 = AbstractC7809mt0.c;
            }
            in2.f(abstractC7809mt0);
        } else {
            if (!z) {
                in2.e(AbstractC6410ip0.b);
            }
            in2.p(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        if (imageProxy2 != null) {
            int a3 = AbstractC2175Qt0.a(context, imageProxy2);
            if (a3 != 0) {
                in2.q(a3);
            } else {
                AbstractC9095qe2 a4 = AbstractC1851Og1.a(imageProxy2);
                if (a4.c()) {
                    byte[] bArr = (byte[]) a4.b();
                    in2.r(new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
            }
        }
        if (imageProxy3 != null) {
            int a5 = AbstractC2175Qt0.a(context, imageProxy3);
            if (a5 != 0) {
                in2.g(a5);
            } else {
                AbstractC9095qe2 a6 = AbstractC1851Og1.a(imageProxy3);
                if (a6.c()) {
                    byte[] bArr2 = (byte[]) a6.b();
                    in2.h(new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length)));
                }
            }
        }
        return in2;
    }

    public static Uri c(String str) {
        Uri parse = Uri.parse(str);
        return AbstractC2442Su2.a(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : parse;
    }

    public static Drawable e(Drawable drawable, ImageProxy imageProxy) {
        if (!imageProxy.sources().isEmpty()) {
            if (((ImageSourceProxy) imageProxy.sources().get(0)).clientResource() != null && ((ImageSourceProxy) imageProxy.sources().get(0)).clientResource().imageColor() != 0) {
                drawable.setColorFilter(((ImageSourceProxy) imageProxy.sources().get(0)).clientResource() != null ? (int) ((ImageSourceProxy) imageProxy.sources().get(0)).clientResource().imageColor() : 0, PorterDuff.Mode.SRC_IN);
            }
        }
        return drawable;
    }

    public static boolean d(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        return (context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null && d(baseContext);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lh1 */
/* loaded from: classes.dex */
public final class C1467Lh1 extends AbstractC11937yv {
    public J74 A;
    public final C3356Zv1 w;
    public final Rect x;
    public final Rect y;
    public J74 z;

    public C1467Lh1(JJ1 jj1, C2456Sx1 c2456Sx1) {
        super(jj1, c2456Sx1);
        this.w = new C3356Zv1(3);
        this.x = new Rect();
        this.y = new Rect();
    }

    @Override // defpackage.AbstractC11937yv
    public final void k(Canvas canvas, Matrix matrix, int i) {
        Bitmap q = q();
        if (q == null || q.isRecycled()) {
            return;
        }
        float c = C74.c();
        C3356Zv1 c3356Zv1 = this.w;
        c3356Zv1.setAlpha(i);
        J74 j74 = this.z;
        if (j74 != null) {
            c3356Zv1.setColorFilter((ColorFilter) j74.f());
        }
        canvas.save();
        canvas.concat(matrix);
        int width = q.getWidth();
        int height = q.getHeight();
        Rect rect = this.x;
        rect.set(0, 0, width, height);
        int width2 = (int) (q.getWidth() * c);
        int height2 = (int) (q.getHeight() * c);
        Rect rect2 = this.y;
        rect2.set(0, 0, width2, height2);
        canvas.drawBitmap(q, rect, rect2, c3356Zv1);
        canvas.restore();
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        if (q() != null) {
            rectF.set(0.0f, 0.0f, C74.c() * r3.getWidth(), C74.c() * r3.getHeight());
            this.l.mapRect(rectF);
        }
    }

    public final Bitmap q() {
        C1462Lg1 c1462Lg1;
        Bitmap bitmap;
        Bitmap bitmap2;
        J74 j74 = this.A;
        if (j74 != null && (bitmap2 = (Bitmap) j74.f()) != null) {
            return bitmap2;
        }
        String str = this.n.g;
        JJ1 jj1 = this.m;
        if (jj1.getCallback() == null) {
            c1462Lg1 = null;
        } else {
            C1462Lg1 c1462Lg12 = jj1.m;
            if (c1462Lg12 != null) {
                Drawable.Callback callback = jj1.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                Context context2 = c1462Lg12.a;
                if (!((context == null && context2 == null) || context2.equals(context))) {
                    jj1.m = null;
                }
            }
            if (jj1.m == null) {
                jj1.m = new C1462Lg1(jj1.getCallback(), jj1.n, jj1.g.d);
            }
            c1462Lg1 = jj1.m;
        }
        if (c1462Lg1 != null) {
            String str2 = c1462Lg1.b;
            LJ1 lj1 = (LJ1) c1462Lg1.c.get(str);
            if (lj1 == null) {
                return null;
            }
            Bitmap bitmap3 = lj1.d;
            if (bitmap3 != null) {
                return bitmap3;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            String str3 = lj1.c;
            if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
                try {
                    byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    synchronized (C1462Lg1.d) {
                        ((LJ1) c1462Lg1.c.get(str)).d = decodeByteArray;
                    }
                    return decodeByteArray;
                } catch (IllegalArgumentException e) {
                    AbstractC5888hI1.b("data URL did not have correct base64 format.", e);
                    return null;
                }
            }
            try {
                if (TextUtils.isEmpty(str2)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(c1462Lg1.a.getAssets().open(str2 + str3), null, options);
                    int i = lj1.a;
                    int i2 = lj1.b;
                    C11325x74 c11325x74 = C74.a;
                    if (decodeStream.getWidth() == i && decodeStream.getHeight() == i2) {
                        bitmap = decodeStream;
                    } else {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i, i2, true);
                        decodeStream.recycle();
                        bitmap = createScaledBitmap;
                    }
                    synchronized (C1462Lg1.d) {
                        ((LJ1) c1462Lg1.c.get(str)).d = bitmap;
                    }
                    return bitmap;
                } catch (IllegalArgumentException e2) {
                    AbstractC5888hI1.b("Unable to decode image.", e2);
                    return null;
                }
            } catch (IOException e3) {
                AbstractC5888hI1.b("Unable to open asset.", e3);
                return null;
            }
        }
        C8985qJ1 c8985qJ1 = jj1.g;
        LJ1 lj12 = c8985qJ1 == null ? null : (LJ1) c8985qJ1.d.get(str);
        if (lj12 != null) {
            return lj12.d;
        }
        return null;
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        super.f(tj1, obj);
        if (obj == NJ1.E) {
            if (tj1 == null) {
                this.z = null;
                return;
            } else {
                this.z = new J74(tj1, null);
                return;
            }
        }
        if (obj == NJ1.H) {
            if (tj1 == null) {
                this.A = null;
            } else {
                this.A = new J74(tj1, null);
            }
        }
    }
}

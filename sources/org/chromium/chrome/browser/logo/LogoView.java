package org.chromium.chrome.browser.logo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AI1;
import defpackage.BI1;
import defpackage.C0037Ah1;
import defpackage.C11037wI1;
import defpackage.CI1;
import defpackage.EI2;
import defpackage.IG3;
import defpackage.RunnableC4383cv;
import java.lang.ref.WeakReference;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.logo.LogoBridge;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LogoView extends FrameLayout implements View.OnClickListener {
    public static WeakReference u;
    public static int v;
    public Bitmap a;
    public Bitmap g;
    public RunnableC4383cv h;
    public ObjectAnimator i;
    public final Paint j;
    public Matrix k;
    public Matrix l;
    public Matrix m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final LoadingView q;
    public float r;
    public CI1 s;
    public final AI1 t;

    public LogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = true;
        this.t = new AI1(this);
        this.k = new Matrix();
        this.n = true;
        Paint paint = new Paint();
        this.j = paint;
        paint.setFilterBitmap(true);
        setOnClickListener(this);
        setClickable(false);
        setWillNotDraw(false);
        LoadingView loadingView = new LoadingView(getContext());
        this.q = loadingView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        loadingView.setLayoutParams(layoutParams);
        loadingView.setVisibility(8);
        addView(loadingView);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            ObjectAnimator objectAnimator = this.i;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.a = null;
            this.g = null;
            canvas.save();
            canvas.concat(this.m);
            this.h.draw(canvas);
            canvas.restore();
            return;
        }
        Bitmap bitmap = this.a;
        Paint paint = this.j;
        if (bitmap != null) {
            float f = this.r;
            if (f < 0.5f) {
                paint.setAlpha((int) ((0.5f - f) * 510.0f));
                canvas.save();
                canvas.concat(this.k);
                canvas.drawBitmap(this.a, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        if (this.g != null) {
            float f2 = this.r;
            if (f2 > 0.5f) {
                paint.setAlpha((int) ((f2 - 0.5f) * 510.0f));
                canvas.save();
                canvas.concat(this.l);
                canvas.drawBitmap(this.g, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    public final void d(LogoBridge.Logo logo) {
        if (logo == null) {
            if (a()) {
                return;
            }
            this.a = null;
            invalidate();
            return;
        }
        String str = logo.c;
        boolean z = true;
        String string = TextUtils.isEmpty(str) ? null : getResources().getString(R.string.f65900_resource_name_obfuscated_res_0x7f14013a, str);
        if (TextUtils.isEmpty(logo.d) && TextUtils.isEmpty(logo.b)) {
            z = false;
        }
        c(logo.a, string, false, z);
    }

    public final void c(Bitmap bitmap, String str, boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        this.q.c();
        Bitmap bitmap2 = this.a;
        if (bitmap2 == null || !bitmap2.sameAs(bitmap)) {
            this.g = bitmap;
            this.l = new Matrix();
            this.o = z;
            b(this.g.getWidth(), this.g.getHeight(), this.l, this.o);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.t, 0.0f, 1.0f);
            this.i = ofFloat;
            ofFloat.setDuration(this.p ? 400L : 0L);
            this.i.addListener(new BI1(this, str, z2));
            this.i.start();
        }
    }

    public final boolean a() {
        Bitmap bitmap;
        Bitmap decodeResource;
        Context context = getContext();
        if (IG3.a().e()) {
            WeakReference weakReference = u;
            bitmap = weakReference == null ? null : (Bitmap) weakReference.get();
            int color = context.getColor(R.color.f21540_resource_name_obfuscated_res_0x7f070512);
            if (bitmap == null || v != color) {
                Resources resources = context.getResources();
                if (color == 0) {
                    decodeResource = BitmapFactory.decodeResource(resources, R.drawable.f46670_resource_name_obfuscated_res_0x7f0901a1);
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inMutable = true;
                    decodeResource = BitmapFactory.decodeResource(resources, R.drawable.f46670_resource_name_obfuscated_res_0x7f0901a1, options);
                    Paint paint = new Paint();
                    paint.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
                    new Canvas(decodeResource).drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                }
                bitmap = decodeResource;
                u = new WeakReference(bitmap);
                v = color;
            }
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return false;
        }
        c(bitmap, null, true, false);
        return true;
    }

    public final void b(int i, int i2, Matrix matrix, boolean z) {
        float width = getWidth();
        float f = i;
        float height = getHeight();
        float f2 = i2;
        float min = Math.min(width / f, height / f2);
        if (z) {
            min = Math.min(1.0f, min);
        }
        int round = Math.round((width - (f * min)) * 0.5f);
        int round2 = Math.round((height - (f2 * min)) * 0.5f);
        matrix.setScale(min, min);
        matrix.postTranslate(round, round2);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h || super.verifyDrawable(drawable);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.h) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        RunnableC4383cv runnableC4383cv = this.h;
        if (runnableC4383cv != null) {
            b(runnableC4383cv.i, runnableC4383cv.j, this.m, false);
        }
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            b(bitmap.getWidth(), this.a.getHeight(), this.k, this.n);
        }
        Bitmap bitmap2 = this.g;
        if (bitmap2 != null) {
            b(bitmap2.getWidth(), this.g.getHeight(), this.l, this.o);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CI1 ci1;
        if (view != this || (ci1 = this.s) == null) {
            return;
        }
        if (this.r != 0.0f) {
            return;
        }
        boolean z = this.h != null;
        final C11037wI1 c11037wI1 = (C11037wI1) ci1;
        if (c11037wI1.h) {
            return;
        }
        if (!z && c11037wI1.f != null) {
            EI2.m(1, "NewTabPage.LogoClick");
            LogoView logoView = c11037wI1.b;
            logoView.a = null;
            logoView.invalidate();
            logoView.q.e();
            c11037wI1.d.c(C0037Ah1.b(c11037wI1.f, "NewTabPageAnimatedLogo"), new Callback() { // from class: uI1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C5070ev c5070ev = (C5070ev) obj;
                    C11037wI1 c11037wI12 = C11037wI1.this;
                    if (c11037wI12.h || c5070ev == null) {
                        return;
                    }
                    LogoView logoView2 = c11037wI12.b;
                    logoView2.q.c();
                    logoView2.h = new RunnableC4383cv(c5070ev, Bitmap.Config.ARGB_8888);
                    Matrix matrix = new Matrix();
                    logoView2.m = matrix;
                    RunnableC4383cv runnableC4383cv = logoView2.h;
                    logoView2.b(runnableC4383cv.i, runnableC4383cv.j, matrix, false);
                    logoView2.h.setCallback(logoView2);
                    logoView2.h.start();
                }
            });
            return;
        }
        if (c11037wI1.e != null) {
            EI2.m(z ? 2 : 0, "NewTabPage.LogoClick");
            c11037wI1.a.onResult(new LoadUrlParams(c11037wI1.e, 0));
        }
    }
}

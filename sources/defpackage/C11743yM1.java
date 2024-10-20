package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yM1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11743yM1 extends Drawable implements Animatable {
    public static final LinearInterpolator o = new LinearInterpolator();
    public static final HH0 p = new HH0();
    public final ArrayList a = new ArrayList();
    public final C11400xM1 g;
    public float h;
    public final View i;
    public C10371uM1 j;
    public float k;
    public double l;
    public double m;
    public boolean n;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C11743yM1(Context context, View view) {
        C11057wM1 c11057wM1 = new C11057wM1(this);
        this.i = view;
        Resources resources = context.getResources();
        C11400xM1 c11400xM1 = new C11400xM1(c11057wM1);
        this.g = c11400xM1;
        c11400xM1.j = new int[]{-16777216};
        c11400xM1.b(0);
        float f = resources.getDisplayMetrics().density;
        double d = f;
        double d2 = 40.0d * d;
        this.l = d2;
        this.m = d2;
        float f2 = ((float) 2.5d) * f;
        c11400xM1.h = f2;
        c11400xM1.b.setStrokeWidth(f2);
        c11400xM1.a();
        c11400xM1.r = d * 8.75d;
        c11400xM1.b(0);
        c11400xM1.s = (int) (10.0f * f);
        c11400xM1.t = (int) (f * 5.0f);
        float min = Math.min((int) this.l, (int) this.m);
        double d3 = c11400xM1.r;
        c11400xM1.i = (float) ((d3 <= 0.0d || min < 0.0f) ? Math.ceil(c11400xM1.h / 2.0f) : (min / 2.0f) - d3);
        C10371uM1 c10371uM1 = new C10371uM1(this, c11400xM1);
        c10371uM1.setRepeatCount(-1);
        c10371uM1.setRepeatMode(1);
        c10371uM1.setInterpolator(o);
        c10371uM1.setAnimationListener(new AnimationAnimationListenerC10714vM1(this, c11400xM1));
        this.j = c10371uM1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.i.getLayoutDirection() == 1;
        Rect bounds = getBounds();
        int save = canvas.save();
        if (z) {
            canvas.scale(-1.0f, 1.0f, bounds.exactCenterX(), bounds.exactCenterY());
        }
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        C11400xM1 c11400xM1 = this.g;
        RectF rectF = c11400xM1.a;
        rectF.set(bounds);
        float f = c11400xM1.i;
        rectF.inset(f, f);
        float f2 = c11400xM1.e;
        float f3 = c11400xM1.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c11400xM1.f + f3) * 360.0f) - f4;
        Paint paint = c11400xM1.b;
        paint.setColor(c11400xM1.x);
        canvas.drawArc(rectF, f4, f5, false, paint);
        if (c11400xM1.o) {
            Path path = c11400xM1.p;
            if (path == null) {
                Path path2 = new Path();
                c11400xM1.p = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float f6 = (((int) c11400xM1.i) / 2.0f) * c11400xM1.q;
            float cos = (float) ((Math.cos(0.0d) * c11400xM1.r) + bounds.exactCenterX());
            float sin = (float) ((Math.sin(0.0d) * c11400xM1.r) + bounds.exactCenterY());
            c11400xM1.p.moveTo(0.0f, 0.0f);
            c11400xM1.p.lineTo(c11400xM1.s * c11400xM1.q, 0.0f);
            Path path3 = c11400xM1.p;
            float f7 = c11400xM1.s;
            float f8 = c11400xM1.q;
            path3.lineTo((f7 * f8) / 2.0f, c11400xM1.t * f8);
            c11400xM1.p.offset(cos - f6, sin);
            c11400xM1.p.close();
            Paint paint2 = c11400xM1.c;
            paint2.setColor(c11400xM1.x);
            canvas.rotate((f4 + f5) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(c11400xM1.p, paint2);
        }
        if (c11400xM1.u < 255) {
            Paint paint3 = c11400xM1.v;
            paint3.setColor(c11400xM1.w);
            paint3.setAlpha(255 - c11400xM1.u);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2.0f, paint3);
        }
        if (z) {
            canvas.scale(-1.0f, 1.0f, bounds.exactCenterX(), bounds.exactCenterY());
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = (Animation) arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.j.reset();
        C11400xM1 c11400xM1 = this.g;
        float f = c11400xM1.e;
        c11400xM1.l = f;
        float f2 = c11400xM1.f;
        c11400xM1.m = f2;
        c11400xM1.n = c11400xM1.g;
        View view = this.i;
        if (f2 != f) {
            this.n = true;
            this.j.setDuration(666L);
            view.startAnimation(this.j);
            return;
        }
        c11400xM1.b(0);
        c11400xM1.l = 0.0f;
        c11400xM1.m = 0.0f;
        c11400xM1.n = 0.0f;
        c11400xM1.e = 0.0f;
        c11400xM1.a();
        c11400xM1.f = 0.0f;
        c11400xM1.a();
        c11400xM1.g = 0.0f;
        c11400xM1.a();
        this.j.setDuration(1332L);
        view.startAnimation(this.j);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.clearAnimation();
        this.h = 0.0f;
        invalidateSelf();
        C11400xM1 c11400xM1 = this.g;
        if (c11400xM1.o) {
            c11400xM1.o = false;
            c11400xM1.a();
        }
        c11400xM1.b(0);
        c11400xM1.l = 0.0f;
        c11400xM1.m = 0.0f;
        c11400xM1.n = 0.0f;
        c11400xM1.e = 0.0f;
        c11400xM1.a();
        c11400xM1.f = 0.0f;
        c11400xM1.a();
        c11400xM1.g = 0.0f;
        c11400xM1.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C11400xM1 c11400xM1 = this.g;
        c11400xM1.b.setColorFilter(colorFilter);
        c11400xM1.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C11400xM1 c11400xM1 = this.g;
        if (c11400xM1.u != i) {
            c11400xM1.u = i;
            c11400xM1.a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g.u;
    }

    public static void b(float f, C11400xM1 c11400xM1) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c11400xM1.j;
            int i = c11400xM1.k;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            int intValue = Integer.valueOf(i2).intValue();
            int intValue2 = Integer.valueOf(i3).intValue();
            c11400xM1.x = ((((intValue >> 24) & 255) + ((int) ((((intValue2 >> 24) & 255) - r2) * f2))) << 24) | ((((intValue >> 16) & 255) + ((int) ((((intValue2 >> 16) & 255) - r3) * f2))) << 16) | ((((intValue >> 8) & 255) + ((int) ((((intValue2 >> 8) & 255) - r4) * f2))) << 8) | ((intValue & 255) + ((int) (f2 * ((intValue2 & 255) - r1))));
        }
    }
}

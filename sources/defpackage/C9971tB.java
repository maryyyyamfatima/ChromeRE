package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9971tB extends Drawable {
    public final Paint b;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public S53 o;
    public ColorStateList p;
    public final U53 a = T53.a;
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final C9628sB g = new C9628sB(this);
    public boolean n = true;

    public C9971tB(S53 s53) {
        this.o = s53;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.n;
        Paint paint = this.b;
        Rect rect = this.d;
        if (z) {
            copyBounds(rect);
            float height = this.h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{AbstractC4242cX.f(this.i, this.m), AbstractC4242cX.f(this.j, this.m), AbstractC4242cX.f(AbstractC4242cX.g(this.j, 0), this.m), AbstractC4242cX.f(AbstractC4242cX.g(this.l, 0), this.m), AbstractC4242cX.f(this.l, this.m), AbstractC4242cX.f(this.k, this.m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.e;
        rectF.set(rect);
        InterfaceC11333x90 interfaceC11333x90 = this.o.e;
        RectF rectF2 = this.f;
        rectF2.set(getBounds());
        float min = Math.min(interfaceC11333x90.a(rectF2), rectF.width() / 2.0f);
        S53 s53 = this.o;
        rectF2.set(getBounds());
        if (s53.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        S53 s53 = this.o;
        RectF rectF = this.f;
        rectF.set(getBounds());
        if (!s53.d(rectF)) {
            Rect rect = this.d;
            copyBounds(rect);
            RectF rectF2 = this.e;
            rectF2.set(rect);
            S53 s532 = this.o;
            Path path = this.c;
            this.a.a(s532, 1.0f, rectF2, null, path);
            if (path.isConvex()) {
                outline.setConvexPath(path);
                return;
            }
            return;
        }
        InterfaceC11333x90 interfaceC11333x90 = this.o.e;
        rectF.set(getBounds());
        outline.setRoundRect(getBounds(), interfaceC11333x90.a(rectF));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        S53 s53 = this.o;
        RectF rectF = this.f;
        rectF.set(getBounds());
        if (!s53.d(rectF)) {
            return true;
        }
        int round = Math.round(this.h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }
}

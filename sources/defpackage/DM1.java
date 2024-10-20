package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DM1 extends Drawable implements InterfaceC12004z63 {
    public static final Paint B;
    public boolean A;
    public CM1 a;
    public final AbstractC6856k63[] g;
    public final AbstractC6856k63[] h;
    public final BitSet i;
    public boolean j;
    public final Matrix k;
    public final Path l;
    public final Path m;
    public final RectF n;
    public final RectF o;
    public final Region p;
    public final Region q;
    public S53 r;
    public final Paint s;
    public final Paint t;
    public final M53 u;
    public final BM1 v;
    public final U53 w;
    public PorterDuffColorFilter x;
    public PorterDuffColorFilter y;
    public final RectF z;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    static {
        Paint paint = new Paint(1);
        B = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public DM1() {
        this(new S53());
    }

    public DM1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(S53.a(context, attributeSet, i, i2).a());
    }

    public DM1(S53 s53) {
        this(new CM1(s53));
    }

    public DM1(CM1 cm1) {
        U53 u53;
        this.g = new AbstractC6856k63[4];
        this.h = new AbstractC6856k63[4];
        this.i = new BitSet(8);
        this.k = new Matrix();
        this.l = new Path();
        this.m = new Path();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new Region();
        this.q = new Region();
        Paint paint = new Paint(1);
        this.s = paint;
        Paint paint2 = new Paint(1);
        this.t = paint2;
        this.u = new M53();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            u53 = T53.a;
        } else {
            u53 = new U53();
        }
        this.w = u53;
        this.z = new RectF();
        this.A = true;
        this.a = cm1;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.v = new BM1(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new CM1(this.a);
        return this;
    }

    @Override // defpackage.InterfaceC12004z63
    public final void b(S53 s53) {
        this.a.a = s53;
        invalidateSelf();
    }

    public final void j(ColorStateList colorStateList) {
        CM1 cm1 = this.a;
        if (cm1.c != colorStateList) {
            cm1.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        CM1 cm1 = this.a;
        if (cm1.g != mode) {
            cm1.g = mode;
            m();
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        CM1 cm1 = this.a;
        if (cm1.l != i) {
            cm1.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.p;
        region.set(bounds);
        RectF f = f();
        Path path = this.l;
        a(f, path);
        Region region2 = this.q;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF f() {
        RectF rectF = this.n;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    public final void g(Context context) {
        this.a.b = new C2720Uy0(context);
        n();
    }

    public final void n() {
        CM1 cm1 = this.a;
        float f = cm1.n + cm1.o;
        cm1.q = (int) Math.ceil(0.75f * f);
        this.a.r = (int) Math.ceil(f * 0.25f);
        m();
        super.invalidateSelf();
    }

    public final void i(float f) {
        CM1 cm1 = this.a;
        if (cm1.n != f) {
            cm1.n = f;
            n();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.j = true;
        super.invalidateSelf();
    }

    public final void k() {
        this.u.a(-12303292);
        this.a.t = false;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.j = true;
        super.onBoundsChange(rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:            if (((h() || r7.isConvex() || android.os.Build.VERSION.SDK_INT >= 29) ? false : true) != false) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021c  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DM1.draw(android.graphics.Canvas):void");
    }

    public void e(Canvas canvas) {
        Paint paint = this.t;
        Path path = this.m;
        S53 s53 = this.r;
        RectF rectF = this.o;
        rectF.set(f());
        Paint.Style style = this.a.u;
        float strokeWidth = (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint.getStrokeWidth() > 0.0f ? 1 : (paint.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        if (s53.d(rectF)) {
            float a = s53.f.a(rectF) * this.a.j;
            canvas.drawRoundRect(rectF, a, a, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public final void d(Canvas canvas) {
        if (this.i.cardinality() > 0) {
            Log.w("DM1", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.a.r;
        Path path = this.l;
        M53 m53 = this.u;
        if (i != 0) {
            canvas.drawPath(path, m53.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC6856k63 abstractC6856k63 = this.g[i2];
            int i3 = this.a.q;
            Matrix matrix = AbstractC6856k63.b;
            abstractC6856k63.a(matrix, m53, i3, canvas);
            this.h[i2].a(matrix, m53, this.a.q, canvas);
        }
        if (this.A) {
            CM1 cm1 = this.a;
            int sin = (int) (Math.sin(Math.toRadians(cm1.s)) * cm1.r);
            CM1 cm12 = this.a;
            int cos = (int) (Math.cos(Math.toRadians(cm12.s)) * cm12.r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, B);
            canvas.translate(sin, cos);
        }
    }

    public final void a(RectF rectF, Path path) {
        U53 u53 = this.w;
        CM1 cm1 = this.a;
        u53.a(cm1.a, cm1.j, rectF, this.v, path);
        if (this.a.i != 1.0f) {
            Matrix matrix = this.k;
            matrix.reset();
            float f = this.a.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.z, true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.a.p == 2) {
            return;
        }
        if (h()) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(f()) * this.a.j);
            return;
        }
        RectF f = f();
        Path path = this.l;
        a(f, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        CM1 cm1 = this.a;
        this.x = c(cm1.f, cm1.g, this.s, true);
        CM1 cm12 = this.a;
        this.y = c(cm12.e, cm12.g, this.t, false);
        CM1 cm13 = this.a;
        if (cm13.t) {
            this.u.a(cm13.f.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.x) && Objects.equals(porterDuffColorFilter2, this.y)) ? false : true;
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                CM1 cm1 = this.a;
                float f = cm1.n + cm1.o + cm1.m;
                C2720Uy0 c2720Uy0 = cm1.b;
                if (c2720Uy0 != null) {
                    colorForState = c2720Uy0.b(colorForState, f);
                }
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            CM1 cm12 = this.a;
            float f2 = cm12.n + cm12.o + cm12.m;
            C2720Uy0 c2720Uy02 = cm12.b;
            int b = c2720Uy02 != null ? c2720Uy02.b(color, f2) : color;
            if (b != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(b, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.c) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = l(iArr) || m();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean l(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.s).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.t).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean h() {
        return this.a.a.d(f());
    }
}

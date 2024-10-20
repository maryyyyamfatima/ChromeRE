package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J71 extends Drawable {
    public static final Paint e;
    public static final Paint f;
    public static final Paint g;
    public static final Paint h;
    public final Path a;
    public final Path b;
    public final Path c;
    public final Path d;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        int argb = Color.argb(168, 246, 178, 107);
        int argb2 = Color.argb(168, 255, 229, 153);
        int argb3 = Color.argb(140, 147, 196, 125);
        int argb4 = Color.argb(168, 111, 168, 220);
        Paint paint = new Paint();
        paint.setColor(argb);
        e = paint;
        Paint paint2 = new Paint();
        paint2.setColor(argb2);
        f = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(argb3);
        g = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(argb4);
        h = paint4;
    }

    public J71(C3025Xh0 c3025Xh0) {
        Path path = new Path();
        this.a = path;
        Path path2 = new Path();
        this.b = path2;
        Path path3 = new Path();
        this.c = path3;
        Path path4 = new Path();
        this.d = path4;
        AbstractC11581xs4 W0 = c3025Xh0.a.W0();
        RectF rectF = new RectF(c3025Xh0.b());
        float f2 = rectF.left;
        EnumC10209ts4 enumC10209ts4 = EnumC10209ts4.g;
        float e2 = f2 - W0.e(enumC10209ts4);
        float f3 = rectF.top;
        EnumC10209ts4 enumC10209ts42 = EnumC10209ts4.h;
        float e3 = f3 - W0.e(enumC10209ts42);
        float f4 = rectF.right;
        EnumC10209ts4 enumC10209ts43 = EnumC10209ts4.i;
        float e4 = W0.e(enumC10209ts43) + f4;
        float f5 = rectF.bottom;
        EnumC10209ts4 enumC10209ts44 = EnumC10209ts4.j;
        RectF rectF2 = new RectF(e2, e3, e4, W0.e(enumC10209ts44) + f5);
        RectF rectF3 = new RectF(W0.b(enumC10209ts4) + rectF.left, W0.b(enumC10209ts42) + rectF.top, rectF.right - W0.b(enumC10209ts43), rectF.bottom - W0.b(enumC10209ts44));
        RectF rectF4 = new RectF(W0.f(enumC10209ts4) + rectF3.left, W0.f(enumC10209ts42) + rectF3.top, rectF3.right - W0.f(enumC10209ts43), rectF3.bottom - W0.f(enumC10209ts44));
        path.addRect(rectF2, Path.Direction.CW);
        path.addRect(rectF, Path.Direction.CCW);
        path2.addRect(rectF, Path.Direction.CW);
        path2.addRect(rectF3, Path.Direction.CCW);
        path3.addRect(rectF3, Path.Direction.CW);
        path3.addRect(rectF4, Path.Direction.CCW);
        path4.addRect(rectF4, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.a, e);
        canvas.drawPath(this.b, f);
        canvas.drawPath(this.c, g);
        canvas.drawPath(this.d, h);
    }
}

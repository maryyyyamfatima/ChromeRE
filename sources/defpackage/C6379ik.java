package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ik, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6379ik extends Drawable implements Drawable.Callback {
    public final Rect a = new Rect();
    public final int g;
    public final int h;
    public final Path i;
    public final Paint j;
    public final ShapeDrawable k;
    public final boolean l;
    public final Context m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C6379ik(Context context, boolean z) {
        this.m = context;
        this.l = z;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f41640_resource_name_obfuscated_res_0x7f0807c1);
        this.g = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f41630_resource_name_obfuscated_res_0x7f0807c0);
        this.h = dimensionPixelSize2;
        Path path = new Path();
        this.i = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo((-dimensionPixelSize) / 2.0f, dimensionPixelSize2);
        path.lineTo(0.0f, 0.0f);
        path.lineTo(dimensionPixelSize / 2.0f, dimensionPixelSize2);
        path.lineTo((-dimensionPixelSize) / 2.0f, dimensionPixelSize2);
        path.close();
        Paint paint = new Paint(1);
        this.j = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.k = shapeDrawable;
        shapeDrawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.k.draw(canvas);
        if (this.q) {
            canvas.save();
            if (!this.p) {
                canvas.scale(1.0f, -1.0f, this.o, getBounds().height() - (this.h / 2));
                canvas.translate(0.0f, r0 - (r2 / 2));
            }
            canvas.translate(this.o, 0.0f);
            canvas.drawPath(this.i, this.j);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect == null) {
            return;
        }
        if (this.l) {
            this.n = rect.height() / 2;
        } else {
            this.n = this.m.getResources().getDimensionPixelSize(R.dimen.f41650_resource_name_obfuscated_res_0x7f0807c2);
        }
        ShapeDrawable shapeDrawable = this.k;
        int i = this.n;
        shapeDrawable.setShape(new RoundRectShape(new float[]{i, i, i, i, i, i, i, i}, null, null));
        Rect rect2 = this.a;
        shapeDrawable.getPadding(rect2);
        int i2 = rect.left;
        int i3 = rect.top;
        boolean z = this.p;
        int i4 = this.h;
        shapeDrawable.setBounds(i2, i3 + (z ? i4 - rect2.top : 0), rect.right, rect.bottom - (z ? 0 : i4 - rect2.bottom));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k.setAlpha(i);
        this.j.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        this.k.getPadding(rect);
        int i = rect.left;
        int i2 = rect.top;
        boolean z = this.p;
        int i3 = this.h;
        int max = Math.max(i2, z ? i3 : 0);
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (this.p) {
            i3 = 0;
        }
        rect.set(i, max, i4, Math.max(i5, i3));
        return true;
    }
}

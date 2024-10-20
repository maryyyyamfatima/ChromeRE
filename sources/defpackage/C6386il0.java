package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: il0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6386il0 extends Drawable implements InterfaceC1655Mt0 {
    public static final /* synthetic */ int j = 0;
    public final Rect a;
    public final int g;
    public final int h;
    public Drawable i;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C6386il0(Rect rect, int i, int i2) {
        this.a = rect;
        this.g = i;
        this.h = i2;
    }

    public static C6386il0 a(int i, int i2, int i3, int i4, int i5, int i6) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        int max3 = Math.max(i3, 0);
        int max4 = Math.max(i4, 0);
        int max5 = Math.max(i5, 0);
        int max6 = Math.max(i6, 0);
        Rect rect = new Rect(0, 0, max, max2);
        Rect rect2 = new Rect(0, 0, max + max3 + max5, max2 + max4 + max6);
        C6386il0 c6386il0 = new C6386il0(rect, max3, max4);
        c6386il0.setBounds(rect2);
        return c6386il0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.i;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.g, this.h);
            drawable.setBounds(this.a);
            drawable.draw(canvas);
            canvas.restore();
        }
    }
}

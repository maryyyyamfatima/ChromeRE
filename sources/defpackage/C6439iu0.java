package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6439iu0 extends Drawable {
    public final Paint a = new Paint();
    public final Rect b = new Rect();
    public final Integer c = null;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Integer num = this.c;
        if (num != null) {
            canvas.drawColor(num.intValue());
        }
        canvas.drawRect(this.b, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int width = rect.width();
        Rect rect2 = this.b;
        rect2.set(0, 0, width, rect2.height());
    }
}

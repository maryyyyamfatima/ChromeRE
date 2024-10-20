package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10127tf0 extends DM1 {
    public final RectF C;

    public C10127tf0(S53 s53) {
        super(s53 == null ? new S53() : s53);
        this.C = new RectF();
    }

    public final void o(float f, float f2, float f3, float f4) {
        RectF rectF = this.C;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.DM1
    public final void e(Canvas canvas) {
        RectF rectF = this.C;
        if (rectF.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(rectF);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }
}

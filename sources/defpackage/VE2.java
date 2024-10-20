package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VE2 implements InterfaceC3468aF2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public VE2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.InterfaceC3468aF2
    public final void a(C4499dF2 c4499dF2, float f) {
        c4499dF2.setAlpha((int) ((f * 63.0f) + 12.0f));
    }

    @Override // defpackage.InterfaceC3468aF2
    public final void b(C4499dF2 c4499dF2, Paint paint, Canvas canvas, float f) {
        Rect bounds = c4499dF2.getBounds();
        int i = this.a;
        if (i != 0) {
            bounds = new Rect(bounds.left - i, bounds.top - i, bounds.right + i, bounds.bottom + i);
        }
        RectF rectF = new RectF(bounds);
        float f2 = this.b;
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }
}

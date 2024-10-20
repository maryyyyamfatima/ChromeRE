package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UE2 implements InterfaceC3468aF2 {
    public final /* synthetic */ YE2 a;

    public UE2(YE2 ye2) {
        this.a = ye2;
    }

    @Override // defpackage.InterfaceC3468aF2
    public final void a(C4499dF2 c4499dF2, float f) {
        c4499dF2.invalidateSelf();
    }

    @Override // defpackage.InterfaceC3468aF2
    public final void b(C4499dF2 c4499dF2, Paint paint, Canvas canvas, float f) {
        Rect bounds = c4499dF2.getBounds();
        YE2 ye2 = this.a;
        float a = ye2.a(bounds);
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), AbstractC2277Rn2.a(ye2.b(bounds), a, 1.0f - f, a), paint);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nj */
/* loaded from: classes.dex */
public final class C1734Nj extends AbstractC9059qY0 {
    public final RectF p;
    public boolean q;

    public C1734Nj(Context context, C2798Vn3 c2798Vn3) {
        super(context, c2798Vn3);
        RectF rectF = new RectF();
        this.p = rectF;
        rectF.setEmpty();
    }

    @Override // defpackage.AbstractC9059qY0, defpackage.AbstractC5518gD0
    public final void c(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) {
            this.q = false;
        }
        super.c(motionEvent);
    }

    @Override // defpackage.AbstractC5518gD0
    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) {
            this.q = false;
        }
        RectF rectF = this.p;
        float x = motionEvent.getX();
        float f = this.a;
        if (!rectF.contains(x * f, motionEvent.getY() * f)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.q = true;
        } else if (!this.q) {
            return false;
        }
        return true;
    }
}

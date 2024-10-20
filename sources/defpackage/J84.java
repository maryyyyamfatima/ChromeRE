package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J84 extends AbstractC1810Ny0 {
    public float a;
    public final float b;
    public final Paint c = new Paint();
    public RectF d;

    @Override // defpackage.AbstractC1810Ny0
    public final void b(Canvas canvas) {
    }

    @Override // defpackage.AbstractC1810Ny0
    public final boolean e() {
        return true;
    }

    public J84(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC1810Ny0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.text.Layout r20, java.lang.CharSequence r21) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.J84.d(android.text.Layout, java.lang.CharSequence):void");
    }

    @Override // defpackage.AbstractC1810Ny0
    public final void a(Canvas canvas) {
        if (this.d.isEmpty()) {
            return;
        }
        canvas.drawRect(this.d, this.c);
    }

    @Override // defpackage.AbstractC1810Ny0
    public final void f() {
        this.d = new RectF();
    }

    @Override // defpackage.AbstractC1810Ny0
    public final boolean c(int i, int i2) {
        return !this.d.isEmpty() && this.d.contains((float) i, (float) i2);
    }
}

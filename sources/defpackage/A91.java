package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A91 extends AbstractC1810Ny0 {
    public final float a;
    public final float b;
    public final Paint c = new Paint();
    public final boolean d;
    public RectF e;

    @Override // defpackage.AbstractC1810Ny0
    public final void b(Canvas canvas) {
    }

    public A91(float f, float f2, boolean z) {
        this.d = z;
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC1810Ny0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.text.Layout r25, java.lang.CharSequence r26) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A91.d(android.text.Layout, java.lang.CharSequence):void");
    }

    @Override // defpackage.AbstractC1810Ny0
    public final void a(Canvas canvas) {
        if (this.e.isEmpty()) {
            return;
        }
        canvas.drawRect(this.e, this.c);
    }

    @Override // defpackage.AbstractC1810Ny0
    public final void f() {
        this.e = new RectF();
    }

    @Override // defpackage.AbstractC1810Ny0
    public final boolean c(int i, int i2) {
        return !this.e.isEmpty() && this.e.contains((float) i, (float) i2);
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yI3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11725yI3 implements LineBackgroundSpan {
    public final int a;
    public final int g;
    public final boolean h;
    public final boolean i;

    public C11725yI3(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.g = i2;
        boolean z2 = true;
        this.h = i3 == 3;
        if ((z || i3 != 2) && (!z || i3 != 4)) {
            z2 = false;
        }
        this.i = z2;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (charSequence.subSequence(i6, i7).toString().trim().length() == 0) {
            return;
        }
        int round = Math.round(paint.measureText(charSequence, i6, i7));
        int color = paint.getColor();
        paint.setColor(this.g);
        if (this.h) {
            int i11 = ((i2 - i) / 2) + i;
            int i12 = round / 2;
            i9 = i11 - i12;
            i10 = i12 + i11;
        } else if (this.i) {
            i10 = round + i;
            i9 = i;
        } else {
            i9 = i2 - round;
            i10 = i2;
        }
        canvas.drawRect(i9, this.a == 3 ? ((i5 - i3) / 2) + i3 : i3, i10 + 10, i5, paint);
        paint.setColor(color);
    }
}

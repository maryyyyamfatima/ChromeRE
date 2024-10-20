package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.EdgeEffect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2989Xa extends View {
    public final EdgeEffect a;

    public C2989Xa(Context context) {
        super(context);
        EdgeEffect edgeEffect = new EdgeEffect(context);
        this.a = edgeEffect;
        edgeEffect.setColor(-16777216);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        EdgeEffect edgeEffect = this.a;
        if (edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, 0.0f, 0.0f);
            z = edgeEffect.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.setSize(getHeight(), getWidth());
    }
}

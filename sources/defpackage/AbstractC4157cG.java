package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4157cG {
    public static boolean a(Canvas canvas, View view, Rect rect, float f, boolean z, InterfaceC3470aG interfaceC3470aG) {
        if (!(z || view.isAttachedToWindow())) {
            return false;
        }
        interfaceC3470aG.c(canvas, rect.isEmpty() ? null : rect);
        if (!rect.isEmpty()) {
            canvas.clipRect(rect);
        }
        canvas.save();
        canvas.scale(f, f);
        view.draw(canvas);
        canvas.restore();
        interfaceC3470aG.d();
        return true;
    }
}

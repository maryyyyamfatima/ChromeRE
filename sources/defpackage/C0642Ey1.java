package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ey1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0642Ey1 {
    public final RectF a;
    public final RectF b;

    public C0642Ey1(float f, IO2 io2) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        C5819h52 e = io2.e();
        if (e != null) {
            rect = e.a;
            rect2 = e.b;
        }
        Rect d = io2.d();
        this.a = new RectF(rect.left * f, rect.top * f, rect.right * f, rect.bottom * f);
        this.b = new RectF(d.left * f, d.top * f, d.right * f, d.bottom * f);
        new RectF(rect2.left * f, rect2.top * f, rect2.right * f, rect2.bottom * f);
    }
}

package defpackage;

import android.graphics.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LI2 {
    public final Rect a;
    public T8 g;

    public LI2() {
        this.a = new Rect();
    }

    public LI2(Rect rect) {
        Rect rect2 = new Rect();
        this.a = rect2;
        rect2.set(rect);
    }

    public void a(T8 t8) {
        this.g = t8;
    }

    public void b() {
        this.g = null;
    }
}

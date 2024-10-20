package defpackage;

import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewStructure;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yv2 */
/* loaded from: classes2.dex */
public final class C3227Yv2 implements M0 {
    public final C7141kw2 a;
    public final long b;
    public final C3097Xv2 c;

    @Override // defpackage.M0
    public final WebContents b() {
        return null;
    }

    @Override // defpackage.M0
    public final String e() {
        return null;
    }

    @Override // defpackage.M0
    public final boolean isIncognito() {
        return false;
    }

    @Override // defpackage.M0
    public final void j(ViewStructure viewStructure, RunnableC9481rl4 runnableC9481rl4) {
    }

    public C3227Yv2(C7141kw2 c7141kw2, long j, Size size) {
        this.a = c7141kw2;
        this.b = j;
        C8173nw2 c8173nw2 = c7141kw2.a;
        this.c = new C3097Xv2(c8173nw2 == null ? null : c8173nw2.i, c8173nw2.b, size);
    }

    @Override // defpackage.M0
    public final L0 k() {
        return this.c;
    }

    @Override // defpackage.M0
    public final long h() {
        return this.b;
    }

    @Override // defpackage.M0
    public final boolean f(Rect rect) {
        this.a.a.c(rect.centerX(), rect.centerY(), true);
        return true;
    }

    @Override // defpackage.M0
    public final boolean g(Rect rect) {
        Runnable runnable;
        C9888sw2 c9888sw2 = this.a.c;
        if (rect != null) {
            C11603xw2 c11603xw2 = c9888sw2.f;
            float b = c11603xw2.b();
            Rect rect2 = new Rect((int) (rect.left * b), (int) (rect.top * b), (int) (rect.right * b), (int) (rect.bottom * b));
            Rect a = c11603xw2.a();
            if (!a.contains(rect2)) {
                float height = rect2.top < a.top ? r2 - r3 : (rect2.height() + r2) - a.bottom;
                float width = rect2.left < a.left ? r3 - r5 : (rect2.width() + r3) - a.right;
                c9888sw2.d.forceFinished(true);
                if (c9888sw2.b(width, height) && (runnable = c9888sw2.i) != null) {
                    runnable.run();
                }
            }
        } else {
            c9888sw2.getClass();
        }
        return true;
    }

    @Override // defpackage.M0
    public final void i(RunnableC8109nl4 runnableC8109nl4) {
        this.a.c.l = runnableC8109nl4;
    }

    @Override // defpackage.M0
    public final View d() {
        return this.a.d;
    }
}

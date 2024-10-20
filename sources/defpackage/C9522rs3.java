package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rs3 */
/* loaded from: classes.dex */
public final class C9522rs3 {
    public int a;
    public int b = -1;
    public final /* synthetic */ C2579Tw c;

    public C9522rs3(C2579Tw c2579Tw) {
        this.c = c2579Tw;
    }

    public final int a(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = Ec4.a;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.c.d;
        if (i2 == 0) {
            if (z) {
                width = this.a - view.getWidth();
                width2 = this.a;
            } else {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.a - view.getWidth();
            width2 = view.getWidth() + this.a;
        } else if (z) {
            width = this.a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.a - view.getWidth();
            width2 = this.a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    public final void b(View view, int i) {
        float f = this.a;
        float width = view.getWidth();
        C2579Tw c2579Tw = this.c;
        float f2 = (width * c2579Tw.e) + f;
        float width2 = (view.getWidth() * c2579Tw.f) + this.a;
        float f3 = i;
        if (f3 <= f2) {
            view.setAlpha(1.0f);
        } else if (f3 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (width2 - f2))), 1.0f));
        }
    }
}

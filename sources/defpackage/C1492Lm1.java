package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1492Lm1 extends C1751Nm1 {
    public final Rect i;

    public C1492Lm1(Context context) {
        super(context);
        this.i = new Rect();
    }

    @Override // defpackage.C1751Nm1, android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        int i;
        int i2;
        int i3;
        int i4;
        displayCutout = windowInsets.getDisplayCutout();
        if (displayCutout != null) {
            i = displayCutout.getSafeInsetLeft();
            i3 = displayCutout.getSafeInsetTop();
            i4 = displayCutout.getSafeInsetRight();
            i2 = displayCutout.getSafeInsetBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        Rect rect = this.i;
        if (rect.left != i || rect.top != i3 || rect.right != i4 || rect.bottom != i2) {
            rect.set(i, i3, i4, i2);
            Iterator it = this.g.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                }
                ((InterfaceC1621Mm1) c11814ya2.next()).a(rect);
            }
        }
        super.onApplyWindowInsets(windowInsets);
        return windowInsets;
    }
}

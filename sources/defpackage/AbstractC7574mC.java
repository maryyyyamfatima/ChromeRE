package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7574mC {
    public static void a(int i, int i2, int i3, int i4, Rect rect, Object obj, boolean z) {
        if (obj instanceof View) {
            View view = (View) obj;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (rect != null && !(view instanceof J91)) {
                view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            }
            if (z || view.getMeasuredHeight() != i6 || view.getMeasuredWidth() != i5) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            }
            if (!z && view.getLeft() == i && view.getTop() == i2 && view.getRight() == i3 && view.getBottom() == i4) {
                return;
            }
            view.layout(i, i2, i3, i4);
            return;
        }
        if (obj instanceof Drawable) {
            if (rect != null) {
                i += rect.left;
                i2 += rect.top;
                i3 -= rect.right;
                i4 -= rect.bottom;
            }
            ((Drawable) obj).setBounds(i, i2, i3, i4);
            return;
        }
        throw new IllegalStateException("Unsupported mounted content ".concat(String.valueOf(obj)));
    }
}

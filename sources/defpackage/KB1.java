package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import org.chromium.components.content_creation.notes.models.Background;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KB1 implements Background {
    public final int[] a;
    public final int b;

    public KB1(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    @Override // org.chromium.components.content_creation.notes.models.Background
    public final void a(View view, float f) {
        GradientDrawable.Orientation orientation;
        if (view == null) {
            return;
        }
        int b = AbstractC2373Sg3.b(this.b);
        if (b == 0 || b == 1) {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        } else if (b == 2) {
            orientation = GradientDrawable.Orientation.TR_BL;
        } else if (b == 3) {
            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        } else if (b == 4) {
            orientation = GradientDrawable.Orientation.BR_TL;
        } else {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, this.a);
        gradientDrawable.setCornerRadius(f);
        view.setBackground(gradientDrawable);
    }
}

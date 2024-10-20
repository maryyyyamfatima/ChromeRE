package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import org.chromium.components.content_creation.notes.models.Background;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jg3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6702jg3 implements Background {
    public final int a;

    public C6702jg3(int i) {
        this.a = i;
    }

    @Override // org.chromium.components.content_creation.notes.models.Background
    public final void a(View view, float f) {
        if (view == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.a);
        gradientDrawable.setCornerRadius(f);
        view.setBackground(gradientDrawable);
    }
}

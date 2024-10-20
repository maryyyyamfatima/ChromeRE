package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import org.chromium.components.content_creation.notes.models.Background;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1591Mg1 implements Background {
    public final String a;
    public Bitmap b;

    public C1591Mg1(String str) {
        this.a = str;
    }

    @Override // org.chromium.components.content_creation.notes.models.Background
    public final void a(View view, float f) {
        if (view == null) {
            return;
        }
        C5590gR2 c5590gR2 = new C5590gR2(view.getContext().getResources(), this.b);
        c5590gR2.b(f);
        if (c5590gR2.c != 119) {
            c5590gR2.c = 119;
            c5590gR2.j = true;
            c5590gR2.invalidateSelf();
        }
        view.setBackground(c5590gR2);
    }
}

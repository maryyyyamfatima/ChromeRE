package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gR2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5590gR2 extends AbstractC5934hR2 {
    public C5590gR2(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        c();
        outline.setRoundRect(this.h, this.g);
    }

    @Override // defpackage.AbstractC5934hR2
    public final void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}

package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9000qM1 extends AbstractC4607db {
    public final /* synthetic */ C9342rM1 b;

    public C9000qM1(C9342rM1 c9342rM1) {
        this.b = c9342rM1;
    }

    @Override // defpackage.AbstractC4607db
    public final void c(Drawable drawable) {
        C9342rM1 c9342rM1 = this.b;
        ColorStateList colorStateList = c9342rM1.r;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c9342rM1.u, colorStateList.getDefaultColor()));
        }
    }

    @Override // defpackage.AbstractC4607db
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.r;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }
}

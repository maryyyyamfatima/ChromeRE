package defpackage;

import android.graphics.drawable.ColorDrawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TY extends ColorDrawable implements UY {
    public TY(int i) {
        super(i);
    }

    @Override // defpackage.UY
    public final boolean a(UY uy) {
        if (this == uy) {
            return true;
        }
        return (uy instanceof TY) && getColor() == ((TY) uy).getColor();
    }
}

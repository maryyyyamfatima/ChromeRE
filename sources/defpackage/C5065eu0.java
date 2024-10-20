package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5065eu0 extends AbstractC3215Yt0 {
    public boolean g;

    public C5065eu0(Drawable drawable) {
        super(drawable);
        this.g = true;
    }

    @Override // defpackage.AbstractC3215Yt0, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.g) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.AbstractC3215Yt0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g) {
            super.draw(canvas);
        }
    }

    @Override // defpackage.AbstractC3215Yt0, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.g) {
            super.setHotspot(f, f2);
        }
    }

    @Override // defpackage.AbstractC3215Yt0, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.g) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.AbstractC3215Yt0, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.g) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}

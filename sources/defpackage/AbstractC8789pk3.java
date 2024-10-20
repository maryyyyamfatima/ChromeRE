package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pk3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8789pk3 extends AbstractC1136It0 {
    public AbstractC8446ok3 s;
    public boolean t;

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);

    @Override // defpackage.AbstractC1136It0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            this.s.e();
            this.t = true;
        }
        return this;
    }

    @Override // defpackage.AbstractC1136It0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }
}

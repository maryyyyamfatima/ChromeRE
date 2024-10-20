package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11331x84 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public C11331x84(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C11674y84 c11674y84 = new C11674y84();
        c11674y84.a = (VectorDrawable) this.a.newDrawable();
        return c11674y84;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C11674y84 c11674y84 = new C11674y84();
        c11674y84.a = (VectorDrawable) this.a.newDrawable(resources);
        return c11674y84;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C11674y84 c11674y84 = new C11674y84();
        c11674y84.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return c11674y84;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}

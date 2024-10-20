package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6332ic extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public C6332ic(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C6674jc c6674jc = new C6674jc(null);
        Drawable newDrawable = this.a.newDrawable();
        c6674jc.a = newDrawable;
        newDrawable.setCallback(c6674jc.k);
        return c6674jc;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C6674jc c6674jc = new C6674jc(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        c6674jc.a = newDrawable;
        newDrawable.setCallback(c6674jc.k);
        return c6674jc;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C6674jc c6674jc = new C6674jc(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        c6674jc.a = newDrawable;
        newDrawable.setCallback(c6674jc.k);
        return c6674jc;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}

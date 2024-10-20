package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eZ0 */
/* loaded from: classes.dex */
public final class C4940eZ0 extends Drawable.ConstantState {
    public final C8378oZ0 a;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public C4940eZ0(C8378oZ0 c8378oZ0) {
        this.a = c8378oZ0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C5284fZ0(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C5284fZ0(this);
    }
}

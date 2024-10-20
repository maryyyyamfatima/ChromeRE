package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9628sB extends Drawable.ConstantState {
    public final /* synthetic */ C9971tB a;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public C9628sB(C9971tB c9971tB) {
        this.a = c9971tB;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.a;
    }
}

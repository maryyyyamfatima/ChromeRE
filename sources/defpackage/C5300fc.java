package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5300fc implements Drawable.Callback {
    public final /* synthetic */ C6674jc a;

    public C5300fc(C6674jc c6674jc) {
        this.a = c6674jc;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}

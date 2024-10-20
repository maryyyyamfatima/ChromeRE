package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4263cb extends Animatable2.AnimationCallback {
    public final /* synthetic */ AbstractC4607db a;

    public C4263cb(AbstractC4607db abstractC4607db) {
        this.a = abstractC4607db;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.a.c(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.b(drawable);
    }
}

package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gs3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0874Gs3 extends Animation {
    public final /* synthetic */ C2303Rs3 a;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.g(1.0f - f);
    }

    public C0874Gs3(C2303Rs3 c2303Rs3) {
        this.a = c2303Rs3;
    }
}

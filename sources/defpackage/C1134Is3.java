package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Is3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1134Is3 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g;
    public final /* synthetic */ b h;

    public C1134Is3(b bVar, int i, int i2) {
        this.h = bVar;
        this.a = i;
        this.g = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.h.D.setAlpha((int) (((this.g - r0) * f) + this.a));
    }
}

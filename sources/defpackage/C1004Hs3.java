package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hs3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004Hs3 extends Animation {
    public final /* synthetic */ b a;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = 1.0f - f;
        b bVar = this.a;
        bVar.y.setScaleX(f2);
        bVar.y.setScaleY(f2);
    }

    public C1004Hs3(b bVar) {
        this.a = bVar;
    }
}

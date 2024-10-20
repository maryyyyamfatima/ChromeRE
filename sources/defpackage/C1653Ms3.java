package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ms3 */
/* loaded from: classes.dex */
public final class C1653Ms3 extends Animation {
    public final /* synthetic */ b a;

    public C1653Ms3(G13 g13) {
        this.a = g13;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        b bVar = this.a;
        bVar.getClass();
        int abs = bVar.C - Math.abs(bVar.B);
        bVar.r((bVar.A + ((int) ((abs - r0) * f))) - bVar.y.getTop());
        C6280iS c6280iS = bVar.D;
        float f2 = 1.0f - f;
        C5936hS c5936hS = c6280iS.a;
        if (f2 != c5936hS.p) {
            c5936hS.p = f2;
        }
        c6280iS.invalidateSelf();
    }
}

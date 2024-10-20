package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fs3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744Fs3 extends Animation {
    public final /* synthetic */ b a;

    public C0744Fs3(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        b bVar = this.a;
        bVar.y.setScaleX(f);
        bVar.y.setScaleY(f);
    }
}

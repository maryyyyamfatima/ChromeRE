package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HP1 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g;
    public final /* synthetic */ View h;

    public HP1(int i, int i2, ViewGroup viewGroup) {
        this.a = i;
        this.g = i2;
        this.h = viewGroup;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.g;
        d.l(this.h, this.a - ((int) ((r0 - i) * f)));
    }
}

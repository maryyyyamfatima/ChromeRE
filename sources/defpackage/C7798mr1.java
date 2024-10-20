package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7798mr1 extends M74 {
    public final TimeInterpolator e;

    public C7798mr1(Interpolator interpolator) {
        this.e = interpolator;
    }

    @Override // defpackage.M74
    public final float b(long j) {
        return this.e.getInterpolation(c("default_input").c);
    }
}

package defpackage;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HV3 implements IV3 {
    public final int a;
    public final Interpolator b;

    public HV3(int i, BaseInterpolator baseInterpolator) {
        this.a = i;
        this.b = baseInterpolator;
    }

    @Override // defpackage.IV3
    public final SV3 a(C10670vD2 c10670vD2) {
        return new DN3(this.a, c10670vD2, this.b);
    }
}

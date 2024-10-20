package defpackage;

import android.graphics.drawable.Animatable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435Lb extends AbstractC2084Qb {
    public final Animatable a;

    public C1435Lb(Animatable animatable) {
        this.a = animatable;
    }

    @Override // defpackage.AbstractC2084Qb
    public final void c() {
        this.a.start();
    }

    @Override // defpackage.AbstractC2084Qb
    public final void d() {
        this.a.stop();
    }
}

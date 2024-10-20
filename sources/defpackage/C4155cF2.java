package defpackage;

import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cF2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4155cF2 extends Drawable.ConstantState {
    public int a;
    public int b;
    public long c;
    public float d;
    public final Interpolator e;
    public final InterfaceC3468aF2 f;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public C4155cF2(Interpolator interpolator, InterfaceC3468aF2 interfaceC3468aF2) {
        this.e = new InterpolatorC4842eF2(interpolator);
        this.f = interfaceC3468aF2;
    }

    public C4155cF2(C4155cF2 c4155cF2) {
        this.a = c4155cF2.a;
        this.b = c4155cF2.b;
        this.c = c4155cF2.c;
        this.e = c4155cF2.e;
        this.f = c4155cF2.f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C4499dF2(this, new ZE2());
    }
}

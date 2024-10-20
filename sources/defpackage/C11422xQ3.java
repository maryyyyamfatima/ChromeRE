package defpackage;

import android.animation.ValueAnimator;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xQ3 */
/* loaded from: classes2.dex */
public final class C11422xQ3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ ToolbarPhone m;

    public C11422xQ3(ToolbarPhone toolbarPhone, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        this.m = toolbarPhone;
        this.a = z;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        boolean z = this.a;
        ToolbarPhone toolbarPhone = this.m;
        if (z) {
            float f = this.g;
            toolbarPhone.e0 = (int) AbstractC2277Rn2.a(this.h, f, animatedFraction, f);
        }
        int a = AbstractC3899bX.a(this.i, this.j, animatedFraction, false);
        int i = ToolbarPhone.L0;
        toolbarPhone.w0(a);
        toolbarPhone.r0(AbstractC3899bX.a(this.k, this.l, animatedFraction, false));
    }
}

package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I70 implements L70 {
    public final /* synthetic */ N70 a;

    @Override // defpackage.L70
    public final float b() {
        N70 n70 = this.a;
        float R0 = n70.R0() + n70.w;
        C3503aM2 V0 = n70.V0();
        float f = (!V0.l || V0.h == null) ? 0.0f : V0.m;
        float f2 = n70.a;
        return Math.round(((f * f2) + R0) / f2);
    }

    public I70(N70 n70) {
        this.a = n70;
    }
}

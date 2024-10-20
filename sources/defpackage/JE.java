package defpackage;

import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class JE {
    public final /* synthetic */ CafExpandedControllerActivity a;

    public final long a() {
        CafExpandedControllerActivity cafExpandedControllerActivity = this.a;
        if (cafExpandedControllerActivity.z.g()) {
            return cafExpandedControllerActivity.z.f.b();
        }
        return 0L;
    }

    public final void b(long j) {
        CafExpandedControllerActivity cafExpandedControllerActivity = this.a;
        if (cafExpandedControllerActivity.z.g()) {
            KM2 km2 = cafExpandedControllerActivity.z.a.h;
            km2.getClass();
            C6963kR1 c6963kR1 = new C6963kR1(j, 0, null);
            if (!km2.h()) {
                KM2.f();
            } else {
                KM2.b(new C11058wM2(km2, c6963kR1));
            }
            EI2.h(2, 3, "Cast.Sender.Clank.FullscreenControlsAction");
        }
    }

    public JE(CafExpandedControllerActivity cafExpandedControllerActivity) {
        this.a = cafExpandedControllerActivity;
    }
}

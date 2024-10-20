package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1609Mk implements InterfaceC4009bp4, InterfaceC2129Qk {
    public final WindowAndroid a;
    public final Q83 g;
    public Callback h;
    public final Runnable i;
    public final InterfaceC2259Rk j;

    @Override // defpackage.InterfaceC4009bp4
    public final void b() {
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void d() {
    }

    public C1609Mk(WindowAndroid windowAndroid, Q83 q83, Of4 of4, Runnable runnable, InterfaceC2259Rk interfaceC2259Rk) {
        this.a = windowAndroid;
        windowAndroid.w.a(this);
        this.g = q83;
        this.h = of4;
        this.i = runnable;
        this.j = interfaceC2259Rk;
    }

    public final void c(int i) {
        this.g.p("Chrome.Assistant.Enabled", true);
        EI2.h(i, 11, "Assistant.VoiceSearch.ConsentOutcome");
        g(true);
    }

    public final void f(int i) {
        this.g.p("Chrome.Assistant.Enabled", false);
        EI2.h(i, 11, "Assistant.VoiceSearch.ConsentOutcome");
        g(false);
    }

    public final void e() {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("AssistantConsentV2")) {
            int M37SqSAy = N.M37SqSAy("AssistantConsentV2", "count", -1);
            if (M37SqSAy < 0) {
                r3 = false;
            } else {
                Q83 q83 = this.g;
                int f = q83.f(0, "Chrome.AssistantVoiceConsentTapsCounter.ConsentTapsCount") + 1;
                r3 = f > M37SqSAy;
                q83.q(f, "Chrome.AssistantVoiceConsentTapsCounter.ConsentTapsCount");
            }
        }
        if (!r3) {
            EI2.h(9, 11, "Assistant.VoiceSearch.ConsentOutcome");
            g(false);
        } else {
            f(4);
        }
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void a() {
        Q83 q83 = this.g;
        if (q83.c("Chrome.Assistant.Enabled")) {
            this.j.dismiss();
            if (q83.e("Chrome.Assistant.Enabled", false)) {
                c(1);
            } else {
                f(3);
            }
        }
    }

    public final void g(boolean z) {
        this.a.w.d(this);
        this.h.onResult(Boolean.valueOf(z));
        this.h = null;
    }
}

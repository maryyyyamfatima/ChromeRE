package defpackage;

import J.N;
import org.chromium.chrome.browser.password_manager.PasswordStoreBridge;
import org.chromium.chrome.browser.safety_check.SafetyCheckSettingsFragment;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WT2 implements InterfaceC3295Zj0 {
    public SafetyCheckSettingsFragment a;
    public C11441xU2 b;
    public C10069tU2 c;

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void onCreate() {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void onPause() {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void onResume() {
    }

    public WT2(SafetyCheckSettingsFragment safetyCheckSettingsFragment, C11441xU2 c11441xU2, SettingsLauncher settingsLauncher, C3083Xs3 c3083Xs3, C8385oa2 c8385oa2) {
        Object obj;
        this.a = safetyCheckSettingsFragment;
        this.b = c11441xU2;
        UT2 ut2 = new UT2(this, settingsLauncher, c3083Xs3, c8385oa2);
        G02 g02 = safetyCheckSettingsFragment.W;
        g02.getClass();
        G02.a("observe");
        if (safetyCheckSettingsFragment.U.b != EnumC11683yA1.DESTROYED) {
            BE1 be1 = new BE1(g02, safetyCheckSettingsFragment, ut2);
            IT2 it2 = g02.b;
            ET2 a = it2.a(ut2);
            if (a != null) {
                obj = a.g;
            } else {
                ET2 et2 = new ET2(ut2, be1);
                it2.i++;
                ET2 et22 = it2.g;
                if (et22 == null) {
                    it2.a = et2;
                    it2.g = et2;
                } else {
                    et22.h = et2;
                    et2.i = et22;
                    it2.g = et2;
                }
                obj = null;
            }
            CE1 ce1 = (CE1) obj;
            if (ce1 != null && !ce1.g(safetyCheckSettingsFragment)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (ce1 == null) {
                safetyCheckSettingsFragment.U.a(be1);
            }
        }
        this.a.U.a(new VT2(this));
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final void d(JA1 ja1) {
        ja1.Z().b(this);
        C10069tU2 c10069tU2 = this.c;
        c10069tU2.j(null);
        Runnable runnable = c10069tU2.m;
        if (runnable != null) {
            c10069tU2.k.removeCallbacks(runnable);
        }
        c10069tU2.m = null;
        Runnable runnable2 = c10069tU2.n;
        if (runnable2 != null) {
            c10069tU2.k.removeCallbacks(runnable2);
        }
        c10069tU2.n = null;
        if (!AbstractC0193Bm2.a()) {
            C2392Sk2 c2392Sk2 = AbstractC1872Ok2.a;
            if (c2392Sk2 != null) {
                N.MbiHHiCX(c2392Sk2.a.a);
                c2392Sk2.b.d(c10069tU2);
            }
        } else {
            PasswordStoreBridge passwordStoreBridge = c10069tU2.f;
            passwordStoreBridge.b.d(c10069tU2);
            long j = passwordStoreBridge.a;
            if (j != 0) {
                N.MQCQJ059(j);
                passwordStoreBridge.a = 0L;
            }
        }
        c10069tU2.b = null;
        c10069tU2.a = null;
        c10069tU2.k = null;
        this.a = null;
        this.b = null;
        this.c = null;
    }
}

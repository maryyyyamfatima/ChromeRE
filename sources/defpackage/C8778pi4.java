package defpackage;

import J.N;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.vr.ndk.base.AndroidCompat;
import com.google.vr.ndk.base.DaydreamApi;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.library_loader.b;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.vr.VrCoreInstallUtils;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.chrome.browser.vr.VrShell;
import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pi4 */
/* loaded from: classes4.dex */
public final class C8778pi4 extends AbstractC7403li4 {
    @Override // defpackage.AbstractC7403li4
    public final void D() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        Mi4.a.a();
        InterfaceC9121qi4 interfaceC9121qi4 = VrModuleProvider.c;
        N.MhxC9zA0();
        N.M5BNAVgK();
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        onBackPressed();
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean f() {
        return VrShellDelegate.h();
    }

    @Override // defpackage.AbstractC7403li4
    public final void t(Activity activity) {
        VrShellDelegate.p(activity);
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean n() {
        return DaydreamApi.isDaydreamReadyPlatform(V60.a);
    }

    @Override // defpackage.AbstractC7403li4
    public final void u() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
    }

    @Override // defpackage.AbstractC7403li4
    public final void G(Activity activity, Intent intent) {
        VrShellDelegate k;
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (activity.isFinishing()) {
            return;
        }
        VrModuleProvider.d().getClass();
        if (Hi4.a(activity, intent) && (k = VrShellDelegate.k((ChromeActivity) activity)) != null) {
            k.w = true;
            if (k.z) {
                k.z = false;
                if (k.l || k.o) {
                    return;
                }
                k.d();
                return;
            }
            if (AbstractC7403li4.h) {
                k.m = true;
            }
            k.d();
            VrModuleProvider.d().c(k.a.getIntent());
            k.e();
        }
    }

    @Override // defpackage.AbstractC7403li4
    public final void o(Activity activity, Intent intent) {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        VrModuleProvider.d().getClass();
        boolean a = Hi4.a(activity, intent);
        if (!a) {
            VrShellDelegate vrShellDelegate2 = VrShellDelegate.F;
            if (!(vrShellDelegate2 != null ? vrShellDelegate2.l : false) || vrShellDelegate2 == null) {
                return;
            }
            vrShellDelegate2.z(true, true);
            return;
        }
        VrModuleProvider.b().getClass();
        if (AbstractC7403li4.c() && a) {
            VrModuleProvider.b().getClass();
            if (AbstractC7403li4.J(activity, intent)) {
                return;
            }
        }
        VrShellDelegate vrShellDelegate3 = VrShellDelegate.F;
        if (vrShellDelegate3 != null && !vrShellDelegate3.z) {
            ChromeActivity chromeActivity = (ChromeActivity) activity;
            if (vrShellDelegate3.a != chromeActivity) {
                if (vrShellDelegate3.l) {
                    vrShellDelegate3.z(false, false);
                }
                vrShellDelegate3.a = chromeActivity;
            }
            VrShellDelegate vrShellDelegate4 = VrShellDelegate.F;
            vrShellDelegate4.exitWebVRPresent();
            vrShellDelegate4.y = false;
        }
        VrShellDelegate vrShellDelegate5 = VrShellDelegate.F;
        if (vrShellDelegate5 == null || !vrShellDelegate5.l) {
            VrModuleProvider.b().getClass();
            AbstractC7403li4.b(activity);
        }
        VrShellDelegate.w(activity, true);
        VrModuleProvider.b().getClass();
        AbstractC7403li4.U(activity);
    }

    @Override // defpackage.AbstractC7403li4
    public final void V(Activity activity) {
        VrShellDelegate.w(activity, true);
    }

    @Override // defpackage.AbstractC7403li4
    public final void e(Activity activity, Bundle bundle) {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        Hi4 d = VrModuleProvider.d();
        Intent intent = activity.getIntent();
        d.getClass();
        if (Hi4.a(activity, intent)) {
            VrShellDelegate.w(activity, true);
        } else {
            if (bundle == null || !bundle.getBoolean("in_vr", false)) {
                return;
            }
            AndroidCompat.setVrModeEnabled(activity, false);
            VrShellDelegate.f11534J.remove(activity);
        }
    }

    @Override // defpackage.AbstractC7403li4
    public final void i() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (b.n.f()) {
            Mi4.a.a();
            InterfaceC9121qi4 interfaceC9121qi4 = VrModuleProvider.c;
            N.MhxC9zA0();
            N.M5BNAVgK();
            Activity activity = ApplicationStatus.c;
            if ((activity instanceof ChromeActivity) && ApplicationStatus.c(activity) == 3) {
                VrShellDelegate.p((ChromeActivity) activity);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC7403li4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(int r5, int r6) {
        /*
            r4 = this;
            r0 = 7212(0x1c2c, float:1.0106E-41)
            r1 = 1
            r2 = 0
            if (r5 != r0) goto L14
            org.chromium.chrome.browser.vr.VrShellDelegate r0 = org.chromium.chrome.browser.vr.VrShellDelegate.F
            if (r0 == 0) goto L2c
            r3 = -1
            if (r6 != r3) goto Lf
            r6 = r1
            goto L10
        Lf:
            r6 = r2
        L10:
            r0.r(r6)
            goto L2c
        L14:
            r6 = 7214(0x1c2e, float:1.0109E-41)
            if (r5 != r6) goto L2e
            org.chromium.chrome.browser.vr.VrShellDelegate r6 = org.chromium.chrome.browser.vr.VrShellDelegate.F
            if (r6 == 0) goto L2c
            int r6 = r6.g
            android.content.Context r0 = defpackage.V60.a
            java.lang.String r3 = "com.google.android.vr.inputmethod"
            int r0 = defpackage.AbstractC4983eg2.c(r0, r3)
            if (r6 != r0) goto L29
            goto L2c
        L29:
            org.chromium.chrome.browser.ApplicationLifetime.terminate(r1)
        L2c:
            r6 = r1
            goto L31
        L2e:
            org.chromium.chrome.browser.vr.VrShellDelegate r6 = org.chromium.chrome.browser.vr.VrShellDelegate.F
            r6 = r2
        L31:
            if (r6 != 0) goto L53
            r6 = 7213(0x1c2d, float:1.0108E-41)
            if (r5 != r6) goto L4e
            org.chromium.chrome.browser.vr.VrCoreInstallUtils r5 = org.chromium.chrome.browser.vr.VrCoreInstallUtils.b
            if (r5 == 0) goto L4c
            r6 = 0
            org.chromium.chrome.browser.vr.VrCoreInstallUtils.d = r6
            int r0 = org.chromium.chrome.browser.vr.VrCoreInstallUtils.getVrSupportLevel()
            if (r0 == r1) goto L46
            r0 = r1
            goto L47
        L46:
            r0 = r2
        L47:
            r5.a(r0)
            org.chromium.chrome.browser.vr.VrCoreInstallUtils.b = r6
        L4c:
            r5 = r1
            goto L4f
        L4e:
            r5 = r2
        L4f:
            if (r5 == 0) goto L52
            goto L53
        L52:
            r1 = r2
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8778pi4.x(int, int):boolean");
    }

    @Override // defpackage.AbstractC7403li4
    public final void B(boolean z) {
        if (!z) {
            VrShellDelegate vrShellDelegate = VrShellDelegate.F;
            return;
        }
        VrShellDelegate vrShellDelegate2 = VrShellDelegate.F;
        if (vrShellDelegate2 == null ? false : vrShellDelegate2.l) {
            vrShellDelegate2.z(true, true);
        }
    }

    @Override // defpackage.AbstractC7403li4
    public final void H(Bundle bundle) {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate == null ? false : vrShellDelegate.l) {
            bundle.putBoolean("in_vr", true);
        }
    }

    @Override // defpackage.AbstractC7403li4, defpackage.InterfaceC11521xi4
    public final boolean a() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate == null) {
            return false;
        }
        return vrShellDelegate.l;
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean d() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate == null ? false : vrShellDelegate.l) {
            vrShellDelegate.getClass();
            if (!VrShellDelegate.A() || VrShellDelegate.f11534J.contains(VrShellDelegate.F.a)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean onBackPressed() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate != null && VrCoreInstallUtils.getVrSupportLevel() > 1) {
            vrShellDelegate.d();
            if (vrShellDelegate.l) {
                Runnable runnable = vrShellDelegate.C;
                if (runnable == null) {
                    runnable = new RunnableC8097nj4(vrShellDelegate);
                    vrShellDelegate.C = runnable;
                }
                ((RunnableC8097nj4) runnable).run();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC7403li4
    public final void N(C10369uM c10369uM) {
        VrShellDelegate.u(c10369uM, 5);
    }

    @Override // defpackage.AbstractC7403li4
    public final void O(int i, Runnable runnable) {
        VrShellDelegate.u(new C6721jj4(runnable), i);
    }

    @Override // defpackage.AbstractC7403li4
    public final void R(Runnable runnable) {
        VrShellDelegate.u(new C6721jj4(runnable), 5);
    }

    @Override // defpackage.AbstractC7403li4
    public final void y(Activity activity) {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate == null || vrShellDelegate.a != activity) {
            return;
        }
        vrShellDelegate.v = true;
        if (!vrShellDelegate.l || vrShellDelegate.u) {
            return;
        }
        vrShellDelegate.i.onResume();
    }

    @Override // defpackage.AbstractC7403li4
    public final void v(Activity activity) {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate == null || vrShellDelegate.a != activity) {
            return;
        }
        vrShellDelegate.v = false;
        if (vrShellDelegate.l) {
            vrShellDelegate.i.onPause();
        }
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean A(int i, int i2) {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate == null) {
            return false;
        }
        int i3 = vrShellDelegate.B;
        if (i3 != 0) {
            vrShellDelegate.B = 0;
            if (i2 != i3) {
                return false;
            }
        } else {
            if (!vrShellDelegate.l && !vrShellDelegate.o) {
                return false;
            }
            vrShellDelegate.B = i;
        }
        return true;
    }

    @Override // defpackage.AbstractC7403li4
    public final void I() {
        final VrShell vrShell = VrShellDelegate.F.i;
        vrShell.getClass();
        vrShell.y.j(new Runnable() { // from class: Wi4
            @Override // java.lang.Runnable
            public final void run() {
                VrShell vrShell2 = VrShell.this;
                long j = vrShell2.A;
                if (j != 0) {
                    N.MPaO1wu2(j, vrShell2);
                }
            }
        });
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean g() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        return (vrShellDelegate == null || vrShellDelegate.B == 0) ? false : true;
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        if (VrShellDelegate.L == null) {
            VrShellDelegate.L = new C8385oa2();
        }
        return VrShellDelegate.L;
    }
}

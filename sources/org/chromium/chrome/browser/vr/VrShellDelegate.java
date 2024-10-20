package org.chromium.chrome.browser.vr;

import J.N;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import com.google.vr.ndk.base.AndroidCompat;
import com.google.vr.ndk.base.DaydreamApi;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC12248zp3;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7403li4;
import defpackage.C6378ij4;
import defpackage.C6715ji4;
import defpackage.C7928nE;
import defpackage.C8385oa2;
import defpackage.C8784pj4;
import defpackage.C9127qj4;
import defpackage.InterfaceC2352Sc2;
import defpackage.InterfaceC7338lX2;
import defpackage.O83;
import defpackage.RunnableC7409lj4;
import defpackage.RunnableC7753mj4;
import defpackage.UN;
import defpackage.V60;
import java.util.HashSet;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.b;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.webapps.WebappActivity;
import org.chromium.content.browser.ScreenOrientationProviderImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrShellDelegate implements View.OnSystemUiVisibilityChangeListener, InterfaceC7338lX2 {
    public static VrShellDelegate F;
    public static C8784pj4 G;
    public static C9127qj4 H;
    public static C6715ji4 I;

    /* renamed from: J */
    public static final HashSet f11534J = new HashSet();
    public static boolean K;
    public static C8385oa2 L;
    public boolean A;
    public int B;
    public Runnable C;
    public Runnable D;
    public long E;
    public ChromeActivity a;
    public int g;
    public final int h;
    public VrShell i;
    public Boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public InterfaceC2352Sc2 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public Integer x;
    public boolean y;
    public boolean z;

    @Override // defpackage.InterfaceC7338lX2
    public final void b() {
    }

    public final void v() {
        ScreenOrientationProviderImpl.getInstance().a = null;
        this.a.getWindow().clearFlags(128);
        Integer num = this.x;
        if (num != null) {
            this.a.setRequestedOrientation(num.intValue());
        }
        this.x = null;
        if (this.w) {
            this.a.getWindow().getDecorView().setSystemUiVisibility(this.a.getWindow().getDecorView().getSystemUiVisibility() & (-5895));
        }
        this.w = false;
        C8385oa2 c8385oa2 = this.a.r0;
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2)) {
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) c8385oa2.g;
            compositorViewHolder.I = false;
            compositorViewHolder.B();
        }
        this.a.getWindow().getAttributes().rotationAnimation = 0;
    }

    public static boolean A() {
        Context context = V60.a;
        return DaydreamApi.isDaydreamReadyPlatform(context) && DaydreamApi.supports2dInVr(context);
    }

    public static boolean h() {
        boolean z = F == null;
        VrShellDelegate vrShellDelegate = getInstance();
        if (vrShellDelegate == null) {
            return false;
        }
        int i = vrShellDelegate.i();
        if (i == 1 && z && F != null) {
            vrShellDelegate.z(false, false);
            long j = vrShellDelegate.E;
            if (j != 0) {
                N.M72yrhTB(j, vrShellDelegate);
            }
            vrShellDelegate.E = 0L;
            F = null;
        }
        return i != 1;
    }

    public static void p(Activity activity) {
        if (Build.VERSION.SDK_INT >= 24 && F == null) {
            VrModuleProvider.b().getClass();
            if ((activity instanceof ChromeTabbedActivity) || !K) {
                Integer num = VrCoreInstallUtils.d;
                if (num == null || num.intValue() == 3) {
                    try {
                        new C6378ij4().c(AbstractC0185Bl.e);
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }
    }

    public static VrShellDelegate k(ChromeActivity chromeActivity) {
        if (b.n.f() && chromeActivity != null) {
            if ((chromeActivity instanceof ChromeTabbedActivity) || (chromeActivity instanceof CustomTabActivity) || (chromeActivity instanceof WebappActivity)) {
                VrShellDelegate vrShellDelegate = F;
                if (vrShellDelegate != null) {
                    return vrShellDelegate;
                }
                Object obj = ThreadUtils.a;
                VrShellDelegate vrShellDelegate2 = new VrShellDelegate(chromeActivity);
                F = vrShellDelegate2;
                return vrShellDelegate2;
            }
        }
        return null;
    }

    public static VrShellDelegate getInstance() {
        Activity activity = ApplicationStatus.c;
        if (activity instanceof ChromeActivity) {
            return k((ChromeActivity) activity);
        }
        return null;
    }

    public static void u(InterfaceC2352Sc2 interfaceC2352Sc2, int i) {
        VrShellDelegate vrShellDelegate = F;
        if (vrShellDelegate == null || !vrShellDelegate.l) {
            interfaceC2352Sc2.b();
            return;
        }
        boolean z = !A();
        VrModuleProvider.b().getClass();
        if (AbstractC7403li4.c()) {
            w(vrShellDelegate.a, false);
            interfaceC2352Sc2.b();
            return;
        }
        if (vrShellDelegate.s != null) {
            interfaceC2352Sc2.a();
            return;
        }
        vrShellDelegate.s = interfaceC2352Sc2;
        vrShellDelegate.q = z;
        VrShell vrShell = vrShellDelegate.i;
        long j = vrShell.A;
        if (j == 0) {
            return;
        }
        if (!z) {
            VrShellDelegate vrShellDelegate2 = vrShell.h;
            vrShellDelegate2.q = false;
            vrShellDelegate2.t = true;
            if (vrShellDelegate2.y(true)) {
                return;
            }
            vrShellDelegate2.c(false);
            return;
        }
        N.M9a3AJig(j, vrShell, i);
    }

    public static void w(Activity activity, boolean z) {
        f();
        if (L == null) {
            L = new C8385oa2();
        }
        HashSet hashSet = f11534J;
        if (z) {
            if (hashSet.contains(activity)) {
                return;
            }
            AndroidCompat.setVrModeEnabled(activity, true);
            hashSet.add(activity);
            L.p(Boolean.TRUE);
            return;
        }
        if (hashSet.contains(activity)) {
            AndroidCompat.setVrModeEnabled(activity, false);
            hashSet.remove(activity);
            L.p(Boolean.FALSE);
        }
    }

    public static C6715ji4 l() {
        if (I == null) {
            I = new C6715ji4();
        }
        return I;
    }

    public static boolean n() {
        VrShellDelegate vrShellDelegate = F;
        return vrShellDelegate != null ? vrShellDelegate.o() : l().b();
    }

    public static PendingIntent j(ChromeActivity chromeActivity) {
        ChromeActivity chromeActivity2;
        C8784pj4 c8784pj4 = G;
        if (c8784pj4 != null && (chromeActivity2 = (ChromeActivity) c8784pj4.a.get()) != null) {
            try {
                chromeActivity2.unregisterReceiver(c8784pj4);
            } catch (IllegalArgumentException unused) {
            }
        }
        IntentFilter intentFilter = new IntentFilter("org.chromium.chrome.browser.vr.VrEntryResult");
        C8784pj4 c8784pj42 = new C8784pj4(chromeActivity);
        V60.d(chromeActivity, c8784pj42, intentFilter);
        G = c8784pj42;
        Intent intent = new Intent("org.chromium.chrome.browser.vr.VrEntryResult");
        intent.setPackage(chromeActivity.getPackageName());
        return PendingIntent.getBroadcast(chromeActivity, 0, intent, 201326592);
    }

    public static void f() {
        if (H != null) {
            return;
        }
        C9127qj4 c9127qj4 = new C9127qj4();
        H = c9127qj4;
        ApplicationStatus.f(c9127qj4);
    }

    public VrShellDelegate(ChromeActivity chromeActivity) {
        this.a = chromeActivity;
        this.u = ApplicationStatus.c(chromeActivity) != 3;
        this.v = chromeActivity.hasWindowFocus();
        this.E = N.M7uQy4b6(this);
        C7928nE c7928nE = UN.a;
        this.h = N.M37SqSAy("VrBrowsingFeedback", "feedback_frequency", 10);
        f();
        if (!this.u) {
            s();
        }
        F = this;
    }

    public final void q(boolean z) {
        long j = this.E;
        if (j == 0 || !this.y) {
            return;
        }
        N.MXq5KpR$(j, this, z);
        this.y = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.vr.VrShellDelegate.g():void");
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        if (this.l) {
            if ((this.a.getWindow().getDecorView().getSystemUiVisibility() & 5894) == 5894 && this.a.getResources().getConfiguration().orientation == 2) {
                return;
            }
            x();
        }
    }

    @Override // defpackage.InterfaceC7338lX2
    public final boolean a(Activity activity, int i) {
        if (this.a != activity || this.x == null) {
            return true;
        }
        this.x = Integer.valueOf(i);
        return false;
    }

    public final void x() {
        C8385oa2 c8385oa2 = this.a.r0;
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2)) {
            ((CompositorViewHolder) c8385oa2.g).I = true;
        }
        ScreenOrientationProviderImpl.getInstance().a = this;
        AbstractC7403li4 b = VrModuleProvider.b();
        ChromeActivity chromeActivity = this.a;
        b.getClass();
        AbstractC7403li4.U(chromeActivity);
        if (this.x == null) {
            this.x = Integer.valueOf(this.a.getRequestedOrientation());
        }
        this.w = true;
        this.a.getWindow().getAttributes().rotationAnimation = 2;
        this.a.setRequestedOrientation(0);
    }

    public final void presentRequested() {
        this.y = true;
        VrModuleProvider.b().getClass();
        if (AbstractC7403li4.c() && !this.l) {
            q(false);
            return;
        }
        int i = i();
        if (i == 0) {
            this.i.e(true);
            q(true);
        } else if (i == 1) {
            q(false);
        } else if (i != 2) {
            if (i == 3) {
                q(true);
            } else {
                AbstractC4851eH1.a("VrShellDelegate", "Unexpected enum.", new Object[0]);
            }
        }
    }

    public final int i() {
        if (this.u) {
            return 1;
        }
        boolean z = false;
        if (this.l) {
            return 0;
        }
        if (!VrCoreInstallUtils.vrSupportNeedsUpdate()) {
            VrCoreInstallUtils.getVrSupportLevel();
            if (this.y) {
                z = true;
            }
        }
        if (!z) {
            return 1;
        }
        if (VrCoreInstallUtils.getVrSupportLevel() == 3 && o()) {
            C6715ji4 l = l();
            PendingIntent j = j(this.a);
            DaydreamApi a = l.a();
            if (a != null) {
                a.launchInVr(j);
            }
            this.k = true;
            return 2;
        }
        g();
        return 2;
    }

    public void exitWebVRPresent() {
        if (this.l) {
            if (this.A) {
                this.i.e(false);
            } else if (o()) {
                l().c();
            } else {
                z(true, true);
            }
        }
    }

    public final boolean e() {
        if (!this.m) {
            return false;
        }
        this.n = true;
        Bundle bundle = ActivityOptions.makeCustomAnimation(this.a, 0, 0).toBundle();
        Intent e = VrModuleProvider.d().e(new Intent(this.a, (Class<?>) VrCancelAnimationActivity.class));
        e.setFlags(e.getFlags() & (-268435457));
        this.a.startActivity(e, bundle);
        this.m = false;
        return true;
    }

    public final void s() {
        if (this.m) {
            if (Build.VERSION.SDK_INT < 24) {
                return;
            }
            new Handler().postDelayed(new RunnableC7409lj4(this), Settings.Global.getFloat(this.a.getContentResolver(), "window_animation_scale", 1.0f) * 500.0f);
            return;
        }
        this.u = false;
        this.n = false;
        if (this.l && this.v) {
            this.i.onResume();
        }
        long j = this.E;
        if (j != 0) {
            N.MwPjVrWz(j, this);
        }
        new Handler().post(new RunnableC7753mj4(this));
        if (this.o) {
            m();
        } else {
            if (this.k) {
                q(false);
                z(true, false);
            }
            if (!this.l && this.B != 0 && this.a.getResources().getConfiguration().densityDpi != this.B) {
                this.a.recreate();
            }
        }
        this.k = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r7 = this;
            r7.x()
            boolean r0 = r7.l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            r7.q(r1)
            r7.o = r2
            return
        Lf:
            long r3 = r7.E
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L18
            goto L2b
        L18:
            boolean r0 = org.chromium.chrome.browser.vr.VrCoreInstallUtils.vrSupportNeedsUpdate()
            if (r0 == 0) goto L20
        L1e:
            r0 = r2
            goto L29
        L20:
            org.chromium.chrome.browser.vr.VrCoreInstallUtils.getVrSupportLevel()
            boolean r0 = r7.y
            if (r0 != 0) goto L28
            goto L1e
        L28:
            r0 = r1
        L29:
            if (r0 != 0) goto L2d
        L2b:
            r1 = r2
            goto L35
        L2d:
            r7.g()
            java.lang.String r0 = "VR.DON"
            defpackage.FI2.a(r0)
        L35:
            if (r1 != 0) goto L41
            r7.d()
            ji4 r0 = l()
            r0.c()
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.vr.VrShellDelegate.m():void");
    }

    public final boolean y(boolean z) {
        boolean z2;
        if (!o()) {
            return false;
        }
        if (A()) {
            w(this.a, false);
            c(true);
            return true;
        }
        try {
            C6715ji4 l = l();
            ChromeActivity chromeActivity = this.a;
            Intent intent = new Intent();
            DaydreamApi a = l.a();
            if (a == null) {
                z2 = false;
            } else {
                a.exitFromVr(chromeActivity, 7212, intent);
                z2 = true;
            }
            if (z2) {
                this.p = true;
                this.r = z;
                return true;
            }
        } catch (IllegalArgumentException | SecurityException unused) {
        }
        if (!z) {
            l().c();
        }
        return false;
    }

    public final void r(boolean z) {
        if (this.p) {
            if (!this.r && !z) {
                l().c();
            }
            this.p = false;
            if (z) {
                z(true, true);
            }
            c(z);
        }
    }

    public final boolean o() {
        if (this.j == null) {
            this.j = Boolean.valueOf(l().b());
        }
        return this.j.booleanValue();
    }

    public final void d() {
        AbstractC7403li4 b = VrModuleProvider.b();
        ChromeActivity chromeActivity = this.a;
        b.getClass();
        AbstractC7403li4.L(chromeActivity, false);
        this.o = false;
        q(false);
        if (this.p) {
            return;
        }
        w(this.a, false);
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115 A[LOOP:0: B:47:0x010f->B:49:0x0115, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.vr.VrShellDelegate.z(boolean, boolean):void");
    }

    public final void c(boolean z) {
        InterfaceC2352Sc2 interfaceC2352Sc2 = this.s;
        if (interfaceC2352Sc2 != null) {
            if (z) {
                interfaceC2352Sc2.b();
            } else {
                interfaceC2352Sc2.a();
            }
        }
        this.s = null;
    }

    public final long getNativePointer() {
        return this.E;
    }

    public static void t(boolean z) {
        if (z) {
            N.Mb9hqS1F();
            K = true;
        }
        O83.a.p("should_register_vr_assets_component_on_startup", z);
    }
}

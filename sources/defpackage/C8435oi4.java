package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.chrome.R;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.library_loader.b;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oi4 */
/* loaded from: classes2.dex */
public final class C8435oi4 extends AbstractC7403li4 {
    @Override // defpackage.AbstractC7403li4
    public final boolean A(int i, int i2) {
        return false;
    }

    @Override // defpackage.AbstractC7403li4
    public final void B(boolean z) {
    }

    @Override // defpackage.AbstractC7403li4
    public final void D() {
    }

    @Override // defpackage.AbstractC7403li4
    public final void G(Activity activity, Intent intent) {
    }

    @Override // defpackage.AbstractC7403li4
    public final void H(Bundle bundle) {
    }

    @Override // defpackage.AbstractC7403li4
    public final void I() {
    }

    @Override // defpackage.AbstractC7403li4
    public final void V(Activity activity) {
    }

    @Override // defpackage.AbstractC7403li4, defpackage.InterfaceC11521xi4
    public final boolean a() {
        return false;
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean d() {
        return true;
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean f() {
        return false;
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean g() {
        return false;
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
    }

    @Override // defpackage.AbstractC7403li4
    public final void i() {
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean onBackPressed() {
        return false;
    }

    @Override // defpackage.AbstractC7403li4
    public final void t(Activity activity) {
    }

    @Override // defpackage.AbstractC7403li4
    public final void u() {
    }

    @Override // defpackage.AbstractC7403li4
    public final void v(Activity activity) {
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean x(int i, int i2) {
        return false;
    }

    @Override // defpackage.AbstractC7403li4
    public final void y(Activity activity) {
    }

    @Override // defpackage.AbstractC7403li4
    public final boolean n() {
        return V60.a.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance");
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return new C8385oa2();
    }

    @Override // defpackage.AbstractC7403li4
    public final void N(C10369uM c10369uM) {
        c10369uM.b();
    }

    @Override // defpackage.AbstractC7403li4
    public final void R(Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.AbstractC7403li4
    public final void O(int i, Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.AbstractC7403li4
    public final void o(final Activity activity, Intent intent) {
        VrModuleProvider.d().getClass();
        if (Hi4.a(activity, intent)) {
            if (AbstractC7403li4.c() && AbstractC7403li4.J(activity, intent)) {
                return;
            }
            AbstractC7403li4.b(activity);
            AbstractC7403li4.U(activity);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Mi4.a.d(new Oi4(new InterfaceC2401Sm1() { // from class: mi4
                @Override // defpackage.InterfaceC2401Sm1
                public final void a(boolean z) {
                    C8435oi4.this.getClass();
                    if (atomicBoolean.getAndSet(true)) {
                        return;
                    }
                    Activity activity2 = ApplicationStatus.c;
                    if (!z) {
                        C8435oi4.W(activity2);
                    } else if (b.n.f()) {
                        if (ApplicationStatus.c(activity2) == 3) {
                            VrModuleProvider.b().f();
                        }
                    }
                }
            }));
            PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: ni4
                @Override // java.lang.Runnable
                public final void run() {
                    C8435oi4.this.getClass();
                    if (atomicBoolean.getAndSet(true)) {
                        return;
                    }
                    C8435oi4.W(activity);
                }
            }, 1500L);
        }
    }

    @Override // defpackage.AbstractC7403li4
    public final void e(Activity activity, Bundle bundle) {
        Hi4 d = VrModuleProvider.d();
        Intent intent = activity.getIntent();
        d.getClass();
        if (Hi4.a(activity, intent) && AbstractC7403li4.c()) {
            boolean z = true;
            try {
                activity.setVrModeEnabled(true, new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService"));
            } catch (PackageManager.NameNotFoundException e) {
                AbstractC4851eH1.a("VrDelegateFallback", "Cannot unset VR mode", e);
                z = false;
            }
            if (z) {
                return;
            }
            activity.finish();
        }
    }

    public static void W(Activity activity) {
        if (!AbstractC7403li4.c()) {
            PostTask.b(AbstractC5103f04.a, new RunnableC10492ui4(activity), 2000L);
            activity.finish();
            return;
        }
        boolean z = true;
        try {
            activity.setVrModeEnabled(false, new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService"));
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC4851eH1.a("VrDelegateFallback", "Cannot unset VR mode", e);
            z = false;
        }
        if (!z) {
            activity.finish();
        } else {
            AbstractC7403li4.L(activity, false);
            ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140bb4, 0, V60.a).d();
        }
    }
}

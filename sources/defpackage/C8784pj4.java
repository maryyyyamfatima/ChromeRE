package defpackage;

import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.chrome.R;
import com.google.vr.ndk.base.DaydreamApi;
import java.lang.ref.WeakReference;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pj4 */
/* loaded from: classes4.dex */
public final class C8784pj4 extends BroadcastReceiver {
    public final WeakReference a;

    public C8784pj4(ChromeActivity chromeActivity) {
        VrShellDelegate.f();
        this.a = new WeakReference(chromeActivity);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ChromeActivity chromeActivity = (ChromeActivity) this.a.get();
        if (chromeActivity == null) {
            return;
        }
        VrShellDelegate.k(chromeActivity);
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate == null) {
            return;
        }
        vrShellDelegate.o = true;
        vrShellDelegate.k = false;
        VrShellDelegate.w(vrShellDelegate.a, true);
        if (!VrShellDelegate.F.l) {
            AbstractC7403li4 b = VrModuleProvider.b();
            ChromeActivity chromeActivity2 = VrShellDelegate.F.a;
            b.getClass();
            AbstractC7403li4.b(chromeActivity2);
        }
        VrShellDelegate vrShellDelegate2 = VrShellDelegate.F;
        if (!vrShellDelegate2.u) {
            vrShellDelegate2.m();
            return;
        }
        if (!(chromeActivity instanceof ChromeTabbedActivity)) {
            int i = (vrShellDelegate2.l || !AbstractC7403li4.h) ? 0 : R.anim.0_resource_name_obfuscated_res_0x7f02004f;
            VrShellDelegate.F.m = i != 0;
            ((ActivityManager) chromeActivity.getSystemService("activity")).moveTaskToFront(chromeActivity.getTaskId(), 0, ActivityOptions.makeCustomAnimation(chromeActivity, i, 0).toBundle());
            return;
        }
        Intent e = VrModuleProvider.d().e(new Intent(chromeActivity, chromeActivity.getClass()));
        VrShellDelegate.F.z = true;
        C6715ji4 l = VrShellDelegate.l();
        PendingIntent activity = PendingIntent.getActivity(chromeActivity, 0, e, 134217728 | AbstractC2281Ro1.d(false));
        DaydreamApi a = l.a();
        if (a == null) {
            return;
        }
        a.launchInVr(activity);
    }
}

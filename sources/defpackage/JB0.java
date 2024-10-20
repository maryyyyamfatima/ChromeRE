package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.util.LinkedList;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JB0 extends AbstractC0185Bl {
    public final /* synthetic */ KB0 h;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Context context = V60.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        PackageManager packageManager = context.getPackageManager();
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        boolean g = AX.e().g("force-device-ownership");
        boolean z = false;
        for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
            if (devicePolicyManager.isProfileOwnerApp(packageInfo.packageName)) {
                z = true;
            }
            if (devicePolicyManager.isDeviceOwnerApp(packageInfo.packageName)) {
                g = true;
            }
            if (z && g) {
                break;
            }
        }
        EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "EnterpriseCheck.IsRunningOnManagedProfileDuration");
        return new FB0(g, z);
    }

    public JB0(KB0 kb0) {
        this.h = kb0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        KB0 kb0 = this.h;
        kb0.getClass();
        Object obj2 = ThreadUtils.a;
        kb0.c = (FB0) obj;
        while (true) {
            LinkedList linkedList = kb0.d;
            if (linkedList.size() <= 0) {
                return;
            } else {
                ((Callback) linkedList.remove()).onResult(kb0.c);
            }
        }
    }
}

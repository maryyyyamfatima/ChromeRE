package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityManager;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XK0 implements InterfaceC2173Qs3 {
    public final /* synthetic */ ZK0 a;
    public final /* synthetic */ Activity b;

    public XK0(ZK0 zk0, Activity activity) {
        this.a = zk0;
        this.b = activity;
    }

    @Override // defpackage.InterfaceC2173Qs3
    public final void a() {
        ZK0 zk0 = this.a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) zk0.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            try {
                accessibilityManager.interrupt();
            } catch (NullPointerException unused) {
            }
            zk0.announceForAccessibility(this.b.getResources().getString(R.string.f66300_resource_name_obfuscated_res_0x7f140164));
        }
        FI2.a("MobilePullGestureReloadNTP");
    }
}

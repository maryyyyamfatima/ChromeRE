package defpackage;

import org.chromium.chrome.browser.vr.VrCoreInstallUtils;
import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ij4 */
/* loaded from: classes4.dex */
public final class C6378ij4 extends AbstractC0185Bl {
    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        if (((Integer) obj).intValue() == 3 && !VrShellDelegate.K) {
            VrShellDelegate.t(VrShellDelegate.n());
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return Integer.valueOf(VrCoreInstallUtils.getVrSupportLevel());
    }
}

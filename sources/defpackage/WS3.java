package defpackage;

import org.chromium.chrome.browser.firstrun.TosAndUmaFirstRunFragmentWithEnterpriseSupport;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WS3 implements InterfaceC0024Ae3 {
    public final /* synthetic */ TosAndUmaFirstRunFragmentWithEnterpriseSupport a;

    @Override // defpackage.InterfaceC0024Ae3
    public final String a() {
        return this.a.m0 ? "MobileFre.CctTos.EnterprisePolicyCheckSpeed2.SlowerThanInflation" : "MobileFre.CctTos.EnterprisePolicyCheckSpeed2.FasterThanInflation";
    }

    @Override // defpackage.InterfaceC0024Ae3
    public final String b() {
        return this.a.m0 ? "MobileFre.CctTos.IsDeviceOwnedCheckSpeed2.SlowerThanInflation" : "MobileFre.CctTos.IsDeviceOwnedCheckSpeed2.FasterThanInflation";
    }

    public WS3(TosAndUmaFirstRunFragmentWithEnterpriseSupport tosAndUmaFirstRunFragmentWithEnterpriseSupport) {
        this.a = tosAndUmaFirstRunFragmentWithEnterpriseSupport;
    }
}

package defpackage;

import org.chromium.chrome.browser.firstrun.LightweightFirstRunActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eB1 */
/* loaded from: classes.dex */
public final class C4821eB1 implements InterfaceC0024Ae3 {
    public final /* synthetic */ LightweightFirstRunActivity a;

    @Override // defpackage.InterfaceC0024Ae3
    public final String a() {
        return this.a.h0 ? "MobileFre.Lightweight.EnterprisePolicyCheckSpeed.SlowerThanInflation" : "MobileFre.Lightweight.EnterprisePolicyCheckSpeed.FasterThanInflation";
    }

    @Override // defpackage.InterfaceC0024Ae3
    public final String b() {
        return this.a.h0 ? "MobileFre.Lightweight.IsDeviceOwnedCheckSpeed.SlowerThanInflation" : "MobileFre.Lightweight.IsDeviceOwnedCheckSpeed.FasterThanInflation";
    }

    public C4821eB1(LightweightFirstRunActivity lightweightFirstRunActivity) {
        this.a = lightweightFirstRunActivity;
    }
}

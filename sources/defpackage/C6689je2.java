package defpackage;

import J.N;
import java.util.HashMap;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: je2 */
/* loaded from: classes.dex */
public final class C6689je2 implements InterfaceC10665vC2 {
    public final /* synthetic */ C7033ke2 a;

    @Override // defpackage.InterfaceC10665vC2
    public final void b(Profile profile) {
    }

    public C6689je2(C7033ke2 c7033ke2) {
        this.a = c7033ke2;
    }

    @Override // defpackage.InterfaceC10665vC2
    public final void d(Profile profile) {
        C7033ke2 c7033ke2 = this.a;
        if (c7033ke2.a.containsKey(profile)) {
            HashMap hashMap = c7033ke2.a;
            OptimizationGuideBridge optimizationGuideBridge = (OptimizationGuideBridge) hashMap.get(profile);
            optimizationGuideBridge.getClass();
            Object obj = ThreadUtils.a;
            long j = optimizationGuideBridge.a;
            if (j != 0) {
                N.M2siX4Rz(j);
                optimizationGuideBridge.a = 0L;
            }
            hashMap.remove(profile);
        }
    }
}

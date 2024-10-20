package defpackage;

import J.N;
import java.util.HashMap;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ke2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7033ke2 {
    public final HashMap a = new HashMap();
    public final List b;
    public final C6689je2 c;

    public C7033ke2(List list) {
        this.b = list;
        if (this.c == null) {
            C6689je2 c6689je2 = new C6689je2(this);
            this.c = c6689je2;
            ProfileManager.a(c6689je2);
        }
    }

    public final OptimizationGuideBridge a() {
        Profile d = Profile.d();
        HashMap hashMap = this.a;
        OptimizationGuideBridge optimizationGuideBridge = (OptimizationGuideBridge) hashMap.get(d);
        if (optimizationGuideBridge == null) {
            optimizationGuideBridge = new OptimizationGuideBridge();
            List list = this.b;
            if (list.size() > 0) {
                Object obj = ThreadUtils.a;
                if (optimizationGuideBridge.a != 0) {
                    int[] iArr = new int[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        iArr[i] = ((R71) list.get(i)).a;
                    }
                    N.MqYUgADF(optimizationGuideBridge.a, iArr);
                }
            }
            hashMap.put(d, optimizationGuideBridge);
        }
        return optimizationGuideBridge;
    }
}

package defpackage;

import J.N;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X74 implements InterfaceC12080zL0 {
    public final boolean a;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    public X74(Profile profile) {
        this.a = profile.i();
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        if (this.a) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Chrome Variations", N.Mkq2qJev());
        return hashMap;
    }
}

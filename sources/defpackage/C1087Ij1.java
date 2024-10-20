package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ij1 */
/* loaded from: classes.dex */
public final class C1087Ij1 implements Callback {
    public final /* synthetic */ C1347Kj1 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C1087Ij1(C1347Kj1 c1347Kj1) {
        this.a = c1347Kj1;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C1347Kj1 c1347Kj1 = this.a;
        c1347Kj1.n = (Profile) obj;
        c1347Kj1.d();
    }
}

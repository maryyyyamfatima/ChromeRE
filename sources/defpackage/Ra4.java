package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.video_tutorials.Tutorial;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class Ra4 implements Callback {
    public final /* synthetic */ Ta4 a;

    public /* synthetic */ Ra4(Ta4 ta4) {
        this.a = ta4;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.b((Tutorial) obj);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}

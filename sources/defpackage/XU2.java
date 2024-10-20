package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.offlinepages.OfflinePageItem;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XU2 implements Callback {
    public final /* synthetic */ YU2 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public XU2(YU2 yu2) {
        this.a = yu2;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        YU2 yu2 = this.a;
        WindowAndroid windowAndroid = yu2.a;
        AbstractC2217Rb2.h(yu2.b, (OfflinePageItem) obj, windowAndroid);
    }
}

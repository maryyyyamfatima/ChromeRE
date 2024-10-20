package defpackage;

import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dy1 */
/* loaded from: classes.dex */
public final class C4745dy1 implements Callback {
    public final /* synthetic */ InterfaceC7697ma2 a;
    public final /* synthetic */ AbstractC5777gy1 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C4745dy1(AbstractC5777gy1 abstractC5777gy1, C8385oa2 c8385oa2) {
        this.g = abstractC5777gy1;
        this.a = c8385oa2;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        TabContentManager tabContentManager = (TabContentManager) obj;
        C4402cy1 c4402cy1 = new C4402cy1(this);
        ArrayList arrayList = tabContentManager.g;
        if (!arrayList.contains(c4402cy1)) {
            arrayList.add(c4402cy1);
        }
        AbstractC2976Wx1 abstractC2976Wx1 = this.g.S;
        if (abstractC2976Wx1 != null) {
            abstractC2976Wx1.G(tabContentManager);
        }
        ((C8385oa2) this.a).n(this);
    }
}

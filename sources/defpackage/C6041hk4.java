package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.webapps.WebApkInstaller;
import org.chromium.chrome.browser.webapps.WebappRegistry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hk4 */
/* loaded from: classes2.dex */
public final class C6041hk4 implements Callback {
    public final /* synthetic */ String a;
    public final /* synthetic */ int g;
    public final /* synthetic */ WebApkInstaller h;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C6041hk4(WebApkInstaller webApkInstaller, String str, int i) {
        this.h = webApkInstaller;
        this.a = str;
        this.g = i;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Integer num = (Integer) obj;
        this.h.a(num.intValue());
        if (num.intValue() == 1) {
            return;
        }
        WebappRegistry webappRegistry = Wn4.a;
        String b = On4.b(this.a);
        C5697gk4 c5697gk4 = new C5697gk4(this);
        webappRegistry.getClass();
        new Un4(webappRegistry, b, c5697gk4).c(AbstractC0185Bl.e);
    }
}

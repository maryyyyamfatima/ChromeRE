package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: As3 */
/* loaded from: classes.dex */
public final class C0094As3 extends BA0 {
    public final /* synthetic */ C0224Bs3 a;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            C0224Bs3 c0224Bs3 = this.a;
            if (c0224Bs3.h != null) {
                c0224Bs3.e();
                c0224Bs3.g();
                C2303Rs3 c2303Rs3 = c0224Bs3.h;
                c2303Rs3.a = null;
                c2303Rs3.g = null;
                c0224Bs3.h = null;
            }
        }
    }

    public C0094As3(C0224Bs3 c0224Bs3) {
        this.a = c0224Bs3;
    }
}

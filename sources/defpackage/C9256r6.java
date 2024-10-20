package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r6 */
/* loaded from: classes.dex */
public final class C9256r6 extends BA0 {
    public final /* synthetic */ C9599s6 a;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            this.a.c = null;
        }
    }

    public C9256r6(C9599s6 c9599s6) {
        this.a = c9599s6;
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        tab.w(this);
    }
}

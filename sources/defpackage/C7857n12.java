package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7857n12 {
    public final Tab a;
    public final JC b;
    public final InterfaceC10590uz3 c;

    public C7857n12(Tab tab, CC cc, InterfaceC10590uz3 interfaceC10590uz3) {
        this.a = tab;
        this.b = cc;
        this.c = interfaceC10590uz3;
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b(LoadUrlParams loadUrlParams, boolean z) {
        Tab tab = this.a;
        if (z && !tab.isIncognito()) {
            ((AbstractC11276wz3) this.c).r(loadUrlParams, 4, tab, true);
        } else {
            tab.d(loadUrlParams);
        }
    }
}

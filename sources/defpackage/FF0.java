package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FF0 implements InterfaceC8544p12 {
    public final InterfaceC0079Ap3 a;

    @Override // defpackage.InterfaceC8544p12
    public final Tab a(LoadUrlParams loadUrlParams) {
        return null;
    }

    @Override // defpackage.InterfaceC8544p12
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.InterfaceC8544p12
    public final boolean c() {
        return false;
    }

    public FF0(InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.a = interfaceC0079Ap3;
    }

    @Override // defpackage.InterfaceC8544p12
    public final Tab d(int i, LoadUrlParams loadUrlParams) {
        Tab b = AbstractC5241fQ2.b(loadUrlParams, i == 4, Boolean.valueOf(i == 8), (Tab) this.a.get());
        FI2.a("ContentSuggestions.Feed.CardAction.Open.StartSurface");
        return b;
    }

    @Override // defpackage.InterfaceC8544p12
    public final boolean e() {
        return N.M$3vpOHw();
    }
}

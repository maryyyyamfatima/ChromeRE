package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uA3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10313uA3 implements InterfaceC9819sl {
    public final Tab a;
    public final Runnable b;

    @Override // defpackage.InterfaceC9819sl
    public final WebContents b() {
        return null;
    }

    public C10313uA3(Tab tab, RunnableC1700Nc0 runnableC1700Nc0) {
        this.a = tab;
        this.b = runnableC1700Nc0;
    }

    @Override // defpackage.InterfaceC9819sl
    public final Tab a() {
        return this.a;
    }
}

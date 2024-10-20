package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl;
import org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HN implements ContextMenuPopulatorFactory {
    public final C60 a;
    public final InterfaceC0079Ap3 b;
    public final int c;
    public final C4502dG0 d;

    public HN(C7136kv3 c7136kv3, InterfaceC0079Ap3 interfaceC0079Ap3, int i, C4502dG0 c4502dG0) {
        this.a = c7136kv3;
        this.b = interfaceC0079Ap3;
        this.c = i;
        this.d = c4502dG0;
    }

    @Override // org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory
    public final void onDestroy() {
        this.a.getClass();
    }

    @Override // org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory
    public final K60 a(Context context, ContextMenuParams contextMenuParams, ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl) {
        return new GN(this.a, this.b, this.c, this.d, context, contextMenuParams, contextMenuNativeDelegateImpl);
    }
}

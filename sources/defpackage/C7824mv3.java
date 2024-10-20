package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl;
import org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mv3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7824mv3 implements ContextMenuPopulatorFactory {
    public final ContextMenuPopulatorFactory a;
    public final Tab b;

    public C7824mv3(ContextMenuPopulatorFactory contextMenuPopulatorFactory, Tab tab) {
        this.a = contextMenuPopulatorFactory;
        this.b = tab;
    }

    @Override // org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory
    public final void onDestroy() {
        ContextMenuPopulatorFactory contextMenuPopulatorFactory = this.a;
        if (contextMenuPopulatorFactory != null) {
            contextMenuPopulatorFactory.onDestroy();
        }
    }

    @Override // org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory
    public final K60 a(Context context, ContextMenuParams contextMenuParams, ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl) {
        return new C7480lv3(this.a.a(context, contextMenuParams, contextMenuNativeDelegateImpl), this.b);
    }
}

package org.chromium.chrome.browser.contextmenu;

import android.content.Context;
import defpackage.K60;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public interface ContextMenuPopulatorFactory {
    K60 a(Context context, ContextMenuParams contextMenuParams, ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl);

    void onDestroy();
}

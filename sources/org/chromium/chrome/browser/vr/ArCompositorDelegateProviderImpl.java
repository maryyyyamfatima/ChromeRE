package org.chromium.chrome.browser.vr;

import defpackage.C0695Fj;
import org.chromium.components.webxr.ArCompositorDelegateProvider;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ArCompositorDelegateProviderImpl implements ArCompositorDelegateProvider {
    @Override // org.chromium.components.webxr.ArCompositorDelegateProvider
    public final C0695Fj a(WebContents webContents) {
        return new C0695Fj(webContents);
    }
}

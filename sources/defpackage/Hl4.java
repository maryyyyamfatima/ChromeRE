package defpackage;

import org.chromium.content.browser.framehost.RenderFrameHostDelegate;
import org.chromium.content.browser.framehost.RenderFrameHostImpl;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class Hl4 {
    public static WebContents a(RenderFrameHost renderFrameHost) {
        RenderFrameHostDelegate renderFrameHostDelegate = ((RenderFrameHostImpl) renderFrameHost).b;
        if (renderFrameHostDelegate == null || !(renderFrameHostDelegate instanceof WebContents)) {
            return null;
        }
        return (WebContents) renderFrameHostDelegate;
    }
}

package defpackage;

import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sp2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2417Sp2 {
    public static WebContents a(RenderFrameHost renderFrameHost) {
        WebContents a = Hl4.a(renderFrameHost);
        if (a == null || a.isDestroyed()) {
            return null;
        }
        return a;
    }
}

package org.chromium.components.segmentation_platform;

import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PageLoadTriggerContext extends TriggerContext {
    public final WebContents a;

    public static PageLoadTriggerContext createPageLoadTriggerContext(WebContents webContents) {
        return new PageLoadTriggerContext(webContents);
    }

    public PageLoadTriggerContext(WebContents webContents) {
        this.a = webContents;
    }
}

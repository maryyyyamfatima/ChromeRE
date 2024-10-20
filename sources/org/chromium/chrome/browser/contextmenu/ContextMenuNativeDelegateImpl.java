package org.chromium.chrome.browser.contextmenu;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContextMenuNativeDelegateImpl {
    public final RenderFrameHost a;
    public long b;

    public ContextMenuNativeDelegateImpl(WebContents webContents, RenderFrameHost renderFrameHost, ContextMenuParams contextMenuParams) {
        this.a = renderFrameHost;
        this.b = N.Mz9Ykykf(webContents, contextMenuParams);
    }

    public final void a(final Callback callback, int i) {
        long j = this.b;
        if (j == 0) {
            return;
        }
        N.M4wUt4Cl(j, this, this.a, new Callback() { // from class: J60
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ContextMenuNativeDelegateImpl.ImageCallbackResult imageCallbackResult = (ContextMenuNativeDelegateImpl.ImageCallbackResult) obj;
                AbstractC5832h73.e(imageCallbackResult.a, imageCallbackResult.b, Callback.this);
            }
        }, 2048, 2048, i);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class ImageCallbackResult {
        public final byte[] a;
        public final String b;

        public ImageCallbackResult(String str, byte[] bArr) {
            this.a = bArr;
            this.b = str;
        }
    }

    public static ImageCallbackResult createImageCallbackResult(byte[] bArr, String str) {
        return new ImageCallbackResult(str, bArr);
    }
}

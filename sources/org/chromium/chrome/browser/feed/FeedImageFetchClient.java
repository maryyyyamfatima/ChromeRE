package org.chromium.chrome.browser.feed;

import defpackage.C6236iJ0;
import defpackage.InterfaceC12198zh1;
import org.chromium.chrome.browser.xsurface.ImageFetchClient$HttpResponseConsumer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedImageFetchClient implements InterfaceC12198zh1 {
    public static void onHttpResponse(ImageFetchClient$HttpResponseConsumer imageFetchClient$HttpResponseConsumer, int i, byte[] bArr) {
        imageFetchClient$HttpResponseConsumer.a(new C6236iJ0(i, bArr));
    }
}

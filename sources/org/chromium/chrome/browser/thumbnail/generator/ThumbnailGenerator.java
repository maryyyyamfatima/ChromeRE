package org.chromium.chrome.browser.thumbnail.generator;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ThumbnailGenerator {
    public long a;

    public void onThumbnailRetrieved(String str, int i, Bitmap bitmap, ThumbnailGeneratorCallback thumbnailGeneratorCallback) {
        thumbnailGeneratorCallback.a(i, bitmap, str);
    }
}

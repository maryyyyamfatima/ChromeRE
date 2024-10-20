package org.chromium.components.installedapp;

import android.util.SparseArray;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PackageHash {
    public static SparseArray a;

    public static void onCookiesDeleted(BrowserContextHandle browserContextHandle) {
        SparseArray sparseArray = a;
        if (sparseArray != null) {
            sparseArray.delete(browserContextHandle.hashCode());
        }
    }
}

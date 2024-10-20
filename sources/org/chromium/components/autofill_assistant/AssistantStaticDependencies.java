package org.chromium.components.autofill_assistant;

import android.app.Activity;
import defpackage.C10021tL;
import defpackage.C10499uk;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface AssistantStaticDependencies {
    C10021tL a();

    C10499uk b(Activity activity);

    AssistantAccessTokenUtil createAccessTokenUtil();

    LargeIconBridge createIconBridge();

    ImageFetcher createImageFetcher();

    AssistantInfoPageUtil createInfoPageUtil();

    long createNative();

    boolean isAccessibilityEnabled();
}

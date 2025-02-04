package org.chromium.components.payments;

import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface PaymentManifestDownloader$ManifestDownloadCallback {
    void onManifestDownloadFailure(String str);

    void onPaymentMethodManifestDownloadSuccess(GURL gurl, Origin origin, String str);

    void onWebAppManifestDownloadSuccess(String str);
}

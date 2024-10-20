package org.chromium.components.payments;

import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PaymentManifestParser {
    public long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface ManifestParseCallback {
        void onManifestParseFailure();

        void onPaymentMethodManifestParseSuccess(GURL[] gurlArr, GURL[] gurlArr2);

        void onWebAppManifestParseSuccess(WebAppManifestSection[] webAppManifestSectionArr);
    }

    public static GURL[] createUrlArray(int i) {
        return new GURL[i];
    }

    public static boolean addUrl(GURL[] gurlArr, int i, String str) {
        if (!new GURL(str).b) {
            return false;
        }
        gurlArr[i] = new GURL(str);
        return true;
    }

    public static WebAppManifestSection[] createManifest(int i) {
        return new WebAppManifestSection[i];
    }

    public static void addSectionToManifest(WebAppManifestSection[] webAppManifestSectionArr, int i, String str, long j, int i2) {
        webAppManifestSectionArr[i] = new WebAppManifestSection(i2, str, j);
    }

    public static void addFingerprintToSection(WebAppManifestSection[] webAppManifestSectionArr, int i, int i2, byte[] bArr) {
        webAppManifestSectionArr[i].c[i2] = bArr;
    }
}

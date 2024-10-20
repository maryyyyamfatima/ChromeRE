package org.chromium.components.payments;

import J.N;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PaymentManifestWebDataService {
    public long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface PaymentManifestWebDataServiceCallback {
        void onPaymentMethodManifestFetched(String[] strArr);

        void onPaymentWebAppManifestFetched(WebAppManifestSection[] webAppManifestSectionArr);
    }

    public PaymentManifestWebDataService(WebContents webContents) {
        if (webContents == null || webContents.isDestroyed()) {
            return;
        }
        this.a = N.MIc9v664(this, webContents);
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

    public static String getIdFromSection(WebAppManifestSection webAppManifestSection) {
        return webAppManifestSection.a;
    }

    public static long getMinVersionFromSection(WebAppManifestSection webAppManifestSection) {
        return webAppManifestSection.b;
    }

    public static byte[][] getFingerprintsFromSection(WebAppManifestSection webAppManifestSection) {
        return webAppManifestSection.c;
    }
}

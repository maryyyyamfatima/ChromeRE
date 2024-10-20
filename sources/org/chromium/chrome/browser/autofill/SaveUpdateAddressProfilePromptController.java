package org.chromium.chrome.browser.autofill;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SaveUpdateAddressProfilePromptController {
    public long a;

    public SaveUpdateAddressProfilePromptController(long j) {
        this.a = j;
    }

    public static SaveUpdateAddressProfilePromptController create(long j) {
        return new SaveUpdateAddressProfilePromptController(j);
    }

    public final void onNativeDestroyed() {
        this.a = 0L;
    }
}

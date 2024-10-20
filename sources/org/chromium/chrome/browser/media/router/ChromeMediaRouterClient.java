package org.chromium.chrome.browser.media.router;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromeMediaRouterClient {
    public static ChromeMediaRouterClient a;

    public static void initialize() {
        if (a != null) {
            return;
        }
        a = new ChromeMediaRouterClient();
    }
}

package org.chromium.chrome.browser.ui.messages.infobar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SimpleConfirmInfoBarBuilder {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface Listener {
        void a(boolean z);

        void b();

        void c();
    }

    public static void onInfoBarDismissed(Listener listener) {
        if (listener != null) {
            listener.b();
        }
    }

    public static boolean onInfoBarButtonClicked(Listener listener, boolean z) {
        if (listener == null) {
            return false;
        }
        listener.a(z);
        return false;
    }

    public static boolean onInfoBarLinkClicked(Listener listener) {
        if (listener == null) {
            return false;
        }
        listener.c();
        return false;
    }
}

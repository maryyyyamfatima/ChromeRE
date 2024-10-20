package defpackage;

import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9664sI0 {
    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "IPH_FeatureNotificationGuideIncognitoTabHelpBubble" : "IPH_FeatureNotificationGuideVoiceSearchHelpBubble" : "IPH_FeatureNotificationGuideNTPSuggestionCardHelpBubble" : "IPH_FeatureNotificationGuideIncognitoTabHelpBubble" : "IPH_FeatureNotificationGuideSignInHelpBubble" : "IPH_FeatureNotificationGuideDefaultBrowserPromo";
    }

    public static void b(int i, Runnable runnable) {
        if (ProfileManager.b) {
            LU3.a(Profile.d()).c(runnable, a(i));
        }
    }

    public static void c(int i) {
        if (ProfileManager.b) {
            LU3.a(Profile.d()).a(a(i));
        }
    }
}

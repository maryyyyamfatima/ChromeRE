package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class LU3 {
    public static KU3 a(Profile profile) {
        if (profile == null) {
            throw new IllegalArgumentException("Profile is required for retrieving tracker.");
        }
        if (profile.b != 0) {
            return (KU3) N.MYO54ANr(profile);
        }
        throw new IllegalArgumentException("Profile must have a valid native pointer.");
    }
}

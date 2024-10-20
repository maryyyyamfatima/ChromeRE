package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.UUID;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NN2 {
    public final Profile a;

    public static NN2 a(Profile profile) {
        Object obj = ThreadUtils.a;
        if (profile.i()) {
            return null;
        }
        return new NN2(profile);
    }

    public NN2(Profile profile) {
        this.a = profile;
    }

    public final void b(String str, String str2) {
        String uuid = UUID.randomUUID().toString();
        LN2 ln2 = new LN2();
        Profile profile = this.a;
        TextUtils.isEmpty("");
        N.Mh8zWNaq(profile, ln2, str, str2, uuid, "", true);
    }
}

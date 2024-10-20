package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fh1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0687Fh1 {
    public static ImageFetcher b(int i, ProfileKey profileKey) {
        Object obj = ThreadUtils.a;
        return a(i, new C0557Eh1(profileKey), null, 20971520);
    }

    public static ImageFetcher c(ProfileKey profileKey, C1241Jo0 c1241Jo0) {
        Object obj = ThreadUtils.a;
        return a(3, new C0557Eh1(profileKey), c1241Jo0, 20971520);
    }

    public static ImageFetcher a(int i, C0557Eh1 c0557Eh1, C1241Jo0 c1241Jo0, int i2) {
        if (i == 0) {
            return new C3745b32(c0557Eh1);
        }
        if (i == 1) {
            return new C11701yE(c0557Eh1, new C11358xE());
        }
        if (i == 2) {
            return new C3031Xi1(a(0, c0557Eh1, c1241Jo0, i2), c1241Jo0, i2);
        }
        if (i != 3) {
            return null;
        }
        return new C3031Xi1(a(1, c0557Eh1, c1241Jo0, i2), c1241Jo0, i2);
    }
}

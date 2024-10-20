package defpackage;

import J.N;
import android.content.Context;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zn */
/* loaded from: classes.dex */
public final class C12232zn implements InterfaceC12080zL0 {
    public final HashMap a;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    public C12232zn(Profile profile, Context context, GURL gurl) {
        boolean z = true;
        HashMap hashMap = new HashMap(1);
        this.a = hashMap;
        if (profile.i()) {
            return;
        }
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("DarkenWebsitesCheckboxInThemesSetting")) {
            hashMap.put("auto_dark_web_content_enabled", "Disabled");
            return;
        }
        if (!N.MJSt3Ocq(profile, 73) || !AbstractC3899bX.e(context) || (!gurl.k() && !AbstractC9824sl4.a(profile, gurl))) {
            z = false;
        }
        hashMap.put("auto_dark_web_content_enabled", z ? "Enabled" : "Disabled");
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        return this.a;
    }
}

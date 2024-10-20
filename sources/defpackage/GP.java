package defpackage;

import android.app.Activity;
import android.content.Context;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GP {
    public final Context a;
    public final Profile b;
    public FP c;
    public UA2 d;
    public LargeIconBridge e;

    public GP(Context context, Profile profile) {
        this.a = context;
        this.b = profile;
    }

    public final InterfaceC4184cL1 a() {
        if (this.c == null) {
            this.c = new FP();
        }
        return this.c;
    }

    public static void b(Activity activity) {
        C12008z71.a().d(activity, activity.getString(R.string.f74440_resource_name_obfuscated_res_0x7f1404f4), null, Profile.d());
    }
}

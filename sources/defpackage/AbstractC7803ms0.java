package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.settings.DownloadSettings;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.SettingsActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ms0 */
/* loaded from: classes.dex */
public abstract class AbstractC7803ms0 {
    /* JADX WARN: Type inference failed for: r5v0, types: [ks0] */
    public static C9519rs0 a(Activity activity, C0351Cs0 c0351Cs0, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, ZX1 zx1) {
        Profile d;
        OTRProfileID oTRProfileID = OTRProfileID.b;
        OTRProfileID oTRProfileID2 = c0351Cs0.a;
        if (oTRProfileID2 != null) {
            d = Profile.d().e(oTRProfileID2);
        } else {
            d = Profile.d();
        }
        return new C9519rs0(activity, c0351Cs0, new C2332Ry2(), new Callback() { // from class: ks0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Context context = (Context) obj;
                String name = DownloadSettings.class.getName();
                Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
                if (!(context instanceof Activity)) {
                    a.addFlags(268435456);
                    a.addFlags(67108864);
                }
                a.putExtra("show_fragment", name);
                ComponentName componentName = AbstractC2281Ro1.a;
                try {
                    context.startActivity(a, null);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }, viewOnClickListenerC1069If3, zx1, LU3.a(d), new C4168cI0(d), AbstractC0653Fa2.a(), AbstractC6474j01.a);
    }
}

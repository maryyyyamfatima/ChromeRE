package defpackage;

import J.N;
import android.content.Intent;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.components.prefs.PrefService;
import org.chromium.ui.permissions.AndroidPermissionDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Wf4 {
    public static Boolean a;

    public static boolean b(AndroidPermissionDelegate androidPermissionDelegate) {
        if (androidPermissionDelegate == null) {
            return false;
        }
        if ((androidPermissionDelegate.hasPermission("android.permission.RECORD_AUDIO") || androidPermissionDelegate.canRequestPermission("android.permission.RECORD_AUDIO")) && c(false)) {
            return a(true);
        }
        return false;
    }

    public static boolean c(boolean z) {
        if (!AbstractC8293oI0.a()) {
            return true;
        }
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("VoiceSearchAudioCapturePolicy")) {
            return true;
        }
        PrefService a2 = !ProfileManager.b ? null : R44.a(Profile.d());
        if (z && a2 == null) {
            return false;
        }
        return a2 == null || a2.a("hardware.audio_capture_enabled");
    }

    public static boolean a(boolean z) {
        Object obj = ThreadUtils.a;
        if (a == null || !z) {
            a = Boolean.valueOf(!AbstractC3017Xf2.b(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).isEmpty());
        }
        return a.booleanValue();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class Hi4 {
    public abstract void c(Intent intent);

    public abstract Intent d(Context context, Intent intent);

    public abstract Intent e(Intent intent);

    public static boolean b(Intent intent) {
        return intent != null && intent.hasCategory("com.google.intent.category.DAYDREAM") && (intent.getFlags() & 1048576) == 0;
    }

    public static boolean a(Activity activity, Intent intent) {
        if (VrModuleProvider.b().n() && b(intent)) {
            VrModuleProvider.b().getClass();
            if (activity instanceof ChromeTabbedActivity) {
                return true;
            }
        }
        return false;
    }
}

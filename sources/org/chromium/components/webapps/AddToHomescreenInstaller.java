package org.chromium.components.webapps;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC4983eg2;
import defpackage.V60;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AddToHomescreenInstaller {
    public static boolean installOrOpenNativeApp(WebContents webContents, AppData appData) {
        Intent intent;
        Context context = V60.a;
        boolean d = AbstractC4983eg2.d(context, appData.a);
        String str = appData.a;
        if (d) {
            intent = context.getPackageManager().getLaunchIntentForPackage(str);
        } else {
            intent = appData.g;
        }
        if (intent != null) {
            WindowAndroid Q0 = webContents.Q0();
            Context context2 = Q0 == null ? null : (Context) Q0.k().get();
            if (context2 != null) {
                try {
                    context2.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    AbstractC4851eH1.a("AddToHomescreen", "Failed to install or open app : %s!", str, e);
                    return false;
                }
            }
        }
        return true;
    }
}

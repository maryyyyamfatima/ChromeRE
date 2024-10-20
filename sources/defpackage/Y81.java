package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import org.chromium.chrome.browser.history.HistoryActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Y81 {
    public static void a(Activity activity, Tab tab, boolean z) {
        Context context = V60.a;
        if (DeviceFormFactor.a(activity)) {
            tab.d(new LoadUrlParams("chrome-native://history/", 0));
            return;
        }
        Intent a = AbstractC7459ls0.a(context, HistoryActivity.class);
        a.putExtra("org.chromium.chrome.browser.parent_component", activity.getComponentName());
        a.putExtra("org.chromium.chrome.browser.incognito_mode", z);
        activity.startActivity(a);
    }
}

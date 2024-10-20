package defpackage;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.content.DialogInterface;
import android.os.Build;
import java.util.Iterator;
import org.chromium.chrome.browser.site_settings.ManageSpaceActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KK1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ActivityManager a;
    public final /* synthetic */ ManageSpaceActivity g;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String id;
        if (this.g.E) {
            EI2.h(2, 3, "Android.ManageSpace.ActionTaken");
        }
        Q83 q83 = O83.a;
        q83.m("org.chromium.chrome.browser.searchwidget.SEARCH_ENGINE_SHORTNAME");
        q83.m("org.chromium.chrome.browser.searchwidget.SEARCH_ENGINE_URL");
        q83.m("org.chromium.chrome.browser.searchwidget.IS_VOICE_SEARCH_AVAILABLE");
        q83.m("org.chromium.chrome.browser.searchwidget.IS_GOOGLE_LENS_AVAILABLE");
        q83.m("org.chromium.chrome.browser.searchwidget.IS_INCOGNITO_AVAILABLE");
        C10094tZ2.b();
        if (Build.VERSION.SDK_INT >= 26) {
            C7549m72 c7549m72 = (C7549m72) AbstractC5316fe3.a.a;
            Iterator it = c7549m72.e().iterator();
            while (it.hasNext()) {
                id = ((NotificationChannel) it.next()).getId();
                if (C5660ge3.e(id)) {
                    c7549m72.d(id);
                }
            }
        }
        this.a.clearApplicationUserData();
    }

    public KK1(ManageSpaceActivity manageSpaceActivity, ActivityManager activityManager) {
        this.g = manageSpaceActivity;
        this.a = activityManager;
    }
}

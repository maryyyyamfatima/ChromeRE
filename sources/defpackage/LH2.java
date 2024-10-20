package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LH2 extends InterceptNavigationDelegate {
    public final /* synthetic */ Activity a;

    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    public final boolean shouldIgnoreNavigation(NavigationHandle navigationHandle, GURL gurl) {
        if (AbstractC2290Rq0.c(navigationHandle.e) || navigationHandle.q) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(gurl.i()));
        String name = ChromeLauncherActivity.class.getName();
        Activity activity = this.a;
        intent.setClassName(activity, name);
        intent.putExtra("org.chromium.chrome.browser.dom_distiller.EXTRA_READER_MODE_PARENT", AbstractC2281Ro1.m("org.chromium.chrome.browser.dom_distiller.EXTRA_READER_MODE_PARENT", -1, activity.getIntent().getExtras()));
        activity.startActivity(intent);
        activity.finish();
        return true;
    }

    public LH2(Activity activity) {
        this.a = activity;
    }
}

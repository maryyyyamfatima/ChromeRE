package org.chromium.chrome.browser.supervised_user;

import android.app.Activity;
import defpackage.InterfaceC11737yL0;
import defpackage.VN;
import defpackage.WN;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.feedback.ScreenshotTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.supervised_user.ChildAccountFeedbackReporter;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ChildAccountFeedbackReporter {
    public static InterfaceC11737yL0 a;

    public static void reportFeedbackWithWindow(WindowAndroid windowAndroid, String str, String str2, Profile profile) {
        Activity activity = (Activity) windowAndroid.k().get();
        Object obj = ThreadUtils.a;
        if (a == null) {
            a = AppHooks.get().h();
        }
        new WN(activity, null, str, new ScreenshotTask(activity), new VN(str2, null, profile), new Callback() { // from class: gJ
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                ChildAccountFeedbackReporter.a.a((AbstractRunnableC9679sL0) obj2);
            }
        }, profile);
    }
}

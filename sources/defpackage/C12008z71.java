package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.feedback.ScreenshotTask;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C12008z71 {
    public static C12008z71 a;

    public static C12008z71 a() {
        Object obj = ThreadUtils.a;
        if (a == null) {
            a = AppHooks.get().l();
        }
        return a;
    }

    public void c(Activity activity, String str, AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        abstractRunnableC9679sL0.d().toString();
        b(activity);
    }

    public void e(Activity activity, AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        abstractRunnableC9679sL0.d().toString();
        b(activity);
    }

    public final void d(final Activity activity, final String str, String str2, Profile profile) {
        FI2.a("MobileHelpAndFeedback");
        new WN(activity, null, null, new ScreenshotTask(activity), new VN(str2, str, profile), new Callback() { // from class: x71
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C12008z71.this.c(activity, str, (AbstractRunnableC9679sL0) obj);
            }
        }, profile);
    }

    public final void f(final Activity activity, Profile profile, String str, String str2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        new WN(activity, str2, null, new ScreenshotTask(activity), new VN(str, null, profile), new Callback() { // from class: w71
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C12008z71 c12008z71 = C12008z71.this;
                c12008z71.getClass();
                EI2.j(SystemClock.elapsedRealtime() - elapsedRealtime, "Feedback.Duration.FormOpenToSubmit");
                c12008z71.e(activity, (AbstractRunnableC9679sL0) obj);
            }
        }, profile);
    }

    public static void b(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/chrome/topic/6069782"));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("create_new_tab", true);
        intent.setPackage(context.getPackageName());
        context.startActivity(intent);
    }
}

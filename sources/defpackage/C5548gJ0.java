package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import org.chromium.chrome.browser.feedback.ProcessIdFeedbackSource;
import org.chromium.chrome.browser.feedback.ScreenshotTask;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gJ0 */
/* loaded from: classes.dex */
public final class C5548gJ0 extends AbstractRunnableC9679sL0 {
    @Override // defpackage.AbstractRunnableC9679sL0
    public final ArrayList a(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5123f40(((C5204fJ0) obj).a));
        arrayList.add(new C8849pu3());
        arrayList.add(new ProcessIdFeedbackSource());
        return arrayList;
    }

    @Override // defpackage.AbstractRunnableC9679sL0
    public final ArrayList b(Activity activity, Object obj) {
        C5204fJ0 c5204fJ0 = (C5204fJ0) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9929t34(c5204fJ0.b));
        arrayList.add(new C5724gp1(c5204fJ0.c));
        return arrayList;
    }

    public C5548gJ0(Activity activity, ScreenshotTask screenshotTask, C5204fJ0 c5204fJ0, C11665y71 c11665y71, Profile profile) {
        super("com.google.chrome.feed.USER_INITIATED_FEEDBACK_REPORT", null, c11665y71);
        e(activity, screenshotTask, c5204fJ0, profile);
    }
}

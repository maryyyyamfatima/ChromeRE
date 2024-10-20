package defpackage;

import J.N;
import android.app.Activity;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feedback.FamilyInfoFeedbackSource;
import org.chromium.chrome.browser.feedback.ProcessIdFeedbackSource;
import org.chromium.chrome.browser.feedback.ScreenshotTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WN extends AbstractRunnableC9679sL0 {
    @Override // defpackage.AbstractRunnableC9679sL0
    public final ArrayList a(Object obj) {
        ArrayList arrayList = new ArrayList();
        Profile profile = ((VN) obj).a;
        arrayList.add(new C5123f40(profile));
        arrayList.add(new C8849pu3());
        arrayList.add(new ProcessIdFeedbackSource());
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("EnableFamilyInfoFeedback") && !profile.i()) {
            arrayList.add(new FamilyInfoFeedbackSource(profile));
        }
        return arrayList;
    }

    @Override // defpackage.AbstractRunnableC9679sL0
    public final ArrayList b(Activity activity, Object obj) {
        VN vn = (VN) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1486Ll0());
        String str = vn.b;
        arrayList.add(new C9929t34(str));
        Profile profile = vn.a;
        arrayList.add(new X74(profile));
        arrayList.add(new S71(profile));
        arrayList.add(new UJ1());
        arrayList.add(new C10802vd1());
        arrayList.add(new C0998Hr2());
        arrayList.add(new C10022tL0(vn.c));
        arrayList.add(new C12232zn(profile, activity, new GURL(str)));
        return arrayList;
    }

    public WN(Activity activity, String str, String str2, ScreenshotTask screenshotTask, VN vn, Callback callback, Profile profile) {
        super(str, str2, callback);
        e(activity, screenshotTask, vn, profile);
    }
}

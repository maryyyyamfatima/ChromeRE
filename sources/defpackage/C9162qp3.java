package defpackage;

import android.app.Activity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qp3 */
/* loaded from: classes.dex */
public class C9162qp3 extends C8887q12 {
    public C9162qp3(Activity activity, Profile profile, C7857n12 c7857n12, InterfaceC10590uz3 interfaceC10590uz3, Tab tab) {
        super(activity, profile, c7857n12, interfaceC10590uz3, tab);
    }

    public void f(String str, int i, boolean z) {
        LoadUrlParams loadUrlParams = new LoadUrlParams(str, 2);
        if (z) {
            a(loadUrlParams);
        } else {
            d(i, loadUrlParams);
        }
    }
}

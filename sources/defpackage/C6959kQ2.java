package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kQ2 */
/* loaded from: classes.dex */
public final class C6959kQ2 extends BA0 {
    public final /* synthetic */ C7991nQ2 a;

    public C6959kQ2(C7991nQ2 c7991nQ2) {
        this.a = c7991nQ2;
    }

    @Override // defpackage.BA0
    public final void G0(int i, Tab tab, LoadUrlParams loadUrlParams) {
        if (i == 1 && (loadUrlParams.d & 255) == 5) {
            C7991nQ2 c7991nQ2 = this.a;
            if (c7991nQ2.f || !N.M$l72hrq(loadUrlParams.a)) {
                return;
            }
            String string = T60.a.getString("com.google.android.apps.chrome.rlz.RLZ_STRING", null);
            if (string == null) {
                new C7647mQ2(c7991nQ2).c(AbstractC0185Bl.e);
                return;
            }
            c7991nQ2.e(string);
            if (c7991nQ2.f) {
                return;
            }
            O83.a.p("rlz_first_search_notified", true);
            c7991nQ2.f = true;
        }
    }
}

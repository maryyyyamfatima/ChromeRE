package defpackage;

import android.view.ViewStub;
import com.android.chrome.R;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l03 */
/* loaded from: classes.dex */
public final class C7164l03 {
    public final C8539p03 a;
    public final C10253u03 b;

    public C7164l03(NewTabPageLayout newTabPageLayout, Tab tab, Tab tab2, Profile profile, C11625y03 c11625y03) {
        C10253u03 c10253u03 = new C10253u03(new C6820k03(tab2));
        this.b = c10253u03;
        this.a = new C8539p03((ViewStub) newTabPageLayout.findViewById(R.id.search_resumption_module_container_stub), tab, tab2, profile, c10253u03, c11625y03);
    }
}

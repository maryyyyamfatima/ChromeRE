package defpackage;

import J.N;
import android.app.Activity;
import android.text.TextUtils;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q12 */
/* loaded from: classes.dex */
public class C8887q12 implements InterfaceC8544p12 {
    public final Profile a;
    public final InterfaceC10590uz3 b;
    public final Tab c;
    public final Activity d;
    public final C7857n12 e;

    @Override // defpackage.InterfaceC8544p12
    public /* synthetic */ boolean b() {
        return true;
    }

    public C8887q12(Activity activity, Profile profile, C7857n12 c7857n12, InterfaceC10590uz3 interfaceC10590uz3, Tab tab) {
        this.d = activity;
        this.a = profile;
        this.e = c7857n12;
        this.b = interfaceC10590uz3;
        this.c = tab;
    }

    @Override // defpackage.InterfaceC8544p12
    public final Tab d(int i, LoadUrlParams loadUrlParams) {
        InterfaceC10590uz3 interfaceC10590uz3 = this.b;
        Tab tab = this.c;
        C7857n12 c7857n12 = this.e;
        if (i == 1) {
            c7857n12.b(loadUrlParams, ((AbstractC11276wz3) interfaceC10590uz3).o());
            return tab;
        }
        if (i == 3) {
            return ((AbstractC11276wz3) interfaceC10590uz3).r(loadUrlParams, i == 3 ? 4 : 5, tab, false);
        }
        if (i == 4) {
            return ((AbstractC11276wz3) interfaceC10590uz3).r(loadUrlParams, i == 3 ? 4 : 5, tab, false);
        }
        if (i == 6) {
            C11598xv3 c11598xv3 = new C11598xv3(false);
            int i2 = C1695Nb0.m(c7857n12.a).q;
            Activity activity = this.d;
            c11598xv3.i(loadUrlParams, activity, i2, C7851n02.e(activity));
        } else if (i == 7) {
            String str = loadUrlParams.a;
            Profile profile = this.a;
            if (tab != null) {
                OfflinePageBridge a = OfflinePageBridge.a(profile);
                WebContents b = tab.b();
                a.getClass();
                long j = a.a;
                TextUtils.isEmpty("");
                N.MNR_O1IV(j, a, b, "ntp_suggestions", str, 65535, "");
            } else {
                NN2.a(profile).b(str, "ntp_suggestions");
            }
        } else if (i == 8) {
            c7857n12.b(loadUrlParams, true);
        }
        return null;
    }

    @Override // defpackage.InterfaceC8544p12
    public final Tab a(LoadUrlParams loadUrlParams) {
        return ((AbstractC11276wz3) this.b).r(loadUrlParams, 14, this.c, false);
    }

    @Override // defpackage.InterfaceC8544p12
    public final boolean c() {
        return C7851n02.i.s(this.d) || C7851n02.b();
    }

    @Override // defpackage.InterfaceC8544p12
    public final boolean e() {
        return N.M$3vpOHw();
    }
}

package defpackage;

import android.app.Activity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cZ1 */
/* loaded from: classes2.dex */
public final class C4254cZ1 extends C9162qp3 {
    public final InterfaceC0079Ap3 f;
    public final C11598xv3 g;

    @Override // defpackage.C8887q12, defpackage.InterfaceC8544p12
    public final boolean b() {
        return false;
    }

    public C4254cZ1(Activity activity, Profile profile, InterfaceC0079Ap3 interfaceC0079Ap3) {
        super(activity, profile, null, null, null);
        this.f = interfaceC0079Ap3;
        this.g = new C11598xv3(false);
    }

    @Override // defpackage.C9162qp3
    public final void f(String str, int i, boolean z) {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.f;
        if (i == 1 || i == 4) {
            AbstractC5241fQ2.b(new LoadUrlParams(str, 2), i == 4, null, (Tab) interfaceC0079Ap3.get());
            return;
        }
        if (i == 6) {
            LoadUrlParams loadUrlParams = new LoadUrlParams(str, 2);
            int id = interfaceC0079Ap3.get() == null ? -1 : ((Tab) interfaceC0079Ap3.get()).getId();
            Activity activity = this.d;
            this.g.i(loadUrlParams, activity, id, C7851n02.e(activity));
            return;
        }
        if (i == 7) {
            NN2.a(Profile.d()).b(str, "ntp_suggestions");
        } else {
            if (i != 8) {
                return;
            }
            AbstractC5241fQ2.b(new LoadUrlParams(str, 2), false, Boolean.TRUE, (Tab) interfaceC0079Ap3.get());
        }
    }
}

package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.firstrun.FirstRunActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aP0 */
/* loaded from: classes.dex */
public final class C3516aP0 implements InterfaceC11179wj {
    public final /* synthetic */ FirstRunActivity a;

    public C3516aP0(FirstRunActivity firstRunActivity) {
        this.a = firstRunActivity;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        FirstRunActivity firstRunActivity = this.a;
        if (activity != firstRunActivity ? i == 3 : i == 5 || i == 6) {
            firstRunActivity.finish();
            ApplicationStatus.h(this);
        }
    }
}

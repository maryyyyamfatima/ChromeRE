package defpackage;

import android.view.View;
import org.chromium.chrome.browser.ntp.IncognitoNewTabPageView;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wj1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC11181wj1 implements View.OnClickListener {
    public final /* synthetic */ IncognitoNewTabPageView a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C10495uj1 c10495uj1 = this.a.a;
        c10495uj1.getClass();
        boolean a = VrModuleProvider.b().a();
        final C10838vj1 c10838vj1 = c10495uj1.a;
        if (a) {
            VrModuleProvider.b().R(new Runnable() { // from class: sj1
                @Override // java.lang.Runnable
                public final void run() {
                    C10838vj1.e(C10838vj1.this);
                }
            });
        } else {
            C10838vj1.e(c10838vj1);
        }
    }

    public ViewOnClickListenerC11181wj1(IncognitoNewTabPageView incognitoNewTabPageView) {
        this.a = incognitoNewTabPageView;
    }
}

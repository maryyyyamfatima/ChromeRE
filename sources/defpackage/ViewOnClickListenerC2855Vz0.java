package defpackage;

import android.view.View;
import org.chromium.chrome.browser.ui.tablet.emptybackground.EmptyBackgroundViewTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vz0 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2855Vz0 implements View.OnClickListener {
    public final /* synthetic */ EmptyBackgroundViewTablet a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EmptyBackgroundViewTablet emptyBackgroundViewTablet = this.a;
        if (emptyBackgroundViewTablet.g == null) {
            return;
        }
        ((AbstractC11276wz3) emptyBackgroundViewTablet.a).j(false).l();
        emptyBackgroundViewTablet.g.e();
    }

    public ViewOnClickListenerC2855Vz0(EmptyBackgroundViewTablet emptyBackgroundViewTablet) {
        this.a = emptyBackgroundViewTablet;
    }
}

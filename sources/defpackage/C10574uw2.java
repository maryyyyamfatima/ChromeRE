package defpackage;

import android.content.Context;
import android.view.ViewStructure;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uw2 */
/* loaded from: classes2.dex */
public final class C10574uw2 extends AbstractC10917vw2 {
    public C10574uw2(Context context, boolean z, C8173nw2 c8173nw2, C7829mw2 c7829mw2, RunnableC0763Fw2 runnableC0763Fw2) {
        super(context, z, c8173nw2, c7829mw2, runnableC0763Fw2);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onProvideVirtualStructure(ViewStructure viewStructure) {
        InterfaceC6390il4 interfaceC6390il4 = this.m;
        if (interfaceC6390il4 != null) {
            ((WebContentsAccessibilityImpl) interfaceC6390il4).w(viewStructure);
        }
    }
}

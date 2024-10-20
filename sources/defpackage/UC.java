package defpackage;

import android.content.Context;
import org.chromium.content.browser.TracingControllerAndroidImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UC implements SC {
    public final /* synthetic */ VC a;

    @Override // defpackage.SC
    public final void a() {
    }

    @Override // defpackage.SC
    public final void b() {
        Context context = V60.a;
        VC vc = this.a;
        vc.a.k = new TracingControllerAndroidImpl(context);
        TracingControllerAndroidImpl tracingControllerAndroidImpl = vc.a.k;
        V60.c(context, tracingControllerAndroidImpl.b, tracingControllerAndroidImpl.c, null);
    }

    public UC(VC vc) {
        this.a = vc;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.chromium.base.library_loader.a;
import org.chromium.base.library_loader.b;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qK */
/* loaded from: classes2.dex */
public final class RunnableC8988qK implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ boolean g;

    public RunnableC8988qK(Context context, boolean z) {
        this.a = context;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.g;
        C1464Lg3 c1464Lg3 = z ? ChildProcessLauncherHelperImpl.n : ChildProcessLauncherHelperImpl.o;
        if (c1464Lg3 != null) {
            if (!(c1464Lg3.b == null || c1464Lg3.d != null)) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("org.chromium.base.process_launcher.extra.bind_to_caller", false);
        a aVar = b.n.i;
        aVar.b();
        aVar.d(bundle);
        Context context = this.a;
        AbstractC11726yJ a = ChildProcessLauncherHelperImpl.a(context, z);
        if (z) {
            ChildProcessLauncherHelperImpl.n = new C1464Lg3(context, a, bundle);
        } else {
            ChildProcessLauncherHelperImpl.o = new C1464Lg3(context, a, bundle);
        }
    }
}

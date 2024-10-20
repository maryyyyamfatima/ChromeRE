package defpackage;

import android.content.Context;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rK */
/* loaded from: classes2.dex */
public final class RunnableC9330rK implements Runnable {
    public final /* synthetic */ Context a;

    public RunnableC9330rK(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        AbstractC11726yJ a = ChildProcessLauncherHelperImpl.a(context, true);
        if (AbstractC2064Px.c()) {
            ChildProcessLauncherHelperImpl.u = new ComponentCallbacks2C2974Wx(-1, ChildProcessLauncherHelperImpl.q, context);
        } else {
            ChildProcessLauncherHelperImpl.u = new ComponentCallbacks2C2974Wx(a.e(), ChildProcessLauncherHelperImpl.q, context);
        }
        C3490aK.a().b = ChildProcessLauncherHelperImpl.u;
    }
}

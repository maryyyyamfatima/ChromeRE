package defpackage;

import org.chromium.content.browser.ChildProcessLauncherHelperImpl;
import org.chromium.content.browser.LauncherThread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pK */
/* loaded from: classes2.dex */
public final class C8645pK extends AbstractC5552gK {
    public final /* synthetic */ ChildProcessLauncherHelperImpl a;

    @Override // defpackage.AbstractC5552gK
    public final VJ a(AbstractC11726yJ abstractC11726yJ, C4521dK c4521dK) {
        ChildProcessLauncherHelperImpl childProcessLauncherHelperImpl = this.a;
        if (!childProcessLauncherHelperImpl.d) {
            return null;
        }
        C1464Lg3 c1464Lg3 = childProcessLauncherHelperImpl.c ? ChildProcessLauncherHelperImpl.n : ChildProcessLauncherHelperImpl.o;
        if (c1464Lg3 == null) {
            return null;
        }
        VJ vj = c1464Lg3.b;
        if ((vj == null || c1464Lg3.d != null) || c1464Lg3.a != abstractC11726yJ || c1464Lg3.d != null) {
            return null;
        }
        c1464Lg3.d = c4521dK;
        if (c1464Lg3.c) {
            LauncherThread.a(new RunnableC1334Kg3(c4521dK));
            c1464Lg3.b = null;
            c1464Lg3.c = false;
        }
        return vj;
    }

    public C8645pK(ChildProcessLauncherHelperImpl childProcessLauncherHelperImpl) {
        this.a = childProcessLauncherHelperImpl;
    }
}

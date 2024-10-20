package defpackage;

import android.content.Context;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.b;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;
import org.chromium.content.browser.LauncherThread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6042hl {
    public boolean a;
    public int b;

    public abstract void a(C6540jB2 c6540jB2);

    public abstract void b();

    public final void c(boolean z, boolean z2) {
        Object obj = ThreadUtils.a;
        if (z2) {
            this.b++;
            RB2.a().e();
            C8655pM a = C8655pM.a();
            C5010el c5010el = new C5010el(this);
            C4807e84 c4807e84 = a.c;
            String str = c4807e84.b;
            if (str != null) {
                c5010el.onResult(str);
            } else {
                c4807e84.a(new C4464d84(c4807e84, c5010el));
            }
        }
        this.a = z;
        this.b++;
        new Thread(new Runnable() { // from class: cl
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC6042hl abstractC6042hl = AbstractC6042hl.this;
                abstractC6042hl.getClass();
                try {
                    b bVar = b.n;
                    bVar.i.b();
                    bVar.a();
                    AbstractC9968tA1.a();
                    e = null;
                } catch (C6540jB2 e) {
                    e = e;
                }
                ThreadUtils.d(new Runnable() { // from class: dl
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC6042hl.this.d(e);
                    }
                });
            }
        }).start();
    }

    public final void d(C6540jB2 c6540jB2) {
        Object obj = ThreadUtils.a;
        int i = this.b;
        if (i < 0) {
            return;
        }
        if (c6540jB2 == null) {
            int i2 = i - 1;
            this.b = i2;
            if (i2 == 0) {
                if (CachedFeatureFlags.b("network_service_warm_up_enabled", false)) {
                    Context context = V60.a;
                    boolean z = ChildProcessLauncherHelperImpl.m;
                    LauncherThread.a(new RunnableC8988qK(context, false));
                }
                if (this.a) {
                    Context context2 = V60.a;
                    boolean z2 = ChildProcessLauncherHelperImpl.m;
                    LauncherThread.a(new RunnableC8988qK(context2, true));
                }
                b();
                this.b = -1;
                return;
            }
            return;
        }
        a(c6540jB2);
        this.b = -1;
    }
}

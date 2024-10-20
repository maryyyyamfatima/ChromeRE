package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.chromium.base.BuildInfo;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vU2 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10755vU2 implements Runnable {
    public final /* synthetic */ C11441xU2 a;
    public final /* synthetic */ WeakReference g;

    public /* synthetic */ RunnableC10755vU2(C11441xU2 c11441xU2, WeakReference weakReference) {
        this.a = c11441xU2;
        this.g = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C3929bc2 c3929bc2 = this.a.a;
        c3929bc2.getClass();
        Object obj = ThreadUtils.a;
        StringBuilder sb = new StringBuilder("OmahaBase::checkForUpdates(): Current version String: \"");
        AbstractC2997Xb2 abstractC2997Xb2 = c3929bc2.a;
        Context context = abstractC2997Xb2.c;
        BuildInfo buildInfo = AbstractC6547jD.a;
        final int i = 0;
        AbstractC4851eH1.d("omaha", Y5.a(sb, buildInfo.e, "\""), new Object[0]);
        if (c3929bc2.f() == null) {
            AbstractC4851eH1.f("omaha", "OmahaBase::checkForUpdates(): Request generator is null. This is probably a developer build.", new Object[0]);
        } else {
            abstractC2997Xb2.b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String str = (abstractC2997Xb2.c.getApplicationInfo().flags & 1) != 0 ? "system_image" : "organic";
            abstractC2997Xb2.getClass();
            C2607Ub2 e = c3929bc2.e(currentTimeMillis, UUID.randomUUID().toString(), new ON2(currentTimeMillis, UUID.randomUUID().toString(), str, false), AbstractC2737Vb2.g().getLong("timestampOfInstall", currentTimeMillis));
            if (e == null) {
                AbstractC4851eH1.f("omaha", "OmahaBase::checkForUpdates(): versionConfig parsed from response is null.", new Object[0]);
                if (c3929bc2.j == 11) {
                    i = 2;
                }
            } else {
                String str2 = e.d;
                if (str2 == null || !str2.equals("noupdate")) {
                    StringBuilder sb2 = new StringBuilder("OmahaBase::checkForUpdates(): Received latest version String from Omaha server: \"");
                    String str3 = e.a;
                    AbstractC4851eH1.d("omaha", Y5.a(sb2, str3, "\""), new Object[0]);
                    Context context2 = abstractC2997Xb2.c;
                    E84 a = E84.a(buildInfo.e);
                    E84 a2 = E84.a(str3);
                    if (a != null && a2 != null) {
                        i = a.b(a2);
                    }
                }
            }
            QF3 qf3 = AbstractC5103f04.a;
            final WeakReference weakReference = this.g;
            PostTask.c(qf3, new Runnable() { // from class: wU2
                @Override // java.lang.Runnable
                public final void run() {
                    Callback callback = (Callback) weakReference.get();
                    if (callback != null) {
                        int i2 = i;
                        callback.onResult(Integer.valueOf(i2 != 0 ? i2 != 1 ? i2 != 2 ? 5 : 4 : 3 : 2));
                    }
                }
            });
        }
        i = 3;
        QF3 qf32 = AbstractC5103f04.a;
        final WeakReference weakReference2 = this.g;
        PostTask.c(qf32, new Runnable() { // from class: wU2
            @Override // java.lang.Runnable
            public final void run() {
                Callback callback = (Callback) weakReference2.get();
                if (callback != null) {
                    int i2 = i;
                    callback.onResult(Integer.valueOf(i2 != 0 ? i2 != 1 ? i2 != 2 ? 5 : 4 : 3 : 2));
                }
            }
        });
    }
}

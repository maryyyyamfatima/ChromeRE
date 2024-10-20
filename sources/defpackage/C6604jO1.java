package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jO1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6604jO1 {
    public final C6948kO1 a;
    public final Handler b = new Handler();
    public RunnableC6262iO1 c;
    public C7980nO1 d;

    public C6604jO1(C6948kO1 c6948kO1) {
        this.a = c6948kO1;
    }

    public final void a(C7980nO1 c7980nO1) {
        C6948kO1 c6948kO1 = this.a;
        if (!C6948kO1.e(c6948kO1.f, c7980nO1)) {
            c6948kO1.f = c7980nO1;
            Service service = c6948kO1.a;
            if (service != null || !c7980nO1.c) {
                if (service == null) {
                    c6948kO1.g();
                    c6948kO1.i();
                    try {
                        Class cls = ((C10036tO) C11408xO.b.get(((C11408xO) c6948kO1.b).a)).a;
                        Intent intent = cls != null ? new Intent(V60.a, (Class<?>) cls) : null;
                        Context context = V60.a;
                        Object obj = Y50.a;
                        if (Build.VERSION.SDK_INT < 26) {
                            context.startService(intent);
                        } else {
                            context.startForegroundService(intent);
                        }
                    } catch (RuntimeException unused) {
                    }
                } else {
                    c6948kO1.h(false, false);
                }
            }
        }
        RunnableC6262iO1 runnableC6262iO1 = new RunnableC6262iO1(this);
        this.c = runnableC6262iO1;
        if (this.b.postDelayed(runnableC6262iO1, 500L)) {
            return;
        }
        AbstractC4851eH1.f("MediaNotification", "Failed to post the throttler task.", new Object[0]);
        this.c = null;
    }
}

package defpackage;

import android.os.Looper;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class PT3 implements Runnable {
    public final /* synthetic */ RT3 a;

    public /* synthetic */ PT3(RT3 rt3) {
        this.a = rt3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RT3 rt3 = this.a;
        rt3.getClass();
        Object obj = ThreadUtils.a;
        if (!rt3.n) {
            Looper.myQueue().addIdleHandler(rt3);
            rt3.n = true;
        }
        rt3.b();
    }
}

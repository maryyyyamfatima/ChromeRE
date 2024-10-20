package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PJ1 implements Runnable {
    public final /* synthetic */ RJ1 a;

    public PJ1(RJ1 rj1) {
        this.a = rj1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d == null) {
            return;
        }
        OJ1 oj1 = this.a.d;
        Object obj = oj1.a;
        if (obj != null) {
            RJ1 rj1 = this.a;
            synchronized (rj1) {
                Iterator it = new ArrayList(rj1.a).iterator();
                while (it.hasNext()) {
                    ((MJ1) it.next()).onResult(obj);
                }
            }
            return;
        }
        RJ1 rj12 = this.a;
        Throwable th = oj1.b;
        synchronized (rj12) {
            ArrayList arrayList = new ArrayList(rj12.b);
            if (arrayList.isEmpty()) {
                AbstractC5888hI1.b("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((MJ1) it2.next()).onResult(th);
            }
        }
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J14 {
    public final IK3 a;
    public final C0056Al0 b;
    public Handler c;
    public HashMap d;

    public J14() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw new IllegalStateException();
        }
        Handler handler = new Handler(myLooper);
        this.a = new IK3();
        this.b = new C0056Al0();
        this.d = new HashMap();
        this.c = handler;
    }

    public final H14 a(K14 k14) {
        this.a.getClass();
        this.b.getClass();
        WeakReference weakReference = (WeakReference) this.d.get(k14);
        if (weakReference == null) {
            return null;
        }
        H14 h14 = (H14) weakReference.get();
        if (h14 == null) {
            k14.c(this);
            return null;
        }
        return (H14) k14.a.cast(h14);
    }
}

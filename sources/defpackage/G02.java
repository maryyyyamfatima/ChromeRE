package defpackage;

import android.os.Looper;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class G02 {
    public static final Object j = new Object();
    public final Object a = new Object();
    public final IT2 b = new IT2();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    public G02() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public final void b(CE1 ce1) {
        if (ce1.b) {
            if (!ce1.h()) {
                ce1.e(false);
                return;
            }
            int i = ce1.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            ce1.c = i2;
            ce1.a.a(this.e);
        }
    }

    public final void c(CE1 ce1) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (ce1 != null) {
                b(ce1);
                ce1 = null;
            } else {
                IT2 it2 = this.b;
                it2.getClass();
                FT2 ft2 = new FT2(it2);
                it2.h.put(ft2, Boolean.FALSE);
                while (ft2.hasNext()) {
                    b((CE1) ((Map.Entry) ft2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public static void a(String str) {
        C1604Mj.a().a.getClass();
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException(AbstractC4199cO1.a("Cannot invoke ", str, " on a background thread"));
        }
    }
}

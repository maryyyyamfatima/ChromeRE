package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sL3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9682sL3 {
    public final PriorityQueue a = new PriorityQueue(5, new Comparator() { // from class: pL3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C5049er2 c5049er2 = (C5049er2) obj;
            C5049er2 c5049er22 = (C5049er2) obj2;
            int i = c5049er2.b;
            int i2 = c5049er22.b;
            return i == i2 ? (int) (c5049er2.d - c5049er22.d) : i - i2;
        }
    });
    public final Handler b = new Handler(Looper.getMainLooper());
    public boolean c;

    public final C5049er2 b(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C5049er2 c5049er2 = (C5049er2) it.next();
            if (c5049er2.a.equals(obj)) {
                it.remove();
                return c5049er2;
            }
        }
        return null;
    }

    public static void a(C9682sL3 c9682sL3) {
        C5049er2 c5049er2 = (C5049er2) c9682sL3.a.poll();
        if (c5049er2 != null) {
            c5049er2.c.run();
            c9682sL3.b.postDelayed(new RunnableC8997qL3(c9682sL3), 350L);
        } else {
            c9682sL3.c = false;
        }
    }
}

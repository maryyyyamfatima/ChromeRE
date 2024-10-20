package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class T82 {
    public final String b;
    public final S82 c;
    public final List a = Collections.synchronizedList(new ArrayList());
    public final AtomicInteger d = new AtomicInteger(0);

    public T82(S82 s82, String str) {
        this.c = s82;
        this.b = str;
    }

    public final Object a() {
        S82 s82 = this.c;
        if (s82 == null) {
            throw new NullPointerException("Pool has no factory");
        }
        List list = this.a;
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        int addAndGet = this.d.addAndGet(1);
        if (addAndGet > 100) {
            AbstractC4508dH1.e(String.format("%s has allocated %d objects, did you forget to call free?", this.b, Integer.valueOf(addAndGet)));
        }
        return s82.a();
    }
}

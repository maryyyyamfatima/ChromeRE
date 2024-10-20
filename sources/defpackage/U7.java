package defpackage;

import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.q;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U7 extends S7 {
    @Override // defpackage.S7
    public final void a(p pVar, Set set) {
        Set set2;
        synchronized (pVar) {
            set2 = ((q) pVar).seenExceptions;
            if (set2 == null) {
                ((q) pVar).seenExceptions = set;
            }
        }
    }

    @Override // defpackage.S7
    public final int b(q qVar) {
        int z;
        synchronized (qVar) {
            z = q.z(qVar);
        }
        return z;
    }
}

package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E04 {
    public static final Status c = new Status(8, "The connection to Google Play services was lost");
    public final Set a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final D04 b = new D04(this);

    public final void a() {
        boolean z;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(new BasePendingResult[0])) {
            basePendingResult.g.set(null);
            synchronized (basePendingResult.a) {
                if (((AbstractC10600v11) basePendingResult.c.get()) == null || !basePendingResult.m) {
                    basePendingResult.d();
                }
                synchronized (basePendingResult.a) {
                    z = basePendingResult.k;
                }
            }
            if (z) {
                this.a.remove(basePendingResult);
            }
        }
    }
}

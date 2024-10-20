package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2526Tl1 {
    public final Map a = Collections.synchronizedMap(new HashMap());
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();

    public final synchronized void a(C7070kk3 c7070kk3) {
        this.c.remove(c7070kk3);
        if (this.c.isEmpty()) {
            this.b.clear();
            this.a.clear();
        }
    }
}

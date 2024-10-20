package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2574Tv {
    public Map a;

    public final void a(Object obj, String str) {
        if (this.a == null) {
            this.a = Collections.synchronizedMap(new HashMap());
        }
        this.a.put(str, obj);
    }
}

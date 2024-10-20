package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fX3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5277fX3 {
    public final Map a = Collections.synchronizedMap(new HashMap());

    public final void b(Class cls, Object obj) {
        this.a.put(cls, obj);
    }

    public final Object a(Class cls) {
        return this.a.get(cls);
    }
}

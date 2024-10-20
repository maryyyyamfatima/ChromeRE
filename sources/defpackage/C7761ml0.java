package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ml0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7761ml0 implements D30 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((D30) it.next()).b(hy1);
        }
    }
}

package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Wu4 extends Tu4 {
    public final Vu4 a = new Vu4();

    @Override // defpackage.Tu4
    public final void a(Throwable th, Throwable th2) {
        ConcurrentHashMap concurrentHashMap;
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        Vu4 vu4 = this.a;
        ReferenceQueue referenceQueue = vu4.b;
        while (true) {
            Reference poll = referenceQueue.poll();
            concurrentHashMap = vu4.a;
            if (poll == null) {
                break;
            } else {
                concurrentHashMap.remove(poll);
            }
        }
        List list = (List) concurrentHashMap.get(new Uu4(th, null));
        if (list == null) {
            list = new Vector(2);
            List list2 = (List) concurrentHashMap.putIfAbsent(new Uu4(th, referenceQueue), list);
            if (list2 != null) {
                list = list2;
            }
        }
        list.add(th2);
    }
}

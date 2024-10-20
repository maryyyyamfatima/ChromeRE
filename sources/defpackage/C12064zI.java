package defpackage;

import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12064zI {
    public volatile boolean b;
    public final LinkedList a = new LinkedList();
    public final RunnableC11721yI c = new RunnableC11721yI(this);

    public final void a(QF3 qf3, Runnable runnable) {
        synchronized (this.a) {
            this.a.add(new Pair(qf3, runnable));
        }
    }

    public final void b(boolean z) {
        synchronized (this.a) {
        }
        if (this.a.isEmpty()) {
            return;
        }
        if (z) {
            PostTask.d((QF3) ((Pair) this.a.peek()).first, new Runnable() { // from class: xI
                @Override // java.lang.Runnable
                public final void run() {
                    C12064zI c12064zI = C12064zI.this;
                    Iterator it = c12064zI.a.iterator();
                    while (it.hasNext()) {
                        ((Runnable) ((Pair) it.next()).second).run();
                        if (c12064zI.b) {
                            return;
                        }
                    }
                }
            });
        } else {
            PostTask.c((QF3) ((Pair) this.a.peek()).first, this.c);
        }
    }
}

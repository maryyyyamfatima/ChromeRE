package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sJ */
/* loaded from: classes.dex */
public final class RunnableC9668sJ implements Runnable {
    public final /* synthetic */ VJ a;
    public final /* synthetic */ C10011tJ g;

    public RunnableC9668sJ(C10011tJ c10011tJ, VJ vj) {
        this.g = c10011tJ;
        this.a = vj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        AbstractC11726yJ abstractC11726yJ = this.g.b;
        abstractC11726yJ.d(this.a);
        ArrayDeque arrayDeque = abstractC11726yJ.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        ((Runnable) arrayDeque.remove()).run();
        if (arrayDeque.isEmpty() || (runnable = abstractC11726yJ.a) == null) {
            return;
        }
        runnable.run();
    }
}

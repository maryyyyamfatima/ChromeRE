package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E00 implements Runnable {
    public final /* synthetic */ ComponentTree a;

    public E00(ComponentTree componentTree) {
        this.a = componentTree;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = ComponentTree.i0;
        this.a.b();
    }
}

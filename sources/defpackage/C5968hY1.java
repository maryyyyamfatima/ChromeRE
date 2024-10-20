package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5968hY1 extends C4866eK1 {
    public C5968hY1() {
        super(500L);
    }

    @Override // defpackage.C4866eK1
    public final void c(Object obj, Object obj2) {
        C6312iY1 c6312iY1 = (C6312iY1) obj;
        c6312iY1.getClass();
        ArrayDeque arrayDeque = C6312iY1.d;
        synchronized (arrayDeque) {
            arrayDeque.offer(c6312iY1);
        }
    }
}

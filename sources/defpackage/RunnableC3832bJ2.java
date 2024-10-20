package defpackage;

import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bJ2 */
/* loaded from: classes.dex */
public final class RunnableC3832bJ2 implements Runnable {
    public final /* synthetic */ Deque a;
    public final /* synthetic */ boolean g;

    public RunnableC3832bJ2(ArrayDeque arrayDeque, boolean z) {
        this.a = arrayDeque;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        while (true) {
            Deque deque = this.a;
            if (deque.isEmpty()) {
                return;
            }
            C10259u13 c10259u13 = (C10259u13) deque.pollFirst();
            boolean z = this.g;
            boolean z2 = c10259u13.a;
            A13 a13 = c10259u13.c;
            a13.getClass();
            LK3.a();
            Y03 y03 = c10259u13.b;
            if (y03 != null) {
                a13.j(y03, z2, z, uptimeMillis, 0);
            }
        }
    }
}

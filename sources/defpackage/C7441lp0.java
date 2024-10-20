package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7441lp0 {
    public final HashMap a = new HashMap();
    public final C7097kp0 b = new C7097kp0();

    public final void a(String str) {
        C6753jp0 c6753jp0;
        synchronized (this) {
            c6753jp0 = (C6753jp0) this.a.get(str);
            AbstractC6464iy2.b(c6753jp0);
            int i = c6753jp0.b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c6753jp0.b);
            }
            int i2 = i - 1;
            c6753jp0.b = i2;
            if (i2 == 0) {
                C6753jp0 c6753jp02 = (C6753jp0) this.a.remove(str);
                if (!c6753jp02.equals(c6753jp0)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + String.valueOf(c6753jp0) + ", but actually removed: " + String.valueOf(c6753jp02) + ", safeKey: " + str);
                }
                C7097kp0 c7097kp0 = this.b;
                synchronized (c7097kp0.a) {
                    if (c7097kp0.a.size() < 10) {
                        c7097kp0.a.offer(c6753jp02);
                    }
                }
            }
        }
        c6753jp0.a.unlock();
    }
}

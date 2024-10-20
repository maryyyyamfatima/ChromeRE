package defpackage;

import java.util.concurrent.Future;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m14, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7515m14 {
    public static Object a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}

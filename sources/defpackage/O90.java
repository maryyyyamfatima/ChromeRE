package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class O90 {
    public static final void a(E90 e90, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) e90.b(M90.a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.h(e90, th);
            } else {
                N90.a(e90, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC4492dE0.a(runtimeException, th);
                th = runtimeException;
            }
            N90.a(e90, th);
        }
    }
}

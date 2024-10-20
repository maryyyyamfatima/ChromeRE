package kotlinx.coroutines.android;

import defpackage.AbstractC9562s;
import defpackage.M90;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Ls;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "LE90;", "context", "", "exception", "Lp14;", "h", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AndroidExceptionPreHandler extends AbstractC9562s implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(M90.a);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:            if (java.lang.reflect.Modifier.isStatic(r6.getModifiers()) != false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:            if (r1 != false) goto L21;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(defpackage.E90 r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            r1 = 1
            r2 = 0
            if (r0 > r6) goto Le
            r0 = 28
            if (r6 >= r0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r2
        Lf:
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r5._preHandler
            r0 = 0
            if (r6 == r5) goto L19
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            goto L3f
        L19:
            java.lang.Class<java.lang.Thread> r6 = java.lang.Thread.class
            java.lang.String r3 = "getUncaughtExceptionPreHandler"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L3c
            int r3 = r6.getModifiers()     // Catch: java.lang.Throwable -> L3c
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L38
            int r3 = r6.getModifiers()     // Catch: java.lang.Throwable -> L3c
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L38
            goto L39
        L38:
            r1 = r2
        L39:
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r0
        L3d:
            r5._preHandler = r6
        L3f:
            if (r6 != 0) goto L43
            r6 = r0
            goto L49
        L43:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r6 = r6.invoke(r0, r1)
        L49:
            boolean r1 = r6 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L50
            r0 = r6
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L50:
            if (r0 != 0) goto L53
            goto L5a
        L53:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r0.uncaughtException(r6, r7)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.android.AndroidExceptionPreHandler.h(E90, java.lang.Throwable):void");
    }
}

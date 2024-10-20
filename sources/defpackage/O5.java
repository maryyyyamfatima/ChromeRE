package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O5 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object g;

    public O5(Object obj, Object obj2) {
        this.a = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = Q5.d;
            Object obj = this.g;
            Object obj2 = this.a;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                Q5.e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}

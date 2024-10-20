package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JZ0 implements KZ0 {
    @Override // defpackage.KZ0
    public final void a(Throwable th) {
        if (Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
        }
    }
}

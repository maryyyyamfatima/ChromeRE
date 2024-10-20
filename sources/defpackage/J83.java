package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J83 implements Callable {
    public final /* synthetic */ Context a;

    public J83(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}

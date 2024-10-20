package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0681Fg0 implements Callable {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ String g;
    public final /* synthetic */ Long h;

    public CallableC0681Fg0(SharedPreferences sharedPreferences, String str, Long l) {
        this.a = sharedPreferences;
        this.g = str;
        this.h = l;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.a.getLong(this.g, this.h.longValue()));
    }
}

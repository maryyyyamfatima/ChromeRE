package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0551Eg0 implements Callable {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ String g;
    public final /* synthetic */ Integer h;

    public CallableC0551Eg0(SharedPreferences sharedPreferences, String str, Integer num) {
        this.a = sharedPreferences;
        this.g = str;
        this.h = num;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(this.a.getInt(this.g, this.h.intValue()));
    }
}

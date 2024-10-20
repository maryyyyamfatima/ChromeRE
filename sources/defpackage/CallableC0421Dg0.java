package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0421Dg0 implements Callable {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ String g;
    public final /* synthetic */ Boolean h;

    public CallableC0421Dg0(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.a = sharedPreferences;
        this.g = str;
        this.h = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(this.a.getBoolean(this.g, this.h.booleanValue()));
    }
}

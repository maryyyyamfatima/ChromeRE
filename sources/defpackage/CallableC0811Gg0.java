package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0811Gg0 implements Callable {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public CallableC0811Gg0(SharedPreferences sharedPreferences, String str, String str2) {
        this.a = sharedPreferences;
        this.g = str;
        this.h = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.getString(this.g, this.h);
    }
}

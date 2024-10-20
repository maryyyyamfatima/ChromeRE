package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC10356uJ1 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public CallableC10356uJ1(Context context, String str, String str2) {
        this.a = context;
        this.g = str;
        this.h = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AbstractC11728yJ1.b(this.a, this.g, this.h);
    }
}

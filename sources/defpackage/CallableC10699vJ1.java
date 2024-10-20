package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC10699vJ1 implements Callable {
    public final /* synthetic */ WeakReference a;
    public final /* synthetic */ Context g;
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;

    public CallableC10699vJ1(WeakReference weakReference, Context context, int i, String str) {
        this.a = weakReference;
        this.g = context;
        this.h = i;
        this.i = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = (Context) this.a.get();
        if (context == null) {
            context = this.g;
        }
        return AbstractC11728yJ1.e(this.h, context, this.i);
    }
}

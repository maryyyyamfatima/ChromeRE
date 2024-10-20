package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VR0 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context g;
    public final /* synthetic */ LR0 h;
    public final /* synthetic */ int i;

    public VR0(String str, Context context, LR0 lr0, int i) {
        this.a = str;
        this.g = context;
        this.h = lr0;
        this.i = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return YR0.a(this.a, this.g, this.h, this.i);
        } catch (Throwable unused) {
            return new XR0(-3);
        }
    }
}

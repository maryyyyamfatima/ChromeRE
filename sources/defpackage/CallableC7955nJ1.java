package defpackage;

import android.content.Context;
import com.airbnb.lottie.b;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nJ1 */
/* loaded from: classes.dex */
public final class CallableC7955nJ1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b g;

    public CallableC7955nJ1(b bVar, int i) {
        this.g = bVar;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        b bVar = this.g;
        boolean z = bVar.v;
        int i = this.a;
        if (z) {
            Context context = bVar.getContext();
            return AbstractC11728yJ1.e(i, context, AbstractC11728yJ1.h(context, i));
        }
        return AbstractC11728yJ1.e(i, bVar.getContext(), null);
    }
}

package defpackage;

import android.content.Context;
import com.airbnb.lottie.b;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oJ1 */
/* loaded from: classes.dex */
public final class CallableC8299oJ1 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ b g;

    public CallableC8299oJ1(b bVar, String str) {
        this.g = bVar;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        b bVar = this.g;
        boolean z = bVar.v;
        String str = this.a;
        if (z) {
            Context context = bVar.getContext();
            HashMap hashMap = AbstractC11728yJ1.a;
            return AbstractC11728yJ1.b(context, str, "asset_" + str);
        }
        return AbstractC11728yJ1.b(bVar.getContext(), str, null);
    }
}

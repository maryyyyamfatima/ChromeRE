package defpackage;

import android.util.Pair;
import java.util.Locale;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H7 implements Callback {
    public final /* synthetic */ L7 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public H7(L7 l7) {
        this.a = l7;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Pair pair = (Pair) obj;
        L7 l7 = this.a;
        l7.t.c.clear();
        String str = (String) pair.first;
        l7.i.g = str;
        l7.j.a = str;
        l7.c(str, Locale.getDefault().getLanguage());
        l7.c.post((Runnable) pair.second);
    }
}

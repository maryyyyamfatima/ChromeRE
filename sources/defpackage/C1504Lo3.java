package defpackage;

import J.N;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lo3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1504Lo3 implements Callback {
    public final /* synthetic */ C3063Xo3 a;
    public final /* synthetic */ Callback g;

    public /* synthetic */ C1504Lo3(Callback callback, C3063Xo3 c3063Xo3) {
        this.a = c3063Xo3;
        this.g = callback;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C3063Xo3 c3063Xo3 = this.a;
        c3063Xo3.getClass();
        N.MCOrSSmL(c3063Xo3.a.a, "PRICE_TRACK", new C2413So3((List) obj, this.g, c3063Xo3));
    }
}

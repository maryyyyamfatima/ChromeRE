package defpackage;

import J.N;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ko3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1374Ko3 implements Callback {
    public final /* synthetic */ C3063Xo3 a;
    public final /* synthetic */ String g;
    public final /* synthetic */ Callback h;

    public /* synthetic */ C1374Ko3(String str, Callback callback, C3063Xo3 c3063Xo3) {
        this.a = c3063Xo3;
        this.g = str;
        this.h = callback;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C3063Xo3 c3063Xo3 = this.a;
        c3063Xo3.getClass();
        N.MCOrSSmL(c3063Xo3.a.a, String.valueOf(this.g), new C2413So3((List) obj, this.h, c3063Xo3));
    }
}

package defpackage;

import J.N;
import android.os.Build;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6678jc3 implements InterfaceC0079Ap3 {
    public final /* synthetic */ C12094zO a;
    public final /* synthetic */ PropertyModel g;
    public final /* synthetic */ long h;

    public /* synthetic */ C6678jc3(C12094zO c12094zO, PropertyModel propertyModel, long j) {
        this.a = c12094zO;
        this.g = propertyModel;
        this.h = j;
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        long j;
        int recommendedTimeoutMillis;
        int h = this.g.h(HU1.a);
        C12094zO c12094zO = this.a;
        long max = Math.max(c12094zO.a, this.h);
        String concat = "autodismiss_duration_ms_".concat(TV1.a(h));
        C7928nE c7928nE = UN.a;
        long M37SqSAy = N.M37SqSAy("MessagesForAndroidInfrastructure", concat, -1);
        if (M37SqSAy > 0) {
            max = Math.max(M37SqSAy, max);
        }
        int i = Build.VERSION.SDK_INT;
        long j2 = c12094zO.b;
        if (i >= 29 && C10021tL.f().c()) {
            C10021tL.f().getClass();
            recommendedTimeoutMillis = H1.b().getRecommendedTimeoutMillis((int) max, 7);
            j = Math.max(j2, recommendedTimeoutMillis);
        } else {
            if (C10021tL.f().c()) {
                max = Math.max(j2, max);
            }
            j = max;
        }
        return Long.valueOf(j);
    }
}

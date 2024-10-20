package defpackage;

import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hP0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C5922hP0 implements Callback {
    public final /* synthetic */ AbstractC6952kP0 a;

    public /* synthetic */ C5922hP0(AbstractC6952kP0 abstractC6952kP0) {
        this.a = abstractC6952kP0;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        List list = (List) obj;
        AbstractC6952kP0 abstractC6952kP0 = this.a;
        abstractC6952kP0.getClass();
        EI2.e(Math.min(list.size(), 2), "Signin.AndroidDeviceAccountsNumberWhenEnteringFRE");
        abstractC6952kP0.e = list;
        abstractC6952kP0.d();
    }
}

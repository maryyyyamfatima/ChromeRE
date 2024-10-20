package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ir2 */
/* loaded from: classes.dex */
public final class C6424ir2 implements InterfaceC5393fr2 {
    public final /* synthetic */ AbstractC5737gr2 a;
    public final /* synthetic */ C6905kF3 b;
    public final /* synthetic */ InterfaceC7455lr2 c;
    public final /* synthetic */ C6081hr2 d;

    public C6424ir2(AbstractC8508ov abstractC8508ov, C6905kF3 c6905kF3, InterfaceC7455lr2 interfaceC7455lr2) {
        C6081hr2 c6081hr2 = AbstractC7799mr2.a;
        this.a = abstractC8508ov;
        this.b = c6905kF3;
        this.c = interfaceC7455lr2;
        this.d = c6081hr2;
    }

    @Override // defpackage.InterfaceC5393fr2
    public final void a(Status status) {
        boolean r1 = status.r1();
        C6905kF3 c6905kF3 = this.b;
        if (r1) {
            c6905kF3.b(this.c.a(this.a.c(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.d.getClass();
            c6905kF3.a(AbstractC10800vd.a(status));
        }
    }
}

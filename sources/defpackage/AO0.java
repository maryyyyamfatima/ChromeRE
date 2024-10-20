package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.ActionImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AO0 extends AbstractC5875hF3 implements InterfaceC8851pv {
    public C6905kF3 d;
    public final /* synthetic */ ActionImpl[] e;

    @Override // defpackage.InterfaceC8851pv
    public final void a(Object obj) {
        Status status = (Status) obj;
        if (status.r1()) {
            this.d.b(null);
        } else {
            this.d.a(B74.a(status, "User Action indexing error, please try again."));
        }
    }

    @Override // defpackage.AbstractC5875hF3
    public final void b(InterfaceC3129Yc interfaceC3129Yc, C6905kF3 c6905kF3) {
        this.d = c6905kF3;
        InterfaceC8402od1 interfaceC8402od1 = (InterfaceC8402od1) ((UA1) interfaceC3129Yc).m();
        Y34 y34 = new Y34(this);
        C7714md1 c7714md1 = (C7714md1) interfaceC8402od1;
        Parcel a = c7714md1.a();
        AbstractC11786yV.c(a, y34);
        a.writeTypedArray(this.e, 0);
        c7714md1.h(7, a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AO0(ActionImpl[] actionImplArr) {
        super(null, false, 9004);
        this.e = actionImplArr;
    }
}

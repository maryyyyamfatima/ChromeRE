package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class FU2 extends AbstractC8508ov {
    public final EU2 q;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, defpackage.InterfaceC8851pv
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((QP2) obj);
    }

    public FU2(C6144i21 c6144i21) {
        super(AU2.a, c6144i21);
        this.q = new EU2(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return new GU2(status, null);
    }
}

package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ov, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8508ov extends BasePendingResult implements InterfaceC8851pv {
    public final C3259Zc o;
    public final C3588ad p;

    public abstract void m(InterfaceC3129Yc interfaceC3129Yc);

    public AbstractC8508ov(C3588ad c3588ad, AbstractC10600v11 abstractC10600v11) {
        super(abstractC10600v11);
        this.o = c3588ad.b;
        this.p = c3588ad;
    }

    public final void n(Status status) {
        status.r1();
        a(e(status));
    }
}

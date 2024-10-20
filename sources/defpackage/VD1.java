package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VD1 extends AbstractC4734dw1 implements InterfaceC7670mV0 {
    public final /* synthetic */ RD1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VD1(SettableFuture settableFuture) {
        super(1);
        this.g = settableFuture;
    }

    @Override // defpackage.InterfaceC7670mV0
    public final Object b(Object obj) {
        this.g.cancel(false);
        return C8546p14.a;
    }
}

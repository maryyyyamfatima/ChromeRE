package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i21 */
/* loaded from: classes.dex */
public final class C6144i21 extends AbstractC10600v11 {
    public final AbstractC7856n11 b;

    public C6144i21(AbstractC7856n11 abstractC7856n11) {
        this.b = abstractC7856n11;
    }

    @Override // defpackage.AbstractC10600v11
    public final ConnectionResult d(TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.AbstractC10600v11
    public final void e() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.AbstractC10600v11
    public final void i() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.AbstractC10600v11
    public final boolean h() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.AbstractC10600v11
    public final void j(InterfaceC9914t11 interfaceC9914t11) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.AbstractC10600v11
    public final void l(InterfaceC9914t11 interfaceC9914t11) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.AbstractC10600v11
    public final void k(InterfaceC10257u11 interfaceC10257u11) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.AbstractC10600v11
    public final void m(InterfaceC10257u11 interfaceC10257u11) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // defpackage.AbstractC10600v11
    public final AbstractC8508ov f(AbstractC8508ov abstractC8508ov) {
        this.b.c(0, abstractC8508ov);
        return abstractC8508ov;
    }

    @Override // defpackage.AbstractC10600v11
    public final Looper g() {
        return this.b.f;
    }
}

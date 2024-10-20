package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11286x11 implements O11 {
    public final R11 a;

    @Override // defpackage.O11
    public final void a(ConnectionResult connectionResult, C3588ad c3588ad, boolean z) {
    }

    @Override // defpackage.O11
    public final void c() {
    }

    @Override // defpackage.O11
    public final void connect() {
    }

    @Override // defpackage.O11
    public final void h(Bundle bundle) {
    }

    public C11286x11(R11 r11) {
        this.a = r11;
    }

    @Override // defpackage.O11
    public final AbstractC8508ov d(AbstractC8508ov abstractC8508ov) {
        b(abstractC8508ov);
        return abstractC8508ov;
    }

    @Override // defpackage.O11
    public final AbstractC8508ov b(AbstractC8508ov abstractC8508ov) {
        try {
            f(abstractC8508ov);
        } catch (DeadObjectException unused) {
            this.a.i(new C10943w11(this, this));
        }
        return abstractC8508ov;
    }

    @Override // defpackage.O11
    public final boolean disconnect() {
        R11 r11 = this.a;
        r11.s.getClass();
        r11.g(null);
        return true;
    }

    @Override // defpackage.O11
    public final void e(int i) {
        R11 r11 = this.a;
        r11.g(null);
        r11.t.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AbstractC8508ov abstractC8508ov) {
        R11 r11 = this.a;
        E04 e04 = r11.s.w;
        e04.a.add(abstractC8508ov);
        abstractC8508ov.g.set(e04.b);
        Map map = r11.s.o;
        C3259Zc c3259Zc = abstractC8508ov.o;
        InterfaceC3129Yc interfaceC3129Yc = (InterfaceC3129Yc) map.get(c3259Zc);
        if (!((BaseGmsClient) interfaceC3129Yc).isConnected() && r11.l.containsKey(c3259Zc)) {
            abstractC8508ov.n(new Status(17, null, 0));
            return;
        }
        try {
            abstractC8508ov.m(interfaceC3129Yc);
        } catch (DeadObjectException e) {
            abstractC8508ov.n(new Status(8, e.getLocalizedMessage(), 0));
            throw e;
        } catch (RemoteException e2) {
            abstractC8508ov.n(new Status(8, e2.getLocalizedMessage(), 0));
        }
    }
}

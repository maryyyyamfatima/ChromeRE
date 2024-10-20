package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kv */
/* loaded from: classes.dex */
public final class C7132kv implements InterfaceC6102hv {
    public final /* synthetic */ BaseGmsClient a;

    public C7132kv(C4261ca3 c4261ca3) {
        this.a = c4261ca3;
    }

    @Override // defpackage.InterfaceC6102hv
    public final void a(ConnectionResult connectionResult) {
        boolean t1 = connectionResult.t1();
        BaseGmsClient baseGmsClient = this.a;
        if (t1) {
            baseGmsClient.j(null, baseGmsClient.l());
            return;
        }
        C10937w01 c10937w01 = baseGmsClient.u;
        if (c10937w01 != null) {
            c10937w01.a.M0(connectionResult);
        }
    }
}

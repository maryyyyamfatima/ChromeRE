package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E11 extends P11 {
    public final /* synthetic */ I11 b;
    public final /* synthetic */ SignInResponse c;

    @Override // defpackage.P11
    public final void a() {
        I11 i11 = this.b;
        boolean z = false;
        if (i11.g(0)) {
            SignInResponse signInResponse = this.c;
            ConnectionResult connectionResult = signInResponse.g;
            if (connectionResult.t1()) {
                ResolveAccountResponse resolveAccountResponse = signInResponse.h;
                ConnectionResult connectionResult2 = resolveAccountResponse.h;
                if (!connectionResult2.t1()) {
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                    i11.k(connectionResult2);
                    return;
                }
                i11.n = true;
                i11.o = resolveAccountResponse.r1();
                i11.p = resolveAccountResponse.i;
                i11.q = resolveAccountResponse.j;
                i11.n();
                return;
            }
            if (i11.l && !connectionResult.s1()) {
                z = true;
            }
            if (z) {
                i11.f();
                i11.n();
            } else {
                i11.k(connectionResult);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E11(I11 i11, I11 i112, SignInResponse signInResponse) {
        super(i11);
        this.b = i112;
        this.c = signInResponse;
    }
}

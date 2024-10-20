package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ea3 */
/* loaded from: classes.dex */
public final class RunnableC4948ea3 implements Runnable {
    public final /* synthetic */ SignInResponse a;
    public final /* synthetic */ BinderC5292fa3 g;

    public RunnableC4948ea3(BinderC5292fa3 binderC5292fa3, SignInResponse signInResponse) {
        this.g = binderC5292fa3;
        this.a = signInResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        BinderC5292fa3 binderC5292fa3 = this.g;
        binderC5292fa3.getClass();
        SignInResponse signInResponse = this.a;
        ConnectionResult connectionResult = signInResponse.g;
        if (connectionResult.t1()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.h;
            ConnectionResult connectionResult2 = resolveAccountResponse.h;
            if (!connectionResult2.t1()) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                binderC5292fa3.l.b(connectionResult2);
                binderC5292fa3.k.disconnect();
                return;
            }
            C5456g21 c5456g21 = binderC5292fa3.l;
            InterfaceC7008ka1 r1 = resolveAccountResponse.r1();
            c5456g21.getClass();
            if (r1 == null || (set = binderC5292fa3.i) == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                c5456g21.b(new ConnectionResult(4));
            } else {
                c5456g21.c = r1;
                c5456g21.d = set;
                if (c5456g21.e) {
                    ((BaseGmsClient) c5456g21.a).j(r1, set);
                }
            }
        } else {
            binderC5292fa3.l.b(connectionResult);
        }
        binderC5292fa3.k.disconnect();
    }
}

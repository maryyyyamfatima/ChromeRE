package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ca3 */
/* loaded from: classes.dex */
public final class C4261ca3 extends AbstractC11280x01 implements InterfaceC3918ba3 {
    public final boolean F;
    public final JU G;
    public final Bundle H;
    public final Integer I;

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.signin.service.START";
    }

    public final ResolveAccountRequest y() {
        Account account = this.G.a;
        if (account == null) {
            account = new Account("<<default account>>", "com.google");
        }
        GoogleSignInAccount googleSignInAccount = null;
        if ("<<default account>>".equals(account.name)) {
            Context context = this.h;
            ReentrantLock reentrantLock = C5708gm3.c;
            reentrantLock.lock();
            try {
                if (C5708gm3.d == null) {
                    C5708gm3.d = new C5708gm3(context.getApplicationContext());
                }
                C5708gm3 c5708gm3 = C5708gm3.d;
                reentrantLock.unlock();
                ReentrantLock reentrantLock2 = c5708gm3.a;
                reentrantLock2.lock();
                try {
                    String string = c5708gm3.b.getString("defaultGoogleSignInAccount", null);
                    reentrantLock2.unlock();
                    if (!TextUtils.isEmpty(string)) {
                        String a = AbstractC4809e90.a("googleSignInAccount:", string);
                        c5708gm3.a.lock();
                        try {
                            String string2 = c5708gm3.b.getString(a, null);
                            if (string2 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.r1(string2);
                                } catch (JSONException unused) {
                                }
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return new ResolveAccountRequest(2, account, this.I.intValue(), googleSignInAccount);
    }

    public C4261ca3(Context context, Looper looper, JU ju, Bundle bundle, InterfaceC9914t11 interfaceC9914t11, InterfaceC10257u11 interfaceC10257u11) {
        super(context, looper, 44, ju, interfaceC9914t11, interfaceC10257u11);
        this.F = true;
        this.G = ju;
        this.H = bundle;
        this.I = ju.j;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final boolean requiresSignIn() {
        return this.F;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle i() {
        JU ju = this.G;
        boolean equals = this.h.getPackageName().equals(ju.f);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", ju.f);
        }
        return bundle;
    }

    public final void z(InterfaceC11157wf1 interfaceC11157wf1) {
        try {
            ResolveAccountRequest y = y();
            InterfaceC12186zf1 interfaceC12186zf1 = (InterfaceC12186zf1) m();
            SignInRequest signInRequest = new SignInRequest(1, y);
            C11500xf1 c11500xf1 = (C11500xf1) interfaceC12186zf1;
            Parcel a = c11500xf1.a();
            AbstractC11786yV.b(a, signInRequest);
            AbstractC11786yV.c(a, interfaceC11157wf1);
            c11500xf1.h(12, a);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC11157wf1.H(new SignInResponse(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC11843yf1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof InterfaceC12186zf1) {
            return (InterfaceC12186zf1) queryLocalInterface;
        }
        return new C11500xf1(iBinder);
    }
}

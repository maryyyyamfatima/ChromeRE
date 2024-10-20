package defpackage;

import J.N;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.io.IOException;
import org.chromium.net.HttpNegotiateAuthenticator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class X91 implements AccountManagerCallback {
    public final Y91 a;
    public final /* synthetic */ HttpNegotiateAuthenticator b;

    public X91(HttpNegotiateAuthenticator httpNegotiateAuthenticator, Y91 y91) {
        this.b = httpNegotiateAuthenticator;
        this.a = y91;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
        Y91 y91 = this.a;
        int i = -9;
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("intent")) {
                httpNegotiateAuthenticator.getClass();
                httpNegotiateAuthenticator.a = bundle.getBundle("spnegoContext");
                int i2 = bundle.getInt("spnegoResult", 1);
                if (i2 != 0) {
                    switch (i2) {
                        case 2:
                            i = -3;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            i = -342;
                            break;
                        case 4:
                            i = -320;
                            break;
                        case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                            i = -338;
                            break;
                        case 6:
                            i = -339;
                            break;
                        case 7:
                            i = -341;
                            break;
                        case 8:
                            i = -344;
                            break;
                        case 9:
                            i = -329;
                            break;
                    }
                } else {
                    i = 0;
                }
                N.M0s8NeYn(y91.a, httpNegotiateAuthenticator, i, bundle.getString("authtoken"));
                return;
            }
            Context context = V60.a;
            context.registerReceiver(new W91(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            AbstractC4851eH1.f("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            N.M0s8NeYn(y91.a, httpNegotiateAuthenticator, -9, null);
        }
    }
}

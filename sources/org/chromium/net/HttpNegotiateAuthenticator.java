package org.chromium.net;

import J.N;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import defpackage.AbstractC4809e90;
import defpackage.AbstractC4851eH1;
import defpackage.V60;
import defpackage.V91;
import defpackage.X91;
import defpackage.Y91;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class HttpNegotiateAuthenticator {
    public Bundle a;
    public final String b;

    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = V60.a;
        Y91 y91 = new Y91();
        y91.d = AbstractC4809e90.a("SPNEGO:HOSTBASED:", str);
        y91.b = AccountManager.get(context);
        y91.a = j;
        String[] strArr = {"SPNEGO"};
        Bundle bundle = new Bundle();
        y91.c = bundle;
        if (str2 != null) {
            bundle.putString("incomingAuthToken", str2);
        }
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            y91.c.putBundle("spnegoContext", bundle2);
        }
        y91.c.putBoolean("canDelegate", z);
        Activity activity = ApplicationStatus.c;
        if (activity == null) {
            if (a(context, "android.permission.GET_ACCOUNTS", true)) {
                AbstractC4851eH1.a("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
                N.M0s8NeYn(y91.a, this, -343, null);
                return;
            } else {
                y91.b.getAccountsByTypeAndFeatures(this.b, strArr, new V91(this, y91), new Handler(ThreadUtils.c()));
                return;
            }
        }
        if (a(context, "android.permission.GET_ACCOUNTS", false)) {
            AbstractC4851eH1.a("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS");
            N.M0s8NeYn(y91.a, this, -343, null);
        } else {
            y91.b.getAuthTokenByFeatures(this.b, y91.d, strArr, activity, null, y91.c, new X91(this, y91), new Handler(ThreadUtils.c()));
        }
    }

    public HttpNegotiateAuthenticator(String str) {
        this.b = str;
    }

    public static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    public static boolean a(Context context, String str, boolean z) {
        return (z || context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) ? false : true;
    }
}

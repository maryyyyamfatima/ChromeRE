package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11636y22 {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public C8573p61 e;
    public final Handler f = new Handler(Looper.getMainLooper());

    public AbstractC11636y22(Context context, String str, String str2, String str3) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final C9957t82 b() {
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            Log.w("SurveyNetworkConnection", "Account was not set.");
            return null;
        }
        try {
            Context context = this.a;
            Account account = new Account(str, "com.google");
            int i = AbstractC7174l21.d;
            Bundle bundle = new Bundle();
            AbstractC9577s21.j(account);
            return new C9957t82(new F0(AbstractC9577s21.e(context, account, "oauth2:https://www.googleapis.com/auth/supportcontent", bundle).g));
        } catch (UserRecoverableAuthException e) {
            Log.e("SurveyNetworkConnection", "User recoverable exception happened while getting authentication token. You need to allowlist your application.", e);
            return null;
        } catch (Exception e2) {
            Log.e("SurveyNetworkConnection", "Exception occurred while getting auth credentials", e2);
            return null;
        }
    }

    public final SurveyDataImpl a(C9934t43 c9934t43) {
        String str = this.b;
        String str2 = c9934t43.n;
        C2553Tq3 c2553Tq3 = c9934t43.k;
        if (c2553Tq3 == null) {
            c2553Tq3 = C2553Tq3.p;
        }
        C2553Tq3 c2553Tq32 = c2553Tq3;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        if (c2553Tq32 == null) {
            throw new IllegalArgumentException("Payload is null.");
        }
        C7456lr3 c7456lr3 = c9934t43.j;
        if (c7456lr3 == null) {
            c7456lr3 = C7456lr3.l;
        }
        C7456lr3 c7456lr32 = c7456lr3;
        String str3 = c9934t43.l;
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC0562Ei1 o = AbstractC0562Ei1.o(c9934t43.m);
        if (currentTimeMillis == 0) {
            throw new IllegalStateException("Trigger time is not set");
        }
        return new SurveyDataImpl(str, str2, currentTimeMillis, c7456lr32, c2553Tq32, str3, o);
    }
}

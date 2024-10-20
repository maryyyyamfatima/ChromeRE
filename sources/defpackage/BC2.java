package defpackage;

import J.N;
import android.accounts.Account;
import org.chromium.components.signin.identitymanager.ProfileOAuth2TokenServiceDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BC2 implements O30 {
    public final /* synthetic */ Account a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AC2 c;
    public final /* synthetic */ ProfileOAuth2TokenServiceDelegate d;

    @Override // defpackage.O30
    public final Object run() {
        return this.d.c.i(this.a, this.b);
    }

    @Override // defpackage.O30
    public final void b(boolean z) {
        N.MTN9MD0o(null, 0L, z, this.c.a);
    }

    public BC2(ProfileOAuth2TokenServiceDelegate profileOAuth2TokenServiceDelegate, Account account, String str, AC2 ac2) {
        this.d = profileOAuth2TokenServiceDelegate;
        this.a = account;
        this.b = str;
        this.c = ac2;
    }

    @Override // defpackage.O30
    public final void a(Object obj) {
        G0 g0 = (G0) obj;
        AC2 ac2 = this.c;
        ac2.getClass();
        N.MTN9MD0o(g0.a, g0.b, false, ac2.a);
    }
}

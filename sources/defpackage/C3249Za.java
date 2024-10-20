package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3249Za {
    public final String a;
    public String b = "files";
    public String c = "common";
    public final Account d = AbstractC3576ab.b;
    public String e = "";
    public final C0042Ai1 f;

    public final void b() {
        AbstractC5778gy2.a(AbstractC3576ab.a.matcher("phenotype").matches(), "Module must match [a-z]+(_[a-z]+)*: %s", "phenotype");
        AbstractC5778gy2.a(!AbstractC3576ab.c.contains("phenotype"), "Module name is reserved and cannot be used: %s", "phenotype");
        this.c = "phenotype";
    }

    public C3249Za(Context context) {
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        this.f = new C0042Ai1();
        AbstractC5778gy2.a(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public final Uri a() {
        String str = this.b;
        String str2 = this.c;
        Account account = this.d;
        Account account2 = AbstractC10959w4.a;
        AbstractC5778gy2.a(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        AbstractC5778gy2.a(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        AbstractC5778gy2.a(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        return new Uri.Builder().scheme("android").authority(this.a).path(AbstractC10204ts.a(AbstractC10975w63.a("/", str, "/", str2, "/"), AbstractC10959w4.a.equals(account) ? "shared" : AbstractC8192o0.a(account.type, ":", account.name), "/", this.e)).encodedFragment(AbstractC4836eE1.a(this.f.f())).build();
    }
}

package defpackage;

import J.N;
import android.accounts.Account;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h84 */
/* loaded from: classes.dex */
public final class C5839h84 extends C4807e84 {
    public static final long g = TimeUnit.MINUTES.toMillis(30);
    public final C4502dG0 c;
    public boolean d;
    public long e;
    public int[] f;

    public C5839h84(C4502dG0 c4502dG0) {
        this.c = c4502dG0;
        d();
    }

    @Override // defpackage.C4807e84
    public final void c() {
        super.c();
        d();
    }

    @Override // defpackage.C4807e84
    public final void b() {
        this.d = true;
        Object obj = ThreadUtils.a;
        int[] iArr = this.f;
        if (iArr != null) {
            N.MwmPuE$v("GsaExperiments", iArr, true);
        }
    }

    public final void d() {
        Object obj = ThreadUtils.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.e;
        if (j == 0 || elapsedRealtime - j >= g) {
            this.e = elapsedRealtime;
            new C5495g84(this).c(AbstractC0185Bl.e);
        }
    }

    @Override // defpackage.C4807e84
    public final void a(final C4464d84 c4464d84) {
        AccountManagerFacadeProvider.getInstance().a().g(new Callback() { // from class: f84
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                String str;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    } else if (((Account) it.next()).name.endsWith("@google.com")) {
                        str = "pinson";
                        break;
                    }
                }
                c4464d84.onResult(str);
            }
        });
    }
}

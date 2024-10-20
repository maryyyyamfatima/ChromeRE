package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import org.chromium.chrome.browser.preferences.PrefChangeRegistrar;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x91 */
/* loaded from: classes.dex */
public final class C11334x91 implements InterfaceC8184ny2 {
    public static C11334x91 k;
    public boolean a;
    public String g;
    public final Q83 i;
    public final C12157za2 j = new C12157za2();
    public boolean h = false;

    public static boolean a() {
        if (k == null) {
            k = new C11334x91();
        }
        return k.a;
    }

    public C11334x91() {
        Q83 q83 = O83.a;
        this.i = q83;
        this.g = q83.i("Chrome.Policy.HomepageLocation", "");
        this.a = !TextUtils.isEmpty(r0);
        C7629mN.a().f(new Runnable() { // from class: w91
            @Override // java.lang.Runnable
            public final void run() {
                C11334x91 c11334x91 = C11334x91.this;
                if (c11334x91.h) {
                    return;
                }
                new PrefChangeRegistrar().a("homepage", c11334x91);
                c11334x91.h = true;
                c11334x91.b();
            }
        });
    }

    @Override // defpackage.InterfaceC8184ny2
    public final void c() {
        b();
    }

    public final void b() {
        PrefService a = R44.a(Profile.d());
        boolean d = a.d("homepage");
        String c = d ? a.c("homepage") : "";
        if (d == this.a && c.equals(this.g)) {
            return;
        }
        this.a = d;
        this.g = c;
        this.i.t("Chrome.Policy.HomepageLocation", c);
        Iterator it = this.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((C10648v91) c11814ya2.next()).e();
            }
        }
    }
}

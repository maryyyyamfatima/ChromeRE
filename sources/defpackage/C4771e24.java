package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e24, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4771e24 {
    public static C4771e24 f;
    public static final Object g = new Object();
    public C8552p24 c;
    public boolean e;
    public final C12157za2 a = new C12157za2();
    public final C3741b24 b = new Callback() { // from class: b24
        @Override // org.chromium.base.Callback
        public final ZE e0(Object obj) {
            return new ZE(this, obj);
        }

        @Override // org.chromium.base.Callback
        public final void onResult(Object obj) {
            C4771e24 c4771e24 = C4771e24.this;
            c4771e24.c = (C8552p24) obj;
            c4771e24.b();
            Iterator it = c4771e24.a.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    c4771e24.c();
                    return;
                }
                ((Runnable) c11814ya2.next()).run();
            }
        }
    };
    public AT1 d = new AT1();

    public final void b() {
        boolean g2 = AX.e().g("force-show-update-menu-badge");
        Resources resources = V60.a.getResources();
        this.d = new AT1();
        C8552p24 c8552p24 = this.c;
        int i = c8552p24.a;
        if (i == 1) {
            if (g2 | (!TextUtils.equals(R44.a(Profile.d()).c("omaha.latest_version_when_clicked_upate_menu_item"), this.c.d))) {
                AT1 at1 = this.d;
                US1 us1 = new US1();
                at1.b = us1;
                us1.a = R.string.f66690_resource_name_obfuscated_res_0x7f14018f;
                us1.b = R.drawable.f44760_resource_name_obfuscated_res_0x7f0900ab;
                us1.c = R.drawable.f44770_resource_name_obfuscated_res_0x7f0900ac;
                us1.d = R.drawable.f44750_resource_name_obfuscated_res_0x7f0900aa;
            }
            AT1 at12 = this.d;
            C6629jT1 c6629jT1 = new C6629jT1();
            at12.a = c6629jT1;
            c6629jT1.a = R.string.f77440_resource_name_obfuscated_res_0x7f140648;
            c6629jT1.b = R.color.f18050_resource_name_obfuscated_res_0x7f07013d;
            c6629jT1.d = R.drawable.f44750_resource_name_obfuscated_res_0x7f0900aa;
            c6629jT1.e = true;
            c6629jT1.c = X14.a("custom_summary");
            if (TextUtils.isEmpty(this.d.a.c)) {
                this.d.a.c = resources.getString(R.string.f77450_resource_name_obfuscated_res_0x7f140649);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        if (g2 | (c8552p24.d == null) | (!TextUtils.equals(AbstractC6547jD.a.e, r2))) {
            AT1 at13 = this.d;
            US1 us12 = new US1();
            at13.b = us12;
            us12.a = R.string.f66680_resource_name_obfuscated_res_0x7f14018e;
            us12.b = R.drawable.f47480_resource_name_obfuscated_res_0x7f0901f9;
            us12.c = R.drawable.f47510_resource_name_obfuscated_res_0x7f0901fc;
            us12.d = R.drawable.f47470_resource_name_obfuscated_res_0x7f0901f8;
        }
        AT1 at14 = this.d;
        C6629jT1 c6629jT12 = new C6629jT1();
        at14.a = c6629jT12;
        c6629jT12.a = R.string.f77460_resource_name_obfuscated_res_0x7f14064a;
        c6629jT12.b = R.color.f18180_resource_name_obfuscated_res_0x7f07014a;
        c6629jT12.c = resources.getString(R.string.f77470_resource_name_obfuscated_res_0x7f14064b);
        C6629jT1 c6629jT13 = this.d.a;
        c6629jT13.d = R.drawable.f47470_resource_name_obfuscated_res_0x7f0901f8;
        c6629jT13.e = false;
    }

    public static C4771e24 a() {
        C4771e24 c4771e24;
        synchronized (g) {
            if (f == null) {
                f = new C4771e24();
            }
            c4771e24 = f;
        }
        return c4771e24;
    }

    public final void d(final Runnable runnable) {
        if (this.a.a(runnable)) {
            if (this.c != null) {
                PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: c24
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12157za2 c12157za2 = C4771e24.this.a;
                        Runnable runnable2 = runnable;
                        if (c12157za2.b(runnable2)) {
                            runnable2.run();
                        }
                    }
                });
                return;
            }
            C8895q24 c8895q24 = AbstractC7865n24.a;
            C3741b24 c3741b24 = this.b;
            if (c8895q24.a.b(c3741b24)) {
                return;
            }
            c8895q24.a.a(c3741b24);
            C8552p24 c8552p24 = c8895q24.d;
            if (c8552p24 != null) {
                QF3 qf3 = AbstractC5103f04.a;
                c3741b24.getClass();
                PostTask.c(qf3, new ZE(c3741b24, c8552p24));
            } else if (c8895q24.b.b == 0) {
                c8895q24.b.c(AbstractC0185Bl.e);
            }
        }
    }

    public final void c() {
        if (AbstractC8650pL.a("omaha.clicked_update_menu_item")) {
            EI2.h(this.c.a != 1 ? 0 : 1, 2, "GoogleUpdate.MenuItem.ActionTakenAfterItemClicked");
            R44.a(Profile.d()).e("omaha.clicked_update_menu_item", false);
        }
    }
}

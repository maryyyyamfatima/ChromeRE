package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsSessionToken;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kj1 */
/* loaded from: classes.dex */
public final class C7062kj1 extends PC {
    public final Intent a;
    public final CustomTabsSessionToken b;
    public final boolean c;
    public final Bundle d;
    public final C6718jj1 e;
    public final int f;
    public final LN3 g;
    public final boolean h;
    public final ArrayList i = new ArrayList();
    public final String j;
    public final String k;
    public final boolean l;
    public final int m;

    @Override // defpackage.PC
    public final boolean P() {
        return false;
    }

    @Override // defpackage.PC
    public final boolean R() {
        return true;
    }

    @Override // defpackage.PC
    public final int a() {
        return 1;
    }

    public C7062kj1(Context context, Intent intent) {
        ArrayList c;
        this.a = intent;
        this.j = C1761No1.n(intent);
        this.k = CustomTabsConnection.g().e(CustomTabsSessionToken.b(intent));
        CustomTabsSessionToken b = CustomTabsSessionToken.b(intent);
        this.b = b;
        this.c = C1186Jd0.T(intent, b);
        this.d = AbstractC2281Ro1.k(intent, "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE");
        this.l = AbstractC2281Ro1.h(intent);
        this.e = new C6718jj1(context);
        this.g = LN3.b(context, R.drawable.0_resource_name_obfuscated_res_0x7f0900c5);
        this.h = AbstractC2281Ro1.j(intent, "android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        this.f = AbstractC2281Ro1.p(0, intent, "android.support.customtabs.extra.TITLE_VISIBILITY");
        this.m = AbstractC2281Ro1.h(intent) && AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE") == 3 ? 3 : 0;
        if ((AbstractC2281Ro1.h(intent) && AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE") == 3) && (c = AbstractC2281Ro1.c(intent, "android.support.customtabs.extra.MENU_ITEMS")) != null) {
            for (int i = 0; i < Math.min(5, c.size()); i++) {
                Bundle bundle = (Bundle) c.get(i);
                String u = AbstractC2281Ro1.u("android.support.customtabs.customaction.MENU_ITEM_TITLE", bundle);
                PendingIntent pendingIntent = (PendingIntent) AbstractC2281Ro1.r("android.support.customtabs.customaction.PENDING_INTENT", bundle);
                if (!TextUtils.isEmpty(u) && pendingIntent != null) {
                    this.i.add(new Pair(u, pendingIntent));
                }
            }
        }
    }

    @Override // defpackage.PC
    public final Intent p() {
        return this.a;
    }

    @Override // defpackage.PC
    public final CustomTabsSessionToken u() {
        return this.b;
    }

    @Override // defpackage.PC
    public final boolean M() {
        return (this.d == null || g() == null) ? false : true;
    }

    @Override // defpackage.PC
    public final String g() {
        Bundle bundle = this.d;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(C1186Jd0.G);
    }

    @Override // defpackage.PC
    public final int c() {
        if (M()) {
            return this.d.getInt(C1186Jd0.H);
        }
        return 0;
    }

    @Override // defpackage.PC
    public final int d() {
        if (M()) {
            return this.d.getInt(C1186Jd0.I);
        }
        return 0;
    }

    @Override // defpackage.PC
    public final boolean I() {
        return this.c;
    }

    @Override // defpackage.PC
    public final String D() {
        return this.j;
    }

    @Override // defpackage.PC
    public final MW j() {
        return this.e;
    }

    @Override // defpackage.PC
    public final Drawable h() {
        return this.g;
    }

    @Override // defpackage.PC
    public final boolean Q() {
        return this.h;
    }

    @Override // defpackage.PC
    public final int x() {
        return this.f;
    }

    @Override // defpackage.PC
    public final boolean G() {
        return this.l;
    }

    @Override // defpackage.PC
    public final int C() {
        return this.m;
    }

    @Override // defpackage.PC
    public final List r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).first);
        }
        return arrayList;
    }
}

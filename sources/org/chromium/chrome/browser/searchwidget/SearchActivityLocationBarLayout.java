package org.chromium.chrome.browser.searchwidget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import com.android.chrome.R;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC4159cG1;
import defpackage.C0257Bz1;
import defpackage.C10094tZ2;
import defpackage.C10285u6;
import defpackage.C1297Jz1;
import defpackage.C2336Rz1;
import defpackage.C5809h34;
import defpackage.C8815pp;
import defpackage.InterfaceC3472aG1;
import defpackage.QZ2;
import defpackage.Vf4;
import defpackage.ViewOnClickListenerC3303Zk3;
import defpackage.ZN3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.searchwidget.SearchActivityLocationBarLayout;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.components.omnibox.AutocompleteResult;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchActivityLocationBarLayout extends AbstractC4159cG1 {
    public static final /* synthetic */ int s = 0;
    public boolean q;
    public boolean r;

    public SearchActivityLocationBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.layout.0_resource_name_obfuscated_res_0x7f0e0172);
        Context context2 = getContext();
        Drawable drawable = context2.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f09039a);
        drawable.mutate();
        drawable.setColorFilter(AbstractC11746yN.c(context2, R.dimen.0_resource_name_obfuscated_res_0x7f080811), PorterDuff.Mode.SRC_IN);
        setBackground(drawable);
    }

    @Override // defpackage.AbstractC4159cG1
    public final void a(C8815pp c8815pp, C5809h34 c5809h34, ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3, InterfaceC3472aG1 interfaceC3472aG1, QZ2 qz2) {
        super.a(c8815pp, c5809h34, viewOnClickListenerC3303Zk3, interfaceC3472aG1, qz2);
        boolean a = LocaleManager.getInstance().a();
        this.q = a;
        this.k.i.G = a;
        findViewById(R.id.url_action_container).setVisibility(0);
    }

    public final void f(int i, Vf4 vf4, C10285u6 c10285u6) {
        if (this.n) {
            C10094tZ2.f(getContext(), c10285u6);
        }
        if (i == 1) {
            if (vf4.b()) {
                vf4.h(2);
                return;
            } else {
                ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140925, 1, getContext()).d();
                g();
                return;
            }
        }
        if (i != 2) {
            g();
            return;
        }
        g();
        C0257Bz1 c0257Bz1 = C0257Bz1.b;
        boolean isIncognito = this.l.isIncognito();
        boolean a = DeviceFormFactor.a(getContext());
        Uri uri = Uri.EMPTY;
        C2336Rz1 c2336Rz1 = new C2336Rz1();
        c2336Rz1.h = 6;
        c2336Rz1.a = uri;
        c2336Rz1.b = null;
        c2336Rz1.c = null;
        c2336Rz1.d = null;
        c2336Rz1.e = null;
        c2336Rz1.f = null;
        c2336Rz1.g = isIncognito;
        c2336Rz1.i = a;
        if (!c0257Bz1.a(c2336Rz1)) {
            ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140923, 1, getContext()).d();
            return;
        }
        boolean isIncognito2 = this.l.isIncognito();
        Uri uri2 = Uri.EMPTY;
        C1297Jz1 c1297Jz1 = new C1297Jz1();
        c1297Jz1.e = isIncognito2;
        c1297Jz1.i = 6;
        c1297Jz1.f = 0;
        c1297Jz1.g = null;
        c1297Jz1.h = 0;
        if (!uri2.equals(uri2)) {
            c1297Jz1.a = uri2;
        }
        c0257Bz1.a.a(c10285u6, c1297Jz1);
    }

    @Override // defpackage.AbstractC4159cG1
    public final void c() {
        this.n = true;
        boolean a = LocaleManager.getInstance().a();
        this.q = a;
        this.k.i.G = a;
    }

    public final void g() {
        this.i.post(new Runnable() { // from class: qZ2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
            @Override // java.lang.Runnable
            public final void run() {
                C5348fk c5348fk;
                int i;
                ArrayList arrayList;
                int i2 = SearchActivityLocationBarLayout.s;
                SearchActivityLocationBarLayout searchActivityLocationBarLayout = SearchActivityLocationBarLayout.this;
                if (searchActivityLocationBarLayout.j == null || searchActivityLocationBarLayout.k == null) {
                    return;
                }
                searchActivityLocationBarLayout.i.requestFocus();
                searchActivityLocationBarLayout.j.c(true, false);
                C1245Jp c1245Jp = searchActivityLocationBarLayout.k.i;
                if (c1245Jp.v) {
                    return;
                }
                Q83 q83 = O83.a;
                int f = q83.f(-1, "zero_suggest_list_size");
                if (f <= 1) {
                    f = 0;
                }
                ?? arrayList2 = new ArrayList(f);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new C11901yp(0, 0));
                int i3 = 0;
                while (i3 < f) {
                    if (TextUtils.isEmpty(q83.i(AbstractC6265iP.x.a(i3), null))) {
                        GURL a = GURL.a(q83.i(AbstractC6265iP.r.a(i3), null));
                        String i4 = q83.i(AbstractC6265iP.s.a(i3), null);
                        String i5 = q83.i(AbstractC6265iP.t.a(i3), null);
                        int f2 = q83.f(-1, AbstractC6265iP.u.a(i3));
                        boolean e = q83.e(AbstractC6265iP.w.a(i3), false);
                        boolean e2 = q83.e(AbstractC6265iP.z.a(i3), false);
                        String i6 = q83.i(AbstractC6265iP.A.a(i3), null);
                        String i7 = q83.i(AbstractC6265iP.B.a(i3), null);
                        byte[] decode = i7 == null ? null : Base64.decode(i7, 0);
                        int f3 = q83.f(-1, AbstractC6265iP.y.a(i3));
                        try {
                            Set k = q83.k(AbstractC6265iP.v.a(i3), null);
                            if (k == null) {
                                c5348fk = null;
                            } else {
                                C5348fk c5348fk2 = new C5348fk(k.size());
                                Iterator it = k.iterator();
                                while (it.hasNext()) {
                                    c5348fk2.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                                }
                                c5348fk = c5348fk2;
                            }
                            i = i3;
                            arrayList = arrayList3;
                            arrayList2.add(new AutocompleteMatch(f2, c5348fk, e, 0, 0, i4, arrayList3, i5, arrayList, null, null, a, GURL.emptyGURL(), null, e2, i6, decode, f3, null, null, false, null, null));
                        } catch (NumberFormatException unused) {
                            arrayList2 = Collections.emptyList();
                        }
                    } else {
                        i = i3;
                        arrayList = arrayList3;
                    }
                    i3 = i + 1;
                    arrayList3 = arrayList;
                }
                int f4 = q83.f(0, "zero_suggest_header_list_size");
                SparseArray sparseArray = new SparseArray(f4);
                for (int i8 = 0; i8 < f4; i8++) {
                    sparseArray.put(q83.f(-1, AbstractC6265iP.C.a(i8)), new C1375Kp(q83.i(AbstractC6265iP.D.a(i8), null), q83.e(AbstractC6265iP.E.a(i8), false)));
                }
                for (int size = sparseArray.size() - 1; size >= 0; size--) {
                    if (sparseArray.keyAt(size) == -1 || TextUtils.isEmpty(((C1375Kp) sparseArray.valueAt(size)).a)) {
                        sparseArray.removeAt(size);
                    }
                }
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    AutocompleteMatch autocompleteMatch = (AutocompleteMatch) arrayList2.get(size2);
                    int i9 = autocompleteMatch.r;
                    GURL gurl = autocompleteMatch.j;
                    if (!gurl.b || gurl.k() || (i9 != -1 && sparseArray.indexOfKey(i9) < 0)) {
                        arrayList2.remove(size2);
                    }
                }
                c1245Jp.a(new AutocompleteResult(0L, arrayList2, sparseArray), "", true);
            }
        });
    }

    @Override // defpackage.AbstractC4159cG1
    public final void b() {
        g();
    }
}

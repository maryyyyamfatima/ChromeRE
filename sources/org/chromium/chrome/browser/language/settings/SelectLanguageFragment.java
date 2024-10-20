package org.chromium.chrome.browser.language.settings;

import J.N;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.A23;
import defpackage.AbstractC4649di;
import defpackage.B23;
import defpackage.C10230tw1;
import defpackage.C10536uq0;
import defpackage.C23;
import defpackage.C7928nE;
import defpackage.C9549rx1;
import defpackage.D23;
import defpackage.InterfaceC7496ly2;
import defpackage.K53;
import defpackage.UN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.chromium.base.LocaleUtils;
import org.chromium.chrome.browser.translate.TranslateBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SelectLanguageFragment extends c {
    public static final /* synthetic */ int h0 = 0;
    public SearchView b0;
    public String c0;
    public RecyclerView d0;
    public D23 e0;
    public ArrayList f0;
    public A23 g0;

    @Override // androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("DetailedLanguageSettings")) {
            getActivity().setTitle(R.string.f75980_resource_name_obfuscated_res_0x7f140598);
        } else {
            getActivity().setTitle(R.string.f67220_resource_name_obfuscated_res_0x7f1401c7);
        }
        F0();
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        View inflate = layoutInflater.inflate(R.layout.f55690_resource_name_obfuscated_res_0x7f0e0037, viewGroup, false);
        this.c0 = "";
        Activity activity = getActivity();
        this.d0 = (RecyclerView) inflate.findViewById(R.id.language_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.d0.q0(linearLayoutManager);
        this.d0.g(new C10536uq0(activity, linearLayoutManager.p));
        int intExtra = getActivity().getIntent().getIntExtra("SelectLanguageFragment.PotentialLanguages", 0);
        C9549rx1 b = C9549rx1.b();
        LinkedHashMap linkedHashMap = b.a;
        if (intExtra != 0) {
            arrayList = null;
            if (intExtra == 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                final C10230tw1 c = b.c(AbstractC4649di.a());
                if (!TextUtils.equals(c.a, null)) {
                    linkedHashSet.add(C10230tw1.a());
                }
                InterfaceC7496ly2 interfaceC7496ly2 = new InterfaceC7496ly2() { // from class: px1
                    @Override // defpackage.InterfaceC7496ly2
                    public final boolean a(C10230tw1 c10230tw1) {
                        return c10230tw1.e && !c10230tw1.equals(C10230tw1.this);
                    }
                };
                C9549rx1.a(linkedHashSet, b.e(), interfaceC7496ly2);
                C9549rx1.a(linkedHashSet, linkedHashMap.values(), interfaceC7496ly2);
                arrayList = new ArrayList(linkedHashSet);
            } else if (intExtra == 2) {
                arrayList = b.d(Arrays.asList(LocaleUtils.a(N.MMKf4EpW())));
            } else if (intExtra == 3) {
                arrayList = b.d(TranslateBridge.a());
            } else if (intExtra == 4) {
                arrayList = b.d(new ArrayList(Arrays.asList(N.MAJqSbXG())));
            }
        } else {
            HashSet hashSet = new HashSet(TranslateBridge.b());
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (C10230tw1 c10230tw1 : linkedHashMap.values()) {
                if (!hashSet.contains(c10230tw1.a)) {
                    linkedHashSet2.add(c10230tw1);
                }
            }
            arrayList = new ArrayList(linkedHashSet2);
        }
        this.f0 = arrayList;
        this.g0 = new A23(activity);
        D23 d23 = new D23(this, activity);
        this.e0 = d23;
        this.d0.n0(d23);
        this.e0.R(this.f0);
        this.d0.getViewTreeObserver().addOnScrollChangedListener(new K53(this.d0, inflate.findViewById(R.id.shadow)));
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f62150_resource_name_obfuscated_res_0x7f100006, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        this.b0 = searchView;
        searchView.u.setImeOptions(33554432);
        SearchView searchView2 = this.b0;
        searchView2.M = new B23(this);
        searchView2.L = new C23(this);
    }
}

package defpackage;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataTabsFragment;
import org.chromium.chrome.browser.history.BrowsingHistoryBridge;
import org.chromium.chrome.browser.history.HistoryItemView;
import org.chromium.chrome.browser.history.HistoryManagerToolbar;
import org.chromium.chrome.browser.history_clusters.f;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.browser_ui.widget.selectable_list.SelectableListLayout;
import org.chromium.components.prefs.PrefService;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.ui.base.Clipboard;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X81 implements BO3, InterfaceC7182l33, InterfaceC3746b33, InterfaceC0679Ff3, N81 {
    public final Activity a;
    public final boolean g;
    public final boolean h;
    public final BrowsingHistoryBridge i;
    public final C8385oa2 j;
    public final ViewGroup k;
    public ViewGroup l;
    public final SelectableListLayout m;
    public final O81 n;
    public final C7526m33 o;
    public final HistoryManagerToolbar p;
    public final ViewOnClickListenerC1069If3 q;
    public final f r;
    public final C8385oa2 s;
    public final C8385oa2 t;
    public final PrefService u;
    public TabLayout v;
    public TabLayout w;
    public boolean x;

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
    }

    @Override // defpackage.N81
    public final void j() {
        HistoryManagerToolbar historyManagerToolbar = this.p;
        historyManagerToolbar.V();
        historyManagerToolbar.S(historyManagerToolbar.B0.w(), historyManagerToolbar.B0.n.r);
        this.t.p(Boolean.valueOf(this.n.d()));
    }

    public X81(Activity activity, boolean z, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, boolean z2, InterfaceC0079Ap3 interfaceC0079Ap3, boolean z3, String str, BrowsingHistoryBridge browsingHistoryBridge) {
        FrameLayout frameLayout;
        boolean z4;
        boolean z5;
        C7253lG2 c7253lG2;
        C8385oa2 c8385oa2 = new C8385oa2();
        this.j = c8385oa2;
        C8385oa2 c8385oa22 = new C8385oa2();
        this.s = c8385oa22;
        C8385oa2 c8385oa23 = new C8385oa2();
        this.t = c8385oa23;
        this.a = activity;
        this.h = z;
        this.q = viewOnClickListenerC1069If3;
        this.g = z2;
        this.i = browsingHistoryBridge;
        PrefService a = R44.a(Profile.d());
        this.u = a;
        t("Show");
        if (!v()) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            this.k = frameLayout2;
            C7928nE c7928nE = UN.a;
            boolean M09VlOh_ = N.M09VlOh_("Journeys");
            if (M09VlOh_) {
                frameLayout = frameLayout2;
                z4 = true;
                this.r = new f(Profile.d(), activity, IG3.a(), new V81(this, z, interfaceC0079Ap3), C10021tL.f());
            } else {
                frameLayout = frameLayout2;
                z4 = true;
            }
            SelectableListLayout selectableListLayout = (SelectableListLayout) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0123, (ViewGroup) null);
            this.m = selectableListLayout;
            C7526m33 c7526m33 = new C7526m33();
            this.o = c7526m33;
            c7526m33.a(this);
            boolean e = O83.a.e("history_home_show_info", z4);
            O81 o81 = new O81(activity, this, z, z2, e, true, null, c7526m33, interfaceC0079Ap3, c8385oa2, new BV0() { // from class: T81
                @Override // defpackage.BV0
                public final Object apply(Object obj) {
                    return X81.this.f(0, (ViewGroup) obj);
                }
            }, browsingHistoryBridge);
            this.n = o81;
            RecyclerView recyclerView = o81.o;
            C4117c81 c4117c81 = o81.n;
            selectableListLayout.f(c4117c81, recyclerView);
            c8385oa22.p(Boolean.valueOf(e));
            c8385oa23.p(Boolean.valueOf(o81.d()));
            HistoryManagerToolbar historyManagerToolbar = (HistoryManagerToolbar) selectableListLayout.i(R.layout.0_resource_name_obfuscated_res_0x7f0e0126, c7526m33, R.string.0_resource_name_obfuscated_res_0x7f14062a, R.id.normal_menu_group, R.id.selection_mode_menu_group, this, z);
            this.p = historyManagerToolbar;
            historyManagerToolbar.B0 = this;
            if (!z) {
                historyManagerToolbar.o().removeItem(R.id.close_menu_id);
            }
            historyManagerToolbar.K(this, R.string.0_resource_name_obfuscated_res_0x7f14050d, R.id.search_menu_id);
            historyManagerToolbar.n0 = R.id.info_menu_id;
            historyManagerToolbar.S(w(), o81.r);
            if (M09VlOh_) {
                boolean a2 = a.a("history_clusters.visible");
                c8385oa2.p(Boolean.valueOf(a2));
                z5 = true;
                historyManagerToolbar.o().findItem(R.id.optout_menu_id).setVisible(true).setTitle(a2 ? R.string.0_resource_name_obfuscated_res_0x7f140504 : R.string.0_resource_name_obfuscated_res_0x7f140505);
            } else {
                z5 = true;
                historyManagerToolbar.o().removeItem(R.id.optout_menu_id);
            }
            selectableListLayout.c();
            selectableListLayout.o = R.string.0_resource_name_obfuscated_res_0x7f14050a;
            selectableListLayout.h.setText(R.string.0_resource_name_obfuscated_res_0x7f14050a);
            selectableListLayout.i.setOnTouchListener(new W23());
            c4117c81.F = null;
            c4117c81.a0();
            if (z3) {
                this.l = this.r.a();
                if (!TextUtils.isEmpty(str)) {
                    c7253lG2 = new C7253lG2(str, o(), z5);
                } else {
                    c7253lG2 = new C7253lG2("", null, false);
                }
                f fVar = this.r;
                I81 i81 = fVar.s;
                if (i81.f == -1) {
                    i81.f = 2;
                }
                fVar.a.C(c7253lG2);
            } else {
                this.l = selectableListLayout;
            }
            frameLayout.addView(this.l);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0131, (ViewGroup) null);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.close_history_placeholder_button);
        if (z) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: U81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    X81.this.a.finish();
                }
            });
        } else {
            imageButton.setVisibility(8);
        }
        viewGroup.setFocusable(true);
        viewGroup.setFocusableInTouchMode(true);
        this.k = viewGroup;
    }

    @Override // defpackage.InterfaceC3746b33
    public final void l(String str) {
        C4117c81 c4117c81 = this.n.n;
        c4117c81.E = str;
        c4117c81.z = true;
        c4117c81.B = true;
        BrowsingHistoryBridge browsingHistoryBridge = c4117c81.n;
        N.ML$TCyGp(browsingHistoryBridge.b, browsingHistoryBridge, new ArrayList(), str, false);
    }

    @Override // defpackage.InterfaceC3746b33
    public final void i() {
        C4117c81 c4117c81 = this.n.n;
        c4117c81.E = "";
        c4117c81.z = false;
        c4117c81.a0();
        this.m.k();
        this.x = false;
    }

    public final boolean w() {
        O81 o81 = this.n;
        if (!(((LinearLayoutManager) o81.o.s).R0() > 0)) {
            C4117c81 c4117c81 = o81.n;
            if ((!c4117c81.k.i && c4117c81.v) && c4117c81.i > 0 && !this.p.b0 && !this.o.e()) {
                return true;
            }
        }
        return false;
    }

    public final void y() {
        O81 o81 = this.n;
        boolean z = !o81.r;
        O83.a.p("history_home_show_info", z);
        this.p.S(w(), z);
        o81.r = z;
        o81.n.Z();
        this.s.p(Boolean.valueOf(z));
    }

    public final void q(boolean z) {
        this.u.e("history_clusters.visible", z);
        C8385oa2 c8385oa2 = this.j;
        HistoryManagerToolbar historyManagerToolbar = this.p;
        if (z) {
            historyManagerToolbar.o().findItem(R.id.optout_menu_id).setTitle(R.string.0_resource_name_obfuscated_res_0x7f140504);
            c8385oa2.p(Boolean.TRUE);
        } else {
            historyManagerToolbar.o().findItem(R.id.optout_menu_id).setTitle(R.string.0_resource_name_obfuscated_res_0x7f140505);
            if (this.l == this.r.a()) {
                x();
            }
            c8385oa2.p(Boolean.FALSE);
        }
    }

    public final ViewGroup f(int i, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0125, viewGroup, false);
        TabLayout tabLayout = (TabLayout) viewGroup2.findViewById(R.id.history_toggle_tab_layout);
        C0249Bx3 k = tabLayout.k(i);
        tabLayout.r(k, true);
        if (i == 0) {
            this.v = tabLayout;
        } else {
            this.w = tabLayout;
        }
        tabLayout.b(new W81(this, k));
        C0249Bx3 k2 = tabLayout.k(0);
        int paddingLeft = k2.h.getPaddingLeft();
        k2.h.setPadding(paddingLeft, 0, paddingLeft, 0);
        tabLayout.k(1).h.setPadding(paddingLeft, 0, paddingLeft, 0);
        return viewGroup2;
    }

    @Override // defpackage.BO3
    public final boolean onMenuItemClick(MenuItem menuItem) {
        HistoryManagerToolbar historyManagerToolbar = this.p;
        historyManagerToolbar.r();
        int itemId = menuItem.getItemId();
        Activity activity = this.a;
        if (itemId == R.id.close_menu_id && this.h) {
            activity.finish();
            return true;
        }
        int itemId2 = menuItem.getItemId();
        C7526m33 c7526m33 = this.o;
        if (itemId2 == R.id.selection_mode_open_in_new_tab) {
            r(c7526m33.c(), false);
            c7526m33.b();
            return true;
        }
        if (menuItem.getItemId() == R.id.selection_mode_copy_link) {
            u("CopyLink");
            Clipboard.getInstance().setText(((Q81) c7526m33.c().get(0)).c.i());
            c7526m33.b();
            this.q.c(C12188zf3.a(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f1403d4), this, 1, 17));
            return true;
        }
        if (menuItem.getItemId() == R.id.selection_mode_open_in_incognito) {
            r(c7526m33.c(), true);
            c7526m33.b();
            return true;
        }
        int itemId3 = menuItem.getItemId();
        O81 o81 = this.n;
        if (itemId3 == R.id.selection_mode_delete_menu_id) {
            u("RemoveSelected");
            r0 = null;
            int i = 0;
            for (Q81 q81 : c7526m33.c) {
                o81.n.W(q81);
                i++;
            }
            o81.n.n.a();
            c7526m33.b();
            RecyclerView recyclerView = o81.o;
            if (i == 1) {
                recyclerView.announceForAccessibility(o81.a.getString(R.string.0_resource_name_obfuscated_res_0x7f1403ed, q81.e));
            } else if (i > 1) {
                recyclerView.announceForAccessibility(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f1406bd, Integer.valueOf(i)));
            }
            return true;
        }
        if (menuItem.getItemId() != R.id.search_menu_id) {
            if (menuItem.getItemId() == R.id.info_menu_id) {
                y();
            } else if (menuItem.getItemId() == R.id.optout_menu_id) {
                q(!this.u.a("history_clusters.visible"));
                return true;
            }
            return false;
        }
        o81.n.R();
        historyManagerToolbar.P();
        this.m.l(o());
        t("Search");
        this.x = true;
        return true;
    }

    public final String o() {
        TemplateUrl c = IG3.a().c();
        String c2 = c != null ? c.c() : null;
        Activity activity = this.a;
        if (c2 == null) {
            return activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14050c);
        }
        return activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14050b, c2);
    }

    public final boolean v() {
        if (this.g) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("UpdateHistoryEntryPointsInIncognito")) {
                return true;
            }
        }
        return false;
    }

    public final void x() {
        if (v()) {
            return;
        }
        ViewGroup viewGroup = this.l;
        SelectableListLayout selectableListLayout = this.m;
        f fVar = this.r;
        if (viewGroup == selectableListLayout && fVar != null) {
            this.l = fVar.a();
            fVar.b(true);
            TabLayout tabLayout = this.w;
            if (tabLayout != null) {
                tabLayout.r(tabLayout.k(1), true);
            }
        } else {
            fVar.b(false);
            this.l = selectableListLayout;
            O81 o81 = this.n;
            C4117c81 c4117c81 = o81.n;
            c4117c81.F = o81.l;
            c4117c81.a0();
            TabLayout tabLayout2 = this.v;
            if (tabLayout2 != null) {
                tabLayout2.r(tabLayout2.k(0), true);
            }
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget(S23.class);
        TransitionManager.go(new Scene(this.k, this.l), autoTransition);
        this.l.requestFocus();
    }

    public final void p() {
        if (v()) {
            return;
        }
        f fVar = this.r;
        if (fVar != null) {
            H81 h81 = fVar.a;
            h81.l.a();
            h81.p.a();
            I81 i81 = fVar.s;
            int i = i81.f;
            if (i != -1) {
                EI2.h(i, 4, "History.Clusters.Actions.InitialState");
                EI2.d(i81.b, "History.Clusters.Actions.FinalState.NumberLinksOpened");
                EI2.d(i81.c, "History.Clusters.Actions.FinalState.NumberRelatedSearchesClicked");
                EI2.d(0, "History.Clusters.Actions.FinalState.NumberVisibilityToggles");
                EI2.d(i81.a, "History.Clusters.Actions.FinalState.NumberIndividualVisitsDeleted");
                EI2.d(i81.e, "History.Clusters.Actions.FinalState.TogglesToBasicHistory");
                EI2.b("History.Clusters.Actions.FinalState.WasSuccessful", (i81.c + i81.b) + i81.a > 0);
                EI2.b("History.Clusters.Actions.DidMakeQuery", i81.d > 0);
                int i2 = i81.d;
                if (i2 > 0) {
                    EI2.d(i2, "History.Clusters.Actions.NumQueries");
                }
            }
            if (fVar.k) {
                fVar.p.j();
            }
        }
        SelectableListLayout selectableListLayout = this.m;
        if (selectableListLayout != null) {
            selectableListLayout.j();
            this.n.e();
        }
    }

    public final void r(ArrayList arrayList, boolean z) {
        u("OpenSelected".concat(z ? "Incognito" : ""));
        O81 o81 = this.n;
        if (o81.h && arrayList.size() > 1) {
            ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
            for (int i = 1; i < arrayList.size(); i++) {
                arrayList2.add(((Q81) arrayList.get(i)).c.i());
            }
            Intent a = o81.a(((Q81) arrayList.get(0)).c, Boolean.valueOf(z), true);
            a.putExtra("org.chromium.chrome.browser.additional_urls", arrayList2);
            C1761No1.y(null, a, null);
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o81.f(((Q81) it.next()).c, Boolean.valueOf(z), true);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            s((Q81) it2.next());
        }
    }

    public static void t(String str) {
        FI2.a("Android.HistoryPage." + str);
    }

    public final void u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.x ? "Search." : "");
        sb.append(str);
        t(sb.toString());
    }

    public static void s(Q81 q81) {
        int currentTimeMillis = ((int) (((((System.currentTimeMillis() - q81.g) / 1000) / 60) / 60) / 24)) + 1;
        EI2.f(Math.min(currentTimeMillis, 1000), 1, 1000, 11, "HistoryPage.ClickAgeInDays");
        if (currentTimeMillis <= 100) {
            EI2.f(currentTimeMillis, 1, 100, 11, "HistoryPage.ClickAgeInDaysSubset");
        }
    }

    @Override // defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        boolean e = this.o.e();
        C4117c81 c4117c81 = this.n.n;
        Button button = c4117c81.p;
        if (button != null) {
            button.setEnabled(!e);
        }
        Iterator it = c4117c81.l.iterator();
        while (it.hasNext()) {
            HistoryItemView historyItemView = (HistoryItemView) it.next();
            boolean z = !e;
            historyItemView.M = z;
            if (AbstractC8650pL.a("history.deleting_enabled")) {
                historyItemView.F.setVisibility(z ? 0 : 4);
            }
        }
    }

    @Override // defpackage.N81
    public final void c(boolean z) {
        this.p.S(w(), this.n.r);
        if (z) {
            u("LoadMoreOnScroll");
        }
    }

    @Override // defpackage.N81
    public final void n(Q81 q81) {
        u("OpenItem");
        s(q81);
    }

    @Override // defpackage.N81
    public final void k(Q81 q81) {
        u("RemoveItem");
        C7526m33 c7526m33 = this.o;
        if (c7526m33.d(q81)) {
            c7526m33.g(q81);
        }
    }

    @Override // defpackage.N81
    public final void e() {
        t("ClearBrowsingData");
        EI2.h(this.g ? 1 : 0, 6, "Android.HistoryPage.ClearBrowsingData.PerProfileType");
        String name = ClearBrowsingDataTabsFragment.class.getName();
        Intent intent = new Intent();
        Activity activity = this.a;
        intent.setClass(activity, SettingsActivity.class);
        if (!(activity instanceof Activity)) {
            intent.addFlags(268435456);
            intent.addFlags(67108864);
        }
        intent.putExtra("show_fragment", name);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            activity.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // defpackage.N81
    public final void m() {
        this.p.S(w(), this.n.r);
    }
}

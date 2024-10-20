package org.chromium.chrome.browser.history_clusters;

import J.N;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC4433d33;
import defpackage.AbstractC5266fV2;
import defpackage.AbstractC9613s81;
import defpackage.BO3;
import defpackage.C10021tL;
import defpackage.C11939yv1;
import defpackage.C4617dc3;
import defpackage.C7253lG2;
import defpackage.C7272lK1;
import defpackage.C7526m33;
import defpackage.C7616mK1;
import defpackage.C8928q81;
import defpackage.FD2;
import defpackage.GD2;
import defpackage.H81;
import defpackage.I81;
import defpackage.InterfaceC7960nK1;
import defpackage.InterfaceC9270r81;
import defpackage.J81;
import defpackage.KH;
import defpackage.ND2;
import defpackage.OK;
import defpackage.PD2;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.VK;
import defpackage.WD2;
import defpackage.ZE;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.history_clusters.f;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.MoreProgressButton;
import org.chromium.components.browser_ui.widget.selectable_list.SelectableListLayout;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class f implements BO3 {
    public final H81 a;
    public final C7616mK1 g;
    public final InterfaceC9270r81 h;
    public C4617dc3 i;
    public final Activity j;
    public boolean k;
    public final PropertyModel l;
    public ViewGroup m;
    public HistoryClustersToolbar n;
    public final C7526m33 o;
    public SelectableListLayout p;
    public final C8928q81 q;
    public RecyclerView r;
    public final I81 s;

    public f(Profile profile, Activity activity, TemplateUrlService templateUrlService, InterfaceC9270r81 interfaceC9270r81, C10021tL c10021tL) {
        I81 i81 = new I81(templateUrlService);
        C7526m33 c7526m33 = new C7526m33();
        this.q = new C8928q81();
        this.j = activity;
        this.h = interfaceC9270r81;
        C7616mK1 c7616mK1 = new C7616mK1();
        this.g = c7616mK1;
        HashMap e = PropertyModel.e(J81.b);
        PD2 pd2 = J81.a;
        C7253lG2 c7253lG2 = new C7253lG2("", null, false);
        GD2 gd2 = new GD2();
        gd2.a = c7253lG2;
        PropertyModel a = AbstractC5266fV2.a(e, pd2, gd2, e);
        this.l = a;
        this.s = i81;
        this.o = c7526m33;
        this.a = new H81((HistoryClustersBridge) N.M1GgDf6u(profile), new LargeIconBridge(profile), activity, activity.getResources(), c7616mK1, a, interfaceC9270r81, new KH(), templateUrlService, c7526m33, i81, c10021tL);
    }

    public final void b(boolean z) {
        I81 i81 = this.s;
        if (z) {
            if (i81.f == -1) {
                i81.f = 3;
            }
            this.a.C(new C7253lG2("", null, false));
            return;
        }
        if (i81.f == -1) {
            i81.f = 3;
        }
        i81.e++;
    }

    public final ViewGroup a() {
        if (!this.k) {
            C4617dc3 c4617dc3 = new C4617dc3(this.g);
            this.i = c4617dc3;
            c4617dc3.Q(1, new InterfaceC7960nK1() { // from class: f81
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    f fVar = f.this;
                    fVar.getClass();
                    S23 s23 = (S23) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e011e, viewGroup, false);
                    s23.m(fVar.o);
                    return s23;
                }
            }, new TD2() { // from class: org.chromium.chrome.browser.history_clusters.e
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    FD2 fd2 = (FD2) obj2;
                    HistoryClustersItemView historyClustersItemView = (HistoryClustersItemView) ((View) obj);
                    PD2 pd2 = AbstractC9613s81.c;
                    if (fd2 == pd2) {
                        historyClustersItemView.setOnClickListener((View.OnClickListener) propertyModel.i(pd2));
                        return;
                    }
                    PD2 pd22 = AbstractC9613s81.d;
                    if (fd2 == pd22) {
                        historyClustersItemView.k((ClusterVisit) propertyModel.i(pd22));
                        return;
                    }
                    PD2 pd23 = AbstractC9613s81.f;
                    if (fd2 == pd23) {
                        historyClustersItemView.u.setOnClickListener((View.OnClickListener) propertyModel.i(pd23));
                        return;
                    }
                    PD2 pd24 = AbstractC9613s81.h;
                    if (fd2 != pd24) {
                        PD2 pd25 = AbstractC9613s81.l;
                        if (fd2 == pd25) {
                            CharSequence charSequence = (CharSequence) propertyModel.i(pd25);
                            historyClustersItemView.v.setText(charSequence);
                            AbstractC4433d33.a(historyClustersItemView.getContext(), historyClustersItemView.u, charSequence.toString(), 1);
                            return;
                        }
                        PD2 pd26 = AbstractC9613s81.m;
                        if (fd2 == pd26) {
                            historyClustersItemView.w.setText((CharSequence) propertyModel.i(pd26));
                            return;
                        } else {
                            ND2 nd2 = AbstractC9613s81.n;
                            if (fd2 == nd2) {
                                historyClustersItemView.setVisibility(propertyModel.h(nd2));
                                return;
                            }
                            return;
                        }
                    }
                    historyClustersItemView.s((Drawable) propertyModel.i(pd24));
                }
            });
            this.i.Q(2, new InterfaceC7960nK1() { // from class: p81
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    f fVar = f.this;
                    fVar.getClass();
                    S23 s23 = (S23) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e011d, viewGroup, false);
                    s23.m(fVar.q);
                    return s23;
                }
            }, new TD2() { // from class: org.chromium.chrome.browser.history_clusters.b
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    FD2 fd2 = (FD2) obj2;
                    HistoryClusterView historyClusterView = (HistoryClusterView) ((View) obj);
                    ND2 nd2 = AbstractC9613s81.a;
                    if (fd2 != nd2) {
                        PD2 pd2 = AbstractC9613s81.c;
                        if (fd2 == pd2) {
                            View.OnClickListener onClickListener = (View.OnClickListener) propertyModel.i(pd2);
                            historyClusterView.setOnClickListener(onClickListener);
                            historyClusterView.u.setOnClickListener(onClickListener);
                            return;
                        }
                        PD2 pd22 = AbstractC9613s81.e;
                        if (fd2 == pd22) {
                            historyClusterView.F.setVisibility(((Boolean) propertyModel.i(pd22)).booleanValue() ? 0 : 8);
                            return;
                        }
                        PD2 pd23 = AbstractC9613s81.g;
                        if (fd2 == pd23) {
                            Drawable drawable = (Drawable) propertyModel.i(pd23);
                            historyClusterView.u.setVisibility(0);
                            historyClusterView.u.setImageDrawable(drawable);
                            return;
                        }
                        PD2 pd24 = AbstractC9613s81.h;
                        if (fd2 != pd24) {
                            PD2 pd25 = AbstractC9613s81.i;
                            if (fd2 != pd25) {
                                PD2 pd26 = AbstractC9613s81.l;
                                if (fd2 == pd26) {
                                    historyClusterView.v.setText((CharSequence) propertyModel.i(pd26));
                                    return;
                                }
                                return;
                            }
                            historyClusterView.w.setText((CharSequence) propertyModel.i(pd25));
                            return;
                        }
                        historyClusterView.s((Drawable) propertyModel.i(pd24));
                        return;
                    }
                    historyClusterView.G = propertyModel.h(nd2);
                }
            });
            this.i.Q(3, new InterfaceC7960nK1() { // from class: g81
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    f.this.getClass();
                    return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0120, viewGroup, false);
                }
            }, new TD2() { // from class: org.chromium.chrome.browser.history_clusters.c
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    FD2 fd2 = (FD2) obj2;
                    final HistoryClustersRelatedSearchesChipLayout historyClustersRelatedSearchesChipLayout = (HistoryClustersRelatedSearchesChipLayout) ((View) obj);
                    PD2 pd2 = AbstractC9613s81.b;
                    if (fd2 == pd2) {
                        historyClustersRelatedSearchesChipLayout.h = (Callback) propertyModel.i(pd2);
                        return;
                    }
                    PD2 pd22 = AbstractC9613s81.k;
                    if (fd2 == pd22) {
                        List list = (List) propertyModel.i(pd22);
                        historyClustersRelatedSearchesChipLayout.getClass();
                        for (int i = 0; i < list.size(); i++) {
                            final String str = (String) list.get(i);
                            C7272lK1 a = VK.a(i, R.drawable.0_resource_name_obfuscated_res_0x7f090312, str, new Callback() { // from class: org.chromium.chrome.browser.history_clusters.g
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj3) {
                                    return new ZE(this, obj3);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj3) {
                                    HistoryClustersRelatedSearchesChipLayout.this.h.onResult(str);
                                }
                            });
                            a.b.k(OK.c, true);
                            historyClustersRelatedSearchesChipLayout.g.s(a);
                        }
                        return;
                    }
                    ND2 nd2 = AbstractC9613s81.n;
                    if (fd2 == nd2) {
                        historyClustersRelatedSearchesChipLayout.setVisibility(propertyModel.h(nd2));
                    }
                }
            });
            C4617dc3 c4617dc32 = this.i;
            final InterfaceC9270r81 interfaceC9270r81 = this.h;
            Objects.requireNonNull(interfaceC9270r81);
            c4617dc32.Q(4, new InterfaceC7960nK1() { // from class: h81
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return InterfaceC9270r81.this.l(viewGroup);
                }
            }, new TD2() { // from class: k81
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                }
            });
            this.i.Q(5, new InterfaceC7960nK1() { // from class: i81
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return InterfaceC9270r81.this.k(viewGroup);
                }
            }, new TD2() { // from class: k81
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                }
            });
            this.i.Q(6, new InterfaceC7960nK1() { // from class: j81
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return InterfaceC9270r81.this.g(viewGroup);
                }
            }, new TD2() { // from class: k81
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                }
            });
            this.i.Q(7, new InterfaceC7960nK1() { // from class: l81
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    f.this.getClass();
                    return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0189, viewGroup, false);
                }
            }, new TD2() { // from class: m81
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    final PropertyModel propertyModel = (PropertyModel) wd2;
                    FD2 fd2 = (FD2) obj2;
                    MoreProgressButton moreProgressButton = (MoreProgressButton) ((View) obj);
                    if (fd2 == AbstractC9613s81.c) {
                        moreProgressButton.h = new Runnable() { // from class: K81
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((View.OnClickListener) PropertyModel.this.i(AbstractC9613s81.c)).onClick(null);
                            }
                        };
                        return;
                    }
                    ND2 nd2 = AbstractC9613s81.j;
                    if (fd2 == nd2) {
                        moreProgressButton.a(propertyModel.h(nd2));
                    }
                }
            });
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.j).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e011f, (ViewGroup) null);
            this.m = viewGroup;
            SelectableListLayout selectableListLayout = (SelectableListLayout) viewGroup.findViewById(R.id.selectable_list);
            this.p = selectableListLayout;
            selectableListLayout.o = R.string.0_resource_name_obfuscated_res_0x7f14050a;
            selectableListLayout.h.setText(R.string.0_resource_name_obfuscated_res_0x7f14050a);
            RecyclerView f = this.p.f(this.i, null);
            this.r = f;
            f.getContext();
            f.q0(new LinearLayoutManager(1, false));
            RecyclerView recyclerView = this.r;
            H81 h81 = this.a;
            recyclerView.i(h81);
            HistoryClustersToolbar historyClustersToolbar = (HistoryClustersToolbar) this.p.i(R.layout.0_resource_name_obfuscated_res_0x7f0e0121, this.o, R.string.0_resource_name_obfuscated_res_0x7f14062a, R.id.normal_menu_group, R.id.selection_mode_menu_group, this, true);
            this.n = historyClustersToolbar;
            historyClustersToolbar.K(h81, R.string.0_resource_name_obfuscated_res_0x7f140509, R.id.search_menu_id);
            this.p.c();
            this.n.N(true);
            if (!interfaceC9270r81.f()) {
                this.n.o().removeItem(R.id.close_menu_id);
            }
            this.n.n0 = R.id.info_menu_id;
            interfaceC9270r81.h().m(new Callback() { // from class: n81
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    f.this.n.S(true, ((Boolean) obj).booleanValue());
                }
            });
            PropertyModel propertyModel = this.l;
            UD2.a(propertyModel, this.n, new TD2() { // from class: org.chromium.chrome.browser.history_clusters.d
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel2 = (PropertyModel) wd2;
                    HistoryClustersToolbar historyClustersToolbar2 = (HistoryClustersToolbar) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = J81.a;
                    if (fd2 == pd2) {
                        C7253lG2 c7253lG2 = (C7253lG2) propertyModel2.i(pd2);
                        if (c7253lG2.c) {
                            historyClustersToolbar2.P();
                            EditText editText = historyClustersToolbar2.B0;
                            String str = c7253lG2.a;
                            editText.setText(str);
                            historyClustersToolbar2.B0.setSelection(str.length());
                            C11939yv1.g.d(historyClustersToolbar2.e0);
                            historyClustersToolbar2.B0.clearFocus();
                            return;
                        }
                        historyClustersToolbar2.I();
                    }
                }
            });
            UD2.a(propertyModel, this.p, new TD2() { // from class: o81
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel2 = (PropertyModel) wd2;
                    SelectableListLayout selectableListLayout2 = (SelectableListLayout) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = J81.a;
                    if (fd2 == pd2) {
                        C7253lG2 c7253lG2 = (C7253lG2) propertyModel2.i(pd2);
                        if (c7253lG2.c) {
                            selectableListLayout2.l(c7253lG2.b);
                        } else {
                            selectableListLayout2.k();
                        }
                    }
                }
            });
            this.k = true;
        }
        return this.m;
    }

    @Override // defpackage.BO3
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC9270r81 interfaceC9270r81 = this.h;
        H81 h81 = this.a;
        if (itemId == R.id.search_menu_id) {
            h81.C(new C7253lG2("", interfaceC9270r81.j(), true));
            return true;
        }
        if (menuItem.getItemId() == R.id.close_menu_id && interfaceC9270r81.f()) {
            this.j.finish();
            return true;
        }
        int itemId2 = menuItem.getItemId();
        C7526m33 c7526m33 = this.o;
        if (itemId2 == R.id.selection_mode_open_in_incognito) {
            h81.B(c7526m33.c(), true, false);
            c7526m33.b();
            return true;
        }
        if (menuItem.getItemId() == R.id.selection_mode_open_in_new_tab) {
            h81.B(c7526m33.c(), false, false);
            c7526m33.b();
            return true;
        }
        if (menuItem.getItemId() == R.id.info_menu_id) {
            interfaceC9270r81.c();
            this.n.S(true, ((Boolean) interfaceC9270r81.h().g).booleanValue());
        } else {
            if (menuItem.getItemId() == R.id.selection_mode_delete_menu_id) {
                h81.w(c7526m33.c());
                c7526m33.b();
                return true;
            }
            if (menuItem.getItemId() == R.id.optout_menu_id) {
                interfaceC9270r81.o();
            } else if (menuItem.getItemId() == R.id.selection_mode_open_in_tab_group) {
                h81.B(c7526m33.c(), false, true);
                return true;
            }
        }
        return false;
    }
}

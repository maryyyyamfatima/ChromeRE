package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC12077zK2;
import defpackage.AbstractC8305oK2;
import defpackage.C0369Cv3;
import defpackage.C10999wA3;
import defpackage.C11342xA3;
import defpackage.C11685yA3;
import defpackage.C2591Ty1;
import defpackage.C5823h60;
import defpackage.C7526m33;
import defpackage.FD2;
import defpackage.GA3;
import defpackage.HA3;
import defpackage.InterfaceC10590uz3;
import defpackage.LD2;
import defpackage.LN3;
import defpackage.ND2;
import defpackage.PD2;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.WD2;
import java.util.HashMap;
import java.util.Objects;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.components.browser_ui.widget.NumberRollView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class j {
    public final TabSelectionEditorLayout a;
    public final c b;
    public final C7526m33 c;
    public final UD2 d;
    public final GA3 e;

    public j(Context context, ViewGroup viewGroup, InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager, int i, ViewGroup viewGroup2) {
        C7526m33 c7526m33 = new C7526m33();
        this.c = c7526m33;
        TraceEvent i2 = TraceEvent.i("TabSelectionEditorCoordinator.constructor", null);
        try {
            TabSelectionEditorLayout tabSelectionEditorLayout = (TabSelectionEditorLayout) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02ad, viewGroup, false).findViewById(R.id.selectable_list);
            this.a = tabSelectionEditorLayout;
            Objects.requireNonNull(tabContentManager);
            c cVar = new c(i, context, interfaceC10590uz3, new C0369Cv3(tabContentManager), null, false, null, null, 0, new C10999wA3(this), null, tabSelectionEditorLayout, false, "TabSelectionEditor", viewGroup2);
            TabListRecyclerView tabListRecyclerView = cVar.g;
            this.b = cVar;
            cVar.d(null);
            cVar.h.Q(4, new C2591Ty1(R.layout.0_resource_name_obfuscated_res_0x7f0e00d4), new C5823h60());
            AbstractC12077zK2 abstractC12077zK2 = tabListRecyclerView.s;
            if (abstractC12077zK2 instanceof GridLayoutManager) {
                ((GridLayoutManager) abstractC12077zK2).K = new C11685yA3(this, abstractC12077zK2);
            }
            AbstractC8305oK2 abstractC8305oK2 = tabListRecyclerView.r;
            tabSelectionEditorLayout.getClass();
            tabSelectionEditorLayout.f(abstractC8305oK2, tabListRecyclerView);
            tabSelectionEditorLayout.s = (TabSelectionEditorToolbar) tabSelectionEditorLayout.i(R.layout.0_resource_name_obfuscated_res_0x7f0e02ae, c7526m33, 0, 0, 0, null, true);
            tabSelectionEditorLayout.t = viewGroup;
            c7526m33.b = true;
            c7526m33.f();
            HashMap e = PropertyModel.e(HA3.k);
            LD2 ld2 = HA3.a;
            AD2 ad2 = new AD2();
            ad2.a = false;
            e.put(ld2, ad2);
            PropertyModel propertyModel = new PropertyModel(e);
            this.d = new UD2(propertyModel, tabSelectionEditorLayout, new TD2() { // from class: org.chromium.chrome.browser.tasks.tab_management.i
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    HashMap hashMap;
                    PropertyModel propertyModel2 = (PropertyModel) wd2;
                    TabSelectionEditorLayout tabSelectionEditorLayout2 = (TabSelectionEditorLayout) obj;
                    FD2 fd2 = (FD2) obj2;
                    LD2 ld22 = HA3.a;
                    if (ld22 != fd2) {
                        PD2 pd2 = HA3.b;
                        if (pd2 == fd2) {
                            tabSelectionEditorLayout2.s.B0.setOnClickListener((View.OnClickListener) propertyModel2.i(pd2));
                            return;
                        }
                        PD2 pd22 = HA3.e;
                        if (pd22 == fd2) {
                            tabSelectionEditorLayout2.s.D((View.OnClickListener) propertyModel2.i(pd22));
                            return;
                        }
                        ND2 nd2 = HA3.f;
                        if (nd2 == fd2) {
                            tabSelectionEditorLayout2.setBackgroundColor(propertyModel2.h(nd2));
                            return;
                        }
                        ND2 nd22 = HA3.g;
                        if (nd22 == fd2) {
                            tabSelectionEditorLayout2.s.D0 = propertyModel2.h(nd22);
                            return;
                        }
                        PD2 pd23 = HA3.h;
                        if (pd23 == fd2) {
                            TabSelectionEditorToolbar tabSelectionEditorToolbar = tabSelectionEditorLayout2.s;
                            ColorStateList colorStateList = (ColorStateList) propertyModel2.i(pd23);
                            NumberRollView numberRollView = tabSelectionEditorToolbar.i0;
                            numberRollView.a.setTextColor(colorStateList);
                            numberRollView.g.setTextColor(colorStateList);
                            return;
                        }
                        PD2 pd24 = HA3.i;
                        if (pd24 == fd2) {
                            TabSelectionEditorToolbar tabSelectionEditorToolbar2 = tabSelectionEditorLayout2.s;
                            ColorStateList colorStateList2 = (ColorStateList) propertyModel2.i(pd24);
                            tabSelectionEditorToolbar2.B0.setTextColor(colorStateList2);
                            ((LN3) tabSelectionEditorToolbar2.p()).c(colorStateList2);
                            return;
                        }
                        PD2 pd25 = HA3.c;
                        if (pd25 == fd2) {
                            tabSelectionEditorLayout2.s.B0.setText((String) propertyModel2.i(pd25));
                            return;
                        }
                        ND2 nd23 = HA3.d;
                        if (nd23 == fd2) {
                            tabSelectionEditorLayout2.s.E0 = propertyModel2.h(nd23);
                            return;
                        }
                        ND2 nd24 = HA3.j;
                        if (nd24 == fd2) {
                            tabSelectionEditorLayout2.s.C0 = Integer.valueOf(propertyModel2.h(nd24));
                            return;
                        }
                        return;
                    }
                    if (!propertyModel2.j(ld22)) {
                        tabSelectionEditorLayout2.getClass();
                        tabSelectionEditorLayout2.t.removeView(tabSelectionEditorLayout2);
                        int i3 = 0;
                        while (true) {
                            int childCount = tabSelectionEditorLayout2.t.getChildCount();
                            hashMap = tabSelectionEditorLayout2.u;
                            if (i3 >= childCount) {
                                break;
                            }
                            View childAt = tabSelectionEditorLayout2.t.getChildAt(i3);
                            Integer num = (Integer) hashMap.get(childAt);
                            childAt.setImportantForAccessibility(num == null ? 0 : num.intValue());
                            i3++;
                        }
                        Integer num2 = (Integer) hashMap.get(tabSelectionEditorLayout2.t);
                        tabSelectionEditorLayout2.t.setImportantForAccessibility(num2 != null ? num2.intValue() : 0);
                        hashMap.clear();
                        return;
                    }
                    tabSelectionEditorLayout2.getClass();
                    while (true) {
                        int childCount2 = tabSelectionEditorLayout2.t.getChildCount();
                        HashMap hashMap2 = tabSelectionEditorLayout2.u;
                        if (r5 >= childCount2) {
                            ViewGroup viewGroup3 = tabSelectionEditorLayout2.t;
                            hashMap2.put(viewGroup3, Integer.valueOf(viewGroup3.getImportantForAccessibility()));
                            tabSelectionEditorLayout2.t.setImportantForAccessibility(2);
                            tabSelectionEditorLayout2.t.addView(tabSelectionEditorLayout2);
                            return;
                        }
                        View childAt2 = tabSelectionEditorLayout2.t.getChildAt(r5);
                        hashMap2.put(childAt2, Integer.valueOf(childAt2.getImportantForAccessibility()));
                        childAt2.setImportantForAccessibility(4);
                        r5++;
                    }
                }
            }, false);
            this.e = new GA3(context, interfaceC10590uz3, new C11342xA3(this), propertyModel, c7526m33);
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void a() {
        this.b.onDestroy();
        this.a.j();
        GA3 ga3 = this.e;
        ga3.k.a();
        InterfaceC10590uz3 interfaceC10590uz3 = ga3.g;
        if (interfaceC10590uz3 != null) {
            ((AbstractC11276wz3) interfaceC10590uz3).s(ga3.l);
        }
        this.d.b();
    }
}

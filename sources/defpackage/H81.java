package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.history_clusters.ClusterVisit;
import org.chromium.chrome.browser.history_clusters.HistoryCluster;
import org.chromium.chrome.browser.history_clusters.HistoryClustersBridge;
import org.chromium.chrome.browser.history_clusters.HistoryClustersResult;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H81 extends DK2 implements InterfaceC3746b33 {
    public final boolean B;
    public final HistoryClustersBridge a;
    public final Context g;
    public final Resources h;
    public final C7616mK1 i;
    public final PropertyModel j;
    public final C6964kR2 k;
    public final LargeIconBridge l;
    public final int m;
    public MC2 n;
    public final InterfaceC9270r81 o;
    public final KH q;
    public final TemplateUrlService r;
    public final C7526m33 s;
    public final C7272lK1 t;
    public final C7272lK1 u;
    public final C7272lK1 v;
    public C7253lG2 w;
    public final C7272lK1 x;
    public final I81 y;
    public final C4496dF p = new C4496dF();
    public final LinkedHashMap z = new LinkedHashMap();
    public final HashMap A = new HashMap();

    @Override // defpackage.InterfaceC3746b33
    public final void i() {
        C(new C7253lG2("", null, false));
    }

    public final void v(HistoryClustersResult historyClustersResult) {
        if (historyClustersResult.d) {
            HistoryClustersBridge historyClustersBridge = this.a;
            historyClustersBridge.getClass();
            MC2 mc2 = new MC2();
            N.MMJAutz7(historyClustersBridge.a, historyClustersBridge, historyClustersResult.c, new C4804e81(mc2));
            this.n = mc2;
            mc2.g(this.p.b(new A81(this)));
            x(2, true);
        }
    }

    public final void A(GURL gurl) {
        Context context = V60.a;
        InterfaceC9270r81 interfaceC9270r81 = this.o;
        if (interfaceC9270r81.f()) {
            context.startActivity(this.o.e(gurl, false, false, false, null));
            return;
        }
        Tab a = interfaceC9270r81.a();
        if (a == null) {
            return;
        }
        a.d(new LoadUrlParams(gurl.i(), 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0091, code lost:            if ((r2 != 1) != false) goto L57;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public H81(org.chromium.chrome.browser.history_clusters.HistoryClustersBridge r2, org.chromium.components.favicon.LargeIconBridge r3, android.content.Context r4, android.content.res.Resources r5, defpackage.C7616mK1 r6, org.chromium.ui.modelutil.PropertyModel r7, defpackage.InterfaceC9270r81 r8, defpackage.KH r9, org.chromium.components.search_engines.TemplateUrlService r10, defpackage.C7526m33 r11, defpackage.I81 r12, defpackage.C10021tL r13) {
        /*
            r1 = this;
            r1.<init>()
            dF r0 = new dF
            r0.<init>()
            r1.p = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.z = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.A = r0
            r1.a = r2
            r1.l = r3
            r1.i = r6
            r1.g = r4
            r1.h = r5
            r1.j = r7
            r1.o = r8
            r2 = 2131231097(0x7f080179, float:1.8078265E38)
            int r2 = r5.getDimensionPixelSize(r2)
            r1.m = r2
            kR2 r2 = defpackage.AbstractC4855eI0.a(r4)
            r1.k = r2
            r1.q = r9
            r1.r = r10
            r1.s = r11
            r1.y = r12
            org.chromium.ui.modelutil.PropertyModel r2 = new org.chromium.ui.modelutil.PropertyModel
            FD2[] r3 = defpackage.AbstractC9613s81.o
            r2.<init>(r3)
            lK1 r4 = new lK1
            r6 = 4
            r4.<init>(r6, r2)
            r1.t = r4
            org.chromium.ui.modelutil.PropertyModel r2 = new org.chromium.ui.modelutil.PropertyModel
            r2.<init>(r3)
            lK1 r4 = new lK1
            r6 = 5
            r4.<init>(r6, r2)
            r1.u = r4
            oa2 r2 = r8.h()
            x81 r4 = new x81
            r4.<init>()
            r2.m(r4)
            org.chromium.ui.modelutil.PropertyModel r2 = new org.chromium.ui.modelutil.PropertyModel
            r2.<init>(r3)
            lK1 r4 = new lK1
            r6 = 6
            r4.<init>(r6, r2)
            r1.v = r4
            oa2 r2 = r8.d()
            y81 r4 = new y81
            r4.<init>()
            r2.m(r4)
            boolean r2 = r13.c()
            r4 = 1
            if (r2 != 0) goto L93
            android.content.res.Configuration r2 = r5.getConfiguration()
            int r2 = r2.keyboard
            r5 = 0
            if (r2 == r4) goto L90
            r2 = r4
            goto L91
        L90:
            r2 = r5
        L91:
            if (r2 == 0) goto L94
        L93:
            r5 = r4
        L94:
            r1.B = r5
            if (r5 == 0) goto L99
            goto L9a
        L99:
            r4 = 2
        L9a:
            java.util.HashMap r2 = org.chromium.ui.modelutil.PropertyModel.e(r3)
            ND2 r3 = defpackage.AbstractC9613s81.j
            DD2 r5 = new DD2
            r5.<init>()
            r5.a = r4
            r2.put(r3, r5)
            PD2 r3 = defpackage.AbstractC9613s81.c
            z81 r4 = new z81
            r4.<init>()
            GD2 r5 = new GD2
            r5.<init>()
            r5.a = r4
            org.chromium.ui.modelutil.PropertyModel r2 = defpackage.AbstractC5266fV2.a(r2, r3, r5, r2)
            lK1 r3 = new lK1
            r4 = 7
            r3.<init>(r4, r2)
            r1.x = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H81.<init>(org.chromium.chrome.browser.history_clusters.HistoryClustersBridge, org.chromium.components.favicon.LargeIconBridge, android.content.Context, android.content.res.Resources, mK1, org.chromium.ui.modelutil.PropertyModel, r81, KH, org.chromium.components.search_engines.TemplateUrlService, m33, I81, tL):void");
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        if (!this.B && ((LinearLayoutManager) recyclerView.s).T0() > this.i.size() - 25) {
            this.n.g(new C9956t81(this));
        }
    }

    public final void C(C7253lG2 c7253lG2) {
        C7253lG2 c7253lG22 = this.w;
        boolean z = c7253lG2.c;
        if (c7253lG22 == null || c7253lG22.c || z) {
            this.w = c7253lG2;
            this.j.o(J81.a, c7253lG2);
            if (z) {
                return;
            }
            this.i.clear();
            this.z.clear();
            this.A.clear();
            D(this.w.a);
        }
    }

    public final void D(String str) {
        if (this.w.c) {
            this.y.d++;
        }
        HistoryClustersBridge historyClustersBridge = this.a;
        historyClustersBridge.getClass();
        MC2 mc2 = new MC2();
        N.MD4nuvYC(historyClustersBridge.a, historyClustersBridge, str, new C4804e81(mc2));
        this.n = mc2;
        mc2.g(this.p.b(new A81(this)));
        x(2, true);
    }

    public final void B(ArrayList arrayList, boolean z, boolean z2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.y.a(0, (ClusterVisit) it.next());
        }
        InterfaceC9270r81 interfaceC9270r81 = this.o;
        int i = 1;
        if (interfaceC9270r81.f()) {
            ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
            while (i < arrayList.size()) {
                arrayList2.add(((ClusterVisit) arrayList.get(i)).c.i());
                i++;
            }
            V60.a.startActivity(this.o.e(((ClusterVisit) arrayList.get(0)).c, z, true, z2, arrayList2));
            return;
        }
        Tab b = interfaceC9270r81.b(z).b(2, null, new LoadUrlParams(((ClusterVisit) arrayList.get(0)).c.i(), 0));
        while (i < arrayList.size()) {
            interfaceC9270r81.b(false).b(2, b, new LoadUrlParams(((ClusterVisit) arrayList.get(i)).c.i(), 0));
            i++;
        }
    }

    public final void w(List list) {
        int i = 0;
        while (true) {
            int size = list.size();
            InterfaceC9270r81 interfaceC9270r81 = this.o;
            if (i < size) {
                ClusterVisit clusterVisit = (ClusterVisit) list.get(i);
                interfaceC9270r81.m(clusterVisit);
                this.y.a(1, clusterVisit);
                HashMap hashMap = this.A;
                G81 g81 = (G81) hashMap.get(clusterVisit);
                if (g81 != null) {
                    C7616mK1 c7616mK1 = this.i;
                    C7272lK1 c7272lK1 = g81.a;
                    c7616mK1.x(c7272lK1);
                    List list2 = g81.c;
                    list2.remove(c7272lK1);
                    if (list2.size() == 1 && ((C7272lK1) list2.get(0)).a == 3) {
                        c7616mK1.x((C7272lK1) list2.get(0));
                        list2.clear();
                    }
                    if (list2.isEmpty()) {
                        c7616mK1.x(g81.b);
                    }
                    hashMap.remove(clusterVisit);
                }
                i++;
            } else {
                interfaceC9270r81.n();
                return;
            }
        }
    }

    public static void t(H81 h81, HistoryClustersResult historyClustersResult) {
        PD2 pd2;
        PD2 pd22;
        Resources resources;
        C7272lK1 c7272lK1;
        Resources resources2;
        String quantityString;
        PD2 pd23;
        PD2 pd24;
        PD2 pd25;
        char c;
        PropertyModel propertyModel;
        String str;
        HistoryClustersResult historyClustersResult2 = historyClustersResult;
        boolean z = !h81.w.c;
        PD2 pd26 = AbstractC9613s81.g;
        PD2 pd27 = AbstractC9613s81.i;
        ND2 nd2 = AbstractC9613s81.a;
        PD2 pd28 = AbstractC9613s81.e;
        PD2 pd29 = AbstractC9613s81.h;
        PD2 pd210 = AbstractC9613s81.c;
        PD2 pd211 = AbstractC9613s81.l;
        FD2[] fd2Arr = AbstractC9613s81.o;
        Resources resources3 = h81.h;
        C7616mK1 c7616mK1 = h81.i;
        Context context = h81.g;
        if (z) {
            h81.y();
            Iterator it = historyClustersResult2.b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                final String str2 = (String) entry.getKey();
                Iterator it2 = it;
                LinkedHashMap linkedHashMap = h81.z;
                PropertyModel propertyModel2 = (PropertyModel) linkedHashMap.get(str2);
                if (propertyModel2 == null) {
                    pd24 = pd27;
                    propertyModel = new PropertyModel(fd2Arr);
                    linkedHashMap.put(str2, propertyModel);
                    propertyModel.o(pd29, AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090243));
                    propertyModel.o(pd28, Boolean.TRUE);
                    Iterator it3 = historyClustersResult2.a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            pd25 = pd28;
                            str = str2;
                            break;
                        }
                        Iterator it4 = it3;
                        HistoryCluster historyCluster = (HistoryCluster) it3.next();
                        pd25 = pd28;
                        if (historyCluster.f.equals(str2)) {
                            str = historyCluster.b;
                            break;
                        } else {
                            it3 = it4;
                            pd28 = pd25;
                        }
                    }
                    propertyModel.o(pd211, str);
                    c7616mK1.s(new C7272lK1(2, propertyModel));
                    propertyModel.o(pd210, new View.OnClickListener() { // from class: B81
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            H81 h812 = H81.this;
                            h812.C(new C7253lG2(str2, h812.o.j(), true));
                        }
                    });
                    propertyModel.o(pd26, null);
                    c = 0;
                    propertyModel.m(nd2, 0);
                } else {
                    pd24 = pd27;
                    pd25 = pd28;
                    c = 0;
                    propertyModel = propertyModel2;
                }
                int intValue = ((Integer) entry.getValue()).intValue();
                Object[] objArr = new Object[1];
                objArr[c] = entry.getValue();
                String quantityString2 = resources3.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120018, intValue, objArr);
                PD2 pd212 = pd24;
                propertyModel.o(pd212, quantityString2);
                pd27 = pd212;
                it = it2;
                pd28 = pd25;
            }
            boolean z2 = h81.B;
            boolean z3 = historyClustersResult2.d;
            if (!z2 && z3 && !historyClustersResult2.e) {
                h81.v(historyClustersResult);
            }
            h81.x(1, z3);
            return;
        }
        PD2 pd213 = pd27;
        Iterator it5 = historyClustersResult2.a.iterator();
        while (it5.hasNext()) {
            HistoryCluster historyCluster2 = (HistoryCluster) it5.next();
            PropertyModel propertyModel3 = new PropertyModel(fd2Arr);
            Iterator it6 = it5;
            propertyModel3.o(pd211, u(historyCluster2.b, historyCluster2.c));
            propertyModel3.o(pd29, AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090243));
            propertyModel3.o(pd28, Boolean.valueOf(z));
            propertyModel3.m(nd2, 1);
            boolean z4 = z;
            final C7272lK1 c7272lK12 = new C7272lK1(2, propertyModel3);
            c7616mK1.s(c7272lK12);
            List list = historyCluster2.a;
            ND2 nd22 = nd2;
            final ArrayList arrayList = new ArrayList(list.size() + 1);
            final List list2 = historyCluster2.e;
            if (list2.isEmpty()) {
                pd2 = pd213;
                pd22 = pd29;
                resources = resources3;
                c7272lK1 = null;
            } else {
                pd22 = pd29;
                HashMap e = PropertyModel.e(fd2Arr);
                pd2 = pd213;
                PD2 pd214 = AbstractC9613s81.k;
                resources = resources3;
                GD2 gd2 = new GD2();
                gd2.a = list2;
                e.put(pd214, gd2);
                PD2 pd215 = AbstractC9613s81.b;
                Callback callback = new Callback() { // from class: C81
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        String str3 = (String) obj;
                        H81 h812 = H81.this;
                        h812.getClass();
                        int indexOf = list2.indexOf(str3);
                        TemplateUrlService templateUrlService = h812.r;
                        if (templateUrlService.f()) {
                            I81 i81 = h812.y;
                            i81.getClass();
                            EI2.d(indexOf, "History.Clusters.UIActions.RelatedSearch.Clicked");
                            i81.c++;
                            h812.A(new GURL(templateUrlService.d(str3, null)));
                        }
                    }
                };
                GD2 gd22 = new GD2();
                gd22.a = callback;
                c7272lK1 = new C7272lK1(3, AbstractC5266fV2.a(e, pd215, gd22, e));
            }
            int i = 0;
            while (i < list.size()) {
                final ClusterVisit clusterVisit = (ClusterVisit) list.get(i);
                HashMap e2 = PropertyModel.e(fd2Arr);
                List list3 = list;
                FD2[] fd2Arr2 = fd2Arr;
                HistoryCluster historyCluster3 = historyCluster2;
                SpannableString spannableString = new SpannableString(u(clusterVisit.a, clusterVisit.d));
                GD2 gd23 = new GD2();
                gd23.a = spannableString;
                e2.put(pd211, gd23);
                PD2 pd216 = AbstractC9613s81.m;
                SpannableString u = u(clusterVisit.b, clusterVisit.e);
                GD2 gd24 = new GD2();
                gd24.a = u;
                e2.put(pd216, gd24);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: D81
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        H81 h812 = H81.this;
                        h812.getClass();
                        S23 s23 = (S23) view;
                        if (h812.s.e()) {
                            s23.onLongClick(s23);
                            return;
                        }
                        I81 i81 = h812.y;
                        ClusterVisit clusterVisit2 = clusterVisit;
                        i81.a(0, clusterVisit2);
                        h812.A(clusterVisit2.c);
                    }
                };
                GD2 gd25 = new GD2();
                gd25.a = onClickListener;
                e2.put(pd210, gd25);
                PD2 pd217 = AbstractC9613s81.d;
                GD2 gd26 = new GD2();
                gd26.a = clusterVisit;
                e2.put(pd217, gd26);
                ND2 nd23 = AbstractC9613s81.n;
                DD2 dd2 = new DD2();
                dd2.a = 0;
                e2.put(nd23, dd2);
                PD2 pd218 = AbstractC9613s81.f;
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: E81
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        H81 h812 = H81.this;
                        h812.getClass();
                        h812.w(Arrays.asList(clusterVisit));
                    }
                };
                GD2 gd27 = new GD2();
                gd27.a = onClickListener2;
                e2.put(pd218, gd27);
                final PropertyModel propertyModel4 = new PropertyModel(e2);
                LargeIconBridge largeIconBridge = h81.l;
                if (largeIconBridge != null) {
                    pd23 = pd211;
                    largeIconBridge.b(clusterVisit.c, h81.m, new LargeIconBridge.LargeIconCallback() { // from class: F81
                        @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                        public final void onLargeIconAvailable(Bitmap bitmap, int i2, boolean z5, int i3) {
                            H81 h812 = H81.this;
                            h812.getClass();
                            Drawable e3 = AbstractC4855eI0.e(bitmap, clusterVisit.c, i2, h812.k, h812.h, h812.m);
                            propertyModel4.o(AbstractC9613s81.h, e3);
                        }
                    });
                } else {
                    pd23 = pd211;
                }
                C7272lK1 c7272lK13 = new C7272lK1(1, propertyModel4);
                h81.A.put(clusterVisit, new G81(c7272lK13, c7272lK12, arrayList));
                arrayList.add(c7272lK13);
                i++;
                list = list3;
                fd2Arr = fd2Arr2;
                historyCluster2 = historyCluster3;
                pd211 = pd23;
            }
            PD2 pd219 = pd211;
            FD2[] fd2Arr3 = fd2Arr;
            HistoryCluster historyCluster4 = historyCluster2;
            if (c7272lK1 != null) {
                arrayList.add(c7272lK1);
            }
            c7616mK1.u(c7616mK1.g.size(), arrayList);
            propertyModel3.o(pd210, new View.OnClickListener() { // from class: u81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    H81.this.z(c7272lK12, arrayList);
                }
            });
            propertyModel3.o(pd26, AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f090201, R.color.0_resource_name_obfuscated_res_0x7f07012b, context));
            h81.q.getClass();
            long currentTimeMillis = System.currentTimeMillis() - historyCluster4.d;
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int days = (int) timeUnit.toDays(currentTimeMillis);
            int hours = (int) timeUnit.toHours(currentTimeMillis);
            int minutes = (int) timeUnit.toMinutes(currentTimeMillis);
            if (days > 0) {
                resources2 = resources;
                quantityString = resources2.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120022, days, Integer.valueOf(days));
            } else {
                resources2 = resources;
                quantityString = hours > 0 ? resources2.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120023, hours, Integer.valueOf(hours)) : minutes > 0 ? resources2.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120024, minutes, Integer.valueOf(minutes)) : resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f140574);
            }
            PD2 pd220 = pd2;
            propertyModel3.o(pd220, quantityString);
            historyClustersResult2 = historyClustersResult;
            pd213 = pd220;
            resources3 = resources2;
            it5 = it6;
            z = z4;
            pd29 = pd22;
            nd2 = nd22;
            fd2Arr = fd2Arr3;
            pd211 = pd219;
        }
        h81.x(1, historyClustersResult2.d);
    }

    @Override // defpackage.InterfaceC3746b33
    public final void l(String str) {
        this.i.clear();
        this.z.clear();
        this.A.clear();
        D(str);
    }

    public final void y() {
        C7253lG2 c7253lG2 = this.w;
        if (c7253lG2 == null || !c7253lG2.c) {
            C7272lK1 c7272lK1 = this.u;
            C7616mK1 c7616mK1 = this.i;
            int i = 1;
            boolean z = c7616mK1.indexOf(c7272lK1) > -1;
            C7272lK1 c7272lK12 = this.v;
            boolean z2 = c7616mK1.indexOf(c7272lK12) > -1;
            C7272lK1 c7272lK13 = this.t;
            boolean z3 = c7616mK1.indexOf(c7272lK13) > -1;
            Boolean bool = Boolean.TRUE;
            InterfaceC9270r81 interfaceC9270r81 = this.o;
            boolean equals = bool.equals(interfaceC9270r81.h().g);
            if (!equals || z) {
                if (!equals && z) {
                    c7616mK1.x(c7272lK1);
                }
                i = 0;
            } else {
                c7616mK1.t(0, c7272lK1);
            }
            boolean equals2 = bool.equals(interfaceC9270r81.d().g);
            if (equals2 && !z2) {
                c7616mK1.t(i, c7272lK12);
                i++;
            } else if (!equals2 && z2) {
                c7616mK1.x(c7272lK12);
            }
            if (z3) {
                return;
            }
            c7616mK1.t(i, c7272lK13);
        }
    }

    public final void x(int i, boolean z) {
        C7272lK1 c7272lK1 = this.x;
        c7272lK1.b.m(AbstractC9613s81.j, i);
        boolean z2 = (i == 1 && z && this.B) || i == 2;
        C7616mK1 c7616mK1 = this.i;
        if (c7616mK1.indexOf(c7272lK1) != -1) {
            c7616mK1.x(c7272lK1);
        }
        if (z2) {
            c7616mK1.s(c7272lK1);
        }
    }

    public final void z(final C7272lK1 c7272lK1, final List list) {
        Object obj = list.get(0);
        C7616mK1 c7616mK1 = this.i;
        int indexOf = c7616mK1.indexOf(obj);
        PropertyModel propertyModel = c7272lK1.b;
        propertyModel.o(AbstractC9613s81.c, new View.OnClickListener() { // from class: v81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final H81 h81 = H81.this;
                h81.getClass();
                final C7272lK1 c7272lK12 = c7272lK1;
                PropertyModel propertyModel2 = c7272lK12.b;
                PD2 pd2 = AbstractC9613s81.c;
                final List list2 = list;
                propertyModel2.o(pd2, new View.OnClickListener() { // from class: w81
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        H81.this.z(c7272lK12, list2);
                    }
                });
                propertyModel2.o(AbstractC9613s81.g, AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f090201, R.color.0_resource_name_obfuscated_res_0x7f07012b, h81.g));
                propertyModel2.m(AbstractC9613s81.a, 1);
                C7616mK1 c7616mK12 = h81.i;
                c7616mK12.u(c7616mK12.indexOf(c7272lK12) + 1, list2);
            }
        });
        propertyModel.o(AbstractC9613s81.g, AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f090200, R.color.0_resource_name_obfuscated_res_0x7f07012b, this.g));
        propertyModel.m(AbstractC9613s81.a, 2);
        c7616mK1.z(indexOf, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClusterVisit clusterVisit = (ClusterVisit) ((C7272lK1) it.next()).b.i(AbstractC9613s81.d);
            C7526m33 c7526m33 = this.s;
            if (c7526m33.d(clusterVisit)) {
                c7526m33.g(clusterVisit);
            }
        }
    }

    public static SpannableString u(String str, List list) {
        SpannableString spannableString = new SpannableString(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4461d81 c4461d81 = (C4461d81) it.next();
            spannableString.setSpan(new StyleSpan(1), c4461d81.a, c4461d81.b, 0);
        }
        return spannableString;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListPopupWindow;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class S12 implements AdapterView.OnItemClickListener {
    public final Profile a;
    public final Context g;
    public final ListPopupWindow h;
    public final NavigationController i;
    public final G12 j;
    public final R12 k;
    public final int l;
    public final int m;
    public final P12 n;
    public final InterfaceC0079Ap3 o;
    public final KH p;
    public VH0 q;
    public WH0 r;
    public boolean s;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public S12(org.chromium.chrome.browser.profiles.Profile r18, android.content.Context r19, org.chromium.content_public.browser.NavigationController r20, int r21, defpackage.C6965kR3 r22, defpackage.KH r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            r17.<init>()
            r4 = r18
            r0.a = r4
            r0.g = r1
            android.content.res.Resources r5 = r19.getResources()
            r0.i = r2
            r0.l = r3
            r6 = r22
            r0.o = r6
            r6 = r23
            r0.p = r6
            r6 = 1
            r7 = 0
            r8 = 2
            if (r3 != r8) goto L28
            r9 = r6
            goto L29
        L28:
            r9 = r7
        L29:
            if (r3 != 0) goto L2d
            r3 = r6
            goto L2e
        L2d:
            r3 = r7
        L2e:
            G12 r2 = r2.n(r9)
            r0.j = r2
            boolean r4 = r18.i()
            if (r4 == 0) goto L46
            nE r4 = defpackage.UN.a
            java.lang.String r4 = "UpdateHistoryEntryPointsInIncognito"
            boolean r4 = J.N.M09VlOh_(r4)
            if (r4 == 0) goto L46
            r4 = r6
            goto L47
        L46:
            r4 = r7
        L47:
            if (r4 != 0) goto L71
            org.chromium.content_public.browser.NavigationEntry r4 = new org.chromium.content_public.browser.NavigationEntry
            r10 = -1
            org.chromium.url.GURL r11 = new org.chromium.url.GURL
            java.lang.String r9 = "chrome://history/"
            r11.<init>(r9)
            org.chromium.url.GURL r12 = org.chromium.url.GURL.emptyGURL()
            org.chromium.url.GURL r13 = org.chromium.url.GURL.emptyGURL()
            org.chromium.url.GURL r14 = org.chromium.url.GURL.emptyGURL()
            r9 = 2132019776(0x7f140a40, float:1.9677896E38)
            java.lang.String r15 = r5.getString(r9)
            r16 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r2 = r2.a
            r2.add(r4)
        L71:
            R12 r2 = new R12
            r2.<init>(r0)
            r0.k = r2
            android.widget.ListPopupWindow r4 = new android.widget.ListPopupWindow
            r9 = 2132083214(0x7f15020e, float:1.9806564E38)
            r10 = 0
            r4.<init>(r1, r10, r7, r9)
            r0.h = r4
            O12 r9 = new O12
            r9.<init>()
            r4.setOnDismissListener(r9)
            if (r3 == 0) goto L91
            r9 = 2131297169(0x7f090391, float:1.8212275E38)
            goto L94
        L91:
            r9 = 2131297170(0x7f090392, float:1.8212277E38)
        L94:
            android.graphics.drawable.Drawable r1 = defpackage.AbstractC2884Wf.a(r1, r9)
            r4.setBackgroundDrawable(r1)
            r4.setModal(r6)
            r4.setInputMethodMode(r8)
            r1 = -2
            r4.setHeight(r1)
            r4.setOnItemClickListener(r0)
            r4.setAdapter(r2)
            if (r3 == 0) goto Lb1
            r1 = 2131232248(0x7f0805f8, float:1.80806E38)
            goto Lb4
        Lb1:
            r1 = 2131231958(0x7f0804d6, float:1.8080012E38)
        Lb4:
            int r1 = r5.getDimensionPixelSize(r1)
            r4.setWidth(r1)
            if (r3 == 0) goto Lc8
            r4.setVerticalOffset(r7)
            P12 r1 = new P12
            r1.<init>(r0)
            r0.n = r1
            goto Lca
        Lc8:
            r0.n = r10
        Lca:
            r1 = 2131231098(0x7f08017a, float:1.8078267E38)
            int r1 = r5.getDimensionPixelSize(r1)
            r0.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S12.<init>(org.chromium.chrome.browser.profiles.Profile, android.content.Context, org.chromium.content_public.browser.NavigationController, int, kR3, KH):void");
    }

    public final String a(String str) {
        return Y5.a(new StringBuilder(), this.l == 2 ? "ForwardMenu_" : "BackMenu_", str);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        NavigationEntry navigationEntry = (NavigationEntry) adapterView.getItemAtPosition(i);
        if (navigationEntry.a == -1) {
            FI2.a(a("ShowFullHistory"));
            Tab tab = (Tab) this.o.get();
            Activity activity = (Activity) tab.m().k().get();
            boolean z = tab.isIncognito();
            this.p.getClass();
            Y81.a(activity, tab, z);
        } else {
            FI2.a(a("HistoryClick" + (i + 1)));
            NavigationController navigationController = this.i;
            int i2 = navigationEntry.a;
            EI2.b("Navigation.BackForward.NavigatingToEntryMarkedToBeSkipped", navigationController.s(i2));
            navigationController.z(i2);
        }
        this.h.dismiss();
    }
}

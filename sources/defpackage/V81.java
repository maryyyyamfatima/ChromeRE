package defpackage;

import J.N;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.chrome.browser.history.BrowsingHistoryBridge;
import org.chromium.chrome.browser.history_clusters.ClusterVisit;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V81 implements InterfaceC9270r81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ InterfaceC0079Ap3 b;
    public final /* synthetic */ X81 c;

    @Override // defpackage.InterfaceC9270r81
    public final Intent i() {
        return null;
    }

    @Override // defpackage.InterfaceC9270r81
    public final void c() {
        this.c.y();
    }

    @Override // defpackage.InterfaceC9270r81
    public final C8385oa2 d() {
        return this.c.t;
    }

    @Override // defpackage.InterfaceC9270r81
    public final Intent e(GURL gurl, boolean z, boolean z2, boolean z3, ArrayList arrayList) {
        Intent a = this.c.n.a(gurl, Boolean.valueOf(z), z2);
        if (arrayList != null) {
            a.putExtra("org.chromium.chrome.browser.additional_urls", arrayList);
            a.putExtra("org.chromium.chrome.browser.open_additional_urls_in_tab_group", z3);
        }
        return a;
    }

    @Override // defpackage.InterfaceC9270r81
    public final ViewGroup g(ViewGroup viewGroup) {
        return this.c.n.n.T(viewGroup);
    }

    @Override // defpackage.InterfaceC9270r81
    public final C8385oa2 h() {
        return this.c.s;
    }

    @Override // defpackage.InterfaceC9270r81
    public final String j() {
        return this.c.o();
    }

    @Override // defpackage.InterfaceC9270r81
    public final ViewGroup k(ViewGroup viewGroup) {
        ViewGroup U = this.c.n.n.U(viewGroup);
        U.findViewById(R.id.privacy_disclaimer_bottom_space).setVisibility(8);
        return U;
    }

    @Override // defpackage.InterfaceC9270r81
    public final ViewGroup l(ViewGroup viewGroup) {
        return this.c.f(1, viewGroup);
    }

    @Override // defpackage.InterfaceC9270r81
    public final void n() {
        this.c.i.a();
    }

    @Override // defpackage.InterfaceC9270r81
    public final void o() {
        this.c.q(false);
    }

    @Override // defpackage.InterfaceC9270r81
    public final void m(ClusterVisit clusterVisit) {
        GURL gurl = clusterVisit.f;
        long[] jArr = {clusterVisit.g};
        if (TextUtils.isEmpty(null)) {
            gurl.i();
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        X81 x81 = this.c;
        BrowsingHistoryBridge browsingHistoryBridge = x81.i;
        N.Mya3ANHw(browsingHistoryBridge.b, browsingHistoryBridge, gurl, Arrays.copyOf(copyOf, copyOf.length));
        int i = 0;
        while (true) {
            List list = clusterVisit.h;
            if (i >= list.size()) {
                return;
            }
            C10757vV c10757vV = (C10757vV) list.get(i);
            GURL gurl2 = c10757vV.b;
            long[] jArr2 = {c10757vV.a};
            if (TextUtils.isEmpty(null)) {
                gurl2.i();
            }
            long[] copyOf2 = Arrays.copyOf(jArr2, jArr2.length);
            BrowsingHistoryBridge browsingHistoryBridge2 = x81.i;
            N.Mya3ANHw(browsingHistoryBridge2.b, browsingHistoryBridge2, gurl2, Arrays.copyOf(copyOf2, copyOf2.length));
            i++;
        }
    }

    public V81(X81 x81, boolean z, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.c = x81;
        this.a = z;
        this.b = interfaceC0079Ap3;
    }

    @Override // defpackage.InterfaceC9270r81
    public final boolean f() {
        return this.a;
    }

    @Override // defpackage.InterfaceC9270r81
    public final Tab a() {
        return (Tab) this.b.get();
    }

    @Override // defpackage.InterfaceC9270r81
    public final AbstractC10569uv3 b(boolean z) {
        return new C11598xv3(z);
    }
}

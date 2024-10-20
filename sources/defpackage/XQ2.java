package defpackage;

import android.content.Intent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.chromium.chrome.browser.history.HistoryActivity;
import org.chromium.chrome.browser.history_clusters.ClusterVisit;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XQ2 implements InterfaceC9270r81 {
    public final /* synthetic */ C4559dR2 a;

    @Override // defpackage.InterfaceC9270r81
    public final /* synthetic */ AbstractC10569uv3 b(boolean z) {
        return null;
    }

    @Override // defpackage.InterfaceC9270r81
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.InterfaceC9270r81
    public final boolean f() {
        return false;
    }

    @Override // defpackage.InterfaceC9270r81
    public final /* synthetic */ ViewGroup g(ViewGroup viewGroup) {
        return null;
    }

    @Override // defpackage.InterfaceC9270r81
    public final /* synthetic */ String j() {
        return "";
    }

    @Override // defpackage.InterfaceC9270r81
    public final /* synthetic */ ViewGroup k(ViewGroup viewGroup) {
        return null;
    }

    @Override // defpackage.InterfaceC9270r81
    public final ViewGroup l(ViewGroup viewGroup) {
        return null;
    }

    @Override // defpackage.InterfaceC9270r81
    public final /* synthetic */ void m(ClusterVisit clusterVisit) {
    }

    @Override // defpackage.InterfaceC9270r81
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9270r81
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.InterfaceC9270r81
    public final C8385oa2 h() {
        return new C8385oa2();
    }

    @Override // defpackage.InterfaceC9270r81
    public final C8385oa2 d() {
        return new C8385oa2();
    }

    public XQ2(C4559dR2 c4559dR2) {
        this.a = c4559dR2;
    }

    @Override // defpackage.InterfaceC9270r81
    public final Tab a() {
        return (Tab) this.a.l.g;
    }

    @Override // defpackage.InterfaceC9270r81
    public final Intent i() {
        Intent intent = new Intent();
        C4559dR2 c4559dR2 = this.a;
        return intent.setClass(c4559dR2.h, HistoryActivity.class).putExtra("org.chromium.chrome.browser.parent_component", c4559dR2.h.getComponentName());
    }

    @Override // defpackage.InterfaceC9270r81
    public final Intent e(GURL gurl, boolean z, boolean z2, boolean z3, ArrayList arrayList) {
        return new Intent();
    }
}

package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nv3 */
/* loaded from: classes.dex */
public final class C1798Nv3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ C2318Rv3 g;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    public C1798Nv3(C2318Rv3 c2318Rv3, Context context) {
        this.g = c2318Rv3;
        this.a = context;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        this.g.h(this.a, tabModel.isIncognito());
    }
}

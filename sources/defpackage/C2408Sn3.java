package defpackage;

import android.os.Handler;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sn3 */
/* loaded from: classes.dex */
public final class C2408Sn3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ C3188Yn3 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
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

    @Override // defpackage.InterfaceC0259Bz3
    public final void a() {
        this.a.t();
        new Handler().post(new Runnable() { // from class: Rn3
            @Override // java.lang.Runnable
            public final void run() {
                C2408Sn3 c2408Sn3 = C2408Sn3.this;
                ((AbstractC11276wz3) c2408Sn3.a.g).s(c2408Sn3);
            }
        });
    }

    public C2408Sn3(C3188Yn3 c3188Yn3) {
        this.a = c3188Yn3;
    }
}

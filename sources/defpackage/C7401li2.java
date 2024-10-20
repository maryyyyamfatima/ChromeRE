package defpackage;

import J.N;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.paint_preview.services.PaintPreviewTabService;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: li2 */
/* loaded from: classes.dex */
public final class C7401li2 extends AbstractC1429Kz3 implements InterfaceC11522xj {
    public int i;
    public final /* synthetic */ PaintPreviewTabService j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7401li2(PaintPreviewTabService paintPreviewTabService, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.j = paintPreviewTabService;
        ApplicationStatus.d(this);
    }

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i) {
        this.i = i;
        if (i == 4) {
            ApplicationStatus.i(this);
        }
    }

    @Override // defpackage.BA0
    public final void A0(int i, final Tab tab) {
        if (this.i == 3) {
            String h = tab.getUrl().h();
            boolean z = false;
            boolean z2 = h.equals("http") || h.equals("https");
            if (!tab.isIncognito() && !tab.isNativePage() && !tab.n() && tab.b() != null && !tab.e() && z2) {
                if (CachedFeatureFlags.b(AbstractC6265iP.d.b("PaintPreviewShowOnStartup:allow_srp"), true) ? true : !N.M$l72hrq(tab.getUrl().i())) {
                    z = true;
                }
            }
            if (z) {
                this.j.b(new Callback() { // from class: ki2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        C7401li2 c7401li2 = C7401li2.this;
                        c7401li2.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            return;
                        }
                        long j = c7401li2.j.c;
                        if (j == 0) {
                            return;
                        }
                        N.MO7GqHLu(j, tab.getId());
                    }
                }, tab);
            }
        }
    }

    @Override // defpackage.AbstractC1429Kz3
    public final void X0(Tab tab) {
        long j = this.j.c;
        if (j == 0) {
            return;
        }
        N.MO7GqHLu(j, tab.getId());
    }
}

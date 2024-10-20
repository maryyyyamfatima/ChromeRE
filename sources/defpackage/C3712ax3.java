package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ax3 */
/* loaded from: classes.dex */
public final class C3712ax3 extends AbstractC11339xA0 {
    public final /* synthetic */ C4742dx3 a;

    @Override // defpackage.AbstractC11339xA0
    public final void d(int i, Tab tab) {
        C4742dx3 c4742dx3 = this.a;
        if (c4742dx3.B && tab == ((AbstractC11276wz3) c4742dx3.j).h()) {
            c4742dx3.e(tab.getId());
        }
    }

    public C3712ax3(C4742dx3 c4742dx3) {
        this.a = c4742dx3;
    }
}

package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bp1 */
/* loaded from: classes2.dex */
public final class RunnableC4006bp1 implements Runnable {
    public final /* synthetic */ C4349cp1 a;

    @Override // java.lang.Runnable
    public final void run() {
        C4349cp1 c4349cp1 = this.a;
        TabImpl tabImpl = ((C3321Zo1) c4349cp1.a).a;
        if (tabImpl.l == null) {
            return;
        }
        boolean z = tabImpl.getLaunchType() == 1;
        InterfaceC3061Xo1 interfaceC3061Xo1 = c4349cp1.a;
        if (z) {
            TK2 tk2 = ((C3321Zo1) interfaceC3061Xo1).a().b;
            if (tk2 != null && tk2.d) {
                ((C3321Zo1) interfaceC3061Xo1).a.O().finishAndRemoveTask();
            } else {
                ((C3321Zo1) interfaceC3061Xo1).a.O().moveTaskToBack(false);
            }
        }
        TabImpl tabImpl2 = ((C3321Zo1) interfaceC3061Xo1).a;
        ((AbstractC11276wz3) tabImpl2.O().s1()).e(tabImpl2);
    }

    public RunnableC4006bp1(C4349cp1 c4349cp1) {
        this.a = c4349cp1;
    }
}

package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.GestureListenerManagerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Av3 */
/* loaded from: classes.dex */
public final class C0109Av3 extends AbstractC10430uY0 {
    public final /* synthetic */ InterfaceC9744sY0 a;
    public final /* synthetic */ C0239Bv3 b;

    public C0109Av3(C0239Bv3 c0239Bv3, GestureListenerManagerImpl gestureListenerManagerImpl) {
        this.b = c0239Bv3;
        this.a = gestureListenerManagerImpl;
    }

    @Override // defpackage.AbstractC10430uY0
    public final void b(int i, int i2) {
        h();
    }

    @Override // defpackage.AbstractC10430uY0
    public final void a(int i, int i2) {
        h();
    }

    @Override // defpackage.AbstractC10430uY0
    public final void d(int i, int i2, boolean z) {
        h();
    }

    @Override // defpackage.AbstractC10430uY0
    public final void c(int i, int i2) {
        h();
        C11814ya2 P = ((TabImpl) this.b.g).P();
        while (P.hasNext()) {
            ((BA0) P.next()).getClass();
        }
    }

    public final void h() {
        InterfaceC9744sY0 interfaceC9744sY0 = this.a;
        boolean isScrollInProgress = interfaceC9744sY0 != null ? interfaceC9744sY0.isScrollInProgress() : false;
        C11814ya2 P = ((TabImpl) this.b.g).P();
        while (P.hasNext()) {
            ((BA0) P.next()).n0(isScrollInProgress);
        }
    }
}

package defpackage;

import java.util.Iterator;
import org.chromium.chrome.browser.infobar.InfoBarContainer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8793pl1 implements InterfaceC6730jl1 {
    public final /* synthetic */ InfoBarContainer a;

    @Override // defpackage.InterfaceC6730jl1
    public final void a(int i) {
        Iterator it = this.a.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6730jl1) c11814ya2.next()).a(i);
            }
        }
    }

    @Override // defpackage.InterfaceC6730jl1
    public final void b(InterfaceC2006Pl1 interfaceC2006Pl1) {
        Iterator it = this.a.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6730jl1) c11814ya2.next()).b(interfaceC2006Pl1);
            }
        }
    }

    public C8793pl1(InfoBarContainer infoBarContainer) {
        this.a = infoBarContainer;
    }
}

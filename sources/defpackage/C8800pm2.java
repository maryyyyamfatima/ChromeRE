package defpackage;

import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.password_manager.settings.PasswordUIView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pm2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8800pm2 implements InterfaceC8113nm2 {
    public PasswordUIView a;
    public final C12157za2 g = new C12157za2();

    @Override // defpackage.InterfaceC8113nm2
    public final void v(int i) {
        Object obj = ThreadUtils.a;
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8113nm2) c11814ya2.next()).v(i);
            }
        }
    }

    @Override // defpackage.InterfaceC8113nm2
    public final void y(int i) {
        Object obj = ThreadUtils.a;
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8113nm2) c11814ya2.next()).y(i);
            }
        }
    }
}

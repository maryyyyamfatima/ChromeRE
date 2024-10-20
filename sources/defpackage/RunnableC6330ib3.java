package defpackage;

import java.util.Iterator;
import org.chromium.chrome.browser.signin.SigninManagerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ib3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6330ib3 implements Runnable {
    public final /* synthetic */ SigninManagerImpl a;

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.a.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC5298fb3) c11814ya2.next()).i();
            }
        }
    }
}

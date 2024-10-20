package defpackage;

import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ff2 */
/* loaded from: classes.dex */
public final class C0678Ff2 {
    public AbstractC9101qf2 c;
    public C9537rv0 e;
    public ViewGroup f;
    public final PriorityQueue d = new PriorityQueue(3, new C0418Df2());
    public final HashSet a = new HashSet();
    public final C12157za2 b = new C12157za2();

    public final void a(AbstractC9101qf2 abstractC9101qf2, int i) {
        abstractC9101qf2.P0(i);
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0548Ef2) c11814ya2.next()).b();
            }
        }
    }
}

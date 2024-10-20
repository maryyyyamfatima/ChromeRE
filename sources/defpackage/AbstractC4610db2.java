package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: db2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4610db2 implements InterfaceC4953eb2, InterfaceC5297fb2 {
    public final InterfaceC5297fb2 a;
    public final HashSet g = new HashSet();
    public final C12157za2 h = new C12157za2();

    public abstract boolean j(OfflineItem offlineItem);

    public AbstractC4610db2(InterfaceC5297fb2 interfaceC5297fb2) {
        this.a = interfaceC5297fb2;
        interfaceC5297fb2.a(this);
    }

    public final void k() {
        HashSet hashSet = new HashSet();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            if (j(offlineItem)) {
                it.remove();
                hashSet.add(offlineItem);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it2 = this.h.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it2;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((InterfaceC4953eb2) c11814ya2.next()).d(hashSet);
                }
            }
        }
        i(this.a.h());
    }

    @Override // defpackage.InterfaceC5297fb2
    public final Collection h() {
        return this.g;
    }

    @Override // defpackage.InterfaceC5297fb2
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.InterfaceC5297fb2
    public final void a(InterfaceC4953eb2 interfaceC4953eb2) {
        this.h.a(interfaceC4953eb2);
    }

    @Override // defpackage.InterfaceC5297fb2
    public final void g(InterfaceC4953eb2 interfaceC4953eb2) {
        this.h.d(interfaceC4953eb2);
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void b(Collection collection) {
        i(collection);
    }

    @Override // defpackage.InterfaceC4953eb2
    public void d(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = ((HashSet) collection).iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            if (this.g.remove(offlineItem)) {
                hashSet.add(offlineItem);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it2;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC4953eb2) c11814ya2.next()).d(hashSet);
            }
        }
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void e(OfflineItem offlineItem, OfflineItem offlineItem2) {
        HashSet hashSet = this.g;
        boolean remove = hashSet.remove(offlineItem);
        boolean z = !j(offlineItem2);
        C12157za2 c12157za2 = this.h;
        if (remove && z) {
            hashSet.add(offlineItem2);
            Iterator it = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    return;
                } else {
                    ((InterfaceC4953eb2) c11814ya2.next()).e(offlineItem, offlineItem2);
                }
            }
        } else if (!remove && z) {
            hashSet.add(offlineItem2);
            HashSet d = AbstractC9048qW.d(offlineItem2);
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    return;
                } else {
                    ((InterfaceC4953eb2) c11814ya22.next()).b(d);
                }
            }
        } else {
            if (!remove || z) {
                return;
            }
            HashSet d2 = AbstractC9048qW.d(offlineItem);
            Iterator it3 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya23 = (C11814ya2) it3;
                if (!c11814ya23.hasNext()) {
                    return;
                } else {
                    ((InterfaceC4953eb2) c11814ya23.next()).d(d2);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void c() {
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC4953eb2) c11814ya2.next()).c();
            }
        }
    }

    public final void i(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            if (!j(offlineItem) && this.g.add(offlineItem)) {
                hashSet.add(offlineItem);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it2;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC4953eb2) c11814ya2.next()).b(hashSet);
            }
        }
    }
}

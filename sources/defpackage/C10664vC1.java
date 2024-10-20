package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10664vC1 implements InterfaceC6416iq0, InterfaceC7103kq0 {
    public LinkedList a;
    public volatile boolean g;

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.g) {
            return;
        }
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.g = true;
            LinkedList linkedList = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (linkedList == null) {
                return;
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC6416iq0) it.next()).dispose();
                } catch (Throwable th) {
                    AbstractC4148cE0.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw ZD0.a((Throwable) arrayList.get(0));
                }
                throw new M10(arrayList);
            }
        }
    }

    @Override // defpackage.InterfaceC7103kq0
    public final boolean a(InterfaceC6416iq0 interfaceC6416iq0) {
        if (interfaceC6416iq0 == null) {
            throw new NullPointerException("d is null");
        }
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    LinkedList linkedList = this.a;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.a = linkedList;
                    }
                    linkedList.add(interfaceC6416iq0);
                    return true;
                }
            }
        }
        interfaceC6416iq0.dispose();
        return false;
    }

    @Override // defpackage.InterfaceC7103kq0
    public final boolean b(InterfaceC6416iq0 interfaceC6416iq0) {
        if (!c(interfaceC6416iq0)) {
            return false;
        }
        ((RunnableC5271fW2) interfaceC6416iq0).dispose();
        return true;
    }

    @Override // defpackage.InterfaceC7103kq0
    public final boolean c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (interfaceC6416iq0 == null) {
            throw new NullPointerException("Disposable item is null");
        }
        if (this.g) {
            return false;
        }
        synchronized (this) {
            if (this.g) {
                return false;
            }
            LinkedList linkedList = this.a;
            if (linkedList != null && linkedList.remove(interfaceC6416iq0)) {
                return true;
            }
            return false;
        }
    }
}

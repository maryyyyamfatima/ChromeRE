package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BZ1 implements InterfaceC3258Zb3 {
    public final AtomicReference a;
    public final AtomicReference g;

    public BZ1() {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.g = atomicReference2;
        AZ1 az1 = new AZ1();
        atomicReference2.lazySet(az1);
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AZ1 az1 = new AZ1(obj);
        ((AZ1) this.a.getAndSet(az1)).lazySet(az1);
        return true;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return ((AZ1) this.g.get()) == ((AZ1) this.a.get());
    }

    @Override // defpackage.InterfaceC3258Zb3, defpackage.InterfaceC3586ac3
    public final Object poll() {
        AZ1 az1;
        AtomicReference atomicReference = this.g;
        AZ1 az12 = (AZ1) atomicReference.get();
        AZ1 az13 = (AZ1) az12.get();
        if (az13 == null) {
            if (az12 == ((AZ1) this.a.get())) {
                return null;
            }
            do {
                az1 = (AZ1) az12.get();
            } while (az1 == null);
            Object obj = az1.a;
            az1.a = null;
            atomicReference.lazySet(az1);
            return obj;
        }
        Object obj2 = az13.a;
        az13.a = null;
        atomicReference.lazySet(az13);
        return obj2;
    }
}

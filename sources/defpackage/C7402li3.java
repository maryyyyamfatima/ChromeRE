package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: li3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7402li3 implements InterfaceC3258Zb3 {
    public static final int n = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object o = new Object();
    public final AtomicLong a;
    public int g;
    public long h;
    public final int i;
    public AtomicReferenceArray j;
    public final int k;
    public AtomicReferenceArray l;
    public final AtomicLong m;

    public C7402li3(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        this.m = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.j = atomicReferenceArray;
        this.i = i2;
        this.g = Math.min(numberOfLeadingZeros / 4, n);
        this.l = atomicReferenceArray;
        this.k = i2;
        this.h = i2 - 1;
        atomicLong.lazySet(0L);
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.j;
        AtomicLong atomicLong = this.a;
        long j = atomicLong.get();
        int i = this.i;
        int i2 = ((int) j) & i;
        if (j < this.h) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = this.g + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.h = j2 - 1;
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.j = atomicReferenceArray2;
        this.h = (i + j) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, o);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // defpackage.InterfaceC3258Zb3, defpackage.InterfaceC3586ac3
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.l;
        AtomicLong atomicLong = this.m;
        long j = atomicLong.get();
        int i = this.k;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = obj == o;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.l = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i2);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return this.a.get() == this.m.get();
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ki3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7058ki3 extends AtomicReferenceArray implements InterfaceC3258Zb3 {
    public static final Integer k = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int a;
    public final AtomicLong g;
    public long h;
    public final AtomicLong i;
    public final int j;

    public C7058ki3(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.a = length() - 1;
        this.g = new AtomicLong();
        this.i = new AtomicLong();
        this.j = Math.min(i / 4, k.intValue());
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.g;
        long j = atomicLong.get();
        int i = this.a;
        int i2 = ((int) j) & i;
        if (j >= this.h) {
            long j2 = this.j + j;
            if (get(i & ((int) j2)) == null) {
                this.h = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // defpackage.InterfaceC3258Zb3, defpackage.InterfaceC3586ac3
    public final Object poll() {
        AtomicLong atomicLong = this.i;
        long j = atomicLong.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return this.g.get() == this.i.get();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n23, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7864n23 {
    public static final C7520m23 a = new C7520m23(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(C7520m23 c7520m23) {
        boolean z = true;
        if (!(c7520m23.f == null && c7520m23.g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c7520m23.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        C7520m23 c7520m232 = (C7520m23) atomicReference.get();
        if (c7520m232 == a) {
            return;
        }
        int i = c7520m232 != null ? c7520m232.c : 0;
        if (i >= 65536) {
            return;
        }
        c7520m23.f = c7520m232;
        c7520m23.b = 0;
        c7520m23.c = i + 8192;
        while (true) {
            if (atomicReference.compareAndSet(c7520m232, c7520m23)) {
                break;
            } else if (atomicReference.get() != c7520m232) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        c7520m23.f = null;
    }

    public static final C7520m23 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        C7520m23 c7520m23 = a;
        C7520m23 c7520m232 = (C7520m23) atomicReference.getAndSet(c7520m23);
        if (c7520m232 == c7520m23) {
            return new C7520m23();
        }
        if (c7520m232 == null) {
            atomicReference.set(null);
            return new C7520m23();
        }
        atomicReference.set(c7520m232.f);
        c7520m232.f = null;
        c7520m232.c = 0;
        return c7520m232;
    }
}

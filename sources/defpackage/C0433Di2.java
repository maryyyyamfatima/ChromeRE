package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Di2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433Di2 extends AtomicInteger implements QQ0 {
    public final InterfaceC0334Co3[] a;
    public final AtomicLongArray g;
    public final long[] h;
    public final int i;
    public final int j;
    public InterfaceC0724Fo3 k;
    public InterfaceC3586ac3 l;
    public Throwable m;
    public volatile boolean n;
    public int o;
    public volatile boolean p;
    public final AtomicInteger q = new AtomicInteger();
    public int r;
    public int s;

    public C0433Di2(InterfaceC0334Co3[] interfaceC0334Co3Arr, int i) {
        this.a = interfaceC0334Co3Arr;
        this.i = i;
        this.j = i - (i >> 2);
        int length = interfaceC0334Co3Arr.length;
        int i2 = length + length;
        AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
        this.g = atomicLongArray;
        atomicLongArray.lazySet(i2, length);
        this.h = new long[length];
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.e(this.k, interfaceC0724Fo3)) {
            this.k = interfaceC0724Fo3;
            if (interfaceC0724Fo3 instanceof CG2) {
                CG2 cg2 = (CG2) interfaceC0724Fo3;
                int e = cg2.e(7);
                if (e == 1) {
                    this.s = e;
                    this.l = cg2;
                    this.n = true;
                    e();
                    a();
                    return;
                }
                if (e == 2) {
                    this.s = e;
                    this.l = cg2;
                    e();
                    interfaceC0724Fo3.a(this.i);
                    return;
                }
            }
            this.l = new C7058ki3(this.i);
            e();
            interfaceC0724Fo3.a(this.i);
        }
    }

    public final void e() {
        InterfaceC0334Co3[] interfaceC0334Co3Arr = this.a;
        int length = interfaceC0334Co3Arr.length;
        int i = 0;
        while (i < length && !this.p) {
            int i2 = i + 1;
            this.q.lazySet(i2);
            interfaceC0334Co3Arr[i].c(new C0303Ci2(this, i, length));
            i = i2;
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        if (this.s == 0 && !this.l.offer(obj)) {
            this.k.cancel();
            onError(new DX1("Queue is full?"));
        } else {
            a();
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        this.m = th;
        this.n = true;
        a();
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        this.n = true;
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0433Di2.a():void");
    }
}

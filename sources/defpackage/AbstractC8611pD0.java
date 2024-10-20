package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8611pD0 extends L90 {
    public long h;
    public boolean i;
    public C4661dk j;

    public abstract Thread M();

    public abstract void shutdown();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean P() {
        C4661dk c4661dk = this.j;
        if (c4661dk == null) {
            return false;
        }
        int i = c4661dk.b;
        AbstractC0986Hp0 abstractC0986Hp0 = null;
        if (i != c4661dk.c) {
            ?? r3 = c4661dk.a;
            ?? r6 = r3[i];
            r3[i] = 0;
            c4661dk.b = (i + 1) & (r3.length - 1);
            if (r6 == 0) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            abstractC0986Hp0 = r6;
        }
        AbstractC0986Hp0 abstractC0986Hp02 = abstractC0986Hp0;
        if (abstractC0986Hp02 == null) {
            return false;
        }
        abstractC0986Hp02.run();
        return true;
    }

    public final void I(AbstractC0986Hp0 abstractC0986Hp0) {
        C4661dk c4661dk = this.j;
        if (c4661dk == null) {
            c4661dk = new C4661dk();
            this.j = c4661dk;
        }
        Object[] objArr = c4661dk.a;
        int i = c4661dk.c;
        objArr[i] = abstractC0986Hp0;
        int length = (objArr.length - 1) & (i + 1);
        c4661dk.c = length;
        int i2 = c4661dk.b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            AbstractC6036hk.d(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = c4661dk.a;
            int length3 = objArr3.length;
            int i3 = c4661dk.b;
            AbstractC6036hk.d(objArr3, objArr2, length3 - i3, 0, i3, 4);
            c4661dk.a = objArr2;
            c4661dk.b = 0;
            c4661dk.c = length2;
        }
    }

    public final void O(boolean z) {
        this.h = (z ? 4294967296L : 1L) + this.h;
        if (z) {
            return;
        }
        this.i = true;
    }

    public final void F() {
        long j = this.h - 4294967296L;
        this.h = j;
        if (j <= 0 && this.i) {
            shutdown();
        }
    }
}

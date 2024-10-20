package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ki1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342Ki1 extends AbstractC11175wi1 {
    public Object[] d;
    public int e;

    @Override // defpackage.AbstractC11518xi1
    public final /* bridge */ /* synthetic */ AbstractC11518xi1 a(Object obj) {
        f(obj);
        return this;
    }

    public C1342Ki1() {
        super(4);
    }

    public C1342Ki1(int i) {
        super(2);
        this.d = new Object[AbstractC1472Li1.m(2)];
    }

    public final void f(Object obj) {
        if (this.d != null) {
            int m = AbstractC1472Li1.m(this.b);
            Object[] objArr = this.d;
            if (m <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a = AbstractC7198l61.a(hashCode);
                while (true) {
                    int i = a & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        c(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        a = i + 1;
                    }
                }
            }
        }
        this.d = null;
        c(obj);
    }

    public final AbstractC1472Li1 g() {
        AbstractC1472Li1 n;
        int i = this.b;
        if (i == 0) {
            int i2 = AbstractC1472Li1.h;
            return UL2.o;
        }
        if (i == 1) {
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            int i3 = AbstractC1472Li1.h;
            return new C4629de3(obj);
        }
        if (this.d == null || AbstractC1472Li1.m(i) != this.d.length) {
            n = AbstractC1472Li1.n(this.b, this.a);
            this.b = n.size();
        } else {
            int i4 = this.b;
            Object[] objArr = this.a;
            int length = objArr.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            n = new UL2(this.e, r9.length - 1, this.b, objArr, this.d);
        }
        this.c = true;
        this.d = null;
        return n;
    }
}

package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eM0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4875eM0 implements Cloneable {
    public Object a;
    public ArrayList g = new ArrayList();

    public final int b() {
        if (this.a != null) {
            throw null;
        }
        Iterator it = this.g.iterator();
        int i = 0;
        while (it.hasNext()) {
            C11632y14 c11632y14 = (C11632y14) it.next();
            i += GV.g(c11632y14.a) + 0 + c11632y14.b.length;
        }
        return i;
    }

    public final void c(GV gv) {
        if (this.a != null) {
            throw null;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            C11632y14 c11632y14 = (C11632y14) it.next();
            gv.v(c11632y14.a);
            byte[] bArr = c11632y14.b;
            int length = bArr.length;
            ByteBuffer byteBuffer = gv.a;
            if (byteBuffer.remaining() >= length) {
                byteBuffer.put(bArr, 0, length);
            } else {
                throw new FV(byteBuffer.position(), byteBuffer.limit());
            }
        }
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4875eM0)) {
            return false;
        }
        C4875eM0 c4875eM0 = (C4875eM0) obj;
        if (this.a != null && c4875eM0.a != null) {
            throw null;
        }
        ArrayList arrayList2 = this.g;
        if (arrayList2 != null && (arrayList = c4875eM0.g) != null) {
            return arrayList2.equals(arrayList);
        }
        try {
            int b = b();
            byte[] bArr = new byte[b];
            c(new GV(bArr, 0, b));
            int b2 = c4875eM0.b();
            byte[] bArr2 = new byte[b2];
            c4875eM0.c(new GV(bArr2, 0, b2));
            return Arrays.equals(bArr, bArr2);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int hashCode() {
        try {
            int b = b();
            byte[] bArr = new byte[b];
            c(new GV(bArr, 0, b));
            return Arrays.hashCode(bArr) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4875eM0 clone() {
        C4875eM0 c4875eM0 = new C4875eM0();
        try {
            ArrayList arrayList = this.g;
            if (arrayList == null) {
                c4875eM0.g = null;
            } else {
                c4875eM0.g.addAll(arrayList);
            }
            Object obj = this.a;
            if (obj != null) {
                if (obj instanceof AbstractC8015nV1) {
                    c4875eM0.a = ((AbstractC8015nV1) obj).clone();
                } else if (obj instanceof byte[]) {
                    c4875eM0.a = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        c4875eM0.a = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        c4875eM0.a = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        c4875eM0.a = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        c4875eM0.a = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        c4875eM0.a = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        c4875eM0.a = ((double[]) obj).clone();
                    } else if (obj instanceof AbstractC8015nV1[]) {
                        AbstractC8015nV1[] abstractC8015nV1Arr = (AbstractC8015nV1[]) obj;
                        AbstractC8015nV1[] abstractC8015nV1Arr2 = new AbstractC8015nV1[abstractC8015nV1Arr.length];
                        c4875eM0.a = abstractC8015nV1Arr2;
                        while (i < abstractC8015nV1Arr.length) {
                            abstractC8015nV1Arr2[i] = abstractC8015nV1Arr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return c4875eM0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

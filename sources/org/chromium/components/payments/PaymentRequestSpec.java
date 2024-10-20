package org.chromium.components.payments;

import J.N;
import defpackage.AbstractC7094ko3;
import defpackage.C10869vo2;
import defpackage.C11212wo2;
import defpackage.C12253zq2;
import defpackage.C1730Ni0;
import defpackage.C4317ck;
import defpackage.C6755jp2;
import defpackage.C7787mp2;
import defpackage.C8697pU1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PaymentRequestSpec {
    public long a;

    public PaymentRequestSpec(C7787mp2 c7787mp2, C10869vo2 c10869vo2, Collection collection, String str) {
        ByteBuffer b = c7787mp2.b();
        ByteBuffer b2 = c10869vo2.b();
        ByteBuffer[] byteBufferArr = new ByteBuffer[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            byteBufferArr[i] = ((AbstractC7094ko3) it.next()).b();
            i++;
        }
        this.a = N.MAELBHG4(b, b2, byteBufferArr, str);
    }

    public final C7787mp2 d() {
        return C7787mp2.d(new C1730Ni0(new C8697pU1(ByteBuffer.wrap(N.Mc7EwNM$(this.a)), new ArrayList())));
    }

    public final C4317ck a() {
        C4317ck c4317ck = new C4317ck();
        for (byte[] bArr : N.MFWoiqvU(this.a)) {
            C6755jp2 d = C6755jp2.d(new C1730Ni0(new C8697pU1(ByteBuffer.wrap(bArr), new ArrayList())));
            c4317ck.put(d.b, d);
        }
        return c4317ck;
    }

    public final C4317ck b() {
        C4317ck c4317ck = new C4317ck();
        C10869vo2 c = c();
        if (c.e != null) {
            int i = 0;
            while (true) {
                C11212wo2[] c11212wo2Arr = c.e;
                if (i >= c11212wo2Arr.length) {
                    break;
                }
                C11212wo2 c11212wo2 = c11212wo2Arr[i];
                c4317ck.put(c11212wo2.d.b, c11212wo2);
                i++;
            }
        }
        return c4317ck;
    }

    public final List e() {
        List arrayList;
        C12253zq2[] c12253zq2Arr = c().d;
        if (c12253zq2Arr != null) {
            arrayList = Arrays.asList(c12253zq2Arr);
        } else {
            arrayList = new ArrayList();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final C10869vo2 c() {
        return C10869vo2.d(new C1730Ni0(new C8697pU1(ByteBuffer.wrap(N.MNkVMjnE(this.a)), new ArrayList())));
    }

    public final long getNativePointer() {
        return this.a;
    }
}

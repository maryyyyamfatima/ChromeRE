package org.chromium.mojo.system.impl;

import J.N;
import defpackage.C10416uV1;
import defpackage.C10990w90;
import defpackage.C11445xV1;
import defpackage.C8433oi2;
import defpackage.C9730sV1;
import defpackage.HY1;
import defpackage.InterfaceC7559m90;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.mojo.system.ResultAnd;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CoreImpl implements InterfaceC7559m90 {
    public final int a;

    public CoreImpl() {
        new ThreadLocal();
        this.a = N.MBIRtXF8(this, ByteBuffer.allocateDirect(8), 8);
    }

    public final C8433oi2 b(C9730sV1 c9730sV1) {
        ByteBuffer byteBuffer;
        if (c9730sV1 != null) {
            byteBuffer = a(8);
            byteBuffer.putInt(0, 8);
            byteBuffer.putInt(4, c9730sV1.a.a);
        } else {
            byteBuffer = null;
        }
        ResultAnd resultAnd = (ResultAnd) N.MZhgS7uU(this, byteBuffer);
        if (resultAnd.a != 0) {
            throw new HY1(resultAnd.a);
        }
        Object obj = resultAnd.b;
        return new C8433oi2(new C11445xV1(this, ((Long) ((C10990w90) obj).a).longValue()), new C11445xV1(this, ((Long) ((C10990w90) obj).b).longValue()));
    }

    public final ByteBuffer a(int i) {
        int i2 = this.a;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i + i2);
        if (i2 != 0) {
            allocateDirect.position(i2);
            allocateDirect = allocateDirect.slice();
        }
        return allocateDirect.order(ByteOrder.nativeOrder());
    }

    public static ResultAnd newResultAndBuffer(int i, ByteBuffer byteBuffer) {
        return new ResultAnd(i, byteBuffer);
    }

    public static ResultAnd newReadMessageResult(int i, byte[] bArr, long[] jArr) {
        C10416uV1 c10416uV1 = new C10416uV1();
        if (i == 0) {
            c10416uV1.a = bArr;
            c10416uV1.b = jArr;
        }
        return new ResultAnd(i, c10416uV1);
    }

    public static ResultAnd newResultAndInteger(int i, int i2) {
        return new ResultAnd(i, Integer.valueOf(i2));
    }

    public static ResultAnd newResultAndLong(int i, long j) {
        return new ResultAnd(i, Long.valueOf(j));
    }

    public static ResultAnd newNativeCreationResult(int i, long j, long j2) {
        return new ResultAnd(i, new C10990w90(Long.valueOf(j), Long.valueOf(j2)));
    }
}

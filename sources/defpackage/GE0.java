package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GE0 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public GE0(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }

    public GE0(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static GE0 d(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[KE0.C[3] * 1]);
        wrap.order(byteOrder);
        wrap.putShort((short) iArr[0]);
        return new GE0(wrap.array(), 3, 1);
    }

    public static GE0 b(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[KE0.C[4] * 1]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new GE0(wrap.array(), 4, 1);
    }

    public static GE0 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(KE0.L);
        return new GE0(bytes, 2, bytes.length);
    }

    public static GE0 c(IE0 ie0, ByteOrder byteOrder) {
        IE0[] ie0Arr = {ie0};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[KE0.C[5] * 1]);
        wrap.order(byteOrder);
        IE0 ie02 = ie0Arr[0];
        wrap.putInt((int) ie02.a);
        wrap.putInt((int) ie02.b);
        return new GE0(wrap.array(), 5, 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(KE0.B[this.a]);
        sb.append(", data length:");
        return AbstractC8207o22.a(sb, this.d.length, ")");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(3:91|(2:92|(1:101)(2:94|(2:97|98)(1:96)))|(1:100))|102|(2:104|(6:113|114|115|116|117|118)(3:106|(2:108|109)(2:111|112)|110))|122|115|116|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x012a, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x012b, code lost:            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0167: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:159:0x0167 */
    /* JADX WARN: Removed duplicated region for block: B:162:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [IE0[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [IE0[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable h(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GE0.h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final double e(ByteOrder byteOrder) {
        Object h = h(byteOrder);
        if (h == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (h instanceof String) {
            return Double.parseDouble((String) h);
        }
        if (h instanceof long[]) {
            if (((long[]) h).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (h instanceof int[]) {
            if (((int[]) h).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (h instanceof double[]) {
            double[] dArr = (double[]) h;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (h instanceof IE0[]) {
            IE0[] ie0Arr = (IE0[]) h;
            if (ie0Arr.length == 1) {
                IE0 ie0 = ie0Arr[0];
                return ie0.a / ie0.b;
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a double value");
    }

    public final int f(ByteOrder byteOrder) {
        Object h = h(byteOrder);
        if (h == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (h instanceof String) {
            return Integer.parseInt((String) h);
        }
        if (h instanceof long[]) {
            long[] jArr = (long[]) h;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (h instanceof int[]) {
            int[] iArr = (int[]) h;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a integer value");
    }

    public final String g(ByteOrder byteOrder) {
        Object h = h(byteOrder);
        if (h == null) {
            return null;
        }
        if (h instanceof String) {
            return (String) h;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (h instanceof long[]) {
            long[] jArr = (long[]) h;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (h instanceof int[]) {
            int[] iArr = (int[]) h;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (h instanceof double[]) {
            double[] dArr = (double[]) h;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(h instanceof IE0[])) {
            return null;
        }
        IE0[] ie0Arr = (IE0[]) h;
        while (i < ie0Arr.length) {
            sb.append(ie0Arr[i].a);
            sb.append('/');
            sb.append(ie0Arr[i].b);
            i++;
            if (i != ie0Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}

package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nV1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8015nV1 {
    protected volatile int cachedSize = -1;

    public abstract int computeSerializedSize();

    public abstract AbstractC8015nV1 mergeFrom(C12129zV c12129zV);

    public abstract void writeTo(GV gv);

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public static final AbstractC8015nV1 mergeFrom(AbstractC8015nV1 abstractC8015nV1, byte[] bArr, int i, int i2) {
        try {
            C12129zV c12129zV = new C12129zV(bArr, i, i2);
            abstractC8015nV1.mergeFrom(c12129zV);
            if (c12129zV.f == 0) {
                return abstractC8015nV1;
            }
            throw new C1257Jr1("Protocol message end-group tag did not match expected tag.");
        } catch (C1257Jr1 e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            AbstractC8359oV1.b(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    public static final void toByteArray(AbstractC8015nV1 abstractC8015nV1, byte[] bArr, int i, int i2) {
        try {
            GV gv = new GV(bArr, i, i2);
            abstractC8015nV1.writeTo(gv);
            if (gv.a.remaining() == 0) {
            } else {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final byte[] toByteArray(AbstractC8015nV1 abstractC8015nV1) {
        int serializedSize = abstractC8015nV1.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(abstractC8015nV1, bArr, 0, serializedSize);
        return bArr;
    }

    public static final AbstractC8015nV1 mergeFrom(AbstractC8015nV1 abstractC8015nV1, byte[] bArr) {
        return mergeFrom(abstractC8015nV1, bArr, 0, bArr.length);
    }

    public AbstractC8015nV1 clone() {
        return (AbstractC8015nV1) super.clone();
    }
}

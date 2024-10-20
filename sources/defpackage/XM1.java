package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import org.chromium.media.MediaCodecBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XM1 extends MediaCodecBridge {
    public final SparseArray o;
    public ByteBuffer p;

    public XM1(MediaCodec mediaCodec, int i) {
        super(mediaCodec, i, false);
        this.o = new SparseArray();
    }

    @Override // org.chromium.media.MediaCodecBridge
    public final ByteBuffer getOutputBuffer(int i) {
        return (ByteBuffer) this.o.get(i);
    }

    @Override // org.chromium.media.MediaCodecBridge
    public final void releaseOutputBuffer(int i, boolean z) {
        try {
            this.a.releaseOutputBuffer(i, z);
            this.o.remove(i);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecEncoder", "Failed to release output buffer", e);
        }
    }

    @Override // org.chromium.media.MediaCodecBridge
    public final int b(MediaCodec.BufferInfo bufferInfo, long j) {
        ByteBuffer byteBuffer;
        int i = -1;
        try {
            i = this.a.dequeueOutputBuffer(bufferInfo, j);
            if (i >= 0) {
                if ((bufferInfo.flags & 2) != 0) {
                    ByteBuffer outputBuffer = super.getOutputBuffer(i);
                    if (outputBuffer != null) {
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        this.p = allocateDirect;
                        allocateDirect.put(outputBuffer);
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        while (true) {
                            int i3 = bufferInfo.size;
                            if (i3 >= 8) {
                                i3 = 8;
                            }
                            if (i2 >= i3) {
                                break;
                            }
                            sb.append(Integer.toHexString(this.p.get(i2) & 255));
                            sb.append(" ");
                            i2++;
                        }
                        AbstractC4851eH1.d("MediaCodecEncoder", "spsData: %s", sb.toString());
                        this.a.releaseOutputBuffer(i, false);
                        i = this.a.dequeueOutputBuffer(bufferInfo, j);
                    } else {
                        throw new IllegalStateException("Got null output buffer");
                    }
                }
            }
            if (i >= 0) {
                ByteBuffer outputBuffer2 = super.getOutputBuffer(i);
                if (outputBuffer2 != null) {
                    outputBuffer2.position(bufferInfo.offset);
                    outputBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                    boolean z = (bufferInfo.flags & 1) != 0;
                    SparseArray sparseArray = this.o;
                    if (z && (byteBuffer = this.p) != null) {
                        byteBuffer.capacity();
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.p.capacity() + bufferInfo.size);
                        this.p.rewind();
                        allocateDirect2.put(this.p);
                        allocateDirect2.put(outputBuffer2);
                        allocateDirect2.rewind();
                        bufferInfo.offset = 0;
                        bufferInfo.size += this.p.capacity();
                        sparseArray.put(i, allocateDirect2);
                    } else {
                        sparseArray.put(i, outputBuffer2);
                    }
                } else {
                    throw new IllegalStateException("Got null output buffer");
                }
            }
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("MediaCodecEncoder", "Failed to dequeue output buffer", e);
        }
        return i;
    }
}

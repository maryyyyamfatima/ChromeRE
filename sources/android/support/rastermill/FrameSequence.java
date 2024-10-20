package android.support.rastermill;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FrameSequence {
    public static native long nativeCreateState(long j);

    public static native FrameSequence nativeDecodeByteArray(byte[] bArr, int i, int i2);

    public static native FrameSequence nativeDecodeByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    public static native FrameSequence nativeDecodeStream(InputStream inputStream, byte[] bArr);

    public static native void nativeDestroyFrameSequence(long j);

    public static native void nativeDestroyState(long j);

    public static native long nativeGetFrame(long j, int i, Bitmap bitmap, int i2);

    static {
        System.loadLibrary("framesequence");
    }

    public final void finalize() {
        super.finalize();
    }
}

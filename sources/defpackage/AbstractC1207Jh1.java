package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1207Jh1 {
    public static ImageHeaderParser$ImageType b(C3492aK1 c3492aK1, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new SI2(inputStream, c3492aK1);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType c = ((InterfaceC0947Hh1) list.get(i)).c(inputStream);
                inputStream.reset();
                if (c != ImageHeaderParser$ImageType.UNKNOWN) {
                    return c;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType c(ByteBuffer byteBuffer, List list) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType a = ((InterfaceC0947Hh1) list.get(i)).a(byteBuffer);
                RD.c(byteBuffer);
                if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a;
                }
            } catch (Throwable th) {
                RD.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int a(C3492aK1 c3492aK1, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new SI2(inputStream, c3492aK1);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int d = ((InterfaceC0947Hh1) list.get(i)).d(inputStream, c3492aK1);
                if (d != -1) {
                    return d;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }
}

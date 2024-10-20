package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rm3 */
/* loaded from: classes.dex */
public final class C2273Rm3 implements RO2 {
    public final List a;
    public final RO2 b;
    public final C3492aK1 c;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) c0543Ee2.c(AbstractC9749sZ0.b)).booleanValue()) {
            if (AbstractC1207Jh1.b(this.c, inputStream, this.a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i, i2, c0543Ee2);
    }

    public C2273Rm3(ArrayList arrayList, MD md, C3492aK1 c3492aK1) {
        this.a = arrayList;
        this.b = md;
        this.c = c3492aK1;
    }
}

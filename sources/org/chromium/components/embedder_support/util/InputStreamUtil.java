package org.chromium.components.embedder_support.util;

import android.util.Log;
import defpackage.AbstractC4199cO1;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InputStreamUtil {
    public static String a(String str) {
        return AbstractC4199cO1.a("Got exception when calling ", str, "() on an InputStream returned from shouldInterceptRequest. This will cause the related request to fail.");
    }

    public static void close(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            Log.e("InputStreamUtil", a("close"), e);
        }
    }

    public static int available(InputStream inputStream) {
        try {
            return Math.max(-1, inputStream.available());
        } catch (IOException e) {
            Log.e("InputStreamUtil", a("available"), e);
            return -2;
        }
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return Math.max(-1, inputStream.read(bArr, i, i2));
        } catch (IOException e) {
            Log.e("InputStreamUtil", a("read"), e);
            return -2;
        }
    }

    public static long skip(InputStream inputStream, long j) {
        try {
            return Math.max(-1L, inputStream.skip(j));
        } catch (IOException e) {
            Log.e("InputStreamUtil", a("skip"), e);
            return -2L;
        }
    }
}

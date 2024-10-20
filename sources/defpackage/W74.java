package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class W74 {
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public static U74 a(String str) {
        List arrayList = new ArrayList();
        if (str.length() > 0) {
            arrayList = Arrays.asList(str.split("\\s*,\\s*"));
        }
        int indexOf = arrayList.indexOf("x-bm");
        int indexOf2 = arrayList.indexOf("gzip");
        ?? r5 = indexOf >= 0 ? 1 : 0;
        ?? r3 = indexOf2 < 0 ? 0 : 1;
        if (r5 + r3 != arrayList.size()) {
            throw new V74(AbstractC4199cO1.a("Unrecognized instance manipulations in ", str, "; only x-bm and gzip are supported"));
        }
        if (r5 != 0 && r3 != 0 && indexOf > indexOf2) {
            throw new V74("Unsupported instance manipulations order: expected x-bm,gzip, but received gzip,x-bm");
        }
        return new U74(r3, r5);
    }

    public static byte[] b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }
}

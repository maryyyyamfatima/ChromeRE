package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.HttpURLConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11455xX1 {
    public final InterfaceC4946ea1 a = new C5290fa1();

    public static void a(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", str));
    }

    public static String b(File file) {
        FileReader fileReader = new FileReader(file);
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null || readLine.trim().isEmpty()) {
                    throw new RuntimeException("File does not have a MIME boundary");
                }
                String trim = readLine.trim();
                if (!trim.startsWith("--") || trim.length() < 10) {
                    throw new RuntimeException("File does not have a MIME boundary");
                }
                if (!trim.matches("^[a-zA-Z0-9-]*$")) {
                    throw new RuntimeException("File has an illegal MIME boundary: ".concat(trim));
                }
                String substring = trim.substring(2);
                bufferedReader.close();
                fileReader.close();
                return substring;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                fileReader.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }
}

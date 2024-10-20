package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vn4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10865vn4 {
    public static final Object a = new Object();
    public static SecretKey b;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static javax.crypto.spec.SecretKeySpec c(android.content.Context r10) {
        /*
            java.lang.String r0 = "HmacSHA256"
            java.lang.String r1 = "Could not close key input stream '"
            java.lang.String r2 = "': "
            java.lang.String r3 = "WebappAuthenticator"
            java.lang.String r4 = "Could not read key from '"
            java.lang.String r5 = "webapp-authenticator"
            java.io.File r10 = r10.getFileStreamPath(r5)
            r5 = 0
            long r6 = r10.length()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r8 = 32
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r0.append(r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r6 = "': invalid file contents"
            r0.append(r6)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            return r5
        L30:
            r6 = 32
            byte[] r7 = new byte[r6]     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            int r9 = r8.read(r7)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lcd
            if (r6 == r9) goto L5a
            r8.close()     // Catch: java.io.IOException -> L43
            goto L59
        L43:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r10)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r10 = r4.toString()
            android.util.Log.e(r3, r10)
        L59:
            return r5
        L5a:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.IllegalArgumentException -> L7a java.lang.Exception -> L95 java.lang.Throwable -> Lcd
            r6.<init>(r7, r0)     // Catch: java.lang.IllegalArgumentException -> L7a java.lang.Exception -> L95 java.lang.Throwable -> Lcd
            r8.close()     // Catch: java.io.IOException -> L63
            goto L79
        L63:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r10)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r10 = r4.toString()
            android.util.Log.e(r3, r10)
        L79:
            return r6
        L7a:
            r8.close()     // Catch: java.io.IOException -> L7e
            goto L94
        L7e:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r10)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r10 = r4.toString()
            android.util.Log.e(r3, r10)
        L94:
            return r5
        L95:
            r0 = move-exception
            goto L9b
        L97:
            r0 = move-exception
            goto Lcf
        L99:
            r0 = move-exception
            r8 = r5
        L9b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lcd
            r6.append(r10)     // Catch: java.lang.Throwable -> Lcd
            r6.append(r2)     // Catch: java.lang.Throwable -> Lcd
            r6.append(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lcd
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> Lcd
            if (r8 == 0) goto Lcc
            r8.close()     // Catch: java.io.IOException -> Lb6
            goto Lcc
        Lb6:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r10)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r10 = r4.toString()
            android.util.Log.e(r3, r10)
        Lcc:
            return r5
        Lcd:
            r0 = move-exception
            r5 = r8
        Lcf:
            if (r5 == 0) goto Leb
            r5.close()     // Catch: java.io.IOException -> Ld5
            goto Leb
        Ld5:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r10)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r10 = r5.toString()
            android.util.Log.e(r3, r10)
        Leb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10865vn4.c(android.content.Context):javax.crypto.spec.SecretKeySpec");
    }

    public static boolean d(Context context, SecretKey secretKey) {
        FileOutputStream fileOutputStream;
        File fileStreamPath = context.getFileStreamPath("webapp-authenticator");
        byte[] encoded = secretKey.getEncoded();
        if (32 != encoded.length) {
            Log.e("WebappAuthenticator", "writeKeyToFile got key encoded bytes length " + encoded.length + "; expected 32");
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(fileStreamPath);
                try {
                    fileOutputStream.write(encoded);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e) {
                        Log.e("WebappAuthenticator", "Could not close key output stream '" + fileStreamPath + "': " + e);
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    Log.e("WebappAuthenticator", "Could not write key to '" + fileStreamPath + "': " + e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                            Log.e("WebappAuthenticator", "Could not close key output stream '" + fileStreamPath + "': " + e3);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            Log.e("WebappAuthenticator", "Could not close key output stream '" + fileStreamPath + "': " + e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public static SecretKey a() {
        synchronized (a) {
            SecretKey secretKey = b;
            if (secretKey != null) {
                return secretKey;
            }
            Context context = V60.a;
            SecretKeySpec c = c(context);
            if (c != null) {
                b = c;
                return c;
            }
            SecretKey secretKey2 = b;
            if (secretKey2 == null) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
                    keyGenerator.init(256, new SecureRandom());
                    secretKey2 = keyGenerator.generateKey();
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
            b = secretKey2;
            if (!d(context, secretKey2)) {
                b = null;
                return null;
            }
            return b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] b(java.lang.String r4) {
        /*
            r0 = 0
            javax.crypto.SecretKey r1 = a()     // Catch: java.security.GeneralSecurityException -> L12
            if (r1 != 0) goto L8
            goto L1a
        L8:
            java.lang.String r2 = "HmacSHA256"
            javax.crypto.Mac r2 = javax.crypto.Mac.getInstance(r2)     // Catch: java.security.GeneralSecurityException -> L12
            r2.init(r1)     // Catch: java.security.GeneralSecurityException -> L12
            goto L1b
        L12:
            r1 = move-exception
            java.lang.String r2 = "WebappAuthenticator"
            java.lang.String r3 = "Error in creating MAC instance"
            android.util.Log.w(r2, r3, r1)
        L1a:
            r2 = r0
        L1b:
            if (r2 != 0) goto L1e
            return r0
        L1e:
            byte[] r4 = defpackage.AbstractC9771sd.b(r4)
            byte[] r4 = r2.doFinal(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10865vn4.b(java.lang.String):byte[]");
    }
}

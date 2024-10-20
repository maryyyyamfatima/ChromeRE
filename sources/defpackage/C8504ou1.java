package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ou1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8504ou1 {
    public static C7816mu1 a(Context context, String str) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            C7816mu1 c7816mu1 = new C7816mu1(keyPairGenerator.generateKeyPair(), System.currentTimeMillis());
            try {
                C7816mu1 e = e(context, str);
                if (e != null) {
                    return e;
                }
            } catch (C8160nu1 unused) {
            }
            g(context, str, c7816mu1);
            h(context, str, c7816mu1);
            return c7816mu1;
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static KeyPair c(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("InstanceID", "Invalid key stored ".concat(String.valueOf(e)));
                throw new C8160nu1(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C8160nu1(e2);
        }
    }

    public static C7816mu1 e(Context context, String str) {
        C7816mu1 d;
        try {
            File b = b(context, str);
            if (b.exists()) {
                try {
                    d = d(b);
                } catch (IOException e) {
                    if (Log.isLoggable("InstanceID", 3)) {
                        String.valueOf(e);
                    }
                    try {
                        d = d(b);
                    } catch (IOException e2) {
                        Log.w("InstanceID", "IID file exists, but failed to read from it: ".concat(String.valueOf(e2)));
                        throw new C8160nu1(e2);
                    }
                }
            } else {
                d = null;
            }
        } catch (C8160nu1 e3) {
            e = e3;
        }
        if (d != null) {
            h(context, str, d);
            return d;
        }
        e = null;
        try {
            C7816mu1 f = f(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (f != null) {
                g(context, str, f);
                return f;
            }
        } catch (C8160nu1 e4) {
            e = e4;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    public static void g(Context context, String str, C7816mu1 c7816mu1) {
        KeyPair keyPair = c7816mu1.a;
        try {
            File b = b(context, str);
            b.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
            properties.setProperty("pri", Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
            properties.setProperty("cre", String.valueOf(c7816mu1.b));
            FileOutputStream fileOutputStream = new FileOutputStream(b);
            try {
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            Log.w("InstanceID", "Failed to write key: ".concat(String.valueOf(e)));
        }
    }

    public static File b(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                str2 = "com.google.InstanceId_" + Base64.encodeToString(str.getBytes("UTF-8"), 11) + ".properties";
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        Object obj = Y50.a;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        return new File(noBackupFilesDir, str2);
    }

    public static C7816mu1 d(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("pub");
            String property2 = properties.getProperty("pri");
            if (property != null && property2 != null) {
                try {
                    C7816mu1 c7816mu1 = new C7816mu1(c(property, property2), Long.parseLong(properties.getProperty("cre")));
                    fileInputStream.close();
                    return c7816mu1;
                } catch (NumberFormatException e) {
                    throw new C8160nu1(e);
                }
            }
            fileInputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static C7816mu1 f(SharedPreferences sharedPreferences, String str) {
        long parseLong;
        String string = sharedPreferences.getString(C10858vm3.b(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C10858vm3.b(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair c = c(string, string2);
        String string3 = sharedPreferences.getString(C10858vm3.b(str, "cre"), null);
        if (string3 != null) {
            try {
                parseLong = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new C7816mu1(c, parseLong);
        }
        parseLong = 0;
        return new C7816mu1(c, parseLong);
    }

    public static void h(Context context, String str, C7816mu1 c7816mu1) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (c7816mu1.equals(f(sharedPreferences, str))) {
                return;
            }
        } catch (C8160nu1 unused) {
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String b = C10858vm3.b(str, "|P|");
        KeyPair keyPair = c7816mu1.a;
        edit.putString(b, Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        edit.putString(C10858vm3.b(str, "|K|"), Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        edit.putString(C10858vm3.b(str, "cre"), String.valueOf(c7816mu1.b));
        edit.commit();
    }
}

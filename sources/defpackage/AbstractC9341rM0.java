package defpackage;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rM0 */
/* loaded from: classes.dex */
public abstract class AbstractC9341rM0 {
    public static IOException a(C3694au3 c3694au3, Uri uri, IOException iOException) {
        try {
            C11719yH2 c11719yH2 = new C11719yH2();
            c11719yH2.a = true;
            File file = (File) c11719yH2.a(c3694au3.a(uri));
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return c(file, iOException);
                        }
                        return c(file, iOException);
                    }
                    if (file.canWrite()) {
                        return c(file, iOException);
                    }
                    return c(file, iOException);
                }
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return c(file, iOException);
                    }
                    return c(file, iOException);
                }
                if (file.canWrite()) {
                    return c(file, iOException);
                }
                return c(file, iOException);
            }
            return c(file, iOException);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static IOException c(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return b(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return b(file, iOException);
                    }
                    return b(file, iOException);
                }
                if (parentFile.canWrite()) {
                    return b(file, iOException);
                }
                return b(file, iOException);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return b(file, iOException);
                }
                return b(file, iOException);
            }
            if (parentFile.canWrite()) {
                return b(file, iOException);
            }
            return b(file, iOException);
        }
        return b(file, iOException);
    }

    public static IOException b(File file, IOException iOException) {
        String str;
        try {
            Locale locale = Locale.US;
            str = "Inoperable file:" + String.format(locale, " canonical[%s] freeSpace[%d]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()));
            try {
                str = str + String.format(locale, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            str = "Inoperable file: failed";
        }
        return new IOException(str, iOException);
    }
}

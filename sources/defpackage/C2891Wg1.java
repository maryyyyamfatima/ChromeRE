package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2891Wg1 implements Closeable {
    public final URL a;
    public volatile Future g;
    public AF3 h;

    public C2891Wg1(URL url) {
        this.a = url;
    }

    public final Bitmap b() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.a;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: ".concat(String.valueOf(url)));
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] b = UD.b(new TD(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = b.length;
                String.valueOf(url);
            }
            if (b.length <= 1048576) {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
                if (decodeByteArray == null) {
                    throw new IOException("Failed to decode image: ".concat(String.valueOf(url)));
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String.valueOf(url);
                }
                return decodeByteArray;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.cancel(true);
    }
}

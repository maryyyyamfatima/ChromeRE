package defpackage;

import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore$Downloads;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5832h73 {
    public static File g() {
        return new File(AbstractC8540p04.c(V60.a), "screenshot");
    }

    public static void e(final byte[] bArr, String str, Callback callback) {
        if (bArr.length == 0) {
            AbstractC4851eH1.f("share", "Share failed -- Received image contains no data.", new Object[0]);
        } else {
            h(String.valueOf(System.currentTimeMillis()), new W63(callback), new InterfaceC5144f73() { // from class: Q63
                @Override // defpackage.InterfaceC5144f73
                public final void a(FileOutputStream fileOutputStream, C3770b73 c3770b73) {
                    fileOutputStream.write(bArr);
                    c3770b73.onResult(Boolean.TRUE);
                }
            }, str);
        }
    }

    public static void d(String str, final Bitmap bitmap, Callback callback) {
        h(str, new X63(callback), new InterfaceC5144f73() { // from class: S63
            @Override // defpackage.InterfaceC5144f73
            public final void a(FileOutputStream fileOutputStream, C3770b73 c3770b73) {
                Bitmap bitmap2 = bitmap;
                bitmap2.compress(bitmap2.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                c3770b73.onResult(Boolean.TRUE);
            }
        }, bitmap.hasAlpha() ? ".png" : ".jpg");
    }

    public static boolean b(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.HARDWARE;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [U63] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T63] */
    public static void h(final String str, final InterfaceC5488g73 interfaceC5488g73, InterfaceC5144f73 interfaceC5144f73, String str2) {
        final ?? r5 = new Callback() { // from class: T63
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final Uri uri = (Uri) obj;
                QF3 qf3 = AbstractC5103f04.a;
                final String str3 = str;
                final InterfaceC5488g73 interfaceC5488g732 = InterfaceC5488g73.this;
                PostTask.c(qf3, new Runnable(uri, str3, interfaceC5488g732) { // from class: V63
                    public final /* synthetic */ Uri a;
                    public final /* synthetic */ InterfaceC5488g73 g;

                    {
                        this.g = interfaceC5488g732;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Uri uri2 = this.a;
                        InterfaceC5488g73 interfaceC5488g733 = this.g;
                        if (uri2 == null) {
                            interfaceC5488g733.b();
                        } else {
                            if (ApplicationStatus.getStateForApplication() == 4) {
                                return;
                            }
                            interfaceC5488g733.a(uri2);
                        }
                    }
                });
            }
        };
        PostTask.c(QF3.h, new RunnableC4113c73(str, str2, interfaceC5144f73, new Callback() { // from class: U63
            public final /* synthetic */ boolean a = true;

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                AbstractC5832h73.a(this.a, r5, (File) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, r5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [org.chromium.base.Callback] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    public static void a(boolean z, Callback callback, File file) {
        Uri b;
        OutputStream outputStream;
        OutputStream outputStream2;
        if (!z) {
            if (Build.VERSION.SDK_INT < 29) {
                String name = file.getName();
                b = ((DownloadManager) V60.a.getSystemService("download")).getUriForDownloadedFile(AbstractC6091ht0.a(name, name, f(file), file.getPath(), file.length(), null, null));
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", file.getName());
                contentValues.put("mime_type", f(file));
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                ContentResolver contentResolver = V60.a.getContentResolver();
                b = contentResolver.insert(MediaStore$Downloads.EXTERNAL_CONTENT_URI, contentValues);
                OutputStream outputStream3 = null;
                try {
                    ?? fileInputStream = new FileInputStream(file);
                    if (b != null) {
                        try {
                            outputStream3 = contentResolver.openOutputStream(b);
                        } catch (IOException unused) {
                            outputStream2 = outputStream3;
                            outputStream3 = fileInputStream;
                            AbstractC2663Um3.a(outputStream3);
                            AbstractC2663Um3.a(outputStream2);
                            callback.onResult(b);
                        } catch (Throwable th) {
                            th = th;
                            outputStream = outputStream3;
                            outputStream3 = fileInputStream;
                            AbstractC2663Um3.a(outputStream3);
                            AbstractC2663Um3.a(outputStream);
                            throw th;
                        }
                    }
                    if (outputStream3 != null) {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                outputStream3.write(bArr, 0, read);
                            }
                        }
                    }
                    file.delete();
                    AbstractC2663Um3.a(fileInputStream);
                    AbstractC2663Um3.a(outputStream3);
                } catch (IOException unused2) {
                    outputStream2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            }
        } else {
            b = AbstractC7974nN0.b(file);
        }
        callback.onResult(b);
    }

    public static File c(String str, String str2, boolean z) {
        File g = g();
        if (!g.exists() && !g.mkdir()) {
            return null;
        }
        if (z) {
            return File.createTempFile(str, str2, g);
        }
        File file = new File("", AbstractC7848n0.a(str, str2));
        int i = 0;
        while (file.exists()) {
            StringBuilder a = AbstractC10761vV3.a(str);
            i++;
            a.append(String.format(Locale.getDefault(), " (%d)", Integer.valueOf(i)));
            a.append(str2);
            file = new File("", a.toString());
        }
        file.createNewFile();
        return file;
    }

    public static String f(File file) {
        String name;
        int lastIndexOf;
        String str = "";
        if (file != null && (lastIndexOf = (name = file.getName()).lastIndexOf(".")) != -1) {
            str = name.substring(lastIndexOf);
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        lowerCase.getClass();
        return !lowerCase.equals("png") ? "image/jpeg" : "image/png";
    }
}

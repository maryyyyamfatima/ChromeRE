package defpackage;

import J.N;
import android.net.Uri;
import android.util.Base64InputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.chromium.media.MediaPlayerBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qO1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9010qO1 extends AbstractC0185Bl {
    public final String h;
    public File i;
    public final /* synthetic */ MediaPlayerBridge j;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Boolean bool = (Boolean) obj;
        if (h()) {
            n();
            return;
        }
        boolean booleanValue = bool.booleanValue();
        MediaPlayerBridge mediaPlayerBridge = this.j;
        if (booleanValue) {
            try {
                mediaPlayerBridge.a().setDataSource(V60.a, Uri.fromFile(this.i));
            } catch (IOException unused) {
                bool = Boolean.FALSE;
            }
        }
        n();
        N.Mo4Rd8TE(mediaPlayerBridge.c, mediaPlayerBridge, bool.booleanValue());
    }

    public C9010qO1(MediaPlayerBridge mediaPlayerBridge, String str) {
        this.j = mediaPlayerBridge;
        this.h = str;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                this.i = File.createTempFile("decoded", "mediadata");
                fileOutputStream = new FileOutputStream(this.i);
                try {
                    Base64InputStream base64InputStream = new Base64InputStream(new ByteArrayInputStream(AbstractC9771sd.b(this.h)), 0);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = base64InputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            base64InputStream.close();
                            Boolean bool = Boolean.TRUE;
                            AbstractC2663Um3.a(fileOutputStream);
                            return bool;
                        }
                    }
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    Boolean bool2 = Boolean.FALSE;
                    AbstractC2663Um3.a(fileOutputStream2);
                    return bool2;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC2663Um3.a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                fileOutputStream = fileOutputStream2;
                th = th3;
            }
        } catch (IOException unused2) {
        }
    }

    public final void n() {
        File file = this.i;
        if (file == null || file.delete()) {
            return;
        }
        AbstractC4851eH1.a("media", "Failed to delete temporary file: " + this.i, new Object[0]);
    }
}

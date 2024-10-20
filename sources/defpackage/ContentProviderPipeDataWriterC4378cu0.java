package defpackage;

import android.content.ContentProvider;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ContentProviderPipeDataWriterC4378cu0 implements ContentProvider.PipeDataWriter {
    @Override // android.content.ContentProvider.PipeDataWriter
    public final void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor, Uri uri, String str, Bundle bundle, Object obj) {
        byte[] bArr = (byte[]) obj;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
            if (bArr != null) {
                try {
                    fileOutputStream.write(bArr);
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused2) {
        }
    }
}

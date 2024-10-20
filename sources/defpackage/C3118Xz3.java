package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xz3 */
/* loaded from: classes.dex */
public final class C3118Xz3 extends AbstractC1649Ms {
    public final /* synthetic */ String h;
    public final /* synthetic */ C9284rA3 i;

    public C3118Xz3(C9284rA3 c9284rA3, String str) {
        this.i = c9284rA3;
        this.h = str;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder("Starting to fetch tab list for ");
        String str = this.h;
        sb.append(str);
        AbstractC4851eH1.d("tabmodel", sb.toString(), new Object[0]);
        File file = new File(this.i.g(), str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            AbstractC4851eH1.d("tabmodel", "State file does not exist.", new Object[0]);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            AbstractC2663Um3.a(fileInputStream2);
            throw th;
        }
        try {
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                AbstractC2663Um3.a(fileInputStream);
                AbstractC4851eH1.d("tabmodel", "Finished fetching tab list.", new Object[0]);
                return new DataInputStream(new ByteArrayInputStream(bArr));
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC2663Um3.a(fileInputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            AbstractC4851eH1.a("tabmodel", "Could not read state file.", e);
            AbstractC2663Um3.a(fileInputStream);
            return null;
        }
    }
}

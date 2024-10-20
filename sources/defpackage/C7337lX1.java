package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7337lX1 implements FileFilter {
    public final HashSet a = new HashSet();
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public final MimeTypeMap d;
    public final boolean e;
    public final boolean f;

    public C7337lX1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).trim().toLowerCase(Locale.US);
            if (lowerCase.startsWith(".")) {
                this.a.add(lowerCase.substring(1));
            } else if (lowerCase.equals("*/*")) {
                this.e = true;
            } else if (lowerCase.endsWith("/*")) {
                this.c.add(lowerCase.substring(0, lowerCase.length() - 2));
            } else if (lowerCase.contains("/")) {
                this.b.add(lowerCase);
            }
        }
        this.d = MimeTypeMap.getSingleton();
        this.f = true;
    }

    public final boolean a(Uri uri, String str) {
        if (uri != null) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            Locale locale = Locale.US;
            String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
            if (this.a.contains(lowerCase)) {
                return true;
            }
            if (str == null) {
                String mimeTypeFromExtension = this.d.getMimeTypeFromExtension(lowerCase);
                str = mimeTypeFromExtension != null ? mimeTypeFromExtension.toLowerCase(locale) : null;
            }
        }
        return str != null && (this.e || this.b.contains(str) || this.c.contains(str.split("/", 2)[0]));
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isDirectory()) {
            return this.f;
        }
        return a(Uri.fromFile(file), null);
    }
}

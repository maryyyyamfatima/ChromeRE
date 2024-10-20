package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6778jt1 implements InterfaceC0090As {
    @Override // defpackage.InterfaceC0090As
    public final String name() {
        return "file";
    }

    @Override // defpackage.InterfaceC0090As
    public final void a(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new GK1("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new GK1("Did not expect uri to have query");
        }
        if (!TextUtils.isEmpty(uri.getAuthority())) {
            throw new GK1("Did not expect uri to have authority");
        }
        File file = new File(uri.getPath());
        if (file.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (file.delete()) {
            return;
        }
        if (!file.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.InterfaceC0090As
    public final boolean b(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new GK1("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new GK1("Did not expect uri to have query");
        }
        if (!TextUtils.isEmpty(uri.getAuthority())) {
            throw new GK1("Did not expect uri to have authority");
        }
        return new File(uri.getPath()).exists();
    }

    @Override // defpackage.InterfaceC0090As
    public final C0350Cs d(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new GK1("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new GK1("Did not expect uri to have query");
        }
        if (!TextUtils.isEmpty(uri.getAuthority())) {
            throw new GK1("Did not expect uri to have authority");
        }
        File file = new File(uri.getPath());
        AbstractC8318oN0.a(file);
        return new C0350Cs(new FileOutputStream(file), file);
    }

    @Override // defpackage.InterfaceC0090As
    public final C0220Bs e(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new GK1("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new GK1("Did not expect uri to have query");
        }
        if (!TextUtils.isEmpty(uri.getAuthority())) {
            throw new GK1("Did not expect uri to have authority");
        }
        File file = new File(uri.getPath());
        return new C0220Bs(new FileInputStream(file), file);
    }

    @Override // defpackage.InterfaceC0090As
    public final File f(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new GK1("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new GK1("Did not expect uri to have query");
        }
        if (!TextUtils.isEmpty(uri.getAuthority())) {
            throw new GK1("Did not expect uri to have authority");
        }
        return new File(uri.getPath());
    }

    @Override // defpackage.InterfaceC0090As
    public final void c(Uri uri, Uri uri2) {
        File a = AbstractC7286lN0.a(uri);
        File a2 = AbstractC7286lN0.a(uri2);
        AbstractC8318oN0.a(a2);
        if (!a.renameTo(a2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}

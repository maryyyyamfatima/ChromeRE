package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a9 */
/* loaded from: classes.dex */
public final class C3434a9 implements InterfaceC0090As {
    public final Context a;
    public String e;
    public final Object d = new Object();
    public final C6778jt1 b = new C6778jt1();
    public final KH c = new KH();

    @Override // defpackage.InterfaceC0090As
    public final String name() {
        return "android";
    }

    public C3434a9(Z8 z8) {
        this.a = z8.a;
    }

    @Override // defpackage.InterfaceC0090As
    public final void c(Uri uri, Uri uri2) {
        this.b.c(h(uri), h(uri2));
    }

    @Override // defpackage.InterfaceC0090As
    public final void a(Uri uri) {
        this.b.a(h(uri));
    }

    @Override // defpackage.InterfaceC0090As
    public final C0350Cs d(Uri uri) {
        return this.b.d(h(uri));
    }

    @Override // defpackage.InterfaceC0090As
    public final C0220Bs e(Uri uri) {
        if (!g(uri)) {
            return this.b.e(h(uri));
        }
        throw new ZM0("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.InterfaceC0090As
    public final boolean b(Uri uri) {
        if (!g(uri)) {
            return this.b.b(h(uri));
        }
        throw new ZM0("Android backend cannot perform remote operations without a remote backend");
    }

    public final boolean g(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.InterfaceC0090As
    public final File f(Uri uri) {
        char c;
        File externalFilesDir;
        String str;
        Context createDeviceProtectedStorageContext;
        Account account;
        Context createDeviceProtectedStorageContext2;
        Context createDeviceProtectedStorageContext3;
        if (g(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.a;
        if (!uri.getScheme().equals("android")) {
            throw new GK1("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new GK1(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new GK1("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        str2.getClass();
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 94416770:
                if (str2.equals("cache")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 97434231:
                if (str2.equals("files")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 835260319:
                if (str2.equals("managed")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 991565957:
                if (str2.equals("directboot-files")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            externalFilesDir = context.getExternalFilesDir(null);
        } else if (c == 1) {
            externalFilesDir = context.getCacheDir();
        } else if (c == 2) {
            externalFilesDir = AbstractC3778b9.a(context);
        } else if (c == 3) {
            File file = new File(AbstractC3778b9.a(context), "managed");
            if (arrayList.size() >= 3) {
                try {
                    String str3 = (String) arrayList.get(2);
                    Account account2 = AbstractC10959w4.a;
                    if ("shared".equals(str3)) {
                        account = AbstractC10959w4.a;
                    } else {
                        int indexOf = str3.indexOf(58);
                        AbstractC5778gy2.a(indexOf > -1, "Malformed account", new Object[0]);
                        account = new Account(str3.substring(indexOf + 1), str3.substring(0, indexOf));
                    }
                    if (!AbstractC10959w4.a.equals(account)) {
                        throw new GK1("AccountManager cannot be null");
                    }
                } catch (IllegalArgumentException e) {
                    throw new GK1(e);
                }
            }
            externalFilesDir = file;
        } else if (c == 4) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
                externalFilesDir = createDeviceProtectedStorageContext2.getCacheDir();
            } else {
                throw new GK1(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(i)));
            }
        } else if (c == 5) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                createDeviceProtectedStorageContext3 = context.createDeviceProtectedStorageContext();
                externalFilesDir = createDeviceProtectedStorageContext3.getFilesDir();
            } else {
                throw new GK1(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(i2)));
            }
        } else {
            throw new GK1(String.format("Path must start with a valid logical location: %s", uri));
        }
        File file2 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
        KH kh = this.c;
        Context context2 = this.a;
        kh.getClass();
        if (!(!AbstractC6404io0.b() || AbstractC6404io0.a(context2))) {
            synchronized (this.d) {
                if (this.e == null) {
                    createDeviceProtectedStorageContext = this.a.createDeviceProtectedStorageContext();
                    this.e = AbstractC3778b9.a(createDeviceProtectedStorageContext).getParentFile().getAbsolutePath();
                }
                str = this.e;
            }
            if (!file2.getAbsolutePath().startsWith(str)) {
                throw new ZM0("Cannot access credential-protected data from direct boot");
            }
        }
        return file2;
    }

    public final Uri h(Uri uri) {
        if (g(uri)) {
            throw new GK1("Operation across authorities is not allowed.");
        }
        File f = f(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        RV.b(4, "initialCapacity");
        path.path(f.getAbsolutePath());
        return path.encodedFragment(AbstractC4836eE1.a(AbstractC0562Ei1.m(0, new Object[4]))).build();
    }
}

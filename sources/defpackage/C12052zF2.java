package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zF2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12052zF2 implements InterfaceC3145Yf0 {
    public static final String[] p = {"_data"};
    public final Context a;
    public final InterfaceC8030nY1 g;
    public final InterfaceC8030nY1 h;
    public final Uri i;
    public final int j;
    public final int k;
    public final C0543Ee2 l;
    public final Class m;
    public volatile boolean n;
    public volatile InterfaceC3145Yf0 o;

    public C12052zF2(Context context, InterfaceC8030nY1 interfaceC8030nY1, InterfaceC8030nY1 interfaceC8030nY12, Uri uri, int i, int i2, C0543Ee2 c0543Ee2, Class cls) {
        this.a = context.getApplicationContext();
        this.g = interfaceC8030nY1;
        this.h = interfaceC8030nY12;
        this.i = uri;
        this.j = i;
        this.k = i2;
        this.l = c0543Ee2;
        this.m = cls;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        try {
            InterfaceC3145Yf0 d = d();
            if (d == null) {
                interfaceC3015Xf0.d(new IllegalArgumentException("Failed to build fetcher for: ".concat(String.valueOf(this.i))));
                return;
            }
            this.o = d;
            if (this.n) {
                cancel();
            } else {
                d.c(enumC7567mA2, interfaceC3015Xf0);
            }
        } catch (FileNotFoundException e) {
            interfaceC3015Xf0.d(e);
        }
    }

    public final InterfaceC3145Yf0 d() {
        boolean isExternalStorageLegacy;
        C7686mY1 b;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        C0543Ee2 c0543Ee2 = this.l;
        int i = this.k;
        int i2 = this.j;
        Context context = this.a;
        if (isExternalStorageLegacy) {
            Uri uri = this.i;
            try {
                Cursor query = context.getContentResolver().query(uri, p, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: ".concat(String.valueOf(uri)));
                            }
                            File file = new File(string);
                            query.close();
                            b = this.g.b(file, i2, i, c0543Ee2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: ".concat(String.valueOf(uri)));
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            boolean z = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
            Uri uri2 = this.i;
            if (z) {
                uri2 = MediaStore.setRequireOriginal(uri2);
            }
            b = this.h.b(uri2, i2, i, c0543Ee2);
        }
        if (b != null) {
            return b.c;
        }
        return null;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
        InterfaceC3145Yf0 interfaceC3145Yf0 = this.o;
        if (interfaceC3145Yf0 != null) {
            interfaceC3145Yf0.b();
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
        this.n = true;
        InterfaceC3145Yf0 interfaceC3145Yf0 = this.o;
        if (interfaceC3145Yf0 != null) {
            interfaceC3145Yf0.cancel();
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return this.m;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}

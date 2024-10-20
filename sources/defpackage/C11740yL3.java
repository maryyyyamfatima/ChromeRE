package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yL3 */
/* loaded from: classes.dex */
public final class C11740yL3 implements InterfaceC3145Yf0 {
    public final Uri a;
    public final OL3 g;
    public InputStream h;

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
    }

    public static C11740yL3 d(Context context, Uri uri, JL3 jl3) {
        return new C11740yL3(uri, new OL3(a.b(context).h.a().d(), jl3, a.b(context).i, context.getContentResolver()));
    }

    public C11740yL3(Uri uri, OL3 ol3) {
        this.a = uri;
        this.g = ol3;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        try {
            InputStream f = f();
            this.h = f;
            interfaceC3015Xf0.f(f);
        } catch (FileNotFoundException e) {
            interfaceC3015Xf0.d(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0034, code lost:            r6.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:            if (r6 != null) goto L350;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0032, code lost:            if (r6 != null) goto L350;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:            r7 = null;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() {
        /*
            r11 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            android.net.Uri r1 = r11.a
            OL3 r2 = r11.g
            r2.getClass()
            r3 = 3
            r4 = 0
            r5 = 0
            JL3 r6 = r2.a     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L28
            android.database.Cursor r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L28
            if (r6 == 0) goto L22
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.SecurityException -> L29 java.lang.Throwable -> Lbb
            if (r7 == 0) goto L22
            java.lang.String r7 = r6.getString(r5)     // Catch: java.lang.SecurityException -> L29 java.lang.Throwable -> Lbb
            r6.close()
            goto L38
        L22:
            if (r6 == 0) goto L37
            goto L34
        L25:
            r0 = move-exception
            goto Lbd
        L28:
            r6 = r4
        L29:
            boolean r7 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto L32
            java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lbb
        L32:
            if (r6 == 0) goto L37
        L34:
            r6.close()
        L37:
            r7 = r4
        L38:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L3f
            goto L57
        L3f:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L55
            long r7 = r6.length()
            r9 = 0
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 >= 0) goto L55
            r5 = 1
        L55:
            if (r5 != 0) goto L59
        L57:
            r5 = r4
            goto L63
        L59:
            android.net.Uri r5 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r6 = r2.c     // Catch: java.lang.NullPointerException -> L9e
            java.io.InputStream r5 = r6.openInputStream(r5)     // Catch: java.lang.NullPointerException -> L9e
        L63:
            r6 = -1
            if (r5 == 0) goto L94
            r2.getClass()
            android.content.ContentResolver r7 = r2.c     // Catch: java.lang.Throwable -> L7d java.lang.Throwable -> L7f
            java.io.InputStream r4 = r7.openInputStream(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Throwable -> L7f
            java.util.List r7 = r2.d     // Catch: java.lang.Throwable -> L7d java.lang.Throwable -> L7f
            aK1 r2 = r2.b     // Catch: java.lang.Throwable -> L7d java.lang.Throwable -> L7f
            int r0 = defpackage.AbstractC1207Jh1.a(r2, r4, r7)     // Catch: java.lang.Throwable -> L7d java.lang.Throwable -> L7f
            if (r4 == 0) goto L95
            r4.close()     // Catch: java.io.IOException -> L95
            goto L95
        L7d:
            r0 = move-exception
            goto L8e
        L7f:
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L88
            java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L7d
        L88:
            if (r4 == 0) goto L94
            r4.close()     // Catch: java.io.IOException -> L94
            goto L94
        L8e:
            if (r4 == 0) goto L93
            r4.close()     // Catch: java.io.IOException -> L93
        L93:
            throw r0
        L94:
            r0 = r6
        L95:
            if (r0 == r6) goto L9d
            NE0 r1 = new NE0
            r1.<init>(r5, r0)
            r5 = r1
        L9d:
            return r5
        L9e:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "NPE opening uri: "
            java.lang.String r5 = " -> "
            java.lang.String r1 = defpackage.IR0.a(r4, r1, r5, r3)
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        Lbb:
            r0 = move-exception
            r4 = r6
        Lbd:
            if (r4 == 0) goto Lc2
            r4.close()
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11740yL3.f():java.io.InputStream");
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
        InputStream inputStream = this.h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}

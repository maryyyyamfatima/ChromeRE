package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.base.task.PostTask;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i9 */
/* loaded from: classes2.dex */
public final class C6184i9 implements InterfaceC4121c9 {
    public final Context a;
    public final C5937hS0 g;
    public final Map h;
    public final HashSet i;
    public final HashMap j;
    public final N33 k;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public static void f(int i) {
        EI2.h(i, 9, "Android.FontLookup.FetchFontResult");
    }

    public C6184i9(Context context) {
        C5937hS0 c5937hS0 = new C5937hS0();
        HashMap hashMap = new HashMap();
        hashMap.put("google sans regular", c(400, "Google Sans"));
        hashMap.put("google sans medium", c(500, "Google Sans"));
        hashMap.put("google sans bold", c(700, "Google Sans"));
        hashMap.put("noto color emoji compat", c(400, "Noto Color Emoji Compat"));
        this.j = new HashMap();
        this.k = PostTask.a(QF3.l);
        this.a = context;
        this.g = c5937hS0;
        this.h = hashMap;
        this.i = new HashSet(hashMap.keySet());
    }

    @Override // defpackage.InterfaceC4121c9
    public final void u0(C10303u9 c10303u9) {
        HashSet hashSet = this.i;
        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
        Arrays.sort(strArr);
        c10303u9.a(strArr);
    }

    @Override // defpackage.InterfaceC4121c9
    public final void j0(final String str, final C11675y9 c11675y9) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        str.getClass();
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1912833989:
                if (str.equals("google sans medium")) {
                    c = 0;
                    break;
                }
                break;
            case -1673814837:
                if (str.equals("google sans bold")) {
                    c = 1;
                    break;
                }
                break;
            case 939296989:
                if (str.equals("noto color emoji compat")) {
                    c = 2;
                    break;
                }
                break;
            case 977358742:
                if (str.equals("google sans regular")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i = 1;
                break;
        }
        EI2.h(i, 5, "Android.FontLookup.FetchFontName");
        final CoreImpl coreImpl = AbstractC10647v90.a;
        final Executor a = AbstractC9987tE0.a(coreImpl);
        this.k.b(new Runnable() { // from class: d9
            @Override // java.lang.Runnable
            public final void run() {
                final DH2 e = C6184i9.this.e(str, coreImpl);
                EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Android.FontLookup.MatchLocalFontByUniqueName.Time");
                final C11675y9 c11675y92 = c11675y9;
                a.execute(new Runnable() { // from class: g9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11675y9.this.a(e);
                    }
                });
            }
        });
    }

    @Override // defpackage.InterfaceC4121c9
    public final void Q(final C8932q9 c8932q9) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final CoreImpl coreImpl = AbstractC10647v90.a;
        final Executor a = AbstractC9987tE0.a(coreImpl);
        this.k.b(new Runnable() { // from class: e9
            @Override // java.lang.Runnable
            public final void run() {
                C6184i9 c6184i9 = C6184i9.this;
                c6184i9.getClass();
                final HashMap hashMap = new HashMap();
                HashSet hashSet = c6184i9.i;
                for (String str : (String[]) hashSet.toArray(new String[hashSet.size()])) {
                    DH2 e = c6184i9.e(str, coreImpl);
                    if (e != null) {
                        hashMap.put(str, e);
                    }
                }
                EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Android.FontLookup.FetchAllFontFiles.Time");
                final C8932q9 c8932q92 = c8932q9;
                a.execute(new Runnable() { // from class: f9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8932q9.this.a(hashMap);
                    }
                });
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.DH2 e(java.lang.String r13, defpackage.InterfaceC7559m90 r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.a
            java.util.HashMap r1 = r12.j
            java.lang.Object r2 = r1.get(r13)
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
            java.util.HashSet r3 = r12.i
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L21
            r6 = 8
            f(r6)     // Catch: java.io.IOException -> L1b
            android.os.ParcelFileDescriptor r0 = r2.dup()     // Catch: java.io.IOException -> L1b
            goto Laf
        L1b:
            defpackage.AbstractC2663Um3.a(r2)
            r1.remove(r13)
        L21:
            java.util.Map r2 = r12.h
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            r6 = 1
            if (r2 != 0) goto L31
            f(r6)
            goto Lae
        L31:
            boolean r7 = r3.contains(r13)
            if (r7 != 0) goto L3d
            r0 = 7
            f(r0)
            goto Lae
        L3d:
            LR0 r7 = new LR0
            r8 = 2130968695(0x7f040077, float:1.754605E38)
            r7.<init>(r8, r2)
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            hS0 r2 = r12.g     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            r2.getClass()     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            eS0 r2 = defpackage.JR0.a(r0, r7)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            java.lang.String r7 = "Android.FontLookup.GmsFontRequest.Time"
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            long r10 = r10 - r8
            defpackage.EI2.n(r10, r7)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            int r7 = r2.a     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            if (r7 == 0) goto L65
            r0 = 2
            f(r0)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            goto Lae
        L65:
            fS0[] r2 = r2.b     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            int r7 = r2.length     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            if (r7 == r6) goto L6f
            r0 = 3
            f(r0)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            goto Lae
        L6f:
            r2 = r2[r5]     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            int r6 = r2.e     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            if (r6 == 0) goto L7a
            r0 = 4
            f(r0)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            goto Lae
        L7a:
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            android.net.Uri r2 = r2.a     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            java.lang.String r6 = "r"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r2, r6)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            if (r0 != 0) goto L8d
            r0 = 5
            f(r0)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            goto Lae
        L8d:
            f(r5)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            java.lang.String r2 = "PrefetchAndroidFonts"
            boolean r2 = J.N.Mudil8Bg(r2)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            if (r2 == 0) goto Laf
            android.os.ParcelFileDescriptor r2 = r0.dup()     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            r1.put(r13, r2)     // Catch: java.lang.RuntimeException -> La0 java.lang.OutOfMemoryError -> La2 java.io.IOException -> La4 android.content.pm.PackageManager.NameNotFoundException -> La6
            goto Laf
        La0:
            r0 = move-exception
            goto La7
        La2:
            r0 = move-exception
            goto La7
        La4:
            r0 = move-exception
            goto La7
        La6:
            r0 = move-exception
        La7:
            r0.toString()
            r0 = 6
            f(r0)
        Lae:
            r0 = r4
        Laf:
            if (r0 != 0) goto Lb5
            r3.remove(r13)
            return r4
        Lb5:
            DH2 r13 = new DH2
            r13.<init>(r5)
            org.chromium.mojo.system.impl.CoreImpl r14 = (org.chromium.mojo.system.impl.CoreImpl) r14
            r14.getClass()
            int r0 = r0.detachFd()
            long r0 = J.N.MDMdj6cc(r0)
            W14 r2 = new W14
            r2.<init>(r14, r0)
            r13.b = r2
            r13.c = r5
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6184i9.e(java.lang.String, m90):DH2");
    }

    public static String c(int i, String str) {
        return String.format(Locale.US, "name=%s&weight=%d&besteffort=false", str, Integer.valueOf(i));
    }
}

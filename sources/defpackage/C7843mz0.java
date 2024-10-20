package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7843mz0 {
    public static final Object i = new Object();
    public static volatile C7843mz0 j;
    public final ReentrantReadWriteLock a;
    public final C5348fk b;
    public int c;
    public final Handler d;
    public final C4749dz0 e;
    public final InterfaceC6811jz0 f;
    public final boolean g;
    public final C0776Fz0 h;

    public C7843mz0(SR0 sr0) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.g = sr0.b;
        this.f = sr0.a;
        this.h = sr0.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new C5348fk(0);
        C4749dz0 c4749dz0 = new C4749dz0(this);
        this.e = c4749dz0;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (b() == 0) {
                c4749dz0.a();
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    public static C7843mz0 a() {
        C7843mz0 c7843mz0;
        synchronized (i) {
            C7843mz0 c7843mz02 = j;
            c7843mz0 = j;
        }
        return c7843mz0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:            if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:            if (java.lang.Character.isLowSurrogate(r5) != false) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007e, code lost:            if (r11 != false) goto L72;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7843mz0.c(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public final void e() {
        C5348fk c5348fk = this.b;
        ArrayList arrayList = new ArrayList();
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(c5348fk);
            c5348fk.clear();
            reentrantReadWriteLock.writeLock().unlock();
            this.d.post(new RunnableC6467iz0(arrayList, this.c, null));
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    public final void d(Throwable th) {
        C5348fk c5348fk = this.b;
        ArrayList arrayList = new ArrayList();
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(c5348fk);
            c5348fk.clear();
            reentrantReadWriteLock.writeLock().unlock();
            this.d.post(new RunnableC6467iz0(arrayList, this.c, th));
        } catch (Throwable th2) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th2;
        }
    }

    public final void g(AbstractC6125hz0 abstractC6125hz0) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i2 = this.c;
            if (i2 != 1 && i2 != 2) {
                this.b.add(abstractC6125hz0);
            }
            this.d.post(new RunnableC6467iz0(Arrays.asList(abstractC6125hz0), i2, null));
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public final int b() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.c;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0164, code lost:            return r19;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:            if (r5 != false) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:            if (r6.b(r19, r10, r0, r8.d.b) != false) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:            if (r9 != 0) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:            r9 = new android.text.SpannableString(r19);     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:            r11 = r8.d.b;        r6.a.getClass();        r9.setSpan(new defpackage.GZ3(r11), r10, r0, 33);        r12 = r12 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:            if (r12 >= r4) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0128, code lost:            if (r5 != false) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0132, code lost:            if (r6.b(r19, r10, r0, r8.c.b) != false) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0134, code lost:            if (r9 != 0) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0136, code lost:            r9 = new android.text.SpannableString(r19);     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013c, code lost:            r2 = r8.c.b;        r6.a.getClass();        r9.setSpan(new defpackage.GZ3(r2), r10, r0, 33);     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:106:0x0037, B:109:0x003c, B:111:0x0040, B:113:0x004d, B:15:0x005a, B:17:0x0062, B:19:0x0065, B:21:0x0069, B:23:0x0075, B:25:0x0078, B:29:0x0085, B:35:0x0094, B:36:0x00a3, B:41:0x00b9, B:51:0x00c7, B:56:0x00d3, B:57:0x00d8, B:59:0x00f0, B:61:0x00f7, B:64:0x00fd, B:66:0x0108, B:70:0x010e, B:72:0x0112, B:74:0x0118, B:76:0x011c, B:82:0x012a, B:85:0x0136, B:86:0x013c, B:13:0x0055), top: B:105:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0154  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(int r17, int r18, java.lang.CharSequence r19, int r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7843mz0.f(int, int, java.lang.CharSequence, int):java.lang.CharSequence");
    }
}

package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11701yE extends ImageFetcher {
    public final C11358xE b;

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void a() {
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void b() {
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final int e() {
        return 1;
    }

    public C11701yE(C0557Eh1 c0557Eh1, C11358xE c11358xE) {
        super(c0557Eh1);
        this.b = c11358xE;
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void c(final C0037Ah1 c0037Ah1, final Callback callback) {
        final long currentTimeMillis = System.currentTimeMillis();
        PostTask.c(QF3.i, new Runnable() { // from class: rE
            /* JADX WARN: Not initialized variable reg: 9, insn: 0x0063: MOVE (r3 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:19:0x0063 */
            @Override // java.lang.Runnable
            public final void run() {
                FileInputStream fileInputStream;
                Closeable closeable;
                int length;
                byte[] bArr;
                final Callback callback2 = callback;
                final long j = currentTimeMillis;
                final C11701yE c11701yE = this;
                c11701yE.getClass();
                final C0037Ah1 c0037Ah12 = c0037Ah1;
                String MDhGn9Di = N.MDhGn9Di(c11701yE.a.a, c0037Ah12.a);
                c11701yE.b.getClass();
                Closeable closeable2 = null;
                final C5070ev c5070ev = null;
                try {
                    try {
                        length = (int) new File(MDhGn9Di).length();
                        bArr = new byte[length];
                        fileInputStream = new FileInputStream(MDhGn9Di);
                    } catch (IOException e) {
                        e = e;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC2663Um3.a(closeable2);
                        throw th;
                    }
                    try {
                    } catch (IOException e2) {
                        e = e2;
                        AbstractC4851eH1.f("CachedImageFetcher", "Failed to read: %s", MDhGn9Di, e);
                        AbstractC2663Um3.a(fileInputStream);
                        PostTask.c(AbstractC5103f04.c, new Runnable() { // from class: sE
                            @Override // java.lang.Runnable
                            public final void run() {
                                final C0037Ah1 c0037Ah13 = c0037Ah12;
                                final Callback callback3 = callback2;
                                final long j2 = j;
                                final C11701yE c11701yE2 = c11701yE;
                                C0557Eh1 c0557Eh1 = c11701yE2.a;
                                C5070ev c5070ev2 = c5070ev;
                                if (c5070ev2 != null) {
                                    callback3.onResult(c5070ev2);
                                    String str = c0037Ah13.b;
                                    c11701yE2.a.getClass();
                                    N.Mlt0uwKm(str, 9);
                                    c0557Eh1.getClass();
                                    N.MNxzlAnV(c0037Ah13.b, j2);
                                    return;
                                }
                                N.Mno1Q7sp(c0557Eh1.a, 1, c0037Ah13.a, c0037Ah13.b, c0037Ah13.f, new C0297Ch1(new Callback() { // from class: vE
                                    @Override // org.chromium.base.Callback
                                    public final ZE e0(Object obj) {
                                        return new ZE(this, obj);
                                    }

                                    @Override // org.chromium.base.Callback
                                    public final void onResult(Object obj) {
                                        C11701yE c11701yE3 = c11701yE2;
                                        c11701yE3.getClass();
                                        callback3.onResult((C5070ev) obj);
                                        String str2 = c0037Ah13.b;
                                        c11701yE3.a.getClass();
                                        N.MtnQwbxo(str2, j2);
                                    }
                                }));
                            }
                        });
                    }
                    if (fileInputStream.read(bArr) == length) {
                        C5070ev c5070ev2 = new C5070ev(bArr);
                        AbstractC2663Um3.a(fileInputStream);
                        c5070ev = c5070ev2;
                        PostTask.c(AbstractC5103f04.c, new Runnable() { // from class: sE
                            @Override // java.lang.Runnable
                            public final void run() {
                                final C0037Ah1 c0037Ah13 = c0037Ah12;
                                final Callback callback3 = callback2;
                                final long j2 = j;
                                final C11701yE c11701yE2 = c11701yE;
                                C0557Eh1 c0557Eh1 = c11701yE2.a;
                                C5070ev c5070ev22 = c5070ev;
                                if (c5070ev22 != null) {
                                    callback3.onResult(c5070ev22);
                                    String str = c0037Ah13.b;
                                    c11701yE2.a.getClass();
                                    N.Mlt0uwKm(str, 9);
                                    c0557Eh1.getClass();
                                    N.MNxzlAnV(c0037Ah13.b, j2);
                                    return;
                                }
                                N.Mno1Q7sp(c0557Eh1.a, 1, c0037Ah13.a, c0037Ah13.b, c0037Ah13.f, new C0297Ch1(new Callback() { // from class: vE
                                    @Override // org.chromium.base.Callback
                                    public final ZE e0(Object obj) {
                                        return new ZE(this, obj);
                                    }

                                    @Override // org.chromium.base.Callback
                                    public final void onResult(Object obj) {
                                        C11701yE c11701yE3 = c11701yE2;
                                        c11701yE3.getClass();
                                        callback3.onResult((C5070ev) obj);
                                        String str2 = c0037Ah13.b;
                                        c11701yE3.a.getClass();
                                        N.MtnQwbxo(str2, j2);
                                    }
                                }));
                            }
                        });
                    }
                    AbstractC2663Um3.a(fileInputStream);
                    PostTask.c(AbstractC5103f04.c, new Runnable() { // from class: sE
                        @Override // java.lang.Runnable
                        public final void run() {
                            final C0037Ah1 c0037Ah13 = c0037Ah12;
                            final Callback callback3 = callback2;
                            final long j2 = j;
                            final C11701yE c11701yE2 = c11701yE;
                            C0557Eh1 c0557Eh1 = c11701yE2.a;
                            C5070ev c5070ev22 = c5070ev;
                            if (c5070ev22 != null) {
                                callback3.onResult(c5070ev22);
                                String str = c0037Ah13.b;
                                c11701yE2.a.getClass();
                                N.Mlt0uwKm(str, 9);
                                c0557Eh1.getClass();
                                N.MNxzlAnV(c0037Ah13.b, j2);
                                return;
                            }
                            N.Mno1Q7sp(c0557Eh1.a, 1, c0037Ah13.a, c0037Ah13.b, c0037Ah13.f, new C0297Ch1(new Callback() { // from class: vE
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj) {
                                    return new ZE(this, obj);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj) {
                                    C11701yE c11701yE3 = c11701yE2;
                                    c11701yE3.getClass();
                                    callback3.onResult((C5070ev) obj);
                                    String str2 = c0037Ah13.b;
                                    c11701yE3.a.getClass();
                                    N.MtnQwbxo(str2, j2);
                                }
                            }));
                        }
                    });
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = closeable;
                    AbstractC2663Um3.a(closeable2);
                    throw th;
                }
            }
        });
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void d(final C0037Ah1 c0037Ah1, final Callback callback) {
        final long currentTimeMillis = System.currentTimeMillis();
        PostTask.c(QF3.i, new Runnable() { // from class: tE
            @Override // java.lang.Runnable
            public final void run() {
                final Callback callback2 = callback;
                final long j = currentTimeMillis;
                final C11701yE c11701yE = this;
                c11701yE.getClass();
                final C0037Ah1 c0037Ah12 = c0037Ah1;
                String MDhGn9Di = N.MDhGn9Di(c11701yE.a.a, c0037Ah12.a);
                c11701yE.b.getClass();
                final Bitmap decodeFile = new File(MDhGn9Di).exists() ? BitmapFactory.decodeFile(MDhGn9Di, null) : null;
                PostTask.c(AbstractC5103f04.c, new Runnable() { // from class: uE
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        int i2;
                        final C0037Ah1 c0037Ah13 = c0037Ah12;
                        final Callback callback3 = callback2;
                        final long j2 = j;
                        final C11701yE c11701yE2 = c11701yE;
                        C0557Eh1 c0557Eh1 = c11701yE2.a;
                        Bitmap bitmap = decodeFile;
                        if (bitmap != null) {
                            if (c0037Ah13.e && (i = c0037Ah13.c) > 0 && (i2 = c0037Ah13.d) > 0 && bitmap.getWidth() != i && bitmap.getHeight() != i2) {
                                bitmap = ThumbnailUtils.extractThumbnail(bitmap, i, i2, 2);
                            }
                            callback3.onResult(bitmap);
                            c11701yE2.a.getClass();
                            String str = c0037Ah13.b;
                            N.Mlt0uwKm(str, 9);
                            c0557Eh1.getClass();
                            N.MNxzlAnV(str, j2);
                            return;
                        }
                        N.M3LHmG_m(c0557Eh1.a, 1, c0037Ah13.a, c0037Ah13.b, c0037Ah13.c, c0037Ah13.d, c0037Ah13.f, new C0427Dh1(c0037Ah13, new Callback() { // from class: wE
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj) {
                                return new ZE(this, obj);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj) {
                                C11701yE c11701yE3 = c11701yE2;
                                c11701yE3.getClass();
                                callback3.onResult((Bitmap) obj);
                                String str2 = c0037Ah13.b;
                                c11701yE3.a.getClass();
                                N.MtnQwbxo(str2, j2);
                            }
                        }));
                    }
                });
            }
        });
    }
}

package com.google.research.ink.core.jni;

import android.graphics.Bitmap;
import defpackage.AbstractC3176Yl1;
import defpackage.AbstractC4508dH1;
import defpackage.BK3;
import defpackage.C1127Ir1;
import defpackage.C12078zK3;
import defpackage.C12125zU0;
import defpackage.C2254Rj;
import defpackage.C3877bS2;
import defpackage.C6827k14;
import defpackage.C7931nE2;
import defpackage.C8987qJ3;
import defpackage.IS0;
import defpackage.InterfaceC11344xB0;
import defpackage.OS2;
import defpackage.OV2;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.RR2;
import defpackage.SR2;
import defpackage.XF0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class HostControllerImpl {
    public static final /* synthetic */ int g = 0;
    public final InterfaceC11344xB0 a;
    public final IS0 b;
    public final SR2 c;
    public final AtomicReference d = new AtomicReference();
    public final C8987qJ3 e;
    public final boolean f;

    public void setTargetFPS(int i) {
        IS0 is0 = this.b;
        C12125zU0 c12125zU0 = is0.i;
        ReentrantReadWriteLock reentrantReadWriteLock = c12125zU0.b;
        reentrantReadWriteLock.writeLock().lock();
        try {
            c12125zU0.c = i;
            c12125zU0.b();
            reentrantReadWriteLock.writeLock().unlock();
            if (is0.i.a() > 0 || is0.k) {
                is0.a();
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    static {
        AbstractC3176Yl1.a();
    }

    public HostControllerImpl(BK3 bk3, IS0 is0, C3877bS2 c3877bS2, C8987qJ3 c8987qJ3, boolean z) {
        this.a = bk3;
        this.b = is0;
        this.c = c3877bS2;
        this.e = c8987qJ3;
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void requestImage(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r9
            java.lang.String r3 = "Requesting image with uri: %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            defpackage.AbstractC4508dH1.c(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r8.d
            java.lang.Object r1 = r1.get()
            qh1 r1 = (defpackage.C9112qh1) r1
            if (r1 != 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No image provider, so could not provide image for "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            defpackage.AbstractC4508dH1.e(r0)
            xB0 r0 = r8.a
            BK3 r0 = (defpackage.BK3) r0
            r0.getClass()
            VL2 r1 = new VL2
            r1.<init>(r9)
            s5 r9 = r0.a
            r9.a(r1)
            return
        L3c:
            java.lang.String r3 = "host:"
            boolean r3 = r9.startsWith(r3)
            r4 = 0
            if (r3 != 0) goto L46
            goto L60
        L46:
            r3 = 58
            r5 = 5
            int r3 = r9.indexOf(r3, r5)
            if (r3 >= 0) goto L50
            goto L60
        L50:
            java.lang.String r5 = r9.substring(r5, r3)
            java.lang.Class<tS2> r6 = defpackage.EnumC10059tS2.class
            java.lang.Enum r5 = java.lang.Enum.valueOf(r6, r5)     // Catch: java.lang.IllegalArgumentException -> L5d
            tS2 r5 = (defpackage.EnumC10059tS2) r5     // Catch: java.lang.IllegalArgumentException -> L5d
            goto L5e
        L5d:
            r5 = r4
        L5e:
            if (r5 != 0) goto L62
        L60:
            r6 = r4
            goto L6c
        L62:
            int r3 = r3 + r0
            java.lang.String r3 = r9.substring(r3)
            N91 r6 = new N91
            r6.<init>(r5, r3)
        L6c:
            if (r6 != 0) goto L77
            L91 r0 = new L91
            r0.<init>(r9)
            defpackage.LZ3.a(r0)
            return
        L77:
            vS2 r3 = defpackage.C10745vS2.m
            JX0 r3 = r3.j()
            uS2 r3 = (defpackage.C10402uS2) r3
            boolean r5 = r3.h
            if (r5 == 0) goto L88
            r3.l()
            r3.h = r2
        L88:
            QX0 r5 = r3.g
            vS2 r5 = (defpackage.C10745vS2) r5
            r5.getClass()
            int r7 = r5.j
            r0 = r0 | r7
            r5.j = r0
            r5.k = r9
            boolean r0 = r3.h
            if (r0 == 0) goto L9f
            r3.l()
            r3.h = r2
        L9f:
            QX0 r0 = r3.g
            vS2 r0 = (defpackage.C10745vS2) r0
            r0.getClass()
            tS2 r2 = r6.a
            int r2 = r2.a
            r0.l = r2
            int r2 = r0.j
            r2 = r2 | 2
            r0.j = r2
            QX0 r0 = r3.j()
            vS2 r0 = (defpackage.C10745vS2) r0
            java.lang.String r2 = "screenshot_data"
            java.lang.String r3 = r6.b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lcb
            org.chromium.chrome.browser.image_editor.ImageEditorDialogFragment r1 = r1.a
            android.graphics.Bitmap r1 = r1.r0
            si1 r1 = defpackage.AbstractC5957hW0.c(r1)
            goto Lcf
        Lcb:
            si1 r1 = defpackage.AbstractC5957hW0.c(r4)
        Lcf:
            M91 r2 = new M91
            r2.<init>(r8, r0, r9)
            jo0 r9 = defpackage.EnumC6747jo0.a
            fW0 r0 = new fW0
            r0.<init>(r1, r2)
            r1.f(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.research.ink.core.jni.HostControllerImpl.requestImage(java.lang.String):void");
    }

    public void onImageExported(int i, Bitmap bitmap, long j, int i2, int i3, String str) {
        HostControllerImpl hostControllerImpl;
        String str2;
        if (bitmap == null) {
            AbstractC4508dH1.e("Image export failed, likely low memory.");
            if (str.isEmpty()) {
                hostControllerImpl = this;
                str2 = "bitmap is null; likely low memory";
                hostControllerImpl.c.b(i, bitmap, j, i2, i3, str2);
            }
        } else {
            AbstractC4508dH1.c(String.format("Finished exporting image, size: (%d, %d) fingerprint: %X", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Long.valueOf(j)));
        }
        hostControllerImpl = this;
        str2 = str;
        hostControllerImpl.c.b(i, bitmap, j, i2, i3, str2);
    }

    public void onPdfSaveComplete(byte[] bArr) {
        this.c.c(bArr);
    }

    public void onSequencePointReached(int i) {
        AbstractC4508dH1.c("Reached sequence point: " + i);
        this.c.f(i);
    }

    public void onFlagChanged(int i, boolean z) {
        this.c.a(i, z);
    }

    public void runOnGLThread(long j) {
        BK3 bk3 = (BK3) this.a;
        bk3.getClass();
        bk3.a.a(new C12078zK3(bk3, j));
    }

    private void onPendingTexturesChanged(boolean z) {
        RR2 rr2;
        if (z) {
            rr2 = RR2.HAS_PENDING_TEXTURES;
        } else {
            rr2 = RR2.NO_PENDING_TEXTURES;
        }
        this.c.d(rr2);
    }

    public boolean getEnableInkDocument() {
        return this.f;
    }

    public void onSceneChange(byte[] bArr) {
        XF0 c;
        try {
            try {
                c = XF0.d();
            } catch (NoSuchMethodError unused) {
                c = XF0.c();
            }
            OV2 ov2 = OV2.l;
            int length = bArr.length;
            OV2 ov22 = new OV2();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(ov22.getClass());
                    b.f(ov22, bArr, 0, length + 0, new C2254Rj(c));
                    b.b(ov22);
                    if (ov22.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(ov22);
                    this.c.e(ov22);
                } catch (C1127Ir1 e) {
                    if (e.g) {
                        throw new C1127Ir1(e);
                    }
                } catch (IndexOutOfBoundsException unused2) {
                    throw C1127Ir1.h();
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            AbstractC4508dH1.b("Proto parse exception in onSceneChange", e4);
        }
    }

    public void onToolEvent(byte[] bArr) {
        XF0 c;
        try {
            try {
                c = XF0.d();
            } catch (NoSuchMethodError unused) {
                c = XF0.c();
            }
            OS2 os2 = OS2.n;
            int length = bArr.length;
            OS2 os22 = new OS2();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(os22.getClass());
                    b.f(os22, bArr, 0, length + 0, new C2254Rj(c));
                    b.b(os22);
                    if (os22.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(os22);
                    this.c.g(os22);
                } catch (C1127Ir1 e) {
                    if (e.g) {
                        throw new C1127Ir1(e);
                    }
                } catch (IndexOutOfBoundsException unused2) {
                    throw C1127Ir1.h();
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            AbstractC4508dH1.b("Proto parse exception in onToolEvent", e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap renderText(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.research.ink.core.jni.HostControllerImpl.renderText(byte[], int, int):android.graphics.Bitmap");
    }
}

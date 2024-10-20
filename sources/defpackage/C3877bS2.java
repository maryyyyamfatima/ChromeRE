package defpackage;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bS2 */
/* loaded from: classes5.dex */
public final class C3877bS2 extends SR2 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.SR2
    public final void e(final OV2 ov2) {
        LZ3.a(new Runnable() { // from class: VR2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C3877bS2.this.a.iterator();
                while (it.hasNext()) {
                    ((SR2) it.next()).e(ov2);
                }
            }
        });
    }

    @Override // defpackage.SR2
    public final void b(final int i, final Bitmap bitmap, final long j, final int i2, final int i3, final String str) {
        LZ3.a(new Runnable() { // from class: TR2
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i;
                Bitmap bitmap2 = bitmap;
                long j2 = j;
                int i5 = i2;
                int i6 = i3;
                String str2 = str;
                Iterator it = C3877bS2.this.a.iterator();
                while (it.hasNext()) {
                    ((SR2) it.next()).b(i4, bitmap2, j2, i5, i6, str2);
                }
            }
        });
    }

    @Override // defpackage.SR2
    public final void c(final byte[] bArr) {
        LZ3.a(new Runnable() { // from class: WR2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C3877bS2.this.a.iterator();
                while (it.hasNext()) {
                    ((SR2) it.next()).c(bArr);
                }
            }
        });
    }

    @Override // defpackage.SR2
    public final void f(final int i) {
        LZ3.a(new Runnable() { // from class: ZR2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C3877bS2.this.a.iterator();
                while (it.hasNext()) {
                    ((SR2) it.next()).f(i);
                }
            }
        });
    }

    @Override // defpackage.SR2
    public final void g(final OS2 os2) {
        LZ3.a(new Runnable() { // from class: YR2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C3877bS2.this.a.iterator();
                while (it.hasNext()) {
                    ((SR2) it.next()).g(os2);
                }
            }
        });
    }

    @Override // defpackage.SR2
    public final void h() {
        LZ3.a(new Runnable() { // from class: aS2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C3877bS2.this.a.iterator();
                while (it.hasNext()) {
                    ((SR2) it.next()).h();
                }
            }
        });
    }

    @Override // defpackage.SR2
    public final void a(final int i, final boolean z) {
        LZ3.a(new Runnable() { // from class: XR2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C3877bS2.this.a.iterator();
                while (it.hasNext()) {
                    ((SR2) it.next()).a(i, z);
                }
            }
        });
    }

    @Override // defpackage.SR2
    public final void d(final RR2 rr2) {
        LZ3.a(new Runnable() { // from class: UR2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C3877bS2.this.a.iterator();
                while (it.hasNext()) {
                    ((SR2) it.next()).d(rr2);
                }
            }
        });
    }
}

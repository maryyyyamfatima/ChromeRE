package defpackage;

import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hk3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0964Hk3 implements IO2 {
    public Bitmap a;
    public final C5819h52 b;
    public final Rect c;

    @Override // defpackage.IO2
    public final boolean a() {
        return false;
    }

    public C0964Hk3(Bitmap bitmap) {
        int i;
        int i2;
        this.a = bitmap;
        C5819h52 c5819h52 = null;
        if (bitmap != null) {
            try {
                byte[] ninePatchChunk = bitmap.getNinePatchChunk();
                if (ninePatchChunk != null && NinePatch.isNinePatchChunk(ninePatchChunk)) {
                    ByteBuffer order = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
                    if (order.get() != 0 && (i = order.get()) != 0 && (i & 1) == 0 && (i2 = order.get()) != 0 && (i2 & 1) == 0) {
                        order.get();
                        order.getInt();
                        order.getInt();
                        Rect rect = new Rect();
                        rect.left = order.getInt();
                        rect.right = order.getInt();
                        rect.top = order.getInt();
                        rect.bottom = order.getInt();
                        order.getInt();
                        int[] iArr = new int[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr[i3] = order.getInt();
                        }
                        int[] iArr2 = new int[i2];
                        for (int i4 = 0; i4 < i2; i4++) {
                            iArr2[i4] = order.getInt();
                        }
                        c5819h52 = new C5819h52(bitmap.getWidth(), bitmap.getHeight(), rect, iArr, iArr2);
                    }
                }
            } catch (BufferUnderflowException unused) {
            }
        }
        this.b = c5819h52;
        this.c = new Rect(0, 0, this.a.getWidth(), this.a.getHeight());
    }

    @Override // defpackage.IO2
    public final C5819h52 e() {
        return this.b;
    }

    @Override // defpackage.IO2
    public final Bitmap b() {
        Bitmap bitmap = this.a;
        this.a = null;
        return bitmap;
    }

    @Override // defpackage.IO2
    public final Rect d() {
        return this.c;
    }

    @Override // defpackage.IO2
    public final long c() {
        return YO2.a(this.b);
    }
}

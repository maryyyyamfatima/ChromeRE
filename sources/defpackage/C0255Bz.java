package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.libraries.elements.interfaces.ContentMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255Bz extends AbstractC0380Cy {
    public final Context b;
    public final U80 c;
    public final ContentMode d;
    public final float e;
    public final AbstractC9896sy0 f;

    public C0255Bz(Context context, U80 u80, AbstractC9896sy0 abstractC9896sy0, ContentMode contentMode, float f) {
        this.b = context.getApplicationContext();
        this.c = u80;
        this.f = abstractC9896sy0;
        this.d = contentMode;
        this.e = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    @Override // defpackage.AbstractC0380Cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(defpackage.InterfaceC11610xy r9, android.graphics.Bitmap r10, int r11, int r12) {
        /*
            r8 = this;
            float r11 = r8.e
            r12 = 1008981770(0x3c23d70a, float:0.01)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 >= 0) goto La
            return r10
        La:
            r12 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r0 <= 0) goto L30
            float r11 = r12 / r11
            int r1 = r10.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r11
            int r1 = java.lang.Math.round(r1)
            int r2 = r10.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r11
            int r11 = java.lang.Math.round(r2)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r11 = r9.c(r1, r11, r2)
            d(r10, r11)
            goto L32
        L30:
            r12 = r11
            r11 = r10
        L32:
            r1 = 0
            android.content.Context r2 = r8.b     // Catch: java.lang.Throwable -> L73 android.renderscript.RSRuntimeException -> L77
            android.renderscript.RenderScript r2 = android.renderscript.RenderScript.create(r2)     // Catch: java.lang.Throwable -> L73 android.renderscript.RSRuntimeException -> L77
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r2)     // Catch: java.lang.Throwable -> L73 android.renderscript.RSRuntimeException -> L77
            android.renderscript.ScriptIntrinsicBlur r3 = android.renderscript.ScriptIntrinsicBlur.create(r2, r3)     // Catch: java.lang.Throwable -> L73 android.renderscript.RSRuntimeException -> L77
            android.renderscript.Allocation r4 = android.renderscript.Allocation.createFromBitmap(r2, r11)     // Catch: java.lang.Throwable -> L69 android.renderscript.RSRuntimeException -> L6e
            android.renderscript.Type r5 = r4.getType()     // Catch: java.lang.Throwable -> L63 android.renderscript.RSRuntimeException -> L67
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createTyped(r2, r5)     // Catch: java.lang.Throwable -> L63 android.renderscript.RSRuntimeException -> L67
            r3.setRadius(r12)     // Catch: java.lang.Throwable -> L63 android.renderscript.RSRuntimeException -> L67
            r3.setInput(r4)     // Catch: java.lang.Throwable -> L63 android.renderscript.RSRuntimeException -> L67
            r3.forEach(r1)     // Catch: java.lang.Throwable -> L63 android.renderscript.RSRuntimeException -> L67
            r1.copyTo(r11)     // Catch: java.lang.Throwable -> L63 android.renderscript.RSRuntimeException -> L67
            r3.destroy()
            r4.destroy()
            r1.destroy()
            goto L94
        L63:
            r9 = move-exception
            r10 = r1
            r1 = r4
            goto L6b
        L67:
            r12 = move-exception
            goto L70
        L69:
            r9 = move-exception
            r10 = r1
        L6b:
            r4 = r1
            r1 = r3
            goto La6
        L6e:
            r12 = move-exception
            r4 = r1
        L70:
            r2 = r1
            r1 = r3
            goto L7a
        L73:
            r9 = move-exception
            r10 = r1
            r4 = r10
            goto La6
        L77:
            r12 = move-exception
            r2 = r1
            r4 = r2
        L7a:
            sy0 r3 = r8.f     // Catch: java.lang.Throwable -> La4
            xU r5 = defpackage.EnumC11438xU.s     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = "Failed to blur image"
            U80 r7 = r8.c     // Catch: java.lang.Throwable -> La4
            r3.d(r5, r6, r7, r12)     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L8a
            r1.destroy()
        L8a:
            if (r4 == 0) goto L8f
            r4.destroy()
        L8f:
            if (r2 == 0) goto L94
            r2.destroy()
        L94:
            com.google.android.libraries.elements.interfaces.ContentMode r12 = r8.d
            com.google.android.libraries.elements.interfaces.ContentMode r1 = com.google.android.libraries.elements.interfaces.ContentMode.CONTENT_MODE_CENTER
            if (r12 != r1) goto La3
            if (r0 <= 0) goto La3
            d(r11, r10)
            r9.b(r11)
            return r10
        La3:
            return r11
        La4:
            r9 = move-exception
            r10 = r2
        La6:
            if (r1 == 0) goto Lab
            r1.destroy()
        Lab:
            if (r4 == 0) goto Lb0
            r4.destroy()
        Lb0:
            if (r10 == 0) goto Lb5
            r10.destroy()
        Lb5:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0255Bz.c(xy, android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    public static void d(Bitmap bitmap, Bitmap bitmap2) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        new Canvas(bitmap2).drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), paint);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(("blur:" + this.e).getBytes(StandardCharsets.UTF_8));
    }
}

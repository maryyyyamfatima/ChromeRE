package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$Source;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7411lk0 implements ImageDecoder$OnHeaderDecodedListener {
    public final O51 a = O51.a();
    public final int b;
    public final int c;
    public final EnumC0041Ai0 d;
    public final AbstractC7809mt0 e;
    public final boolean f;
    public final EnumC1942Oy2 g;

    public C7411lk0(int i, int i2, C0543Ee2 c0543Ee2) {
        this.b = i;
        this.c = i2;
        this.d = (EnumC0041Ai0) c0543Ee2.c(C8840pt0.f);
        this.e = (AbstractC7809mt0) c0543Ee2.c(AbstractC7809mt0.f);
        C8752pe2 c8752pe2 = C8840pt0.i;
        this.f = c0543Ee2.c(c8752pe2) != null && ((Boolean) c0543Ee2.c(c8752pe2)).booleanValue();
        this.g = (EnumC1942Oy2) c0543Ee2.c(C8840pt0.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder$Source imageDecoder$Source) {
        Size size;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        boolean z = false;
        if (this.a.b(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == EnumC0041Ai0.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C7067kk0());
        size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.e.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        EnumC1942Oy2 enumC1942Oy2 = this.g;
        if (enumC1942Oy2 != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 28) {
                if (i3 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            if (enumC1942Oy2 == EnumC1942Oy2.DISPLAY_P3) {
                colorSpace = imageInfo.getColorSpace();
                if (colorSpace != null) {
                    colorSpace2 = imageInfo.getColorSpace();
                    if (colorSpace2.isWideGamut()) {
                        z = true;
                    }
                }
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}

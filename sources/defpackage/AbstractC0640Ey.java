package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ey, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0640Ey {
    public static void c(int i) {
        EI2.h(i, 9, "Android.PhotoPicker.ExifOrientation");
    }

    public static Pair a(FileDescriptor fileDescriptor, int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > i && i4 > i) {
            i2 = Math.min(i3, i4) / i;
        }
        options.inSampleSize = i2;
        options.inJustDecodeBounds = false;
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        if (decodeFileDescriptor == null) {
            return null;
        }
        return new Pair(e(decodeFileDescriptor, i, z, fileDescriptor), Float.valueOf(decodeFileDescriptor.getHeight() / decodeFileDescriptor.getWidth()));
    }

    public static Bitmap e(Bitmap bitmap, int i, boolean z, FileDescriptor fileDescriptor) {
        if (!z) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width != i || height != i) {
                if (width > i && height > i) {
                    float f = (width < height ? width : height) / i;
                    bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(width / f), Math.round(height / f), true);
                } else {
                    if (width < i) {
                        height = (int) (height * (i / width));
                        width = i;
                    }
                    if (height < i) {
                        width = (int) (width * (i / height));
                        height = i;
                    }
                    bitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                }
            }
            Bitmap bitmap2 = bitmap;
            int width2 = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            if (width2 == i && height2 == i) {
                return bitmap2;
            }
            return Bitmap.createBitmap(bitmap2, width2 > i ? (width2 - i) / 2 : 0, height2 > i ? (height2 - i) / 2 : 0, i, i, b(fileDescriptor), true);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), b(fileDescriptor), true);
        }
        return Bitmap.createScaledBitmap(bitmap, i, (int) (bitmap.getHeight() * (i / bitmap.getWidth())), true);
    }

    public static Matrix b(FileDescriptor fileDescriptor) {
        Matrix matrix = new Matrix();
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                switch (new ExifInterface(fileDescriptor).getAttributeInt("Orientation", 0)) {
                    case 0:
                        c(8);
                        break;
                    case 1:
                        c(0);
                        break;
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        c(6);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        matrix.postRotate(180.0f);
                        c(2);
                        break;
                    case 4:
                        matrix.setScale(1.0f, -1.0f);
                        c(7);
                        break;
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        c(4);
                        break;
                    case 6:
                        matrix.postRotate(90.0f);
                        c(1);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        c(5);
                        break;
                    case 8:
                        matrix.postRotate(-90.0f);
                        c(3);
                        break;
                }
            } catch (IOException unused) {
            }
        }
        return matrix;
    }

    public static Bitmap d(Bitmap bitmap, float f) {
        float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
        return Bitmap.createScaledBitmap(bitmap, Math.round(min * bitmap.getWidth()), Math.round(bitmap.getHeight() * min), false);
    }
}

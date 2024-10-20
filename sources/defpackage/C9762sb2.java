package defpackage;

import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.chromium.components.browser_ui.widget.async_image.AsyncImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9762sb2 {
    public final ImageView a;
    public final int b;

    public C9762sb2(AsyncImageView asyncImageView, int i) {
        this.a = asyncImageView;
        this.b = i;
    }

    public final void a(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        boolean z = drawable instanceof BitmapDrawable;
        ImageView imageView = this.a;
        Matrix matrix = null;
        if (z && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
            int width = bitmapDrawable.getBitmap().getWidth();
            float f = width;
            float width2 = imageView.getWidth() / f;
            float height = bitmapDrawable.getBitmap().getHeight();
            float height2 = imageView.getHeight() / height;
            EI2.f((int) (Math.max(width2, height2) * 100.0f), 10, 1000, 50, "Android.DownloadManager.Thumbnail.MaxRequiredStretch.".concat(A04.a(this.b)));
            float min = Math.max(width2, height2) < 4.0f ? 1.0f : Math.min(Math.min(width2, height2), 4.0f);
            if (min > 1.0f) {
                float height3 = (imageView.getHeight() - (height * min)) / 2.0f;
                Matrix matrix2 = new Matrix();
                matrix2.postScale(min, min);
                matrix2.postTranslate((imageView.getWidth() - (f * min)) / 2.0f, height3);
                matrix = matrix2;
            }
        }
        imageView.setImageMatrix(matrix);
        imageView.setScaleType(matrix == null ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.MATRIX);
    }
}

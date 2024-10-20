package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ik3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1094Ik3 implements InterfaceC8104nl {
    public final /* synthetic */ Resources a;

    public C1094Ik3(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.InterfaceC8104nl
    public final C0964Hk3 a(int i) {
        if (i <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Resources resources = this.a;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
        if (decodeResource == null) {
            decodeResource = null;
        } else if (decodeResource.getConfig() != options.inPreferredConfig) {
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), options.inPreferredConfig);
            new Canvas(createBitmap).drawBitmap(decodeResource, 0.0f, 0.0f, (Paint) null);
            decodeResource.recycle();
            decodeResource = createBitmap;
        }
        if (decodeResource == null) {
            try {
                Drawable c = AbstractC9771sd.c(resources, i, 0);
                int max = Math.max(c.getMinimumWidth(), Math.max(0, 1));
                int max2 = Math.max(c.getMinimumHeight(), Math.max(0, 1));
                Bitmap createBitmap2 = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap2);
                c.setBounds(0, 0, max, max2);
                c.draw(canvas);
                decodeResource = createBitmap2;
            } catch (Resources.NotFoundException unused) {
                decodeResource = null;
            }
        }
        if (decodeResource == null) {
            return null;
        }
        return new C0964Hk3(decodeResource);
    }
}

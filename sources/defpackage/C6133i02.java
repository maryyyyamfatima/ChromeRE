package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Size;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6133i02 {
    public final IE2 a;
    public final Callback b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public Canvas h;
    public Bitmap i;
    public String j;
    public final int n;
    public final int o;
    public final /* synthetic */ C6475j02 p;
    public final ArrayList f = new ArrayList(4);
    public final AtomicInteger g = new AtomicInteger();
    public final ArrayList k = new ArrayList(4);
    public final ArrayList l = new ArrayList(4);
    public final ArrayList m = new ArrayList(4);

    public C6133i02(C6475j02 c6475j02, IE2 ie2, Size size, C1164Iy3 c1164Iy3, boolean z, boolean z2, boolean z3) {
        this.p = c6475j02;
        this.b = c1164Iy3;
        this.a = ie2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        if (size == null || size.getHeight() <= 0 || size.getWidth() <= 0) {
            float c = AbstractC7239lD3.c(c6475j02.n);
            int dimension = (int) c6475j02.n.getResources().getDimension(R.dimen.f41250_resource_name_obfuscated_res_0x7f080799);
            this.n = dimension;
            this.o = (int) (dimension / c);
            return;
        }
        this.n = size.getWidth();
        this.o = size.getHeight();
    }

    public final void b(int i, Bitmap bitmap) {
        ArrayList arrayList = this.l;
        C6475j02 c6475j02 = this.p;
        if (bitmap == null) {
            Paint paint = this.e ? c6475j02.k : c6475j02.f;
            Canvas canvas = this.h;
            RectF rectF = (RectF) arrayList.get(i);
            float f = c6475j02.d;
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        c6475j02.h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        Canvas canvas2 = this.h;
        RectF rectF2 = (RectF) arrayList.get(i);
        float f2 = c6475j02.d;
        Paint paint2 = c6475j02.h;
        canvas2.drawRoundRect(rectF2, f2, f2, paint2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) ((RectF) arrayList.get(i)).width(), (int) ((RectF) arrayList.get(i)).height(), true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.h.drawBitmap(createScaledBitmap, new Rect(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight()), (RectF) arrayList.get(i), paint2);
        createScaledBitmap.recycle();
    }

    public final void a(Drawable drawable, int i) {
        Canvas canvas = this.h;
        RectF rectF = (RectF) this.m.get(i);
        C6475j02 c6475j02 = this.p;
        float f = c6475j02.e;
        canvas.drawRoundRect(rectF, f, f, c6475j02.j);
        drawable.setBounds((Rect) this.k.get(i));
        drawable.draw(this.h);
        if (this.g.decrementAndGet() == 0) {
            PostTask.c(AbstractC5103f04.c, this.b.e0(this.i));
        }
    }
}

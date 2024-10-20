package defpackage;

import android.content.Context;
import android.content.res.Resources;
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
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j02 */
/* loaded from: classes.dex */
public final class C6475j02 implements InterfaceC1424Ky3 {
    public final TabContentManager a;
    public final InterfaceC10590uz3 b;
    public final C5101f02 c;
    public final float d;
    public final float e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final C5091ey3 m;
    public final Context n;

    public C6475j02(Context context, TabContentManager tabContentManager, InterfaceC10590uz3 interfaceC10590uz3) {
        this.n = context;
        Resources resources = context.getResources();
        this.a = tabContentManager;
        this.b = interfaceC10590uz3;
        this.d = resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0807ab);
        this.e = resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08079c);
        this.m = new C5091ey3(context, false);
        Paint paint = new Paint();
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(AbstractC5521gD3.b(context, false, false));
        Paint paint2 = new Paint(paint);
        this.k = paint2;
        paint2.setColor(AbstractC5521gD3.b(context, false, true));
        Paint paint3 = new Paint(paint);
        this.h = paint3;
        paint3.setColor(-16777216);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint4 = new Paint();
        this.g = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0807aa));
        paint4.setColor(AbstractC10957w33.f(context));
        paint4.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.i = paint5;
        paint5.setTextSize(resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080120));
        paint5.setFakeBoldText(true);
        paint5.setAntiAlias(true);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setColor(AbstractC5521gD3.f(context, false, false));
        Paint paint6 = new Paint(paint5);
        this.l = paint6;
        paint6.setColor(AbstractC5521gD3.f(context, false, true));
        int color = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070195);
        Paint paint7 = new Paint();
        this.j = paint7;
        paint7.setAntiAlias(true);
        paint7.setColor(color);
        paint7.setStyle(Paint.Style.FILL);
        paint7.setShadowLayer(resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08079b), 0.0f, resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08079a), resources.getColor(R.color.0_resource_name_obfuscated_res_0x7f0707ac));
        C5101f02 c5101f02 = new C5101f02(this, context);
        this.c = c5101f02;
        ((AbstractC11276wz3) interfaceC10590uz3).c(c5101f02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1424Ky3
    public final void a(int i, Size size, C1164Iy3 c1164Iy3, boolean z, boolean z2) {
        int i2;
        boolean z3;
        ArrayList arrayList;
        C6133i02 c6133i02;
        IE2 b = IE2.b(i);
        Context context = this.n;
        InterfaceC10590uz3 interfaceC10590uz3 = this.b;
        if (IE2.e(context, b, interfaceC10590uz3).size() == 1) {
            this.a.f(i, size, c1164Iy3, z, z2);
            return;
        }
        C6133i02 c6133i022 = new C6133i02(this, b, size, c1164Iy3, z, z2, i == ((AbstractC11276wz3) interfaceC10590uz3).i());
        float dimension = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080787);
        int i3 = c6133i022.n;
        float f = i3;
        float f2 = f * 0.5f;
        int i4 = c6133i022.o;
        float f3 = i4;
        float f4 = 0.5f * f3;
        float f5 = dimension / 2.0f;
        ArrayList arrayList2 = c6133i022.l;
        float f6 = f2 - f5;
        float f7 = f4 - f5;
        arrayList2.add(new RectF(0.0f, 0.0f, f6, f7));
        float f8 = f2 + f5;
        arrayList2.add(new RectF(f8, 0.0f, f, f7));
        float f9 = f4 + f5;
        arrayList2.add(new RectF(0.0f, f9, f6, f3));
        arrayList2.add(new RectF(f8, f9, f, f3));
        float dimension2 = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08079d) / 2.0f;
        float dimension3 = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08079e);
        for (int i5 = 0; i5 < 4; i5++) {
            RectF rectF = (RectF) arrayList2.get(i5);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            RectF rectF2 = new RectF(centerX, centerY, centerX, centerY);
            float f10 = -dimension2;
            rectF2.inset(f10, f10);
            c6133i022.m.add(rectF2);
            RectF rectF3 = new RectF(rectF2);
            rectF3.inset(dimension3, dimension3);
            Rect rect = new Rect();
            rectF3.roundOut(rect);
            c6133i022.k.add(rect);
        }
        c6133i022.i = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(c6133i022.i);
        c6133i022.h = canvas;
        canvas.drawColor(0);
        IE2 ie2 = c6133i022.a;
        ArrayList e = IE2.e(context, ie2, interfaceC10590uz3);
        int size2 = e.size();
        AtomicInteger atomicInteger = c6133i022.g;
        ArrayList arrayList3 = c6133i022.f;
        if (size2 <= 4) {
            atomicInteger.set(e.size());
            arrayList3.add(ie2);
            e.remove(ie2);
            int i6 = 0;
            while (i6 < 3) {
                arrayList3.add(i6 < e.size() ? (IE2) e.get(i6) : null);
                i6++;
            }
            i2 = 0;
            z3 = true;
        } else {
            c6133i022.j = "+" + (e.size() - 3);
            atomicInteger.set(3);
            arrayList3.add(ie2);
            e.remove(ie2);
            i2 = 0;
            arrayList3.add((IE2) e.get(0));
            z3 = true;
            arrayList3.add((IE2) e.get(1));
            arrayList3.add(null);
        }
        int i7 = i2;
        while (i7 < 4) {
            if (arrayList3.get(i7) != null) {
                final GURL k = ((IE2) arrayList3.get(i7)).k();
                final boolean l = ((IE2) arrayList3.get(i7)).l();
                Size size3 = new Size((int) ((RectF) arrayList2.get(i7)).width(), (int) ((RectF) arrayList2.get(i7)).height());
                final AtomicReference atomicReference = new AtomicReference();
                arrayList = arrayList2;
                final C6133i02 c6133i023 = c6133i022;
                c6133i02 = c6133i022;
                final int i8 = i7;
                this.a.f(((IE2) arrayList3.get(i7)).c(), size3, new Callback() { // from class: g02
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        final C6133i02 c6133i024 = C6133i02.this;
                        final int i9 = i8;
                        c6133i024.b(i9, (Bitmap) obj);
                        final AtomicReference atomicReference2 = atomicReference;
                        if (atomicReference2.get() == null) {
                            C5091ey3 c5091ey3 = c6133i024.p.m;
                            Callback callback = new Callback() { // from class: h02
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj2) {
                                    return new ZE(this, obj2);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj2) {
                                    Drawable drawable = (Drawable) obj2;
                                    C6133i02 c6133i025 = C6133i02.this;
                                    c6133i025.getClass();
                                    atomicReference2.set(drawable);
                                    c6133i025.a(drawable, i9);
                                }
                            };
                            c5091ey3.getClass();
                            c5091ey3.c(k, l, new C4404cy3(callback));
                            return;
                        }
                        c6133i024.a((Drawable) atomicReference2.get(), i9);
                    }
                }, (c6133i02.c && i7 == 0) ? z3 : i2, (c6133i02.d && i7 == 0) ? z3 : i2);
            } else {
                arrayList = arrayList2;
                c6133i02 = c6133i022;
                c6133i02.b(i7, null);
                String str = c6133i02.j;
                if (str != null && i7 == 3) {
                    Paint paint = this.i;
                    c6133i02.h.drawText(str, (((RectF) arrayList.get(i7)).left + ((RectF) arrayList.get(i7)).right) / 2.0f, ((((RectF) arrayList.get(i7)).top + ((RectF) arrayList.get(i7)).bottom) / 2.0f) - ((paint.ascent() + paint.descent()) / 2.0f), c6133i02.e ? this.l : paint);
                    i7++;
                    arrayList2 = arrayList;
                    c6133i022 = c6133i02;
                    i2 = 0;
                    z3 = true;
                }
            }
            i7++;
            arrayList2 = arrayList;
            c6133i022 = c6133i02;
            i2 = 0;
            z3 = true;
        }
    }
}

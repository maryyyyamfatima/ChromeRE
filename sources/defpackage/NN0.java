package defpackage;

import J.N;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NN0 extends View {
    public static final KN0 E = new KN0();
    public boolean A;
    public final Paint B;
    public final Paint C;
    public boolean D;
    public final int a;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public IN0 s;
    public final WindowAndroid t;
    public int u;
    public RectF[] v;
    public RectF w;
    public ArrayList x;
    public int y;
    public ObjectAnimator z;

    public NN0(Context context, Q50 q50, WindowAndroid windowAndroid, IN0 in0) {
        super(context);
        this.u = -1;
        this.v = new RectF[0];
        this.x = new ArrayList(0);
        this.y = -1;
        Resources resources = context.getResources();
        this.a = context.getColor(R.color.f19040_resource_name_obfuscated_res_0x7f0701a9);
        this.g = context.getColor(R.color.f19030_resource_name_obfuscated_res_0x7f0701a8);
        this.h = context.getColor(R.color.f19080_resource_name_obfuscated_res_0x7f0701ad);
        this.i = context.getColor(R.color.f19070_resource_name_obfuscated_res_0x7f0701ac);
        this.j = context.getColor(R.color.f19020_resource_name_obfuscated_res_0x7f0701a7);
        this.k = context.getColor(R.color.f19010_resource_name_obfuscated_res_0x7f0701a6);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f32280_resource_name_obfuscated_res_0x7f08023e);
        this.l = dimensionPixelSize;
        this.m = resources.getDimensionPixelSize(R.dimen.f32260_resource_name_obfuscated_res_0x7f08023c) + resources.getDimensionPixelSize(R.dimen.f32230_resource_name_obfuscated_res_0x7f080239);
        this.n = resources.getDimensionPixelSize(R.dimen.f32250_resource_name_obfuscated_res_0x7f08023b);
        this.o = resources.getDimensionPixelSize(R.dimen.f32220_resource_name_obfuscated_res_0x7f080238);
        this.p = resources.getDimensionPixelSize(R.dimen.f32290_resource_name_obfuscated_res_0x7f08023f);
        this.q = resources.getDimensionPixelSize(R.dimen.f32240_resource_name_obfuscated_res_0x7f08023a);
        this.r = resources.getDimensionPixelSize(R.dimen.f32270_resource_name_obfuscated_res_0x7f08023d);
        Paint paint = new Paint();
        this.B = paint;
        Paint paint2 = new Paint();
        this.C = paint2;
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f);
        this.s = in0;
        q50.addView(this, new FrameLayout.LayoutParams(dimensionPixelSize, -1, 8388613));
        setTranslationX(LocalizationUtils.isLayoutRtl() ? -dimensionPixelSize : dimensionPixelSize);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<NN0, Float>) View.TRANSLATION_X, 0.0f);
        this.z = ofFloat;
        ofFloat.setDuration(200L);
        this.z.setInterpolator(InterpolatorC0485Dt.e);
        this.t = windowAndroid;
        if (windowAndroid == null) {
            throw new IllegalArgumentException("WindowAndroid must be non null.");
        }
        windowAndroid.C(this.z);
    }

    public final void b(int i, RectF[] rectFArr, RectF rectF) {
        if (this.u != i) {
            this.u = i;
            this.v = rectFArr;
            this.x.clear();
            Arrays.sort(this.v, E);
            this.y = -1;
        }
        this.w = rectF;
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A && this.x.size() > 0 && this.x.size() == this.v.length && !this.D && motionEvent.getAction() != 3) {
            C11939yv1.g.d(this);
            int binarySearch = Collections.binarySearch(this.x, new MN0(this, motionEvent.getY(), motionEvent.getY()));
            if (binarySearch < 0) {
                int i = (-1) - binarySearch;
                if (i == 0) {
                    binarySearch = 0;
                } else if (i == this.x.size()) {
                    binarySearch = this.x.size() - 1;
                } else {
                    float y = motionEvent.getY();
                    MN0 mn0 = (MN0) this.x.get(i - 1);
                    float abs = Math.abs(y - ((mn0.a + mn0.g) * 0.5f));
                    float y2 = motionEvent.getY();
                    MN0 mn02 = (MN0) this.x.get(i);
                    binarySearch = i - (abs <= Math.abs(y2 - ((mn02.a + mn02.g) * 0.5f)) ? 1 : 0);
                }
            }
            this.D = true;
            IN0 in0 = this.s;
            N.MqpwqIAC(in0.b, in0, this.v[binarySearch].centerX(), this.v[binarySearch].centerY());
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A || this.v.length <= 0) {
            return;
        }
        IN0 in0 = this.s;
        N.M4m8QCn$(in0.b, in0, this.u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int binarySearch;
        MN0 mn0;
        float f;
        super.onDraw(canvas);
        boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
        int i = this.m;
        ?? r8 = 0;
        int width = isLayoutRtl ? 0 : getWidth() - i;
        Paint paint = this.B;
        paint.setColor(this.a);
        Paint paint2 = this.C;
        paint2.setColor(this.g);
        float f2 = width;
        float f3 = width + i;
        canvas.drawRect(f2, 0.0f, f3, getHeight(), paint);
        float f4 = LocalizationUtils.isLayoutRtl() ? f3 - 0.5f : f2 + 0.5f;
        canvas.drawLine(f4, 0.0f, f4, getHeight(), paint2);
        if (this.v.length == 0) {
            return;
        }
        int i2 = 1;
        if (this.y != getHeight()) {
            this.y = getHeight();
            this.x = new ArrayList(this.v.length);
            RectF rectF = this.v[0];
            int i3 = this.y;
            int i4 = this.p;
            float f5 = i3 - (i4 * 2);
            float f6 = i4;
            MN0 a = a(new MN0(this, (rectF.top * f5) + f6, (rectF.bottom * f5) + f6), false);
            int i5 = this.q;
            float f7 = -i5;
            int i6 = 0;
            while (i6 < this.v.length) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a);
                while (true) {
                    i6 += i2;
                    RectF[] rectFArr = this.v;
                    if (i6 >= rectFArr.length) {
                        break;
                    }
                    RectF rectF2 = rectFArr[i6];
                    float f8 = this.y - (i4 * 2);
                    float f9 = i4;
                    a = a(new MN0(this, (rectF2.top * f8) + f9, (rectF2.bottom * f8) + f9), r8);
                    if (a.a > ((MN0) arrayList.get(arrayList.size() - i2)).g + i5) {
                        break;
                    } else {
                        arrayList.add(a);
                    }
                }
                int size = arrayList.size();
                int i7 = size - 1;
                float f10 = ((MN0) arrayList.get(i7)).g;
                float f11 = this.n;
                float f12 = (f10 - (this.r * i7)) - f11;
                float round = Math.round(JM1.b(f12, f7 + i5, ((MN0) arrayList.get(r8)).a));
                float f13 = round >= f12 ? 1.0f : (f10 - round) / (f10 - f12);
                if (size == 1) {
                    f = 0.0f;
                    mn0 = a;
                } else {
                    mn0 = a;
                    f = ((f10 - round) - (f11 * f13)) / i7;
                }
                int i8 = 0;
                while (i8 < size) {
                    int i9 = i5;
                    MN0 mn02 = (MN0) arrayList.get(i8);
                    int i10 = i4;
                    float f14 = (i8 * f) + round;
                    mn02.a = f14;
                    if (i8 != i7) {
                        mn02.g = (f11 * f13) + f14;
                    }
                    this.x.add(mn02);
                    i8++;
                    i4 = i10;
                    i5 = i9;
                }
                f7 = f10;
                a = mn0;
                i2 = 1;
                r8 = 0;
            }
        }
        paint.setColor(this.h);
        paint2.setColor(this.i);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            RectF a2 = ((MN0) it.next()).a();
            canvas.drawRoundRect(a2, 2.0f, 2.0f, paint);
            canvas.drawRoundRect(a2, 2.0f, 2.0f, paint2);
        }
        RectF rectF3 = this.w;
        if (rectF3 == null || rectF3.isEmpty() || (binarySearch = Arrays.binarySearch(this.v, this.w, E)) < 0) {
            return;
        }
        RectF a3 = a((MN0) this.x.get(binarySearch), true).a();
        paint.setColor(this.j);
        paint2.setColor(this.k);
        canvas.drawRoundRect(a3, 2.0f, 2.0f, paint);
        canvas.drawRoundRect(a3, 2.0f, 2.0f, paint2);
    }

    public final MN0 a(MN0 mn0, boolean z) {
        int i = z ? this.o : this.n;
        float f = mn0.g;
        float f2 = mn0.a;
        float f3 = i - (f - f2);
        if (f3 <= 0.0f) {
            return mn0;
        }
        float f4 = f3 / 2.0f;
        return new MN0(this, f2 - f4, f + f4);
    }
}
